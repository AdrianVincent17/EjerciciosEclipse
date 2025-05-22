package facturacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ArticulosTest extends JFrame implements ActionListener {

	/*
	 * componentes de la ventan
	 */

	private JTextField codigo, descripcion, precio, stock, stock_min;
	private JButton guardar, borrar;
	private JLabel nueva, listado, cod, des, pre, sto, stom;
	private JScrollPane sc;
	private JTable tabla;

	/*
	 * Conexion a la base de datos para acceder a la tabla P
	 */
	private ConexionArticulos con;

	public ArticulosTest() {

		getContentPane().setLayout(null);

		cod = new JLabel("Codigo: ");
		cod.setBounds(30, 77, 100, 25);
		getContentPane().add(cod);

		codigo = new JTextField();
		codigo.setBounds(30, 113, 100, 25);
		getContentPane().add(codigo);

		des = new JLabel("Descripcion: ");
		des.setBounds(30, 149, 100, 25);
		getContentPane().add(des);

		descripcion = new JTextField();
		descripcion.setBounds(30, 185, 534, 44);
		getContentPane().add(descripcion);

		pre = new JLabel("Precio: ");
		pre.setBounds(464, 77, 100, 25);
		getContentPane().add(pre);

		precio = new JTextField();
		precio.setBounds(464, 113, 100, 25);
		getContentPane().add(precio);

		sto = new JLabel("Stock: ");
		sto.setBounds(318, 77, 100, 25);
		getContentPane().add(sto);

		stock = new JTextField();
		stock.setBounds(318, 113, 100, 25);
		getContentPane().add(stock);

		stom = new JLabel("Stock Minimo: ");
		stom.setBounds(170, 77, 100, 25);
		getContentPane().add(stom);

		stock_min = new JTextField();
		stock_min.setBounds(170, 113, 100, 25);
		getContentPane().add(stock_min);

		guardar = new JButton("Guardar");
		guardar.setBounds(30, 251, 200, 44);
		guardar.addActionListener(this);
		getContentPane().add(guardar);

		borrar = new JButton("Limpiar");
		borrar.setBounds(364, 251, 200, 44);
		borrar.addActionListener(this);
		getContentPane().add(borrar);

		listado = new JLabel("Listado de Articulos: ");
		listado.setBounds(30, 306, 200, 25);
		getContentPane().add(listado);

		// Creamos la tabla y la insertamos en la ventan
		tabla = new JTable();
		sc = new JScrollPane(tabla);
		sc.setBounds(30, 342, 534, 220);
		getContentPane().add(sc);

		JLabel nuevo = new JLabel("Introduce un articulo:");
		nuevo.setBounds(30, 32, 240, 34);
		getContentPane().add(nuevo);

		con = new ConexionArticulos();
		con.MostrarArticulos(tabla);
		con.desconectar();

	}

	/**
	 * metodo que limpia todos los campos de texto
	 */
	public void limpiar() {

		codigo.setText("");
		descripcion.setText("");
		precio.setText("");
		stock.setText("");
		stock_min.setText("");
	}

	public static void main(String[] args) {

		ArticulosTest fo = new ArticulosTest();

		fo.setVisible(true);
		fo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fo.setTitle("ARTICULOS");
		fo.setSize(620, 700);
		fo.setLocationRelativeTo(null);

	}

	/**
	 * metodo que implementa la funcion de los botones
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		try {

			// boton guardar
			if (e.getSource() == guardar) {

				String code = codigo.getText();
				String desc = descripcion.getText();
				String price = String.valueOf(precio.getText());
				String stocki = String.valueOf(stock.getText());
				String stokim = String.valueOf(stock_min.getText());

				// Comprobamos si los campos obligatorios estan vacios
				if (code.isEmpty()) {
					JOptionPane.showMessageDialog(null, "El campo codigo es obligatorio", "Aviso",
							JOptionPane.WARNING_MESSAGE);
				} else {
					// Establecemos conexion para inserta el nuevo registro en la base de datos
					con = new ConexionArticulos();
					con.insertarArticulos(code, desc, price, stocki, stokim);
					con.MostrarArticulos(tabla);
					con.desconectar();
					limpiar();
				}

			}

			// boton de borrar
			if (e.getSource() == borrar) {
				limpiar();
			}

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Los valores introducidos no son correctos", "Error al guardar",
					JOptionPane.ERROR_MESSAGE);

		}
	}
}

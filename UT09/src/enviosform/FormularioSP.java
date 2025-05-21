package enviosform;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FormularioSP extends JFrame implements ActionListener {

	/*
	 * componentes de la ventan
	 */

	private JTextField proveedor, pieza, cant;
	private JButton guardar, borrar;
	private JLabel nueva, listado, pro, pie, can;
	private JScrollPane sc;
	private JTable tabla;

	/*
	 * Conexion a la base de datos para acceder a la tabla P
	 */
	private ConexionSP con;

	public FormularioSP() {

		setLayout(null);

		nueva = new JLabel("Introduce un nuevo envio: ");
		nueva.setBounds(30, 20, 200, 25);
		add(nueva);

		pro = new JLabel("Proveedor: ");
		pro.setBounds(30, 60, 60, 25);
		add(pro);

		proveedor = new JTextField();
		proveedor.setBounds(90, 60, 100, 25);
		add(proveedor);

		pie = new JLabel("Pieza: ");
		pie.setBounds(220, 60, 60, 25);
		add(pie);

		pieza = new JTextField();
		pieza.setBounds(280, 60, 100, 25);
		add(pieza);

		can = new JLabel("Cantidad: ");
		can.setBounds(30, 100, 60, 25);
		add(can);

		cant = new JTextField();
		cant.setBounds(90, 100, 100, 25);
		add(cant);

		guardar = new JButton("Guardar");
		guardar.setBounds(90, 160, 130, 25);
		guardar.addActionListener(this);
		add(guardar);

		borrar = new JButton("Borrar");
		borrar.setBounds(250, 160, 130, 25);
		borrar.addActionListener(this);
		add(borrar);

		listado = new JLabel("Listado de envios: ");
		listado.setBounds(30, 210, 200, 25);
		add(listado);

		// Creamos la tabla y la insertamos en la ventan
		tabla = new JTable();
		sc = new JScrollPane(tabla);
		sc.setBounds(30, 240, 360, 130);
		add(sc);

		con = new ConexionSP();
		con.MostrarSP(tabla);
		con.desconectar();

	}

	/**
	 * metodo que limpia todos los campos de texto
	 */
	public void limpiar() {

		proveedor.setText("");
		pieza.setText("");
		cant.setText("");
	}

	public static void main(String[] args) {

		FormularioSP fo = new FormularioSP();

		fo.setVisible(true);
		fo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fo.setTitle("ENVIOS");
		fo.setSize(450, 420);
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

				String prov = proveedor.getText();
				String piez = pieza.getText();
				String canti = String.valueOf(cant.getText());

				// Comprobamos si los campos obligatorios estan vacios
				if (prov.isEmpty() || piez.isEmpty() || canti.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Los campos no pueden estar en blanco", "Aviso",
							JOptionPane.WARNING_MESSAGE);
				} else {
					// Establecemos conexion para inserta el nuevo registro en la base de datos
					con = new ConexionSP();
					con.insertarSP(prov, piez, canti);
					con.MostrarSP(tabla);
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

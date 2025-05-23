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

		getContentPane().setLayout(null);

		pro = new JLabel("Proveedor: ");
		pro.setBounds(30, 30, 100, 25);
		getContentPane().add(pro);

		proveedor = new JTextField();
		proveedor.setBounds(30, 60, 100, 25);
		getContentPane().add(proveedor);

		pie = new JLabel("Pieza: ");
		pie.setBounds(170, 30, 100, 25);
		getContentPane().add(pie);

		pieza = new JTextField();
		pieza.setBounds(170, 60, 100, 25);
		getContentPane().add(pieza);

		can = new JLabel("Cantidad: ");
		can.setBounds(310, 30, 100, 25);
		getContentPane().add(can);

		cant = new JTextField();
		cant.setBounds(310, 60, 100, 25);
		getContentPane().add(cant);

		guardar = new JButton("Guardar");
		guardar.setBounds(30, 110, 150, 25);
		guardar.addActionListener(this);
		getContentPane().add(guardar);

		borrar = new JButton("Limpiar");
		borrar.setBounds(260, 110, 150, 25);
		borrar.addActionListener(this);
		getContentPane().add(borrar);

		listado = new JLabel("Listado de envios: ");
		listado.setBounds(30, 170, 200, 25);
		getContentPane().add(listado);

		// Creamos la tabla y la insertamos en la ventan
		tabla = new JTable();
		sc = new JScrollPane(tabla);
		sc.setBounds(30, 206, 380, 220);
		getContentPane().add(sc);

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
		fo.setSize(460, 495);
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
				if (prov.isEmpty() || piez.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Los campos proveedor y pieza son obligatorios", "Aviso",
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

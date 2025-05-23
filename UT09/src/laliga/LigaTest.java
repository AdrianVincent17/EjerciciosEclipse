package laliga;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class LigaTest extends JFrame implements ActionListener {

	/*
	 * componentes de la ventan
	 */

	private JTextField nombre, estadio, ciudad, fundacion;
	private JButton guardar, borrar;
	private JLabel nueva, listado, nom, est, ciu, fun;
	private JScrollPane sc;
	private JTable tabla;

	/*
	 * Conexion a la base de datos para acceder a la tabla P
	 */
	private ConexionLiga con;

	public LigaTest() {

		getContentPane().setLayout(null);

		nueva = new JLabel("Introduce un nuevo Club: ");
		nueva.setBounds(30, 20, 200, 25);
		getContentPane().add(nueva);

		nom = new JLabel("Nombre: ");
		nom.setBounds(30, 60, 60, 25);
		getContentPane().add(nom);

		nombre = new JTextField();
		nombre.setBounds(110, 56, 120, 25);
		getContentPane().add(nombre);

		ciu = new JLabel("Ciudad: ");
		ciu.setBounds(262, 60, 93, 25);
		getContentPane().add(ciu);

		ciudad = new JTextField();
		ciudad.setBounds(345, 60, 120, 25);
		getContentPane().add(ciudad);

		est = new JLabel("Estadio: ");
		est.setBounds(30, 96, 60, 25);
		getContentPane().add(est);

		estadio = new JTextField();
		estadio.setBounds(110, 96, 120, 25);
		getContentPane().add(estadio);

		fun = new JLabel("Fundacion: ");
		fun.setBounds(262, 96, 93, 25);
		getContentPane().add(fun);

		fundacion = new JTextField();
		fundacion.setBounds(345, 96, 120, 25);
		getContentPane().add(fundacion);

		guardar = new JButton("Guardar");
		guardar.setBounds(30, 140, 203, 25);
		guardar.addActionListener(this);
		getContentPane().add(guardar);

		borrar = new JButton("Borrar");
		borrar.setBounds(262, 140, 203, 25);
		borrar.addActionListener(this);
		getContentPane().add(borrar);

		listado = new JLabel("Clubes de LaLiga: ");
		listado.setBounds(30, 194, 200, 25);
		getContentPane().add(listado);

		// Creamos la tabla y la insertamos en la ventan
		tabla = new JTable();
		sc = new JScrollPane(tabla);
		sc.setBounds(30, 230, 435, 130);
		getContentPane().add(sc);

		con = new ConexionLiga();
		con.MostrarLiga(tabla);
		con.desconectar();

	}

	/**
	 * metodo que limpia todos los campos de texto
	 */
	public void limpiar() {

		nombre.setText("");
		ciudad.setText("");
		estadio.setText("");
		fundacion.setText("");

	}

	public static void main(String[] args) {

		LigaTest fo = new LigaTest();

		fo.setVisible(true);
		fo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fo.setTitle("Clubes de Fútbol");
		fo.setSize(520, 450);
		fo.setLocationRelativeTo(null);
		fo.setResizable(false);

	}

	/**
	 * metodo que implementa la funcion de los botones
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		try {

			// boton guardar
			if (e.getSource() == guardar) {

				String name = nombre.getText();
				String city = ciudad.getText();
				String estad = estadio.getText();
				String fundat = fundacion.getText();

				// Comprobamos si los campos obligatorios estan vacios
				if (name.isEmpty() || city.isEmpty() || fundat.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Los campos nombre, ciudad y año de fundacion son obligatorios",
							"Aviso", JOptionPane.WARNING_MESSAGE);
				} else {
					// Establecemos conexion para inserta el nuevo registro en la base de datos
					con = new ConexionLiga();
					con.insertarLiga(name, city, estad, fundat);
					con.MostrarLiga(tabla);
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

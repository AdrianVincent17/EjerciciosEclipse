package allTablas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Formulario extends JFrame implements ActionListener {

	private JTextField codigo, nombre, color, peso, ciudad, codigoS, nombreS, estadoS, ciudadS, spSnTF, spPnTF,
			spCantTF;
	private JLabel nueva, listado, cod, nom, col, pes, ciu, codS, nomS, estS, ciuS, spSn, spPn, spCant;
	private JButton guardar, borrar;
	private JScrollPane sc;
	private JTable tabla;

	private boolean tablaSActiva, tablaPActiva, tablaSPActiva;

	JMenuItem tablaPMenu;
	JMenuItem tablaSMenu;
	JMenuItem tablaSPMenu;

	// Conexion a la base de datos para acceder a la tabla
	private conexionBD con;

	public Formulario() {

		tablaP();

		// Creamos la tabla

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuMain = new JMenu("Formulario");
		menuBar.add(menuMain);

		tablaPMenu = new JMenuItem("Tabla P");
		tablaPMenu.addActionListener(this);
		menuMain.add(tablaPMenu);

		tablaSMenu = new JMenuItem("Tabla S");
		tablaSMenu.addActionListener(this);
		menuMain.add(tablaSMenu);

		tablaSPMenu = new JMenuItem("Tabla SP");
		tablaSPMenu.addActionListener(this);
		menuMain.add(tablaSPMenu);
		con.desconectar();

	}

	public void limpiar() {
		try {
			codigo.setText("");
			nombre.setText("");
			color.setText("");
			peso.setText("");
			ciudad.setText("");
			color.setText("");
			peso.setText("");
			ciudad.setText("");
			codigoS.setText("");
			nombreS.setText("");
			estadoS.setText("");
			ciudadS.setText("");
			spSnTF.setText("");
			spPnTF.setText("");
			spCantTF.setText("");
		} catch (Exception e) {
			System.out.println("Se ha limpiado correctamente.");
		}

	}

	public static void main(String[] args) {

		Formulario pt = new Formulario();
		pt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pt.setTitle("PIEZAS");
		pt.setSize(440, 500);
		pt.setLocationRelativeTo(null);
		pt.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == tablaPMenu) {
			setTitle("Tabla P");
			tablaP();
		}

		if (e.getSource() == tablaSMenu) {
			setTitle("Tabla S");
			tablaS();
		}

		if (e.getSource() == tablaSPMenu) {
			setTitle("Tabla SP");
			tablaSP();
		}

		if (e.getSource() == borrar) {
			limpiar();
		}

		if (e.getSource() == guardar) {
			if (tablaPActiva) {
				String code = codigo.getText();
				String name = nombre.getText();
				String colour = color.getText();
				String weight = peso.getText();
				String city = ciudad.getText();

				if (code.isBlank() || name.isBlank() || city.isBlank()) {

					JOptionPane.showMessageDialog(null, "Los campos Código, Nombre y Ciudad son obligatorios", "",
							JOptionPane.WARNING_MESSAGE);

				} else {

					con = new conexionBD();
					con.insertarP(code, name, colour, weight, city);
					tablaP();
					con.desconectar();

					limpiar();

				}
			} else if (tablaSActiva) {

				String code = codigoS.getText();
				String name = nombreS.getText();
				String estado = estadoS.getText();
				String city = ciudadS.getText();

				if (code.isBlank() || name.isBlank() || city.isBlank()) {

					JOptionPane.showMessageDialog(null, "Los campos Código, Nombre y Ciudad son obligatorios", "",
							JOptionPane.WARNING_MESSAGE);

				} else {

					con = new conexionBD();
					con.insertarS(code, name, estado, city);
					tablaS();
					con.desconectar();

					limpiar();

				}

			} else if (tablaSPActiva) {

				String sn = spSnTF.getText();
				String pn = spPnTF.getText();
				String cant = spCantTF.getText();

				if (sn.isBlank() || pn.isBlank()) {

					JOptionPane.showMessageDialog(null, "Los campos Proveedor y Pieza son obligatorios", "",
							JOptionPane.WARNING_MESSAGE);

				} else {

					con = new conexionBD();
					con.insertarSP(sn, pn, cant);
					tablaSP();
					con.desconectar();

					limpiar();

				}

			}
		}
	}

	private void tablaP() {
		getContentPane().removeAll();

		tablaPActiva = true;
		tablaSActiva = false;
		tablaSPActiva = false;

		getContentPane().setLayout(null);

		nueva = new JLabel("Introduce una nueva pieza: ");
		nueva.setBounds(30, 20, 200, 25);
		getContentPane().add(nueva);

		cod = new JLabel("Código: ");
		cod.setBounds(30, 60, 60, 25);
		getContentPane().add(cod);
		codigo = new JTextField();
		codigo.setBounds(90, 60, 100, 25);
		getContentPane().add(codigo);

		nom = new JLabel("Nombre: ");
		nom.setBounds(30, 100, 60, 25);
		getContentPane().add(nom);
		nombre = new JTextField();
		nombre.setBounds(90, 100, 100, 25);
		getContentPane().add(nombre);

		col = new JLabel("Color: ");
		col.setBounds(30, 140, 60, 25);
		getContentPane().add(col);
		color = new JTextField();
		color.setBounds(90, 140, 100, 25);
		getContentPane().add(color);

		pes = new JLabel("Peso: ");
		pes.setBounds(220, 100, 60, 25);
		getContentPane().add(pes);
		peso = new JTextField();
		peso.setBounds(280, 100, 100, 25);
		getContentPane().add(peso);

		ciu = new JLabel("Ciudad: ");
		ciu.setBounds(220, 140, 60, 25);
		getContentPane().add(ciu);
		ciudad = new JTextField();
		ciudad.setBounds(280, 140, 100, 25);
		getContentPane().add(ciudad);

		guardar = new JButton("Guardar");
		guardar.setBounds(100, 200, 130, 25);
		guardar.addActionListener(this);
		getContentPane().add(guardar);

		borrar = new JButton("Borrar");
		borrar.setBounds(250, 200, 130, 25);
		borrar.addActionListener(this);
		getContentPane().add(borrar);

		listado = new JLabel("Listado de piezas: ");
		listado.setBounds(30, 260, 200, 25);
		getContentPane().add(listado);

		tabla = new JTable();
		sc = new JScrollPane(tabla);
		sc.setBounds(30, 300, 360, 130);
		getContentPane().add(sc);

		con = new conexionBD();
		con.setQuery("SELECT * FROM P");
		con.mostrarP(tabla);

		getContentPane().repaint();
	}

	private void tablaS() {
		getContentPane().removeAll();

		tablaPActiva = false;
		tablaSActiva = true;
		tablaSPActiva = false;

		getContentPane().setLayout(null);

		// cambiar diseño

		nueva = new JLabel("Introduce un nuevo Suministrador: ");
		nueva.setBounds(30, 20, 200, 25);
		getContentPane().add(nueva);

		codS = new JLabel("Código: ");
		codS.setBounds(30, 60, 60, 25);
		getContentPane().add(codS);
		codigoS = new JTextField();
		codigoS.setBounds(90, 60, 100, 25);
		getContentPane().add(codigoS);

		nomS = new JLabel("Nombre: ");
		nomS.setBounds(30, 100, 60, 25);
		getContentPane().add(nomS);
		nombreS = new JTextField();
		nombreS.setBounds(90, 100, 100, 25);
		getContentPane().add(nombreS);

		estS = new JLabel("Estado: ");
		estS.setBounds(30, 140, 60, 25);
		getContentPane().add(estS);
		estadoS = new JTextField();
		estadoS.setBounds(90, 140, 100, 25);
		getContentPane().add(estadoS);

		ciuS = new JLabel("Ciudad: ");
		ciuS.setBounds(220, 140, 60, 25);
		getContentPane().add(ciuS);
		ciudadS = new JTextField();
		ciudadS.setBounds(280, 140, 100, 25);
		getContentPane().add(ciudadS);

		guardar = new JButton("Guardar");
		guardar.setBounds(100, 200, 130, 25);
		guardar.addActionListener(this);
		getContentPane().add(guardar);

		borrar = new JButton("Borrar");
		borrar.setBounds(250, 200, 130, 25);
		borrar.addActionListener(this);
		getContentPane().add(borrar);

		listado = new JLabel("Listado de Suministradores: ");
		listado.setBounds(30, 260, 200, 25);
		getContentPane().add(listado);

		// cambiar diseño

		tabla = new JTable();
		sc = new JScrollPane(tabla);
		sc.setBounds(30, 300, 360, 130);
		getContentPane().add(sc);

		con = new conexionBD();
		con.setQuery("SELECT * FROM S");
		con.mostrarP(tabla);

		getContentPane().repaint();

	}

	private void tablaSP() {
		getContentPane().removeAll();

		tablaPActiva = false;
		tablaSActiva = false;
		tablaSPActiva = true;

		getContentPane().setLayout(null);

		// cambiar diseño

		nueva = new JLabel("Introduce un nuevo envio: ");
		nueva.setBounds(30, 20, 200, 25);
		getContentPane().add(nueva);

		spSn = new JLabel("Proveedor: ");
		spSn.setBounds(30, 60, 90, 25);
		getContentPane().add(spSn);
		spSnTF = new JTextField();
		spSnTF.setBounds(110, 60, 90, 25);
		getContentPane().add(spSnTF);

		spPn = new JLabel("Pieza: ");
		spPn.setBounds(30, 100, 60, 25);
		getContentPane().add(spPn);
		spPnTF = new JTextField();
		spPnTF.setBounds(110, 100, 90, 25);
		getContentPane().add(spPnTF);

		spCant = new JLabel("Cantidad: ");
		spCant.setBounds(220, 100, 60, 25);
		getContentPane().add(spCant);
		spCantTF = new JTextField();
		spCantTF.setBounds(300, 100, 90, 25);
		getContentPane().add(spCantTF);

		guardar = new JButton("Guardar");
		guardar.setBounds(110, 170, 130, 25);
		guardar.addActionListener(this);
		getContentPane().add(guardar);

		borrar = new JButton("Borrar");
		borrar.setBounds(260, 170, 130, 25);
		borrar.addActionListener(this);
		getContentPane().add(borrar);

		listado = new JLabel("Listado de Envíos: ");
		listado.setBounds(30, 210, 200, 25);
		getContentPane().add(listado);

		// cambiar diseño

		tabla = new JTable();
		sc = new JScrollPane(tabla);
		sc.setBounds(30, 250, 360, 170);
		getContentPane().add(sc);

		con = new conexionBD();
		con.setQuery("SELECT * FROM SP");
		con.mostrarP(tabla);

		getContentPane().repaint();
	}
}

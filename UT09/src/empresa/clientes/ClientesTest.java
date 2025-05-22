package empresa.clientes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ClientesTest extends JFrame implements ActionListener {

	JTable tabla;
	JScrollPane sc;
	JButton boton, borrar;
	JLabel cliente, nombre, localidad, vendedor, debe, haber, limite, insertaclientes, listado;
	JTextField cli, nom, loc, vend, deb, hab, lim;
	JPanel panel;

	// objeto de la clase donde se realiza la conexion
	ConexionClientes con;

	ClientesTest() {
		getContentPane().setLayout(null);

		insertaclientes = new JLabel("Inserta un nuevo cliente: ");
		insertaclientes.setHorizontalAlignment(SwingConstants.LEFT);
		insertaclientes.setBounds(60, 30, 150, 25);
		getContentPane().add(insertaclientes);

		boton = new JButton("Inserta"); // new ImageIcon("D:\\PR\\ ... ")
		boton.addActionListener(this); // implements ActionListener
		boton.setBounds(90, 220, 120, 25);
		getContentPane().add(boton);

		borrar = new JButton("Borrar"); // new ImageIcon("D:\\PR\\ ... ")
		borrar.addActionListener(this); // implements ActionListener
		borrar.setBounds(270, 220, 120, 25);
		getContentPane().add(borrar);

		cliente = new JLabel("Cliente: ");
		cliente.setHorizontalAlignment(SwingConstants.LEFT);
		cliente.setBounds(30, 70, 80, 25);
		getContentPane().add(cliente);

		cli = new JTextField(5);
		cli.setHorizontalAlignment(SwingConstants.LEFT);
		cli.setBounds(100, 70, 80, 25);
		getContentPane().add(cli);

		nombre = new JLabel("Nombre: ");
		nombre.setHorizontalAlignment(SwingConstants.LEFT);
		nombre.setBounds(30, 105, 80, 25);
		getContentPane().add(nombre);

		nom = new JTextField();
		nom.setHorizontalAlignment(SwingConstants.LEFT);
		nom.setBounds(100, 105, 80, 25);
		getContentPane().add(nom);

		localidad = new JLabel("Localidad: ");
		localidad.setHorizontalAlignment(SwingConstants.LEFT);
		localidad.setBounds(30, 140, 80, 25);
		getContentPane().add(localidad);

		loc = new JTextField();
		loc.setHorizontalAlignment(SwingConstants.LEFT);
		loc.setBounds(100, 140, 80, 25);
		getContentPane().add(loc);

		vendedor = new JLabel("Vendedor: ");
		vendedor.setHorizontalAlignment(SwingConstants.LEFT);
		vendedor.setBounds(30, 180, 80, 25);
		getContentPane().add(vendedor);

		vend = new JTextField();
		vend.setHorizontalAlignment(SwingConstants.LEFT);
		vend.setBounds(100, 180, 80, 25);
		getContentPane().add(vend);

		debe = new JLabel("Debe: ");
		debe.setHorizontalAlignment(SwingConstants.LEFT);
		debe.setBounds(230, 100, 80, 25);
		getContentPane().add(debe);

		deb = new JTextField();
		deb.setHorizontalAlignment(SwingConstants.LEFT);
		deb.setBounds(280, 100, 80, 25);
		getContentPane().add(deb);

		haber = new JLabel("Haber: ");
		haber.setHorizontalAlignment(SwingConstants.LEFT);
		haber.setBounds(230, 140, 80, 25);
		getContentPane().add(haber);

		hab = new JTextField();
		hab.setHorizontalAlignment(SwingConstants.LEFT);
		hab.setBounds(280, 140, 80, 25);
		getContentPane().add(hab);

		limite = new JLabel("Limite: ");
		limite.setHorizontalAlignment(SwingConstants.LEFT);
		limite.setBounds(230, 180, 80, 25);
		getContentPane().add(limite);

		lim = new JTextField();
		lim.setHorizontalAlignment(SwingConstants.LEFT);
		lim.setBounds(280, 180, 80, 25);
		getContentPane().add(lim);

		listado = new JLabel("Listado de clientes: ");
		listado.setHorizontalAlignment(SwingConstants.LEFT);
		listado.setBounds(30, 280, 150, 25);
		getContentPane().add(listado);

		// creamos la tabla y la insertamos en la ventana
		tabla = new JTable();
		sc = new JScrollPane(tabla);
		sc.setBounds(30, 320, 450, 200);
		getContentPane().add(sc);

		// añadimos a la conexión la tabla
		con = new ConexionClientes(); // creamos el objeto de la clase donde se realiza la conexion
		con.mostrarTabla(tabla);
		con.desconectar();

		setSize(532, 472);
	}

	public static void main(String[] args) {
		ClientesTest v = new ClientesTest();
		v.setTitle("CLIENTES"); // título de la ventana
		v.setSize(550, 600); // dimensiones(ancho, alto)
		v.setLocationRelativeTo(null); // ventana en el centro
		v.setVisible(true); // visibilidad
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void limpiar() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {

			if (e.getSource() == boton) {
				/* CAMBIAR */
				String cliente = cli.getText();
				String nombre = nom.getText();
				String local = loc.getText();
				String vendor = vend.getText();
				String debe = deb.getText();
				String haber = hab.getText();
				String limite = lim.getText();

				// comprobmaos si los campos están vacios
				if (cliente.isEmpty() || nombre.isEmpty() || local.isEmpty() || debe.isBlank() || haber.isEmpty()
						|| limite.isEmpty()) {
					JOptionPane.showMessageDialog(null,
							"Los campos Cliente, Nombre, Localidad, Debe y Haber son obligatorios", "ERROR",
							JOptionPane.WARNING_MESSAGE);
				} else {
					// establecemos la conexión para insertar el nuevo registro y mostrar la tabla
					/* CAMBIAR */
					con = new ConexionClientes();
					con.insertar(cliente, nombre, local, vendor, debe, haber, limite);
					con.mostrarTabla(tabla);
					con.desconectar();

					limpiar();
				}
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Los valores introducidos no son correctos", "Error al guardar",
					JOptionPane.WARNING_MESSAGE);
		}

	}

}

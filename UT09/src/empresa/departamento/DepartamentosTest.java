package empresa.departamento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class DepartamentosTest extends JFrame implements ActionListener {

	JLabel numDep, depNom, localidad, label;
	JTextField depNumtf, depNomtf, loctf;
	JTable tabla;
	JScrollPane sc;
	JButton boton, boton2;

	ConexionDepartamentos con;

	DepartamentosTest() {

		getContentPane().setLayout(null);

		numDep = new JLabel("Localidad:");
		numDep.setBounds(343, 33, 133, 25); // (x, y, ANCHO, ALTO)

		depNumtf = new JTextField();
		depNumtf.setBounds(22, 57, 111, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(numDep);
		getContentPane().add(depNumtf);

		depNom = new JLabel("Nombre:");
		depNom.setBounds(180, 33, 133, 25);
		getContentPane().add(depNom);

		depNomtf = new JTextField();
		depNomtf.setBounds(180, 57, 111, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(depNomtf);

		localidad = new JLabel("Nº departamento:");
		localidad.setBounds(22, 33, 133, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(localidad);

		loctf = new JTextField();
		loctf.setBounds(343, 57, 111, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(loctf);

		label = new JLabel("Listado de departamentos:");
		label.setBounds(22, 124, 168, 41); // (x, y, ANCHO, ALTO)
		getContentPane().add(label);

		// creamos la tabla y la insertamos en la ventana
		tabla = new JTable();
		sc = new JScrollPane(tabla);
		sc.setBounds(22, 157, 432, 134);
		getContentPane().add(sc);

		boton = new JButton("Guardar");
		boton.setBounds(229, 124, 111, 25); // (x, y ANCHO, ALTO)
		boton.addActionListener(this);
		getContentPane().add(boton);

		boton2 = new JButton("Limpiar");
		boton2.setBounds(350, 124, 104, 25); // (x, y ANCHO, ALTO)
		boton2.addActionListener(this);
		getContentPane().add(boton2);

		setSize(492, 343);

		con = new ConexionDepartamentos(); // creamos el objeto de la clase donde se realiza la conexion
		con.mostrarTabla(tabla);
		con.desconectar();

	}

	public static void main(String[] args) {
		DepartamentosTest v = new DepartamentosTest();
		v.setTitle("DEPARTAMENTOS"); // título de la ventana
		v.setLocationRelativeTo(null); // ventana en el centro
		v.setVisible(true); // visibilidad
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void limpiar() {
		depNumtf.setText("");
		depNomtf.setText("");
		loctf.setText("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == boton2) {
				limpiar();
			}

			if (e.getSource() == boton) {
				/* CAMBIAR */
				String dep_no = depNumtf.getText();
				String dnombre = depNomtf.getText();
				String localidad = loctf.getText();

				// comprobmaos si los campos están vacios
				if (dep_no.isEmpty() || dnombre.isEmpty() || localidad.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Los campos Departamento, Nombre y Localidad son obligatorios",
							"ERROR", JOptionPane.WARNING_MESSAGE);
				} else {
					// establecemos la conexión para insertar el nuevo registro y mostrar la tabla
					/* CAMBIAR */
					con = new ConexionDepartamentos();
					con.insertar(dep_no, dnombre, localidad);
					con.mostrarTabla(tabla);
					con.desconectar();
				}
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Los valores introducidos no son correctos", "Error al guardar",
					JOptionPane.WARNING_MESSAGE);
			System.out.println(ex.getMessage());
		}

	}

}

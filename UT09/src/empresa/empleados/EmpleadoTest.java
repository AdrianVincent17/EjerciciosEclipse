package empresa.empleados;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class EmpleadoTest extends JFrame implements ActionListener {

	JLabel empL, apellidoL, oficioL, directorL, fechaL, salarioL, comisionL, depL;
	JTextField empTF, apeTF, ofiTF, directorTF, fechaTF, salarioTF, comisionTF, depTF;
	JButton boton, boton2;
	JTable tabla;
	JScrollPane sc;
	private JLabel lblNewLabel;

	ConexionEmpleados con;

	EmpleadoTest() {
		getContentPane().setLayout(null);

		empL = new JLabel("Nº empleado: ");
		empL.setBounds(38, 37, 87, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(empL);

		empTF = new JTextField();
		empTF.setBounds(127, 37, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(empTF);

		apellidoL = new JLabel("Apellido: ");
		apellidoL.setBounds(61, 73, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(apellidoL);

		apeTF = new JTextField();
		apeTF.setBounds(127, 73, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(apeTF);

		oficioL = new JLabel("Oficio: ");
		oficioL.setBounds(71, 109, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(oficioL);

		ofiTF = new JTextField();
		ofiTF.setBounds(127, 109, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(ofiTF);

		directorL = new JLabel("Director: ");
		directorL.setBounds(61, 145, 68, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(directorL);

		directorTF = new JTextField();
		directorTF.setBounds(127, 145, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(directorTF);

		fechaL = new JLabel("Fecha: ");
		fechaL.setBounds(285, 37, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(fechaL);

		fechaTF = new JTextField();
		fechaTF.setBounds(339, 37, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(fechaTF);

		salarioL = new JLabel("Salario: ");
		salarioL.setBounds(280, 73, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(salarioL);

		salarioTF = new JTextField();
		salarioTF.setBounds(339, 73, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(salarioTF);

		comisionL = new JLabel("Comisión: ");
		comisionL.setBounds(270, 109, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(comisionL);

		comisionTF = new JTextField();
		comisionTF.setBounds(339, 109, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(comisionTF);

		depL = new JLabel("Departamento: ");
		depL.setBounds(242, 145, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(depL);

		depTF = new JTextField();
		depTF.setBounds(339, 145, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(depTF);

		lblNewLabel = new JLabel("Listado de empleados:");
		lblNewLabel.setBounds(31, 230, 166, 14);
		getContentPane().add(lblNewLabel);

		boton = new JButton("Ingresar");
		boton.setBounds(127, 194, 100, 25); // (x, y ANCHO, ALTO)
		boton.addActionListener(this);
		getContentPane().add(boton);

		boton2 = new JButton("Limpiar");
		boton2.setBounds(255, 194, 100, 25); // (x, y ANCHO, ALTO)
		boton2.addActionListener(this);
		getContentPane().add(boton2);

		tabla = new JTable();
		sc = new JScrollPane(tabla);
		sc.setBounds(31, 254, 432, 134);
		getContentPane().add(sc);

		// añadimos a la conexión la tabla
		con = new ConexionEmpleados(); // creamos el objeto de la clase donde se realiza la conexion
		con.mostrarTabla(tabla);
		con.desconectar();

		setSize(512, 447);
	}

	public static void main(String[] args) {
		EmpleadoTest v = new EmpleadoTest();

		v.setTitle("EMPLEADOS"); // título de la ventana
		v.setLocationRelativeTo(null); // ventana en el centro
		v.setVisible(true); // visibilidad
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void limpiar() {
		empTF.setText("");
		apeTF.setText("");
		ofiTF.setText("");
		directorTF.setText("");
		fechaTF.setText("");
		salarioTF.setText("");
		comisionTF.setText("");
		depTF.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {

			if (e.getSource() == boton2) {
				limpiar();
			}

			if (e.getSource() == boton) {
				/* CAMBIAR */
				String emp_no = empTF.getText();
				String apellido = apeTF.getText();
				String oficio = ofiTF.getText();
				String director = directorTF.getText();
				String fecha = fechaTF.getText();
				String salario = salarioTF.getText();
				String comision = comisionTF.getText();
				String dep_no = depTF.getText();

				// comprobmaos si los campos están vacios
				if (emp_no.isEmpty() || apellido.isEmpty() || oficio.isEmpty() || salario.isEmpty()
						|| dep_no.isEmpty()) {
					JOptionPane.showMessageDialog(null,
							"Los campos Empleado, Apellido, Oficio, Salario y Departamento son obligatorios", "ERROR",
							JOptionPane.WARNING_MESSAGE);
				} else {
					// establecemos la conexión para insertar el nuevo registro y mostrar la tabla
					/* CAMBIAR */
					con = new ConexionEmpleados();
					con.insertar(emp_no, apellido, oficio, director, fecha, salario, comision, dep_no);
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

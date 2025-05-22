package empresa.empleados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConexionEmpleados {

	private Connection conexion = null; // variable para crear conexión
	private String nombreBD = "C:\\programacion\\empresa\\empresa"; /* CAMBIAR ruta del archivo */
	private String driver = "org.hsqldb.jdbcDriver"; // driver usado para conectar a odb
	private String url = "jdbc:hsqldb:file:" + nombreBD; // URL de nuestra BD

	ConexionEmpleados() {
		try {
			if (conexion == null) {
				Class.forName(driver);
				conexion = DriverManager.getConnection(url);
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se ha podido establecer la conexión con la BD", "Error de conexión",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Método para terminar la conexión a la base de datos
	 */
	public void desconectar() {
		try {
			conexion.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al cerrar la conexión con la BD", "Error de conexión",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Inserta una nueva tupla en la tabla
	 * 
	 * @param emp_no
	 * @param apellido
	 * @param oficio
	 * @param director
	 * @param fecha_alta
	 */
	public void insertar(String emp_no, String apellido, String oficio, String director, String fecha_alta,
			String salario, String comision, String dep_no) {
		try {
			/* CAMBIAR */
			String sql = "INSERT INTO EMPLEADOS VALUES (?,?,?,?,?,?,?,?);";

			// Permite ejecutar consultas SQL con parámetros dinámicos
			PreparedStatement pst = conexion.prepareStatement(sql);

			/* CAMBIAR */
			// asigna valores a cada '?'
			pst.setInt(1, Integer.parseInt(emp_no));
			pst.setString(2, apellido);
			pst.setString(3, oficio);
			pst.setDouble(6, Double.parseDouble(salario));
			pst.setInt(8, Integer.parseInt(dep_no));

			// El campo color acepta nulos
			if (director.isEmpty()) {
				pst.setString(4, null);
			} else {
				pst.setInt(4, Integer.parseInt(director));
			}

			// El campo peso acepta nulos
			if (fecha_alta.isEmpty()) {
				pst.setString(5, null);
			} else {
				pst.setString(5, fecha_alta);
			}

			// El campo peso acepta nulos
			if (comision.isEmpty()) {
				pst.setString(7, null);
			} else {
				pst.setDouble(7, Double.parseDouble(comision));
			}

			// ejecuta la inserción
			pst.executeUpdate();

			pst.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"Datos incorrectos.\nComprueba que el código tiene 3 dígitos o carácteres y no está duplicado.",
					"Error al insertar el registro en la BD", JOptionPane.WARNING_MESSAGE);
		}
	}

	/**
	 * Método para mostrar datos de la BD en una tabla
	 * 
	 * @param JTable
	 */
	public void mostrarTabla(JTable t) {
		try {
			String consulta = "SELECT * FROM EMPLEADOS";

			// nos permite realizar operaciones SQL
			Statement st = conexion.createStatement(); // permite enviar sentencias
			ResultSet rs = st.executeQuery(consulta); // guarda los resultados de una consulta

			// crea un modelo de tabla
			DefaultTableModel modelo = new DefaultTableModel();

			/* CAMBIAR */
			String atributos[] = { "Número Empleado", "Apellido", "Oficio", "Director", "Fecha alta", "Salario",
					"Comisión", "Departamento" }; // los atributos que tenga la tabla

			// añadimos los atributos como columnas al modelo
			modelo.setColumnIdentifiers(atributos);

			// se crea una array que será una de las filas de la tabla
			Object[] fila = new Object[modelo.getColumnCount()];

			// bucle para cada resultado de la consulta
			while (rs.next()) {
				// añadimos las filas
				fila[0] = rs.getInt("emp_no");
				fila[1] = rs.getString("apellido");
				fila[2] = rs.getString("oficio");
				fila[3] = rs.getInt("director");
				fila[4] = rs.getString("fecha_alta");
				fila[5] = rs.getDouble("salario");
				fila[6] = rs.getDouble("comision");
				fila[7] = rs.getInt("dep_no");

				// for (int i = 0; i < fila.length; i++) {
				// fila[i] = rs.getString(atributos[i]);
				// }

				// se añade la fila completa al modelo de tabla
				modelo.addRow(fila);
			}

			// metemos los datos en la tabla
			t.setModel(modelo);

			st.close();
			rs.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla", "Error en la consulta",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

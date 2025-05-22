package empresa.clientes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConexionClientes {

	private Connection conexion = null; // variable para crear conexión
	private String nombreBD = "C:\\programacion\\empresa\\empresa"; /* CAMBIAR ruta del archivo */
	private String driver = "org.hsqldb.jdbcDriver"; // driver usado para conectar a odb
	private String url = "jdbc:hsqldb:file:" + nombreBD; // URL de nuestra BD

	ConexionClientes() {
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
	 * Método para mostrar datos de la BD en una tabla
	 * 
	 * @param JTable
	 */
	public void mostrarTabla(JTable t) {
		try {
			String consulta = "SELECT * FROM CLIENTES";

			// nos permite realizar operaciones SQL
			Statement st = conexion.createStatement(); // permite enviar sentencias
			ResultSet rs = st.executeQuery(consulta); // guarda los resultados de una consulta

			// crea un modelo de tabla
			DefaultTableModel modelo = new DefaultTableModel();
			/* CAMBIAR */
			String atributos[] = { "cl", "nombre", "localidad", "vendedor_no", "debe", "haber", "limite_credito" };

			// añadimos los atributos como columnas al modelo
			modelo.setColumnIdentifiers(atributos);

			// se crea una array que será una de las filas de la tabla
			Object[] fila = new Object[modelo.getColumnCount()];

			// bucle para cada resultado de la consulta
			while (rs.next()) {
				// añadimos las fila

				fila[0] = rs.getInt("cliente_no");
				fila[1] = rs.getString("nombre");
				fila[2] = rs.getString("localidad");
				fila[3] = rs.getInt("vendedor_no");
				fila[4] = rs.getInt("debe");
				fila[5] = rs.getInt("haber");
				fila[6] = rs.getInt("limite_credito");

//				for (int i = 0; i < fila.length; i++) {
//					fila[i] = rs.getString(atributos[i]);
//				}
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

	/**
	 * Inserta una nueva tupla en la tabla
	 * 
	 * @param cod
	 * @param nom
	 * @param col
	 * @param peso
	 * @param ciudad
	 */
	public void insertar(String cod, String nom, String localidad, String vendedor, String debe, String haber,
			String limite) {
		try {
			/* CAMBIAR */
			String sql = "INSERT INTO CLIENTES VALUES (?,?,?,?,?,?,?);";

			// Permite ejecutar consultas SQL con parámetros dinámicos
			PreparedStatement pst = conexion.prepareStatement(sql);

			/* CAMBIAR */
			// asigna valores a cada '?'
			pst.setInt(1, Integer.parseInt(cod));
			pst.setString(2, nom);
			pst.setString(3, localidad);
			pst.setInt(5, Integer.parseInt(debe));
			pst.setInt(6, Integer.parseInt(haber));
			pst.setInt(7, Integer.parseInt(limite));

			// El campo color acepta nulos
			if (vendedor.isEmpty()) {
				pst.setString(4, null);
			} else {
				pst.setInt(4, Integer.parseInt(vendedor));
			}

			// ejecuta la inserción
			pst.executeUpdate();

			pst.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error SQL: " + e.getMessage(),
					"Error al insertar el registro en la BD", JOptionPane.WARNING_MESSAGE);
			e.printStackTrace(); // muestra el error en consola
		}
	}

}

package enviostabla;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class Envios {

	// Variable que usamos para crear la conexion
	private Connection conexion = null;
	// nombre del archivo donde tenemos nuestra base de datos
	private String nombreDB = "C:\\Programacion\\envios\\envios";
	// Driver usado para conectarse
	private String driver = "org.hsqldb.jdbcDriver";
	// url
	private String url = "jdbc:hsqldb:file:" + nombreDB;

	/**
	 * metodo para obtener una conexion a la base de datos
	 * 
	 * @param conexion
	 */

	public Connection obtnerConexion() {

		try {
			if (conexion == null) {
				Class.forName(driver);
				conexion = DriverManager.getConnection(url);
				System.out.println("Conexion establecida correctamente");
			}

		} catch (Exception e) {
			System.out.println("Error al establecer la conexion");
		}
		return conexion;

	}

	/**
	 * Metodo que se utiliza para cerrar la conexion a la base de datos
	 */
	public void desconectar() {
		try {
			conexion.close();

		} catch (SQLException e) {
			System.out.println("Error al cerrar la conexion");
		}
	}

	public void mostrartabla(DefaultTableModel t) {

		try {
			String consulta = "SELECT * From SP";
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(consulta);

			Object[] fila = new Object[t.getColumnCount()];
			// Imprimimos el resultado
			while (rs.next()) {

				fila[0] = rs.getString("sn");
				fila[1] = rs.getString("pn");
				fila[2] = rs.getInt("cant");
				t.addRow(fila);
			}
			st.close();
			rs.close();

		} catch (SQLException e2) {
			System.out.println("Error en la consulta");
		}
	}

	public void mostrar() {

		try {
			String consulta = "Select * From SP";
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(consulta);

			// Imprimimos el resultado
			while (rs.next()) {
				System.out.print("\n" + rs.getString("sn"));
				System.out.print("\t" + rs.getString("sp"));
				System.out.print("\t" + rs.getString("cant"));
			}
			st.close();
			rs.close();

		} catch (SQLException e2) {
			System.out.println("Error en la consulta");
		}

	}

}

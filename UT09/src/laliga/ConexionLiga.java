package laliga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConexionLiga {

	// Variable que usamos para crear la conexion
	private Connection conexion = null;
	// nombre del archivo donde tenemos nuestra base de datos
	private String nombreDB = "C:\\Programacion\\liga\\liga";
	// Driver usado para conectarse
	private String driver = "org.hsqldb.jdbcDriver";
	// url
	private String url = "jdbc:hsqldb:file:" + nombreDB;

	/**
	 * metodo para obtener una conexion a la base de datos
	 * 
	 * @param conexion
	 */

	public ConexionLiga() {

		try {
			if (conexion == null) {
				Class.forName(driver);
				conexion = DriverManager.getConnection(url);

			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se ha podido establecer conexion con la BD", "Error de conexion",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	/**
	 * Metodo que se utiliza para cerrar la conexion a la base de datos
	 */
	public void desconectar() {
		try {
			conexion.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido cerrar la conexion con la BD", "Error de conexion",
					JOptionPane.ERROR_MESSAGE);

		}
	}

	/**
	 * metodo para mostrar dates de la base de datos en una tabla
	 * 
	 * @param JTable
	 */

	public void MostrarLiga(JTable t) {
		try {

			String consulta = "Select * From CLUB";

			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(consulta);

			DefaultTableModel modelo = new DefaultTableModel();

			String atributos[] = { "Nombre", "Ciudad", "Estadio", "Fundacion" };
			modelo.setColumnIdentifiers(atributos);

			Object[] fila = new Object[modelo.getColumnCount()];
			// Imprimimos el resultado
			while (rs.next()) {

				fila[0] = rs.getString("nombre");
				fila[1] = rs.getString("ciudad");
				fila[2] = rs.getString("estadio");
				fila[3] = rs.getInt("fundacion");
				modelo.addRow(fila);
			}

			t.setModel(modelo);

			st.close();
			rs.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla", "Error en la consulta",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * metodo que inserta una nueva pieza en la tabla P
	 * 
	 * @param cod  codigo de la pieza
	 * @param nom  nombre de la pieza
	 * @param col  color de la pieza
	 * @param pes  peso de la pieza
	 * @param ciud diudad de la pieza
	 */

	public void insertarLiga(String nom, String ciu, String est, String fun) {
		try {
			String sql = "INSERT INTO CLUB VALUES(?,?,?,?);";

			PreparedStatement pst = conexion.prepareStatement(sql);

			pst.setString(1, nom);
			pst.setString(2, ciu);

			// El campo color acepta nulos
			if (est.isEmpty()) {
				pst.setString(3, null);
			} else {
				pst.setString(3, est);
			}

			pst.setInt(4, Integer.parseInt(fun));

			pst.executeUpdate();
			pst.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"Datos incorrectos.\nComprueba que el nombre no esta duplicado y que el año de fundacion es correcto",
					"Error al insertar registros en la BD", JOptionPane.ERROR_MESSAGE);

		}
	}

}

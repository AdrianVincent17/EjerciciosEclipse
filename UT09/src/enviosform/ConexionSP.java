package enviosform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConexionSP {

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

	public ConexionSP() {

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

	public void MostrarSP(JTable t) {
		try {

			String consulta = "SELECT * From SP";

			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(consulta);

			DefaultTableModel modelo = new DefaultTableModel();

			String atributos[] = { "Proveedor", "Pieza", "Cantidad" };
			modelo.setColumnIdentifiers(atributos);

			Object[] fila = new Object[modelo.getColumnCount()];
			// Imprimimos el resultado
			while (rs.next()) {

				fila[0] = rs.getString("sn");
				fila[1] = rs.getString("pn");
				fila[2] = rs.getInt("cant");
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

	public void insertarSP(String pro, String pie, String cant) {
		try {
			String sql = "INSERT INTO SP VALUES(?,?,?);";

			PreparedStatement pst = conexion.prepareStatement(sql);

			pst.setString(1, pro);
			pst.setString(2, pie);
			pst.setInt(3, Integer.parseInt(cant));

			pst.executeUpdate();
			pst.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"Datos incorrectos.\nComprueba que el codigo tiene 3 digitos o caracteres y no esta duplicado",
					"Error al insertar registros en la BD", JOptionPane.ERROR_MESSAGE);

		}
	}

}

package facturacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConexionArticulos {

	// Variable que usamos para crear la conexion
	private Connection conexion = null;
	// nombre del archivo donde tenemos nuestra base de datos
	private String nombreDB = "C:\\Programacion\\facturacion\\facturacion";
	// Driver usado para conectarse
	private String driver = "org.hsqldb.jdbcDriver";
	// url
	private String url = "jdbc:hsqldb:file:" + nombreDB;

	/**
	 * metodo para obtener una conexion a la base de datos
	 * 
	 * @param conexion
	 */

	public ConexionArticulos() {

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

	public void MostrarArticulos(JTable t) {
		try {

			String consulta = "SELECT * From ARTICULOS";

			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(consulta);

			DefaultTableModel modelo = new DefaultTableModel();

			String atributos[] = { "codart", "descrip", "precio", "stock", "stock_min" };
			modelo.setColumnIdentifiers(atributos);

			Object[] fila = new Object[modelo.getColumnCount()];
			// Imprimimos el resultado
			while (rs.next()) {

				fila[0] = rs.getString("codart");
				fila[1] = rs.getString("descrip");
				fila[2] = rs.getDouble("precio");
				fila[3] = rs.getInt("stock");
				fila[4] = rs.getInt("stock_min");
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

	public void insertarArticulos(String cod, String des, String pre, String sto, String stom) {
		try {
			String sql = "INSERT INTO ARTICULOS VALUES(?,?,?,?,?);";

			PreparedStatement pst = conexion.prepareStatement(sql);

			pst.setString(1, cod);

			if (des.isEmpty()) {
				pst.setString(2, null);
			} else {
				pst.setString(2, des);
			}

			// el campo peso acepta nulos
			if (pre.isEmpty()) {
				pst.setString(3, null);
			} else {
				pst.setDouble(3, Double.parseDouble(pre));
			}

			// el campo peso acepta nulos
			if (sto.isEmpty()) {
				pst.setString(4, null);
			} else {
				pst.setInt(4, Integer.parseInt(sto));
			}

			// el campo peso acepta nulos
			if (stom.isEmpty()) {
				pst.setString(5, null);
			} else {
				pst.setInt(4, Integer.parseInt(stom));
			}

			pst.executeUpdate();
			pst.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"Datos incorrectos.\nComprueba que el codigo tiene 3 digitos o caracteres y no esta duplicado",
					"Error al insertar registros en la BD", JOptionPane.ERROR_MESSAGE);

		}
	}

}

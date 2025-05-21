package allTablas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class conexionBD {

	private Connection conexion = null;
	private String nombreBD = "C:\\Programacion\\envios\\envios";
	private String driver = "org.hsqldb.jdbcDriver";
	private String url = "jdbc:hsqldb:file:" + nombreBD;

	// CUIDADO QUE NO SIRVE YA QUE HAY QUE CAMBIAR EL MÉTODO DE INSERTAR
	private String queryMain = "SELECT * FROM S";

	/**
	 * Setter del atributo queryMain para modificarlo
	 * 
	 * @param newQuery
	 */
	public void setQuery(String newQuery) {
		queryMain = newQuery;
	}

	public conexionBD() {
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

	public void desconectar() {
		try {
			conexion.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al cerrar la conexión con la BD", "Error de conexión",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public void mostrarP(JTable t) {
		try {
			String consulta = queryMain;

			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(consulta);

			DefaultTableModel modelo = new DefaultTableModel();
			String atributos[] = almacenarNombres();
			modelo.setColumnIdentifiers(atributos);

			Object[] fila = new Object[modelo.getColumnCount()];

			while (rs.next()) {

				for (int i = 0; i < fila.length; i++) {
					fila[i] = rs.getString(atributos[i]);
				}

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

	public String[] almacenarNombres() {
		String[] columnas = null;
		try {
			String consulta = queryMain;
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery(consulta);

			ResultSetMetaData metaData = rs.getMetaData();

			int max = metaData.getColumnCount();

			columnas = new String[max];

			// Guardamos los nombres de las columnas en la lista
			for (int i = 1; i <= max; i++) {
				columnas[i - 1] = metaData.getColumnName(i);
			}
			st.close();
			rs.close();
		} catch (SQLException e) {
			System.out.println("Error en la consulta");
		}

		return columnas;

	}

	public void insertarP(String cod, String nom, String col, String pes, String ciud) {

		try {
			String sql = "INSERT INTO P VALUES (?,?,?,?,?);";

			PreparedStatement pst = conexion.prepareStatement(sql);

			pst.setString(1, cod);
			pst.setString(2, nom);
			pst.setString(5, ciud);

			// Estos campos aceptan nulos
			if (col.isEmpty()) {
				pst.setString(3, null);
			} else {
				pst.setString(3, col);
			}

			if (pes.isEmpty()) {
				pst.setString(4, null);
			} else {
				pst.setInt(4, Integer.parseInt(pes));
			}

			pst.executeUpdate();

			pst.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"Datos incorrectos. \nComprueba que el código tiene 3 dígitos o carácteres y no está duplicado.",
					"Error al insertar registro en la BD", JOptionPane.ERROR_MESSAGE);
		}

	}

	public void insertarS(String sn, String snombre, String estado, String ciudad) {

		try {
			String sql = "INSERT INTO S VALUES (?,?,?,?);";

			PreparedStatement pst = conexion.prepareStatement(sql);

			pst.setString(1, sn);
			pst.setString(2, snombre);

			if (estado.isEmpty()) {
				pst.setString(3, null);
			} else {
				pst.setInt(3, Integer.parseInt(estado));
			}

			pst.setString(4, ciudad);

			pst.executeUpdate();

			pst.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"Datos incorrectos. \nComprueba que el código tiene 3 dígitos o carácteres y no está duplicado.",
					"Error al insertar registro en la BD", JOptionPane.ERROR_MESSAGE);
		}

	}

	public void insertarSP(String sn, String pn, String cant) {

		try {
			String sql = "INSERT INTO SP VALUES (?,?,?);";

			PreparedStatement pst = conexion.prepareStatement(sql);

			pst.setString(1, sn);
			pst.setString(2, pn);

			if (cant.isEmpty()) {
				pst.setString(3, null);
			} else {
				pst.setInt(3, Integer.parseInt(cant));
			}

			pst.executeUpdate();
			pst.close();

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Datos incorrectos. \nComprueba los campos para continuar.",
					"Error al insertar registro en la BD", JOptionPane.ERROR_MESSAGE);
		}

	}

}

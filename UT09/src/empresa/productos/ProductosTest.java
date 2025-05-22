package empresa.productos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ProductosTest extends JFrame implements ActionListener {

	JLabel productoL, descL, precioL, stockL;
	JTextField productoTF, descTF, precioTF, stockTF;
	JButton boton, borrar;
	JTable tabla;
	JScrollPane sc;

	ConexionProductos con;

	ProductosTest() {
		getContentPane().setLayout(null);

		productoL = new JLabel("Producto: ");
		productoL.setBounds(30, 40, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(productoL);

		productoTF = new JTextField();
		productoTF.setBounds(96, 40, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(productoTF);

		descL = new JLabel("Descripción: ");
		descL.setBounds(16, 76, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(descL);

		descTF = new JTextField();
		descTF.setBounds(96, 76, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(descTF);

		precioL = new JLabel("Precio: ");
		precioL.setBounds(236, 40, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(precioL);

		precioTF = new JTextField();
		precioTF.setBounds(291, 40, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(precioTF);

		stockL = new JLabel("Stock: ");
		stockL.setBounds(240, 76, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(stockL);

		stockTF = new JTextField();
		stockTF.setBounds(291, 76, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(stockTF);

		boton = new JButton("Insertar");
		boton.setBounds(80, 130, 120, 25); // (x, y ANCHO, ALTO)
		boton.addActionListener(this);
		getContentPane().add(boton);

		borrar = new JButton("Borrar");
		borrar.setBounds(270, 130, 120, 25); // (x, y ANCHO, ALTO)
		borrar.addActionListener(this);
		getContentPane().add(borrar);

		tabla = new JTable();
		sc = new JScrollPane(tabla);
		sc.setBounds(20, 180, 432, 134);
		getContentPane().add(sc);

		// añadimos a la conexión la tabla
		con = new ConexionProductos(); // creamos el objeto de la clase donde se realiza la conexion
		con.mostrarTabla(tabla);
		con.desconectar();

		setSize(491, 364); // dimensiones(ancho, alto)
	}

	public static void main(String[] args) {
		ProductosTest v = new ProductosTest();

		v.setTitle("PRODUCTOS"); // título de la ventana
		v.setLocationRelativeTo(null); // ventana en el centro
		v.setVisible(true); // visibilidad
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void limpiar() {
		productoTF.setText("");
		descTF.setText("");
		precioTF.setText("");
		stockTF.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == borrar) {
				limpiar();
			}

			if (e.getSource() == boton) {
				/* CAMBIAR */
				String producto = productoTF.getText();
				String desc = descTF.getText();
				String precio = precioTF.getText();
				String stock = stockTF.getText();

				// comprobmaos si los campos están vacios
				if (producto.isEmpty() || desc.isEmpty() || precio.isEmpty() || stock.isEmpty()) {
					JOptionPane.showMessageDialog(null,
							"Los campos Producto, Descripción, Precio y Stock son obligatorios", "ERROR",
							JOptionPane.WARNING_MESSAGE);
				} else {
					// establecemos la conexión para insertar el nuevo registro y mostrar la tabla
					/* CAMBIAR */
					con = new ConexionProductos();
					con.insertar(producto, desc, precio, stock);
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

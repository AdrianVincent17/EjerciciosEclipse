package empresa.pedidos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class PedidosTest extends JFrame implements ActionListener {

	JLabel pedidoL, productoL, clienteL, unidadesL, fechaL;
	JTextField pedidoTF, productoTF, clienteTF, unidadesTF, fechaTF;
	JTable tabla;
	JScrollPane sc;
	JButton boton, boton2;

	ConexionPedidos con;
	private JLabel lblNewLabel;

	PedidosTest() {

		getContentPane().setLayout(null);

		pedidoL = new JLabel("Pedido: ");
		pedidoL.setBounds(27, 40, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(pedidoL);

		pedidoTF = new JTextField();
		pedidoTF.setBounds(80, 40, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(pedidoTF);

		productoL = new JLabel("Producto: ");
		productoL.setBounds(15, 76, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(productoL);

		productoTF = new JTextField();
		productoTF.setBounds(80, 76, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(productoTF);

		clienteL = new JLabel("Cliente: ");
		clienteL.setBounds(280, 40, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(clienteL);

		clienteTF = new JTextField();
		clienteTF.setBounds(333, 40, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(clienteTF);

		unidadesL = new JLabel("Unidades: ");
		unidadesL.setBounds(267, 76, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(unidadesL);

		unidadesTF = new JTextField();
		unidadesTF.setBounds(333, 76, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(unidadesTF);

		fechaL = new JLabel("Fecha: ");
		fechaL.setBounds(32, 112, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(fechaL);

		fechaTF = new JTextField();
		fechaTF.setBounds(80, 112, 100, 25); // (x, y, ANCHO, ALTO)
		getContentPane().add(fechaTF);

		boton = new JButton("Insertar");
		boton.setBounds(103, 166, 120, 25); // (x, y ANCHO, ALTO)
		boton.addActionListener(this);
		getContentPane().add(boton);

		boton2 = new JButton("Limpiar");
		boton2.setBounds(251, 166, 120, 25); // (x, y ANCHO, ALTO)
		boton2.addActionListener(this);
		getContentPane().add(boton2);

		tabla = new JTable();
		sc = new JScrollPane(tabla);
		sc.setBounds(22, 235, 432, 138);
		getContentPane().add(sc);

		// añadimos a la conexión la tabla
		con = new ConexionPedidos(); // creamos el objeto de la clase donde se realiza la conexion
		con.mostrarTabla(tabla);

		lblNewLabel = new JLabel("Listado de pedidos:");
		lblNewLabel.setBounds(27, 213, 153, 14);
		getContentPane().add(lblNewLabel);
		con.desconectar();

		setSize(492, 426);

	}

	public static void main(String[] args) {
		PedidosTest v = new PedidosTest();

		v.setTitle("PEDIDOS"); // título de la ventana
		v.setLocationRelativeTo(null); // ventana en el centro
		v.setVisible(true); // visibilidad
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void limpiar() {
		pedidoTF.setText("");
		productoTF.setText("");
		clienteTF.setText("");
		unidadesTF.setText("");
		fechaTF.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == boton2) {
			limpiar();
		}

		try {
			if (e.getSource() == boton) {
				/* CAMBIAR */
				String pedido = pedidoTF.getText();
				String producto = productoTF.getText();
				String cliente = clienteTF.getText();
				String unidades = unidadesTF.getText();
				String fecha = fechaTF.getText();

				// comprobmaos si los campos están vacios
				if (pedido.isEmpty() || producto.isEmpty() || cliente.isEmpty() || fecha.isEmpty()
						|| unidades.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Los campos Pedido, Producto, Cliente y Fecha son obligatorios",
							"ERROR", JOptionPane.WARNING_MESSAGE);
				} else {
					// establecemos la conexión para insertar el nuevo registro y mostrar la tabla
					/* CAMBIAR */
					con = new ConexionPedidos();
					con.insertar(pedido, producto, cliente, unidades, fecha);
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

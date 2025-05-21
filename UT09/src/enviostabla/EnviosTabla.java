package enviostabla;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EnviosTabla extends JFrame {

	public EnviosTabla() {
		// Creamos el layout y lo añadimos a la ventana

		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

		DefaultTableModel modelo = new DefaultTableModel();

		String atributos[] = { "Proveedores", "Piezas", "Cantidad" };
		modelo.setColumnIdentifiers(atributos);

		JTable tabla = new JTable();
		tabla.setModel(modelo);

		JScrollPane sc = new JScrollPane(tabla);
		add(sc);

		// Insertamos los datos en la tabla

		Envios p = new Envios();

		p.obtnerConexion();
		p.mostrartabla(modelo);
		p.desconectar();

	}

	public static void main(String[] args) {

		EnviosTabla p = new EnviosTabla();

		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setVisible(true);
		p.pack();
		p.setTitle("PIEZAS");

	}

}

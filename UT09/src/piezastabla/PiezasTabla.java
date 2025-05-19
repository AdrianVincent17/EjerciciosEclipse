package piezastabla;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PiezasTabla extends JFrame {
	
	public PiezasTabla() {
		//Creamos el layout y lo añadimos a la ventana
		
		setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
		
		DefaultTableModel modelo=new DefaultTableModel();
		
		String atributos[]= {"Codigo","Nombre","Color","Peso","Ciudad"};
		modelo.setColumnIdentifiers(atributos);
		
		JTable tabla=new JTable();
		tabla.setModel(modelo);
		
		JScrollPane sc=new JScrollPane(tabla);
		add(sc);
		
		//Insertamos los datos en la tabla
		
		Piezas p = new Piezas();
		
		p.obtnerConexion();
		p.mostrartabla(modelo);
		p.desconectar();
		
		
	}

	public static void main(String[] args) {
		
		PiezasTabla p=new PiezasTabla();
		
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setVisible(true);
		p.pack();
		p.setTitle("PIEZAS");

	}

}

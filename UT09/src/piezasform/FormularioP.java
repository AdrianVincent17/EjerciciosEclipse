package piezasform;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FormularioP extends JFrame implements ActionListener {
	
	/*
	 * componentes de la ventan
	 */
	
	private JTextField codigo, nombre, color, peso, ciudad;
	private JButton guardar, borrar;
	private JLabel nueva, listado, cod, nom, col, pes, ciud;
	private JScrollPane sc;
	private JTable tabla;
	
	/*
	 * Conexion a la base de datos  para acceder a la tabla P
	 */
	private ConexionP con;
	
	public FormularioP() {
		
		setLayout(null);
		
		nueva =new JLabel("Introduce una nueva pieza: ");
		nueva.setBounds(30,20,200,25);
		add(nueva);
		
		cod =new JLabel("Codigo: ");
		cod.setBounds(30,60,60,25);
		add(cod);
		
		codigo=new JTextField();
		codigo.setBounds(90,60,100,25);
		add(codigo);
		
		nom=new JLabel("Nombre: ");
		nom.setBounds(30,100,60,25);
		add(nom);
		
		nombre=new JTextField();
		nombre.setBounds(90,100,100,25);
		add(nombre);
		
		col=new JLabel("Color: ");
		col.setBounds(30,140,60,25);
		add(col);
		
		color=new JTextField();
		color.setBounds(90,140,100,25);
		add(color);
		
		pes=new JLabel("Peso: ");
		pes.setBounds(220,100,60,25);
		add(pes);
		
		peso=new JTextField();
		peso.setBounds(280,100,100,25);
		add(peso);
		
		ciud=new JLabel("Ciudad: ");
		ciud.setBounds(220,140,60,25);
		add(ciud);
		
		ciudad=new JTextField();
		ciudad.setBounds(280,140,100,25);
		add(ciudad);
		
		guardar =new JButton("Guardar");
		guardar.setBounds(90,200,130,25);
		guardar.addActionListener(this);
		add(guardar);
		
		borrar =new JButton("Borrar");
		borrar.setBounds(250,200,130,25);
		borrar.addActionListener(this);
		add(borrar);
		
		listado =new JLabel("Listado de piezas: ");
		listado.setBounds(30,260,200,25);
		add(listado);
		
		//Creamos la tabla y la insertamos en la ventan 
		tabla =new JTable();
		sc =new JScrollPane(tabla);
		sc.setBounds(30,300,360,130);
		add(sc);
		
		con =new ConexionP();
		con.MostrarP(tabla);
		con.desconectar();
		
	}
	
	/**
	 * metodo que limpia todos los campos de texto
	 */
	public void limpiar() {
		
		codigo.setText("");
		nombre.setText("");
		color.setText("");
		peso.setText("");
		ciudad.setText("");
	}
	
	public static void main(String[] args) {
		
		FormularioP fo=new FormularioP();
		
		fo.setVisible(true);
		fo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fo.setTitle("PIEZAS");
		fo.setSize(450,500);
		fo.setLocationRelativeTo(null);
		

	}

	/**
	 * metodo que implementa la funcion de los botones
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			//boton guardar
			if(e.getSource()==guardar) {
				
				String code=codigo.getText();
				String name=nombre.getText();
				String colour=color.getText();
				String weight=peso.getText();
				String city=ciudad.getText();
				
				//Comprobamos si los campos obligatorios estan vacios
				if(code.isEmpty() || name.isEmpty() || city.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Los campos codigo, nombre y ciudad son obligatorios","Aviso",JOptionPane.WARNING_MESSAGE);
				}else {
					//Establecemos conexion para inserta el nuevo registro en la base de datos 
					con =new ConexionP();
					con.insertarP(code, name, colour, weight, city);
					con.MostrarP(tabla);
					con.desconectar();
					limpiar();
				}
				
			}
			
			//boton de borrar
			if(e.getSource()==borrar) {
				limpiar();
			}
			
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null,"Los valores introducidos no son correctos","Error al guardar",JOptionPane.ERROR_MESSAGE);

		}
	}

}

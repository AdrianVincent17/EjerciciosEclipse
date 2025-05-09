package boletin;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Ej02 extends JFrame implements ActionListener {

	/*
	 * Componentes de la ventana
	 */

	private JMenuBar menubar; // barra de menu que contendra el resto de menus
	private JMenu menu; // menu principal
	private JMenuItem info, salir; // desplegable de informacin y salir
	private JLabel uno, dos, tres, cuatro, cinco, seis; // textos de los numeros
	private JTextField c1, c2, c3, c4, c5, c6; // campos de texto
	private JButton boton; // boton de generar el numero aleatorio
	private JPanel panel1, panel2, panel3; // paneles
	private int num = 49; // numeros totales

	public Ej02() {

		// establecemos un layout por defecto
		setLayout(new FlowLayout(FlowLayout.CENTER, 40, 50));

		// metemos el menu y los diferentes items
		menubar = new JMenuBar();
		setJMenuBar(menubar);

		menu = new JMenu("Menu");
		menubar.add(menu);

		info = new JMenuItem("Info");
		menu.add(info);
		info.addActionListener(this);

		salir = new JMenuItem("Salir");
		menu.add(salir);
		salir.addActionListener(this);

		// etablecemos el panel 3 que contiene los otros dos paneles
		panel3 = new JPanel();
		panel3.setLayout(new GridLayout(2, 1, 0, 20));
		add(panel3);

		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2, 6, 25, 2));
		panel3.add(panel1);

		// creamos y establecemos los labels y añadimos al panel 1

		uno = new JLabel("1", JLabel.CENTER);
		uno.setFont(new Font("", Font.ITALIC, 12));
		panel1.add(uno);

		dos = new JLabel("2", JLabel.CENTER);
		dos.setFont(new Font("", Font.ITALIC, 12));
		panel1.add(dos);

		tres = new JLabel("3", JLabel.CENTER);
		tres.setFont(new Font("", Font.ITALIC, 12));
		panel1.add(tres);

		cuatro = new JLabel("4", JLabel.CENTER);
		cuatro.setFont(new Font("", Font.ITALIC, 12));
		panel1.add(cuatro);

		cinco = new JLabel("5", JLabel.CENTER);
		cinco.setFont(new Font("", Font.ITALIC, 12));
		panel1.add(cinco);

		seis = new JLabel("6", JLabel.CENTER);
		seis.setFont(new Font("", Font.ITALIC, 12));
		panel1.add(seis);

		// añadimos los camposs de texto al panel 1
		c1 = new JTextField(2);
		panel1.add(c1);

		c2 = new JTextField(2);
		panel1.add(c2);

		c3 = new JTextField(2);
		panel1.add(c3);

		c4 = new JTextField(2);
		panel1.add(c4);

		c5 = new JTextField(2);
		panel1.add(c5);

		c6 = new JTextField(2);
		panel1.add(c6);

		// añadimos y cremos el panel 2 y le establecemos un Layout
		// Borderlayout
		panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());
		panel3.add(panel2);

		// añadimos el boton al panel 2 y hacemos la llamada
		// a la funcionalidad del boton

		boton = new JButton("Generar numero");
		panel2.add(boton);
		boton.addActionListener(this);

	}

	public static void main(String[] args) {

		Ej02 e = new Ej02();

		e.setVisible(true);
		e.setSize(400, 300);
		e.setTitle("Loteria Primitiva");
		e.setLocationRelativeTo(null);
		e.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		e.setResizable(false);

	}

	/**
	 * Funcion que devuelve un numero aleatorio entre u y 49
	 * 
	 * @return devuelve un numero entero
	 */
	public int aleatorio(int n) {

		return (int) (Math.random() * n + 1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Funcionalidad para el boton info
		// lo cual nos
		if (e.getSource() == info) {
			VentanaSec vm = new VentanaSec(this, true);
			vm.setTitle("Examen de Programacion");
			vm.setVisible(true);

		}

		// Funcionalidad del boton de salir
		if (e.getSource() == salir) {
			System.exit(0);
		}

		// Creamos la funcion del boton de generar el aleatorio pasando
		// string el integer que nos devuelve la funcion
		if (e.getSource() == boton) {

			c1.setText(String.valueOf(aleatorio(num)));
			c2.setText(String.valueOf(aleatorio(num)));
			c3.setText(String.valueOf(aleatorio(num)));
			c4.setText(String.valueOf(aleatorio(num)));
			c5.setText(String.valueOf(aleatorio(num)));
			c6.setText(String.valueOf(aleatorio(num)));
		}

	}
}

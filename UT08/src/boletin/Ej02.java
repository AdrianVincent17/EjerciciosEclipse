package boletin;

import java.awt.Color;
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

public class Ej02 extends JFrame implements ActionListener {

	final static int TAM = 6;
	final static int LIM = 49;

	JPanel panel, panelB;
	JMenuBar menubar;
	JMenu menu;
	JMenuItem info, salir;

	int[] nums;
	JLabel[] labels;
	JTextField[] tfields;

	JButton boton;

	public Ej02() {

		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 90)); // margen(ancho, alto)

		panel = new JPanel();
		panel.setLayout(new GridLayout(2, TAM, 15, 8)); // (rows, cols, ancho, alto)

		panelB = new JPanel();
		panelB.setLayout(new GridLayout(2, 0, 10, 25)); // margen(ancho, alto)

		int ancho = 3;

		labels = new JLabel[TAM];
		tfields = new JTextField[TAM];

		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel(i + 1 + "");
			labels[i].setFont(new Font("Arial", Font.PLAIN, 12));
			labels[i].setForeground(Color.GRAY);
			labels[i].setHorizontalAlignment(0);
			panel.add(labels[i]);
		}

		for (int i = 0; i < tfields.length; i++) {
			tfields[i] = new JTextField(ancho);
			tfields[i].setHorizontalAlignment(0);
			panel.add(tfields[i]);
		}

		boton = new JButton("Generar números"); // new ImageIcon("D:\\PR\\ ... ")
		boton.addActionListener(this); // implements ActionListener

		panelB.add(panel);
		panelB.add(boton);

		// creamos el JMenuBar y lo asociamos con el JFrame
		menubar = new JMenuBar();
		setJMenuBar(menubar);

		// creamos el JMenu y lo añadimos al JMenuBar
		menu = new JMenu("Menú");
		menubar.add(menu);

		// creamos los item y los asociamos al JMenu
		info = new JMenuItem("Info");
		menu.add(info);
		info.addActionListener(this);

		salir = new JMenuItem("Salir");
		menu.add(salir);
		salir.addActionListener(this);

		add(panelB);

	}

	public static void main(String[] args) {
		Ej02 v = new Ej02();

		v.setTitle("Lotería primitiva"); // título de la ventana
		v.setSize(600, 350); // dimensiones(ancho, alto)
		v.setLocationRelativeTo(null); // ventana en el centro
		v.setVisible(true); // visibilidad
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == info) {
			VentanaSec vs = new VentanaSec(this, true);
			vs.setVisible(true);
		}

		if (e.getSource() == salir) {
			System.exit(0);
		}

		if (e.getSource() == boton) {

			for (int i = 0; i < tfields.length; i++) {
				tfields[i].setText(String.valueOf(aleatorio()));
			}

			for (int i = 0; i < tfields.length; i++) {
				while (repetido(tfields, tfields[i].getText(), i)) {
					tfields[i].setText(String.valueOf(aleatorio()));
				}
			}

			burbuja(tfields);

		}

	}

	/**
	 * función que devuelve números aleatorios
	 * 
	 * @return devuelve números aleatorios
	 */
	public static int aleatorio() {
		return (int) (Math.random() * LIM + 1);
	}

	/**
	 * método para comprobar si hay un número repetido dentro de un array
	 * 
	 * @param tfields2 -> array a la que vamos a realizar el booleano
	 * @param tfields3 -> valor del que comprobamos si está repetido o no
	 * @param pos      -> posición de la expresión booleana
	 * @return devuelve true o false si hay valores repetidos dentro de una array
	 */
	public static boolean repetido(JTextField[] tfields2, String tfields3, int pos) {

		for (int i = 0; i < pos; i++) {
			if (tfields2[i].getText().equals(tfields3)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * método que ordena de menor a mayor un array
	 * 
	 * @param tfields2
	 */
	public static void burbuja(JTextField[] tfields2) {
		int aux;
		boolean ok = false;
		for (int i = tfields2.length; i > 0; i--) {
			ok = false;
			for (int j = 0; j < i - 1; j++) {
				if (Integer.valueOf(tfields2[j].getText()) > Integer.valueOf(tfields2[j + 1].getText())) {
					ok = true;
					aux = Integer.valueOf(tfields2[j + 1].getText());
					tfields2[j + 1].setText(tfields2[j].getText());
					tfields2[j].setText(String.valueOf(aux));
				}

			}
			if (!ok) {
				return;
			}
		}
	}
}

package boletin;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ej01 extends JFrame implements ActionListener {

	/**
	 * Componentes de la ventana
	 */

	private JMenuBar menu;
	private JMenu idioma;
	private JMenuItem ingles, frances;
	private JLabel label1, label2;
	private JTextField campo1, campo2;
	private JButton traducir, borrar;
	private JPanel panel;
	private String ruta = "C:\\Users\\AdrianV\\Downloads\\ingles.txt";

	public Ej01() {

		setLayout(new FlowLayout(FlowLayout.CENTER, 60, 40));

		menu = new JMenuBar();
		setJMenuBar(menu);

		idioma = new JMenu("Idioma");
		menu.add(idioma);

		ingles = new JMenuItem("Ingles");
		idioma.add(ingles);
		ingles.addActionListener(this);

		frances = new JMenuItem("Frances");
		idioma.add(frances);
		frances.addActionListener(this);

		panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2, 20, 25));
		add(panel);

		label1 = new JLabel("Palabra (en español)");
		panel.add(label1);

		label2 = new JLabel("Traducción", JLabel.CENTER);
		panel.add(label2);

		campo1 = new JTextField();
		panel.add(campo1);

		campo2 = new JTextField();
		panel.add(campo2);

		traducir = new JButton("Traducir");
		panel.add(traducir);
		traducir.addActionListener(this);

		borrar = new JButton("Borrar");
		panel.add(borrar);
		borrar.addActionListener(this);

	}

	public static void main(String[] args) {

		Ej01 e = new Ej01();

		e.setTitle("Traductores");
		e.setVisible(true);
		e.setLocationRelativeTo(null);
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setSize(400, 300);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == ingles) {
			setTitle("Traductor Español > Inglés");
			ruta = "C:\\Users\\AdrianV\\Downloads\\ingles.txt";
		}

		if (e.getSource() == frances) {
			setTitle("Traductor Español > Francés");
			ruta = "C:\\Users\\AdrianV\\Downloads\\frances.txt";
		}

		if (e.getSource() == traducir) {
			if (campo1.getText().isBlank()) {
				JOptionPane.showMessageDialog(null, "Introduce una palabra a traducir por favor", "Aviso",
						JOptionPane.WARNING_MESSAGE);
			} else {
				try {
					String palabra = campo1.getText();
					File f = new File(ruta);
					boolean encontrado = false;
					Scanner s = new Scanner(f);

					while (s.hasNext() && !encontrado) {
						String linea = s.nextLine();
						String word = linea.substring(linea.indexOf('=') + 1);
						if (palabra.compareToIgnoreCase(word) == 0) {
							String translate = linea.substring(0, linea.indexOf('='));
							campo2.setText(translate);
							encontrado = true;
						}
					}
					s.close();

					if (!encontrado) {
						JOptionPane.showMessageDialog(null,
								"Lo siento, no se encuentra la palabra en nuestro diccionario", campo1.getText(),
								JOptionPane.INFORMATION_MESSAGE);
					}

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}

		}

		if (e.getSource() == borrar) {
			campo1.setText("");
			campo2.setText("");
			setTitle("Traductores");
		}
	}
}

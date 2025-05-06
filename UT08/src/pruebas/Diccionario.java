package pruebas;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Diccionario extends JFrame implements ActionListener {

	private JLabel label;
	private JPanel panel;
	private JButton boton;
	private JTextField campo;

	public Diccionario() {

		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));

		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3, 5, 5));
		add(panel);

		campo = new JTextField(15);
		panel.add(campo);

		boton = new JButton("TRANSLATE");
		panel.add(boton);
		boton.addActionListener(this);

		label = new JLabel("");
		panel.add(label);

	}

	public static void main(String[] args) {

		Diccionario d = new Diccionario();

		d.setVisible(true);
		d.setSize(600, 150);
		d.setResizable(false);
		d.setLocationRelativeTo(null);
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		d.setTitle("Traductor español/ingles");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			if (campo.getText().isBlank()) {
				label.setText("Introduce una palabra");
			} else {
				try {
					String palabra = campo.getText();
					File f = new File("C:\\Users\\Asun\\Downloads\\dictionary.txt");
					boolean encontrado = false;
					Scanner s = new Scanner(f);

					while (s.hasNext() && !encontrado) {
						String linea = s.nextLine();
						String word = linea.substring(linea.indexOf('=') + 1);
						if (palabra.compareToIgnoreCase(word) == 0) {
							String translate = linea.substring(0, linea.indexOf('='));
							label.setText(translate);
							encontrado = true;
						}
					}
					s.close();

					if (!encontrado) {
						label.setText("No se encuentra la palabra");
					}

				} catch (Exception e1) {
					label.setText(e1.getMessage());
				}
			}
		}

	}

}

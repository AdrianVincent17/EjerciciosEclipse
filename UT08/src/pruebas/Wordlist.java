package pruebas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Wordlist extends JFrame implements ActionListener {

	private JButton boton;
	private JLabel label;
	private JTextField campo;

	public Wordlist() {

		setLayout(null);

		campo = new JTextField();
		campo.setBounds(20, 30, 120, 30);
		add(campo);

		boton = new JButton("TRADUCCION");
		boton.setBounds(150, 30, 120, 30);
		add(boton);
		boton.addActionListener(this);

		label = new JLabel("");
		label.setBounds(280, 30, 200, 30);
		add(label);

	}

	public static void main(String[] args) {

		Wordlist w = new Wordlist();

		w.setVisible(true);
		w.setLocationRelativeTo(null);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setTitle("Traductor ingles/español");
		w.setSize(450, 150);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			if (campo.getText().isBlank()) {
				label.setText("Introduce una palabra");
			} else {
				try {
					String word = campo.getText();
					File f = new File("C:\\Users\\Asun\\Downloads\\dictionary.txt");
					boolean encontrado = false;

					Scanner s = new Scanner(f);

					while (s.hasNext() && !encontrado) {
						String linea = s.nextLine();
						String palabra = linea.substring(0, linea.indexOf('='));
						if (word.compareToIgnoreCase(palabra) == 0) {
							String traduccion = linea.substring(linea.indexOf('=') + 1);
							label.setText(traduccion);
							encontrado = true;
						}

					}
					s.close();
					if (!encontrado) {
						label.setText("La palabra no esta ");
					}

				} catch (Exception e1) {
					label.setText(e1.getMessage());
				}
			}
		}

	}

}

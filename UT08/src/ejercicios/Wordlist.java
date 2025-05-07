package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Wordlist extends JFrame implements ActionListener {

	private JLabel label;
	private JButton boton;
	private JTextField campo;

	public Wordlist() {

		setLayout(null);

		label = new JLabel("Enter a word to search: ");
		label.setBounds(50, 40, 150, 25);
		add(label);

		campo = new JTextField();
		campo.setBounds(50, 70, 300, 50);
		add(campo);

		boton = new JButton(new ImageIcon("C:\\Users\\Asun\\Downloads\\lupa01.png"));
		boton.setBounds(352, 70, 70, 50);
		add(boton);
		boton.addActionListener(this);

	}

	public static void main(String[] args) {

		Wordlist w = new Wordlist();

		w.setTitle("Wordlist");
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setLocationRelativeTo(null);
		w.setSize(500, 220);
		w.setResizable(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == boton) {
			if (campo.getText().isBlank()) {
				JOptionPane.showMessageDialog(null, "Enter a Word please", "Warning", JOptionPane.WARNING_MESSAGE);
			} else {
				try {
					String word = campo.getText();
					boolean encontrado = false;
					File f = new File("C:\\Users\\Asun\\Downloads\\wordlist.txt");
					Scanner s = new Scanner(f);

					while (s.hasNext() && !encontrado) {
						String linea = s.nextLine();
						if (word.compareToIgnoreCase(linea) == 0) {
							encontrado = true;
						}
					}
					s.close();
					if (encontrado) {
						JOptionPane.showMessageDialog(null, "The word is found in our wordlist", campo.getText(),
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "The word is not found in our wordlist", campo.getText(),
								JOptionPane.INFORMATION_MESSAGE);
					}

				} catch (Exception e1) {
					setTitle(e1.getMessage());

				}
			}
		}

	}

}

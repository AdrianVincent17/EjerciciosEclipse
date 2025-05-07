package ejercicios;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Wordlist extends JFrame implements ActionListener {

	private JLabel label;
	private JButton boton;
	private JTextField campo;
	private JPanel panel;

	public Wordlist() {

		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 40));

		panel = new JPanel();
		panel.setLayout(new BorderLayout(5, 10));

		label = new JLabel("Enter a word to search: ");
		panel.add(label, BorderLayout.NORTH);

		campo = new JTextField(20);
		panel.add(campo, BorderLayout.CENTER);

		boton = new JButton(new ImageIcon("C:\\Users\\Asun\\Downloads\\lupa01.png"));

		panel.add(boton, BorderLayout.EAST);
		boton.addActionListener(this);

		add(panel);

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

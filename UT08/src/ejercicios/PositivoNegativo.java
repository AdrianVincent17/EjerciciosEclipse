package ejercicios;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PositivoNegativo extends JFrame implements ActionListener {

	private JLabel label;
	private JButton boton;
	private JTextField campo;
	private JPanel panel;

	public PositivoNegativo() {

		setLayout(new FlowLayout(FlowLayout.CENTER, 80, 30));

		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 1, 0, 20));

		label = new JLabel("Introduce un valor entero:");
		panel.add(label);

		campo = new JTextField(5);
		panel.add(campo);

		boton = new JButton("Comprobar");
		panel.add(boton);
		boton.addActionListener(this);

		add(panel);

	}

	public static void main(String[] args) {

		PositivoNegativo p = new PositivoNegativo();

		p.setVisible(true);
		p.setTitle("Positivo o Negativo");
		p.setLocationRelativeTo(null);
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setSize(300, 250);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == boton) {
			try {
				if (campo.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Debes introducir un valor", "Aviso",
							JOptionPane.WARNING_MESSAGE);
				} else {
					int num = Integer.parseInt(campo.getText());
					if (num > 0) {
						JOptionPane.showMessageDialog(null, "El valor introducido es POSITIVO", "Resultado",
								JOptionPane.PLAIN_MESSAGE);
					} else if (num < 0) {
						JOptionPane.showMessageDialog(null, "El valor introducido es NEGATIVO", "Resultado",
								JOptionPane.PLAIN_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "El valor introducido es CERO", "",
								JOptionPane.INFORMATION_MESSAGE);
					}

				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "El valor introducido no es valido", "Error",
						JOptionPane.ERROR_MESSAGE);
			}

		}

	}

}

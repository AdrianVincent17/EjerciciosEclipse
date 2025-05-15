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

public class AdivinaAPP extends JFrame implements ActionListener {

	JLabel labelprincipal, labelintentos;
	JTextField campotexto;
	JButton intentar, reiniciar;
	JPanel panel1, panel2;

	final static int MAX = 25;
	static int intentos = 5;
	static int numAdivinar = (int) (Math.random() * MAX + 1);
	int intentosRealizados = 0;

	/**
	 * Método que hace un restart del juego poniendo los valores predeterminados.
	 */
	public void resetGame() {
		intentos = 5;
		intentosRealizados = 0;
		numAdivinar = (int) (Math.random() * MAX + 1);
		campotexto.setText("");

		labelintentos.setText("Te quedan " + intentos + " intentos.");

		intentar.setEnabled(true);

		setTitle("Adivina");
	}

	/**
	 * Constructor de la ventana gráfica
	 */
	AdivinaAPP() {
		panel1 = new JPanel();

		panel1.setLayout(new GridLayout(0, 1, 0, 8)); // (rows, cols, ancho, alto)

		labelprincipal = new JLabel("Introduce un número para adivinar (1-" + MAX + ")", JLabel.CENTER);
		labelintentos = new JLabel("Te quedan " + intentos + " intentos.", JLabel.CENTER);
		intentar = new JButton("Intentar");
		intentar.addActionListener(this);
		reiniciar = new JButton("Reiniciar");
		reiniciar.addActionListener(this);

		setLayout(new FlowLayout(FlowLayout.CENTER, 80, 35)); // margen(ancho, largo)

		campotexto = new JTextField(5);

		panel2 = new JPanel();

		panel2.setLayout(new GridLayout(1, 0, 15, 15)); // (rows, cols, ancho, alto)

		panel1.add(labelprincipal);
		panel1.add(campotexto);
		panel1.add(labelintentos);
		panel2.add(intentar);
		panel2.add(reiniciar);
		add(panel1);
		add(panel2);
	}

	/**
	 * Método que realiza la acción al pulsar los botones.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == intentar) {
			if (campotexto.getText().isBlank()) {
				JOptionPane.showMessageDialog(null, "Introduce un número", "Error", JOptionPane.WARNING_MESSAGE);
			} else {
				try {
					if (Integer.parseInt(campotexto.getText()) > MAX || Integer.parseInt(campotexto.getText()) <= 0) {
						JOptionPane.showMessageDialog(null, "Inserta un número del 1 al " + MAX + "!", "Aviso",
								JOptionPane.WARNING_MESSAGE);
					} else {
						intentosRealizados++;
						if (intentos == 0) {
							intentar.setEnabled(false);
							JOptionPane.showMessageDialog(null,
									"Te has quedado sin intentos, el número era: " + numAdivinar, "Has perdido",
									JOptionPane.WARNING_MESSAGE);
							campotexto.setText("");
							labelintentos.setText("Te quedan " + intentos + " intentos.");

						} else if (Integer.parseInt(campotexto.getText()) > numAdivinar) {
							JOptionPane.showMessageDialog(null, "El número es menor", "Aviso",
									JOptionPane.INFORMATION_MESSAGE);
							campotexto.setText("");
							intentos--;
							labelintentos.setText("Te quedan " + intentos + " intentos.");
						} else if (Integer.parseInt(campotexto.getText()) < numAdivinar) {
							JOptionPane.showMessageDialog(null, "El número es mayor", "Aviso",
									JOptionPane.INFORMATION_MESSAGE);
							campotexto.setText("");
							intentos--;
							labelintentos.setText("Te quedan " + intentos + " intentos.");
						} else {
							setTitle("Enhorabuena!");
							JOptionPane.showMessageDialog(null, "¡Has adivinado!", "Aviso",
									JOptionPane.INFORMATION_MESSAGE);
							campotexto.setText("");
							intentar.setEnabled(false);
							labelintentos.setText("Has adivinado en " + intentosRealizados + " intentos!");
						}

					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Introduce un número entero", "Error",
							JOptionPane.ERROR_MESSAGE);
					campotexto.setText("");
				}
			}

		}

		if (e.getSource() == reiniciar) {
			intentos = 5;
			intentosRealizados = 0;
			numAdivinar = (int) (Math.random() * MAX + 1);
			campotexto.setText("");
			labelintentos.setText("Te quedan " + intentos + " intentos.");
			intentar.setEnabled(true);
			setTitle("Adivina");
		}

	}

	public static void main(String[] args) {
		AdivinaAPP v = new AdivinaAPP();
		System.out.println(numAdivinar);
		v.setTitle("Adivina"); // título de la ventana
		v.setSize(300, 250); // dimensiones(ancho, alto)
		v.setLocationRelativeTo(null); // ventana en el centro
		v.setVisible(true); // visibilidad
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
}

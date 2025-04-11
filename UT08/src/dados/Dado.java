package dados;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Dado extends JFrame implements ActionListener {

	private JLabel numeros;
	private JButton tirada;

	public Dado() {

		setLayout(new BorderLayout(5, 10));

		numeros = new JLabel("?", JLabel.CENTER);
		numeros.setFont(new Font("Arial", Font.BOLD, 150));
		add(numeros);

		tirada = new JButton("Tirar");
		tirada.setFont(new Font("new Times Roman", Font.ITALIC, 50));
		add(tirada, BorderLayout.SOUTH);
		tirada.addActionListener(this);

	}

	/**
	 * Devuelve un numero entero con un rango metido como parametro
	 * 
	 * @param N numero entero maximo
	 * @return numero entero aleatorio
	 */

	public int aleatorio(int N) {
		return (int) (Math.random() * N + 1);
	}

	public static void main(String[] args) {

		Dado d = new Dado();

		d.setTitle("Tira el dado");
		d.setLocationRelativeTo(null);
		d.setSize(300, 300);
		d.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		d.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tirada) {
			String ale = Integer.toString(aleatorio(6));
			numeros.setText(ale);
		}
	}
}

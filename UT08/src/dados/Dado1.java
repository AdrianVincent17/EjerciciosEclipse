package dados;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Dado1 extends JFrame implements ActionListener {

	private JButton tirada;

	public Dado1() {

		setLayout(new BorderLayout(5, 10));

		tirada = new JButton("?");
		add(tirada);
		tirada.setFont(new Font("Comic Sans MS", Font.BOLD, 160));
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

		Dado1 d = new Dado1();

		d.setTitle("Dado 1");
		d.setLocationRelativeTo(null);
		d.setSize(300, 300);
		d.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		d.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tirada) {
			String ale = Integer.toString(aleatorio(6));
			tirada.setText(ale);
		}
	}

}

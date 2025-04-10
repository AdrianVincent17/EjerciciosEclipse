package dados;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dado1 extends JFrame implements ActionListener {

	private JLabel numeros;
	private JButton tirada;

	public Dado1() {

		numeros = new JLabel("?");
	}

	public static void main(String[] args) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Esbozo de método generado automáticamente

	}

}

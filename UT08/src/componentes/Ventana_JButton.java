package componentes;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Ventana_JButton extends JFrame {

	private JButton boton;

	public Ventana_JButton() {

		setLayout(null);

		boton = new JButton("BOTON");
		boton.setBounds(100, 40, 80, 25);
		add(boton);
	}

	public static void main(String[] args) {

		Ventana_JButton b = new Ventana_JButton();

		b.setTitle("ventana boton");
		b.setSize(300, 150);
		b.setLocationRelativeTo(null);
		b.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		b.setVisible(true);

	}

}

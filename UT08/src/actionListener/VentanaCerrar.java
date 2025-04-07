package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class VentanaCerrar extends JFrame implements ActionListener {

	private JButton boton;

	public VentanaCerrar() {

		setLayout(null);

		boton = new JButton("Cerrar");
		boton.setBounds(20, 20, 80, 30);
		add(boton);
		boton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		VentanaCerrar c = new VentanaCerrar();

		c.setTitle("Pais");
		c.setSize(100, 100);
		c.setLocationRelativeTo(null);
		c.setVisible(true);
		c.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}

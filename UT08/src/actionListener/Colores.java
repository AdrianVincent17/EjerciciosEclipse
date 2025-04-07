package actionListener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Colores extends JFrame implements ActionListener {

	private JButton rojo, azul, verde, amarillo;

	public Colores() {

		setLayout(null);

		rojo = new JButton("Rojo");
		rojo.setBounds(25, 40, 100, 25);
		add(rojo);
		rojo.addActionListener(this);

		azul = new JButton("Azul");
		azul.setBounds(145, 40, 100, 25);
		add(azul);
		azul.addActionListener(this);

		verde = new JButton("Verde");
		verde.setBounds(25, 80, 100, 25);
		add(verde);
		verde.addActionListener(this);

		amarillo = new JButton("Amarillo");
		amarillo.setBounds(145, 80, 100, 25);
		add(amarillo);
		amarillo.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == rojo) {
			getContentPane().setBackground(Color.red);
		}
		if (e.getSource() == azul) {
			getContentPane().setBackground(Color.blue);
		}
		if (e.getSource() == verde) {
			getContentPane().setBackground(Color.green);
		}
		if (e.getSource() == amarillo) {
			getContentPane().setBackground(Color.yellow);
		}
	}

	public static void main(String[] args) {

		Colores c = new Colores();

		c.setTitle("Colores");
		c.setSize(300, 200);
		c.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		c.setLocationRelativeTo(null);
		c.setVisible(true);

	}

}

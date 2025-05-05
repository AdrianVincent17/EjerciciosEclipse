package pruebas;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ej01 extends JFrame implements ActionListener {

	private JButton boton1, boton2, boton3;
	private JPanel panel;

	public Ej01() {

		setLayout(new GridLayout(1, 1, 10, 10));

		boton1 = new JButton("1");
		boton1.addActionListener(this);

		boton2 = new JButton("2");
		boton2.addActionListener(this);

		boton3 = new JButton("3");
		boton3.addActionListener(this);

		add(boton1);
		add(boton2);
		add(boton3);

	}

	public static void main(String[] args) {

		Ej01 e = new Ej01();

		e.setTitle("Escoge un numero");
		e.setVisible(true);
		e.setLocationRelativeTo(null);
		e.setSize(300, 200);
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			setTitle("Uno");
		}
		if (e.getSource() == boton2) {
			setTitle("Dos");
		}
		if (e.getSource() == boton3) {
			setTitle("Tres");
		}
	}

}

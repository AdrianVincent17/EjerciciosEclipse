package actionListener.ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Ej01 extends JFrame implements ActionListener {

	private JLabel nombre;
	private JTextField campotexto;
	private JButton boton;

	public Ej01() {

		setLayout(null);

		nombre = new JLabel("Nombre: ");
		nombre.setBounds(20, 20, 60, 30);
		add(nombre);

		campotexto = new JTextField();
		campotexto.setBounds(80, 20, 150, 30);
		add(campotexto);

		boton = new JButton("Aceptar");
		boton.setBounds(80, 60, 100, 30);
		add(boton);
		boton.addActionListener(this);
	}

	public static void main(String[] args) {

		Ej01 e = new Ej01();

		e.setSize(275, 150);
		e.setVisible(true);
		e.setLocationRelativeTo(null);
		e.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			setTitle(campotexto.getText());
		}

	}

}

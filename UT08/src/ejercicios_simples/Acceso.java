package ejercicios_simples;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Acceso extends JFrame {

	private JLabel usuario, contraseña;
	private JTextField campotexto1, campotexto2;
	private JCheckBox check;
	private JButton botonentrar;

	public Acceso() {

		setLayout(null);

		usuario = new JLabel("Usuario: ");
		usuario.setBounds(20, 20, 100, 25);
		add(usuario);

		contraseña = new JLabel("Contraseña: ");
		contraseña.setBounds(20, 60, 100, 25);
		add(contraseña);

		campotexto1 = new JTextField();
		campotexto1.setBounds(100, 20, 175, 25);
		add(campotexto1);

		campotexto2 = new JTextField();
		campotexto2.setBounds(100, 60, 175, 25);
		add(campotexto2);

		check = new JCheckBox("Recordar usuario");
		check.setBounds(95, 100, 150, 25);
		add(check);

		botonentrar = new JButton("Entrar");
		botonentrar.setBounds(120, 140, 120, 25);
		add(botonentrar);
	}

	public static void main(String[] args) {

		Acceso a = new Acceso();

		a.setTitle("Acceso");
		a.setBounds(10, 10, 350, 225);
		a.setVisible(true);
		a.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}

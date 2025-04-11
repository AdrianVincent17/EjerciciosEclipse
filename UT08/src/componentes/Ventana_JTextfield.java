package componentes;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Ventana_JTextfield extends JFrame {

	private JLabel usuario;
	private JTextField campotexto;

	public Ventana_JTextfield() {

		setLayout(null);

		usuario = new JLabel("Usuario ");
		usuario.setBounds(20, 30, 80, 25);
		add(usuario);

		campotexto = new JTextField();
		campotexto.setBounds(80, 30, 150, 25);
		add(campotexto);

	}

	public static void main(String[] args) {

		Ventana_JTextfield t = new Ventana_JTextfield();

		t.setTitle("Ventana Texto");
		t.setLocationRelativeTo(null);
		t.setSize(300, 150);
		t.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		t.setVisible(true);

	}

}

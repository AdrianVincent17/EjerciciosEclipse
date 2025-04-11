package componentes;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Ventana_JTextArea extends JFrame {

	private JTextArea area;
	private JScrollPane scpanel;

	public Ventana_JTextArea() {

		setLayout(null);

		area = new JTextArea();
		area.setLineWrap(true);

		scpanel = new JScrollPane(area);
		scpanel.setBounds(20, 50, 225, 150);
		add(scpanel);

	}

	public static void main(String[] args) {

		Ventana_JTextArea v = new Ventana_JTextArea();

		v.setTitle("Ventana TextArea");
		v.setSize(300, 250);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		v.setLocationRelativeTo(null);
		v.setVisible(true);

	}

}

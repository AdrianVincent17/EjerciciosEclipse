package componentes;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Ventana_JCheckBox extends JFrame {

	private JCheckBox check1, check2;

	public Ventana_JCheckBox() {

		setLayout(null);

		check1 = new JCheckBox("Pulsar para activar");
		check2 = new JCheckBox("Pulsar para desactivar");

		check1.setBounds(60, 20, 150, 25);
		check2.setBounds(60, 60, 150, 25);

		add(check1);
		add(check2);

	}

	public static void main(String[] args) {

		Ventana_JCheckBox v = new Ventana_JCheckBox();

		v.setTitle("Ventana JCheckBox");
		v.setSize(300, 150);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		v.setLocationRelativeTo(null);
		v.setVisible(true);

	}

}

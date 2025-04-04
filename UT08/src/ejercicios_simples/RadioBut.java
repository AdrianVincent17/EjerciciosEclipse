package ejercicios_simples;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class RadioBut extends JFrame {

	JRadioButton radiomayor, radiomenor;
	ButtonGroup radiobotones;

	public RadioBut() {

		setLayout(null);

		radiobotones = new ButtonGroup();

		radiomayor = new JRadioButton("Mayor de edad", true);
		radiomenor = new JRadioButton("Menor de edad");

		radiomayor.setBounds(20, 30, 150, 50);
		radiomenor.setBounds(150, 30, 150, 50);

		radiobotones.add(radiomayor);
		radiobotones.add(radiomenor);

		add(radiomayor);
		add(radiomenor);

	}

	public static void main(String[] args) {

		RadioBut r = new RadioBut();

		r.setTitle("Edad");
		r.setBounds(10, 10, 350, 150);
		r.setVisible(true);
		r.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}

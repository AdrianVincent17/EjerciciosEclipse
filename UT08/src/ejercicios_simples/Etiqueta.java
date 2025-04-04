package ejercicios_simples;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Etiqueta {

	public static void main(String[] args) {

		JFrame j = new JFrame();

		JLabel etiqueta = new JLabel("Federico Garcia");

		j.getContentPane().add(etiqueta);
		j.setSize(300, 100);
		j.setLocationRelativeTo(null);
		j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		j.setVisible(true);

	}

}

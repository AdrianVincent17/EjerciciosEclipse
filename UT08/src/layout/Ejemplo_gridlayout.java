package layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Ejemplo_gridlayout extends JFrame {

	public Ejemplo_gridlayout() {

		setLayout(new GridLayout(3, 4, 5, 5));

		for (int i = 1; i <= 10; i++) {
			add(new JButton("" + i));

		}
	}

	public static void main(String[] args) {

		Ejemplo_gridlayout e = new Ejemplo_gridlayout();

		e.setTitle("GridLayout");
		e.setVisible(true);
		e.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		e.setLocationRelativeTo(null);
		e.setSize(300, 250);
	}

}

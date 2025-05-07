package layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo_FlowLayout extends JFrame {

	public Ejemplo_FlowLayout() {

		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

		for (int i = 1; i <= 10; i++) {
			add(new JButton("Boton " + i));
		}
	}

	public static void main(String[] args) {

		Ejemplo_FlowLayout e = new Ejemplo_FlowLayout();

		e.setVisible(true);
		e.setTitle("Ejemplo flowLayout");
		e.setLocationRelativeTo(null);
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setSize(300, 250);

	}

}

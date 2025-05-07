package layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo_BorderLayout extends JFrame {

	public Ejemplo_BorderLayout() {

		setLayout(new BorderLayout(5, 10));

		add(new JButton("UNO"), BorderLayout.CENTER);
		add(new JButton("DOS"), BorderLayout.SOUTH);
		add(new JButton("TRES"), BorderLayout.NORTH);
		add(new JButton("CUATRO"), BorderLayout.EAST);
		add(new JButton("CINCO"), BorderLayout.WEST);

	}

	public static void main(String[] args) {

		Ejemplo_BorderLayout e = new Ejemplo_BorderLayout();

		e.setVisible(true);
		e.pack();
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setLocationRelativeTo(null);
		e.setTitle("Ejemplo de BorderLayour");

	}

}

package layout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Ejemplo_BorderLayout extends JFrame implements ActionListener {

	public static void main(String[] args) {

		Ejemplo_BorderLayout e = new Ejemplo_BorderLayout();

		e.setVisible(true);
		e.setSize(300, 200);
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setLocationRelativeTo(null);
		e.setTitle("Ejemplo de BorderLayour");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}

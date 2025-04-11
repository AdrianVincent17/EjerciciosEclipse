package dados;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Dado3 extends JFrame implements ActionListener {

	private JButton tirada;

	public Dado3() {

		setLayout(new GridLayout(1, 0));

		tirada = new JButton(new ImageIcon("C:\\Users\\AdrianV\\Downloads\\dados\\dado1.png"));
		add(tirada);
		tirada.addActionListener(this);

	}

	public static void main(String[] args) {

		Dado3 d = new Dado3();

		d.setTitle("Dado 3");
		d.setSize(350, 350);
		d.setResizable(false);
		d.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		d.setVisible(true);
		d.setLocationRelativeTo(null);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tirada) {
			int num = (int) (Math.random() * 6 + 1);
			switch (num) {
			case 1:
				tirada.setIcon(new ImageIcon("C:\\Users\\AdrianV\\Downloads\\dados\\dado1.png"));
				break;
			case 2:
				tirada.setIcon(new ImageIcon("C:\\Users\\AdrianV\\Downloads\\dados\\dado2.png"));
				break;
			case 3:
				tirada.setIcon(new ImageIcon("C:\\Users\\AdrianV\\Downloads\\dados\\dado3.png"));
				break;
			case 4:
				tirada.setIcon(new ImageIcon("C:\\Users\\AdrianV\\Downloads\\dados\\dado4.png"));
				break;
			case 5:
				tirada.setIcon(new ImageIcon("C:\\Users\\AdrianV\\Downloads\\dados\\dado5.png"));
				break;
			case 6:
				tirada.setIcon(new ImageIcon("C:\\Users\\AdrianV\\Downloads\\dados\\dado6.png"));
				break;
			}
		}

	}

}

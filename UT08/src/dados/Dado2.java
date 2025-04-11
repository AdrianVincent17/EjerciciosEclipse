package dados;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Dado2 extends JFrame implements ActionListener {

	private JLabel tirada;
	private JButton boton;

	public Dado2() {

		setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

		tirada = new JLabel(new ImageIcon("C:\\Users\\AdrianV\\Downloads\\dados\\uno.png"));

		add(tirada);

		boton = new JButton("Tirar dado");
		boton.setFont(new Font("Arial", Font.BOLD, 15));
		add(boton);
		boton.addActionListener(this);
	}

	public static void main(String[] args) {

		Dado2 d = new Dado2();

		d.setTitle("Dado 2");
		d.setSize(250, 250);
		d.setResizable(false);
		d.setLocationRelativeTo(null);
		d.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		d.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			int num = (int) (Math.random() * 6 + 1);
			switch (num) {
			case 1:
				tirada.setIcon(new ImageIcon("C:\\Users\\AdrianV\\Downloads\\dados\\uno.png"));
				break;
			case 2:
				tirada.setIcon(new ImageIcon("C:\\Users\\AdrianV\\Downloads\\dados\\dos.png"));
				break;
			case 3:
				tirada.setIcon(new ImageIcon("C:\\Users\\AdrianV\\Downloads\\dados\\tres.png"));
				break;
			case 4:
				tirada.setIcon(new ImageIcon("C:\\Users\\AdrianV\\Downloads\\dados\\cuatro.png"));
				break;
			case 5:
				tirada.setIcon(new ImageIcon("C:\\Users\\AdrianV\\Downloads\\dados\\cinco.png"));
				break;
			case 6:
				tirada.setIcon(new ImageIcon("C:\\Users\\AdrianV\\Downloads\\dados\\seis.png"));
				break;
			}
		}

	}

}

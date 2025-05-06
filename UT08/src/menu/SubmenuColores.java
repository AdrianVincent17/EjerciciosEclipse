package menu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SubmenuColores extends JFrame implements ActionListener {

	private JMenuBar menubar;
	private JMenu opciones, menuColores, menuResoluciones;
	private JMenuItem color1, color2, res1, res2;

	public SubmenuColores() {

		setLayout(null);

		menubar = new JMenuBar();
		setJMenuBar(menubar);

		opciones = new JMenu("Opciones");
		menubar.add(opciones);

		menuColores = new JMenu("Colores");
		opciones.add(menuColores);

		menuResoluciones = new JMenu("Resoluciones");
		opciones.add(menuResoluciones);

		color1 = new JMenuItem("Rojo");
		menuColores.add(color1);
		color1.addActionListener(this);

		color2 = new JMenuItem("Azul");
		menuColores.add(color2);
		color2.addActionListener(this);

		res1 = new JMenuItem("640X480");
		menuResoluciones.add(res1);
		res1.addActionListener(this);

		res2 = new JMenuItem("800X600");
		menuResoluciones.add(res2);
		res2.addActionListener(this);

	}

	public static void main(String[] args) {

		SubmenuColores s = new SubmenuColores();

		s.setVisible(true);
		s.setLocationRelativeTo(null);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setSize(300, 200);
		s.setTitle("Menus");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == color1) {
			getContentPane().setBackground(Color.red);
		}

		if (e.getSource() == color2) {
			getContentPane().setBackground(Color.blue);
		}

		if (e.getSource() == res1) {
			setSize(640, 480);
		}

		if (e.getSource() == res2) {
			setSize(800, 600);
		}

	}

}

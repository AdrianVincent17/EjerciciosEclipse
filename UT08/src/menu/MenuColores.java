package menu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MenuColores extends JFrame implements ActionListener, ChangeListener {

	private JMenuBar menubar;
	private JMenu menu;
	private JMenuItem item1, item2, item3;

	public MenuColores() {

		setLayout(null);

		menubar = new JMenuBar();
		setJMenuBar(menubar);

		menu = new JMenu("Colores");
		menubar.add(menu);

		item1 = new JMenuItem("Rojo");
		menu.add(item1);
		item1.addActionListener(this);

		item2 = new JMenuItem("Azul");
		menu.add(item2);
		item2.addActionListener(this);

		item3 = new JMenuItem("Verde");
		menu.add(item3);
		item3.addActionListener(this);

	}

	public static void main(String[] args) {

		MenuColores m = new MenuColores();

		m.setVisible(true);
		m.setTitle("Menu");
		m.setLocationRelativeTo(null);
		m.setSize(300, 200);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == item1) {
			getContentPane().setBackground(Color.red);
		}

		if (e.getSource() == item2) {
			getContentPane().setBackground(Color.blue);
		}

		if (e.getSource() == item3) {
			getContentPane().setBackground(Color.green);
		}

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Esbozo de método generado automáticamente

	}

}

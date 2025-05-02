package itemListener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class CambioColores extends JFrame implements ItemListener {

	/*
	 * añadimos los componentes de la ventana
	 */
	private JComboBox<String> combo;

	public CambioColores() {

		setLayout(null);

		combo = new JComboBox<String>();
		combo.setBounds(20, 20, 80, 20);
		combo.addItem("");
		combo.addItem("Rojo");
		combo.addItem("Azul");
		combo.addItem("Verde");
		combo.addItem("Amarillo");

		add(combo);

		combo.addItemListener(this);
	}

	public static void main(String[] args) {

		CambioColores cc = new CambioColores();
		cc.setSize(200, 200);
		cc.setLayout(null);
		cc.setVisible(true);
		cc.setLocationRelativeTo(null);
		cc.setTitle("Cambio de Colores");
		cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == combo) {
			String color = (String) combo.getSelectedItem();
			switch (color) {
			case "Rojo":
				getContentPane().setBackground(java.awt.Color.red);
				break;
			case "Azul":
				getContentPane().setBackground(java.awt.Color.blue);
				break;
			case "Verde":
				getContentPane().setBackground(java.awt.Color.green);
				break;
			case "Amarillo":
				getContentPane().setBackground(java.awt.Color.yellow);
				break;
			case "":
				getContentPane().setBackground(java.awt.Color.lightGray);
				break;
			}
		}

	}

}

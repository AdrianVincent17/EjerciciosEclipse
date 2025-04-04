package componentes;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Ventana_ComboBox extends JFrame {

	// Componentes

	JComboBox combo;

	/**
	 * Creamo la ventana con un comboBox
	 */
	public Ventana_ComboBox() {
		setLayout(null);

		combo = new JComboBox();
		combo.setBounds(10, 10, 120, 20);
		combo.addItem("Rojo");
		combo.addItem("verde");
		combo.addItem("azul");

		add(combo);
	}

	public static void main(String[] args) {

		Ventana_ComboBox v = new Ventana_ComboBox();

		v.setTitle("Ejemplo combobox");
		v.setBounds(10, 10, 320, 150);
		v.setVisible(true);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}

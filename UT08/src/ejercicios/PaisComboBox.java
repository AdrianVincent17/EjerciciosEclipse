package ejercicios;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

//Para capturar la seleccion de un item debemeos implementar la interface ItemListener
public class PaisComboBox extends JFrame implements ItemListener {

	/*
	 * componentes te la ventana
	 */

	private JComboBox combo;

	/*
	 * Creamos la ventana con un ComboBox
	 */

	public PaisComboBox() {

		// Posicionamiento absoluto
		setLayout(null);

		// Creamos el ComboBox y lo ubicamos dentro de la ventana
		combo = new JComboBox();

		combo.setBounds(50, 25, 150, 25);

		// Añadimos los Strings al ComboBox
		combo.addItem("");
		combo.addItem("España");
		combo.addItem("Francia");
		combo.addItem("Italia");
		combo.addItem("Portugal");

		// Añadimos el ComboBox a la ventana
		add(combo);

		// Asociamos la clase que capturara el evento de cambio de item
		// con el this indicamos que esta misma clase sera la que capture el evento
		combo.addItemListener(this);

	}

	public static void main(String[] args) {

		PaisComboBox e = new PaisComboBox();

		e.setTitle("Elige un pais");
		e.setVisible(true);
		e.setLocationRelativeTo(null);
		e.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		e.setSize(280, 200);

	}

	/**
	 * metodo itemStateChanged que debemos implementar de la interface ItemListener
	 * Este metodo implementa la accion del cambio de item mediante una seleccion de
	 * un item en un ComboBox
	 */

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == combo) {
			// Para extraer el contenido del item seleccionado llamamos al metodo
			// getSelectedItem(),
			// que retorna un objeto de la clase Object, por lo que debemos transformalo a
			// String

			String seleccionado = (String) combo.getSelectedItem();

			// Añadimo al titulo
			setTitle(seleccionado);

		}

	}

}

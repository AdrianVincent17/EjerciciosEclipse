package componentes;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class Ventana_RadioButton extends JFrame {

	private ButtonGroup grupobotones;
	private JRadioButton hombre, mujer;

	public Ventana_RadioButton() {

		setLayout(null);

		grupobotones = new ButtonGroup();

		hombre = new JRadioButton("hombre", true);
		mujer = new JRadioButton("Mujer");

		hombre.setBounds(50, 20, 100, 25);
		mujer.setBounds(50, 60, 100, 25);

		grupobotones.add(hombre);
		grupobotones.add(mujer);

		add(hombre);
		add(mujer);

	}

	public static void main(String[] args) {

		Ventana_RadioButton r = new Ventana_RadioButton();

		r.setTitle("Ventana Radio button");
		r.setSize(300, 150);
		r.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		r.setLocationRelativeTo(null);
		r.setVisible(true);

	}

}

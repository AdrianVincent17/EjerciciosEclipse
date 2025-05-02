package ejercicios;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorRadioButton extends JFrame implements ChangeListener {

	/*
	 * Componentes de la ventana
	 */

	private JPanel panel1;
	private JLabel label1;
	private JRadioButton rojo, azul, verde, amarillo;
	private ButtonGroup grupobotones;

	/*
	 * Creamos la ventana con tres JRadioButtons
	 */

	public ColorRadioButton() {

		// creamos el grupo de botones

		grupobotones = new ButtonGroup();

		// Añadimos al panel los radiobuttons con su changelistener
		rojo = new JRadioButton("Rojo");
		grupobotones.add(rojo);
		rojo.addChangeListener(this);

		azul = new JRadioButton("Azul");
		grupobotones.add(azul);
		azul.addChangeListener(this);

		verde = new JRadioButton("Verde");
		grupobotones.add(verde);
		verde.addChangeListener(this);

		amarillo = new JRadioButton("Amarillo");
		grupobotones.add(amarillo);
		amarillo.addChangeListener(this);

		// Creamos la etiqueta todavia sin texto...
		label1 = new JLabel();

		// Creamos el panel donde insertamos el grupo de botones y la etiqueta
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(0, 1, 15, 15));

		panel1.add(rojo);
		panel1.add(azul);
		panel1.add(verde);
		panel1.add(amarillo);

		panel1.add(label1);

		// Añadimos el panel a la ventana con un layout (flowlayout) para crear margenes
		setLayout(new FlowLayout(FlowLayout.LEFT, 60, 20));
		add(panel1);

	}

	public static void main(String[] args) {

		ColorRadioButton c = new ColorRadioButton();

		c.setVisible(true);
		c.setSize(280, 280);
		c.setLocationRelativeTo(null);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setTitle("Elige un color");

	}

	@Override
	public void stateChanged(ChangeEvent e) {

		String cad = "Color elegido: ";

		if (rojo.isSelected()) {
			cad = cad + rojo.getText();

		}

		if (azul.isSelected()) {
			cad = cad + azul.getText();

		}

		if (verde.isSelected()) {
			cad = cad + verde.getText();

		}

		if (amarillo.isSelected()) {
			cad = cad + amarillo.getText();

		}

		label1.setText(cad);

	}

}

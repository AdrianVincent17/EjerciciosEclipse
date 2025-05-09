package boletin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class VentanaSec extends JDialog implements ActionListener {

	/*
	 * componentes de la ventana modal
	 */
	private JButton volver;
	private JLabel label;

	public VentanaSec(Ej02 parent, boolean modal) {

		setLayout(null);

		// Establecemos el tamaño y posicion de la ventana secundaria
		setBounds(300, 250, 350, 200);

		// Establecemos y añadimos la etiqueta a la ventana secundaria
		label = new JLabel("Generamos un numero de la LOTERIA PRIMITIVA");
		label.setBounds(35, 30, 300, 30);
		add(label);

		// Establecemos y añadimos el boton de volver a la ventan secundaria
		volver = new JButton("Volver");
		volver.setBounds(130, 80, 80, 30);
		add(volver);
		volver.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Funcionalidad que nos hace el boton de volver
		// en la ventana modal

		if (e.getSource() == volver) {
			setVisible(false);
		}

	}

}

package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class ventanarequisitos extends JDialog implements ActionListener {

	/*
	 * componentes de la ventana modal
	 */
	private JButton volver;
	private JLabel label1, label2, label3, label4, label5, label6, label7;

	public ventanarequisitos(ForzadoContraseña parent, boolean modal) {

		setLayout(null);

		// Establecemos el tamaño y posicion de la ventana secundaria
		setBounds(300, 250, 380, 400);

		// Establecemos y añadimos la etiqueta a la ventana secundaria
		label1 = new JLabel("La Contraseña: ");
		label1.setBounds(35, 30, 300, 30);
		add(label1);

		label2 = new JLabel("- Debe tener al menos 8 caracteres de longitud");
		label2.setBounds(35, 60, 300, 30);
		add(label2);

		label3 = new JLabel("- No puede tener más de 24 caracteres de longitud");
		label3.setBounds(35, 90, 300, 30);
		add(label3);

		label4 = new JLabel("- No puede contener el login del usuario");
		label4.setBounds(35, 120, 300, 30);
		add(label4);

		label5 = new JLabel("- Debe contener al menos una letra mayúscula");
		label5.setBounds(35, 150, 300, 30);
		add(label5);

		label6 = new JLabel("- Debe contener al menos una letra minuscula");
		label6.setBounds(35, 180, 300, 30);
		add(label6);

		label7 = new JLabel("- Debe contener al menos un numero");
		label7.setBounds(35, 210, 300, 30);
		add(label7);

		// Establecemos y añadimos el boton de volver a la ventan secundaria
		volver = new JButton("Volver");
		volver.setBounds(130, 250, 80, 30);
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

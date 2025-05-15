package boletin;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaSec extends JDialog implements ActionListener {

	// componentes
	JLabel mensaje;
	JButton volver;
	JPanel panel;

	public VentanaSec(Ej02 parent, boolean modal) {

		// invocamos al constructor de la clase JDialog

		super(parent, modal);
		setSize(380, 200);
		setTitle("Examen de Programación");

		setLayout(new GridLayout(0, 1, 0, 100)); // (rows, cols, ancho, alto)

		panel = new JPanel();

		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 40)); // margen(ancho, alto)

		// creamos una etiqueta, la ubicamos y damos tamaño y la añadimos a la ventana
		mensaje = new JLabel("Generador de números de la LOTERIA PRIMITIVA");
		panel.add(mensaje, BorderLayout.NORTH);

		volver = new JButton("Volver");
		// posicion y tamaño del botón dentro de la ventana
		panel.add(volver, BorderLayout.CENTER);
		volver.addActionListener(this);

		add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == volver) {
			setVisible(false);
		}

	}

	public static void main(String[] args) {

	}

}

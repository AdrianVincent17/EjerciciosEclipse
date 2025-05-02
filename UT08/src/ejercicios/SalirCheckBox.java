package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SalirCheckBox extends JFrame implements ActionListener, ChangeListener {

	/*
	 * Componentes de la ventana
	 */

	private JCheckBox check;
	private JButton boton;

	/*
	 * Declaramos un booleano para saber si el check esta seleccionado o no
	 */

	private boolean aceptado = false;

	public SalirCheckBox() {

		setLayout(null);

		check = new JCheckBox("Acepta antes de salir");
		check.setBounds(80, 20, 200, 25);
		add(check);
		check.addChangeListener(this);

		boton = new JButton("Salir");
		boton.setBounds(110, 60, 100, 25);
		add(boton);
		boton.addActionListener(this);

	}

	public static void main(String[] args) {

		SalirCheckBox s = new SalirCheckBox();

		s.setVisible(true);
		s.setLocationRelativeTo(null);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		s.setSize(360, 150);

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if (check.isSelected()) {
			aceptado = true;
		} else {
			aceptado = false;
			setTitle("");
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			if (aceptado) {
				System.exit(0); // Esta funcion sirve para salir de la ventana
			} else
				setTitle("Debes aceptar antes de salir...");
		}

	}

}

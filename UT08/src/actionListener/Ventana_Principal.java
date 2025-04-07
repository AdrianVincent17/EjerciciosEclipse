package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana_Principal extends JFrame implements ActionListener {

	private JLabel mensaje;
	private JButton boton;

	public Ventana_Principal() {

		setLayout(null);

		mensaje = new JLabel("Esta es la ventana principal");
		mensaje.setBounds(35, 30, 200, 30);
		add(mensaje);

		boton = new JButton("Haz click aqui");
		boton.setBounds(40, 80, 150, 30);
		add(boton);
		boton.addActionListener(this);

	}

	public static void main(String[] args) {

		Ventana_Principal v = new Ventana_Principal();

		v.setBounds(000, 100, 250, 200);
		v.setVisible(true);
		v.setLocationRelativeTo(null);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			Ventana_modal vm = new Ventana_modal(this, true);
			vm.setVisible(true);

		}

	}

}

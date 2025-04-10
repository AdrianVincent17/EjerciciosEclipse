package actionListener.ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Ej02 extends JFrame implements ActionListener {

	private JLabel etiqueta;
	private JTextField campo;
	private JButton boton;

	public Ej02() {

		setLayout(null);

		etiqueta = new JLabel("Introduce un nº Entero: ");
		etiqueta.setBounds(50, 30, 150, 30);
		add(etiqueta);

		campo = new JTextField();
		campo.setBounds(40, 70, 150, 30);
		add(campo);

		boton = new JButton("Par o Impar");
		boton.setBounds(50, 120, 120, 30);
		add(boton);
		boton.addActionListener(this);
	}

	public static void main(String[] args) {
		Ej02 e = new Ej02();

		e.setSize(250, 300);
		e.setVisible(true);
		e.setLocationRelativeTo(null);
		e.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			try {
				int n = Integer.parseInt(campo.getText());
				if (n % 2 == 0)
					setTitle("PAR");
				else
					setTitle("IMPAR");
			} catch (Exception lupita) {
				setTitle("ERROR");
			}

		}

	}

}

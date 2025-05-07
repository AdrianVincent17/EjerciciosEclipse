package ejercicios;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ej02 extends JFrame implements ActionListener {

	private JLabel numero;
	private JTextField campo;
	private JButton boton;
	private JTextArea area;

	public Ej02() {

		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

		numero = new JLabel("numero");
		add(numero);

		campo = new JTextField(10);
		add(campo);

		boton = new JButton("Generar tabla");
		add(boton);
		boton.addActionListener(this);

		area = new JTextArea(12, 25);
		add(area);

	}

	public static void main(String[] args) {

		Ej02 e = new Ej02();

		e.setTitle("Tabla de multiplicar");
		e.setVisible(true);
		e.setSize(320, 300);
		e.setLocationRelativeTo(null);
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int num = 0;

		if (e.getSource() == boton) {
			num = Integer.parseInt(campo.getText());
			try {
				if (num < 1 || num > 10) {
					area.setText("introduce un numero entre 1 y 10");
				} else {
					area.setText("");
					for (int i = 1; i <= 10; i++) {
						area.append(num + " X " + i + " = " + (num * i) + "\n");
					}
				}

			} catch (NumberFormatException e1) {
				area.setText("Introduce un numero valido");
			}
		}

	}

}

package actionListener;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class ConversorDecimalRomano extends JFrame implements ActionListener {

	/* componentes */
	private JPanel panel;
	private JTextField campodecimal, camporomano;
	private JButton boton;

	public ConversorDecimalRomano() {

		campodecimal = new JTextField(10);
		camporomano = new JTextField(10);
		boton = new JButton("Convertir");
		panel = new JPanel();
		boton.addActionListener(this);

		panel.setLayout(new GridLayout(2, 3, 15, 5));

		panel.add(new JLabel("Nº Decimal:"), JLabel.CENTER);
		panel.add(new JLabel(""), JLabel.CENTER);
		panel.add(new JLabel("Nº Romanol:"), JLabel.CENTER);

		panel.add(campodecimal);
		panel.add(boton);
		panel.add(camporomano);

		// añadimos el panel a la ventan
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		add(panel);

	}

	/**
	 * Funcion que devuelve una cadena de caracteres como numeros romanos al pasar
	 * un numero como parametro
	 * 
	 * @param N numero entero
	 * @return numero romano
	 */

	public static String romanos(int N) {

		String cad = "";
		int num = Math.abs(N);

		while (num >= 1000) {
			num -= 1000;
			cad = cad + "M";
		}

		if (num >= 900) {
			num -= 900;
			cad = cad + "CM";
		}

		if (num >= 500) {
			num -= 500;
			cad = cad + "D";
		}

		if (num >= 400) {
			num -= 400;
			cad = cad + "CD";
		}

		while (num >= 100) {
			num -= 100;
			cad = cad + "C";
		}

		if (num >= 90) {
			num -= 90;
			cad = cad + "C";
		}

		if (num >= 50) {
			num -= 50;
			cad = cad + "L";
		}

		if (num >= 40) {
			num -= 40;
			cad = cad + "XL";
		}

		while (num >= 10) {
			num -= 10;
			cad = cad + "X";
		}

		if (num >= 9) {
			num -= 9;
			cad = cad + "IX";
		}

		if (num >= 5) {
			num -= 5;
			cad = cad + "V";
		}

		if (num >= 4) {
			num -= 4;
			cad = cad + "IV";
		}

		while (num >= 1) {
			num -= 1;
			cad = cad + "I";
		}

		return cad;

	}

	/* Creamos la ventana y la configuracion */

	public static void main(String[] args) {

		ConversorDecimalRomano c = new ConversorDecimalRomano();

		c.setTitle("Conversor Decimal > Romano");
		c.pack();
		c.setLocationRelativeTo(null);
		c.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		c.setVisible(true);

	}

	/**
	 * implementa la accion del boton
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton) {
			try {
				int n = Integer.parseInt(campodecimal.getText());
				camporomano.setText(romanos(n));
			} catch (Exception lupita) {
				camporomano.setText("ERROR!");
			}
		}

	}

}

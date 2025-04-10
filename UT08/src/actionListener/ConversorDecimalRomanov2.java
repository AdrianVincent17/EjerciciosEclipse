package actionListener;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class ConversorDecimalRomanov2 extends JFrame implements ActionListener {

	private JLabel label1, label2;
	private JTextField campo1, campo2;
	private JButton boton;
	private JPanel panel1, panel2, panel3;

	public ConversorDecimalRomanov2() {

		// Creamos el panel de la izquierda con sus componentes

		label1 = new JLabel("Nº DECIMAL", JLabel.CENTER);
		campo1 = new JTextField(10);
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(0, 1, 0, 10));
		panel1.add(label1);
		panel1.add(campo1);

		// Creamos el panel de la derecha con sus componentes

		label2 = new JLabel("Nº ROMANO", JLabel.CENTER);
		campo2 = new JTextField(10);
		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(0, 1, 0, 10));
		panel2.add(label2);
		panel2.add(campo2);

		// Creamo el panel central con un boton
		boton = new JButton(new ImageIcon("C:\\Users\\AdrianV\\Downloads\\flecha.png"));
		boton.setContentAreaFilled(false);
		boton.setBorder(null);
		boton.addActionListener(this);

		// layout de la ventana
		setLayout(new FlowLayout(FlowLayout.CENTER, 25, 50));
		add(panel1);
		add(boton);
		add(panel2);

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

	public static void main(String[] args) {

		ConversorDecimalRomanov2 c = new ConversorDecimalRomanov2();

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
				int n = Integer.parseInt(campo1.getText());
				campo2.setText(romanos(n));
			} catch (Exception lupita) {
				campo2.setText("ERROR!");
			}
		}

	}

}

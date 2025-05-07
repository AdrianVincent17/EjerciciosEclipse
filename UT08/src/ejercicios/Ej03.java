package ejercicios;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ej03 extends JFrame implements ChangeListener {

	private JLabel operandos, operaciones, resultado;
	private JTextField campo1, campo2, campo3;
	private JRadioButton suma, resta, multiplicacion, division, resto;
	private ButtonGroup grupo;
	private JPanel panel1, panel2;

	public Ej03() {

		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(0, 1, 16, 16));

		operandos = new JLabel("Operandos: ");
		panel1.add(operandos);

		campo1 = new JTextField(5);
		panel1.add(campo1);

		campo2 = new JTextField(5);
		panel1.add(campo2);

		resultado = new JLabel("Resultado: ");
		panel1.add(resultado);

		campo3 = new JTextField(5);
		panel1.add(campo3);

		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(0, 1, 5, 5));

		operaciones = new JLabel("Operaciones: ");
		panel2.add(operaciones);

		suma = new JRadioButton("Suma");
		panel2.add(suma);
		suma.addChangeListener(this);

		resta = new JRadioButton("Resta");
		panel2.add(resta);
		resta.addChangeListener(this);

		multiplicacion = new JRadioButton("Multiplicación");
		panel2.add(multiplicacion);
		multiplicacion.addChangeListener(this);

		division = new JRadioButton("División");
		panel2.add(division);
		division.addChangeListener(this);

		resto = new JRadioButton("Resto");
		panel2.add(resto);
		resto.addChangeListener(this);

		grupo = new ButtonGroup();
		grupo.add(suma);
		grupo.add(resta);
		grupo.add(multiplicacion);
		grupo.add(division);
		grupo.add(resto);

		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 30));
		add(panel1);
		add(panel2);

	}

	public static void main(String[] args) {

		Ej03 ventana = new Ej03();
		ventana.setSize(320, 300);
		ventana.setTitle("Operaciones");
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void stateChanged(ChangeEvent e) {

		int num1 = 0;
		int num2 = 0;

		try {
			num1 = Integer.parseInt(campo1.getText());
			num2 = Integer.parseInt(campo2.getText());
			if (num1 < 1 || num2 < 1) {
				campo3.setText("Los números deben ser mayores que 0");
			} else {
				campo3.setText("");
				if (suma.isSelected()) {
					campo3.setText(String.valueOf(num1 + num2));
				} else if (resta.isSelected()) {
					campo3.setText(String.valueOf(num1 - num2));
				} else if (multiplicacion.isSelected()) {
					campo3.setText(String.valueOf(num1 * num2));
				} else if (division.isSelected()) {
					campo3.setText(String.valueOf(num1 / num2));
				} else if (resto.isSelected()) {
					campo3.setText(String.valueOf(num1 % num2));
				}
			}
		} catch (NumberFormatException e1) {
			campo3.setText("Introduce un número válido");
		}

	}

}

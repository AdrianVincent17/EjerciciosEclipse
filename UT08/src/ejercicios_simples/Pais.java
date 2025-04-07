package ejercicios_simples;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Pais extends JFrame {

	private JComboBox combo;
	private JLabel nombre, pais;
	private JTextField entrada;

	public Pais() {

		setLayout(null);

		nombre = new JLabel("Nombre y apellidos: ");
		nombre.setBounds(10, 10, 150, 25);
		add(nombre);

		entrada = new JTextField();
		entrada.setBounds(10, 40, 150, 25);
		add(entrada);

		pais = new JLabel("Indica tu pais de origen: ");
		pais.setBounds(10, 80, 150, 25);
		add(pais);

		combo = new JComboBox();
		combo.setBounds(10, 110, 150, 25);
		combo.addItem("España");
		combo.addItem("Francia");
		combo.addItem("Italia");
		combo.addItem("Alemania");
		add(combo);

	}

	public static void main(String[] args) {

		Pais c = new Pais();

		c.setTitle("Pais");
		c.setBounds(10, 10, 225, 275);
		c.setLocationRelativeTo(null);
		c.setVisible(true);
		c.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}

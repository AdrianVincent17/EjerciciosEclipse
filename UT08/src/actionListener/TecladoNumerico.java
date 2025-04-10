package actionListener;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class TecladoNumerico extends JFrame implements ActionListener {

	JButton[] numeros = new JButton[10];

	public TecladoNumerico() {

		numeros[0] = new JButton("0");
		numeros[1] = new JButton("1");
		numeros[2] = new JButton("2");
		numeros[3] = new JButton("3");
		numeros[4] = new JButton("4");
		numeros[5] = new JButton("5");
		numeros[6] = new JButton("6");
		numeros[7] = new JButton("7");
		numeros[8] = new JButton("8");
		numeros[9] = new JButton("9");

		setLayout(new GridLayout(4, 3, 2, 2));

		// primera fila
		add(numeros[7]);
		add(numeros[8]);
		add(numeros[9]);

		// segunda fila
		add(numeros[4]);
		add(numeros[5]);
		add(numeros[6]);

		// tercera fila
		add(numeros[1]);
		add(numeros[2]);
		add(numeros[3]);

		// Cuarta fila
		add(new JLabel(""));
		add(numeros[0]);
		add(new JLabel(""));

		for (int i = 0; i < numeros.length; i++) {
			numeros[i].addActionListener(this);
		}

	}

	public static void main(String[] args) {

		TecladoNumerico t = new TecladoNumerico();

		t.setTitle("Pulsa un boton");
		t.setSize(300, 300);
		t.setLocationRelativeTo(null);
		t.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		t.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == numeros[0]) {
			setTitle("CERO");

		}
		if (e.getSource() == numeros[1]) {
			setTitle("UNO");

		}
		if (e.getSource() == numeros[2]) {
			setTitle("DOS");

		}
		if (e.getSource() == numeros[3]) {
			setTitle("TRES");

		}
		if (e.getSource() == numeros[4]) {
			setTitle("CUATRO");

		}
		if (e.getSource() == numeros[5]) {
			setTitle("CINCO");

		}
		if (e.getSource() == numeros[6]) {
			setTitle("SEIS");

		}
		if (e.getSource() == numeros[7]) {
			setTitle("SIETE");

		}
		if (e.getSource() == numeros[8]) {
			setTitle("OCHO");

		}
		if (e.getSource() == numeros[9]) {
			setTitle("NUEVE");

		}

	}

}

package ejercicios;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Cifrado extends JFrame implements ActionListener, ChangeListener {

	/*
	 * Componentes de la ventana
	 */

	private JLabel opcion, textoclaro, cifrado;
	private JTextField campoclaro, campocifrado;
	private JButton cifrar, borrar;
	private ButtonGroup grupobotones;
	private JRadioButton cesar, rot13, riel;
	private JPanel panel1, panel2, panel3;
	private int clave = 3;
	private boolean trans = false;

	public Cifrado() {

		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 40));

		panel3 = new JPanel();
		panel3.setLayout(new BorderLayout(5, 50));
		add(panel3);

		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(5, 1, 10, 10));
		panel3.add(panel1, BorderLayout.WEST);

		opcion = new JLabel("Elige una opcion de cifrado: ");
		panel1.add(opcion);

		grupobotones = new ButtonGroup();

		cesar = new JRadioButton("Cifrado del Cesar");
		grupobotones.add(cesar);
		panel1.add(cesar);
		cesar.addChangeListener(this);

		rot13 = new JRadioButton("Cifrado ROT13");
		grupobotones.add(rot13);
		panel1.add(rot13);
		rot13.addChangeListener(this);

		riel = new JRadioButton("Transposicion de Riel");
		grupobotones.add(riel);
		panel1.add(riel);
		riel.addChangeListener(this);

		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(5, 1, 5, 10));
		panel3.add(panel2, BorderLayout.EAST);

		textoclaro = new JLabel("Texto en claro: ");
		panel2.add(textoclaro);

		campoclaro = new JTextField(15);
		panel2.add(campoclaro);

		cifrado = new JLabel("Texto cifrado: ");
		panel2.add(cifrado);

		campocifrado = new JTextField(15);
		panel2.add(campocifrado);

		cifrar = new JButton("Cifrar");
		panel1.add(cifrar);
		cifrar.addActionListener(this);

		borrar = new JButton("Borrar");
		panel2.add(borrar);
		borrar.addActionListener(this);

	}

	public static void main(String[] args) {

		Cifrado c = new Cifrado();

		c.setVisible(true);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLocationRelativeTo(null);
		c.setSize(400, 300);
		c.setTitle("Cifrado");
	}

	/**
	 * Cifrado por sustitucion Sustituye cada caracter del mensaje a cifrar por el
	 * caracter que ocupa 'clave' posiciones en adelante en el alfabeto Cifra solo
	 * los caracteres del alfabeto 'A'..'Z' y 'a'..'z' (sin incluir la Ñ ni la ñ)
	 * cualquier otro caracter (incluidos espacios en blanco) se copiaran igual, sin
	 * cifrar. Considera el alfabeto circular, de forma que despues de la 'Z'
	 * continuaria la 'A' y despues de la 'z' iria la 'a'.
	 * 
	 * @param mensaje - mensaje a cifrar
	 * @param clave   - Clave a aplicar en el cifrado
	 * @return criptograma al que se ha aplicado el cifrado por sustitucion
	 */

	public String sustitucion(String mensaje, int clave) {
		String criptograma = "";

		// Recorremos el mensaje y ciframos caracter a caracter
		for (int i = 0; i < mensaje.length(); i++) {
			// si el caracter a cifrar se encuentra entre la 'A'(65) y la 'Z'(90)
			if (mensaje.charAt(i) >= 'A' && mensaje.charAt(i) <= 'Z') {
				int caracter = mensaje.charAt(i) + clave;
				if ((char) caracter > 'Z')
					caracter = caracter - 26;
				criptograma += (char) caracter;

			} // si el caracter a cifrar se encuentra entre la 'a'(97) y la 'z'(122)
			else if (mensaje.charAt(i) >= 'a' && mensaje.charAt(i) <= 'z') {
				int caracter = mensaje.charAt(i) + clave;
				if ((char) caracter > 'z')
					caracter = caracter - 26;
				criptograma += (char) caracter;

			} // En otro caso, no se trata de un caracter del alfabeto, y lo copiamos tal cual
				// (sin aplicar cifrado)
			else {
				criptograma += mensaje.charAt(i);
			}

		}
		return criptograma;
	}

	/**
	 * Cifrar con la transposicion de Riel El mensaje se cifra alternando las letras
	 * en dos cadenas separadas, y concatenando estas dos cadenas.
	 * 
	 * @param mensaje - Mensaje a cifrar
	 * @return criptograma que se obtiene al aplicar la transposicion de Riel
	 */

	public String trasposicionRiel(String mensaje) {

		String cad1 = "";
		String cad2 = "";

		for (int i = 0; i < mensaje.length(); i++) {
			if (i % 2 == 0) {
				cad1 += mensaje.charAt(i);
			} else {
				cad2 += mensaje.charAt(i);
			}
		}

		return cad1 + cad2;

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if (cesar.isSelected()) {
			clave = 3;
		}
		if (rot13.isSelected()) {
			clave = 13;
		}
		if (riel.isSelected()) {
			trans = true;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == borrar) {
			campoclaro.setText("");
			campocifrado.setText("");
		}
		if (e.getSource() == cifrar) {
			if (campoclaro.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Debes introducir un texto en claro", "Aviso",
						JOptionPane.WARNING_MESSAGE);
				;
			} else {
				String mensaje = campoclaro.getText();
				if (!trans) {
					campocifrado.setText(sustitucion(mensaje, clave));
				} else {
					campocifrado.setText(trasposicionRiel(mensaje));
				}
			}

		}

	}

}

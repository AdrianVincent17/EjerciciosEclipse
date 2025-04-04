package ejercicios_simples;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class TextArea extends JFrame {

	private JTextArea texto;
	private JLabel etiqueta;
	private JScrollPane scpanel;

	/**
	 * Creamos la ventana con el text area y el label
	 */
	public TextArea() {

		setLayout(null);

		texto = new JTextArea();
		scpanel = new JScrollPane(texto);
		etiqueta = new JLabel("Escribe tus comentarios");

		etiqueta.setBounds(10, 10, 150, 25);
		add(etiqueta);

		texto.setLineWrap(true);

		scpanel.setBounds(10, 40, 225, 150);
		add(scpanel);

	}

	public static void main(String[] args) {

		TextArea t = new TextArea();

		t.setTitle("Comentarios");
		t.setBounds(10, 10, 300, 250);
		t.setVisible(true);
		t.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}

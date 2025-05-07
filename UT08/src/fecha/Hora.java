package fecha;

import java.awt.BorderLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Hora extends JFrame {

	/*
	 * Componentes de la ventana
	 */

	private JLabel label;

	public Hora() {

		label = new JLabel(HoraActual());

		setLayout(new BorderLayout(0, 0));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.ITALIC, 50));
		add(label, BorderLayout.CENTER);

	}

	public String HoraActual() {

		Date horaActual = new Date();
		String cad = new SimpleDateFormat("HH").format(horaActual).toString();
		cad += " : " + new SimpleDateFormat("mm").format(horaActual).toString();
		cad += " : " + new SimpleDateFormat("ss").format(horaActual).toString();
		return cad;

	}

	public static void main(String[] args) {

		Hora h = new Hora();

		h.setVisible(true);
		h.setTitle("Hora Actual");
		h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		h.setLocationRelativeTo(null);
		h.setSize(400, 200);
		;

	}

}

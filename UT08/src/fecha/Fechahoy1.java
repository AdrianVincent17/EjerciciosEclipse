package fecha;

import java.awt.BorderLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Fechahoy1 extends JFrame {

	/**
	 * comoponente de la ventana
	 */

	private JLabel fecha;

	/**
	 * Contructor
	 */
	public Fechahoy1() {

		fecha = new JLabel(fechaActual());

		setLayout(new BorderLayout(0, 0));
		fecha.setFont(new Font("Arial", Font.ITALIC, 50));
		fecha.setHorizontalAlignment(SwingConstants.CENTER);
		add(fecha, BorderLayout.CENTER);
	}

	/**
	 * Devuelve un string que representra la fecha actual del sistema
	 * 
	 * @return String con la fecah actual del sistema
	 */
	public String fechaActual() {
		Date ahora = new Date();
		String cad = new SimpleDateFormat("dd").format(ahora).toString(); // Dia
		cad += "/" + new SimpleDateFormat("MM").format(ahora).toString(); // Mes
		cad += "/" + new SimpleDateFormat("yyyy").format(ahora).toString(); // Año
		return cad;
	}

	public static void main(String[] args) {

		Fechahoy1 f = new Fechahoy1();

		f.setTitle("Fecha");
		f.setSize(400, 150);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}

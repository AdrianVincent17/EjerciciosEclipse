package fecha;

import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Fechahoy2 extends JFrame {

	/**
	 * comoponente de la ventana
	 */

	private JLabel fecha;

	/**
	 * Contructor
	 */
	public Fechahoy2() {

		fecha = new JLabel(fechaActual());

		fecha.setFont(new Font("Arial", Font.ITALIC, 50));
		fecha.setHorizontalAlignment(SwingConstants.CENTER);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		add(fecha);
	}

	/**
	 * Devuelve un string que representra la fecha actual del sistema
	 * 
	 * @return String con la fecah actual del sistema
	 */
	public String fechaActual() {
		Date ahora = new Date();

		String cad = new SimpleDateFormat("EEEE").format(ahora).toString(); // Dia de la semana
		cad += " " + new SimpleDateFormat("dd").format(ahora).toString(); // Dia
		cad += "/" + new SimpleDateFormat("MM").format(ahora).toString(); // Mes
		cad += "/" + new SimpleDateFormat("yyyy").format(ahora).toString(); // Año

		return cad;
	}

	public static void main(String[] args) {

		Fechahoy2 f = new Fechahoy2();

		f.setTitle("Fecha");
		f.pack();
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}

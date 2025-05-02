package changeListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Resoluciones extends JFrame implements ChangeListener {

	/*
	 * componentes de la ventana
	 */

	private ButtonGroup grupobotones;
	private JRadioButton radio1, radio2, radio3;

	public Resoluciones() {

		setLayout(null);

		grupobotones = new ButtonGroup();

		radio1 = new JRadioButton("640 X 480");
		radio1.setBounds(30, 10, 100, 25);
		grupobotones.add(radio1);
		add(radio1);
		radio1.addChangeListener(this);

		radio2 = new JRadioButton("800 X 600");
		radio2.setBounds(30, 40, 100, 25);
		grupobotones.add(radio2);
		add(radio2);
		radio2.addChangeListener(this);

		radio3 = new JRadioButton("1024 X 768");
		radio3.setBounds(30, 70, 100, 25);
		grupobotones.add(radio3);
		add(radio3);
		radio3.addChangeListener(this);

	}

	public static void main(String[] args) {

		Resoluciones r = new Resoluciones();

		r.setTitle("Elige una resolucion");
		r.setSize(200, 160);
		r.setResizable(false);
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setLocationRelativeTo(null);

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if (radio1.isSelected()) {
			setSize(640, 480);
		}

		if (radio2.isSelected()) {
			setSize(800, 600);
		}

		if (radio3.isSelected()) {
			setSize(1024, 768);
		}

	}

}

package changeListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Idiomas extends JFrame implements ChangeListener {

	private JLabel label;
	private JCheckBox checkBox1, checkBox2, checkBox3;

	public Idiomas() {

		setLayout(null);

		label = new JLabel();
		label.setText("Selecciona uno o varios idiomas: ");
		label.setBounds(40, 20, 300, 30);
		add(label);

		checkBox1 = new JCheckBox("Inglés");
		checkBox1.setBounds(40, 70, 100, 30);
		add(checkBox1);

		checkBox2 = new JCheckBox("Francés");
		checkBox2.setBounds(140, 70, 100, 30);
		add(checkBox2);

		checkBox3 = new JCheckBox("Italiano");
		checkBox3.setBounds(240, 70, 100, 30);
		add(checkBox3);

		checkBox1.addChangeListener(this);
		checkBox2.addChangeListener(this);
		checkBox3.addChangeListener(this);
	}

	public static void main(String[] args) {
		Idiomas ventana = new Idiomas();
		ventana.setTitle("Idiomas");
		ventana.setSize(370, 180);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		String cad = "Idiomas:  ";
		if (checkBox1.isSelected() == true)
			cad = cad + "Inglés, ";
		if (checkBox2.isSelected() == true)
			cad = cad + "Frances, ";
		if (checkBox3.isSelected() == true)
			cad = cad + "Italiano, ";

		cad = cad.substring(0, cad.length() - 2);
		label.setText(cad);

	}
}

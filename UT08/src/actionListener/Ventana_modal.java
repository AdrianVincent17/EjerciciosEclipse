package actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class Ventana_modal extends JDialog implements ActionListener {

	private JButton botonsec;
	private JLabel label;

	public Ventana_modal(Ventana_Principal parent, boolean modal) {

		super(parent, modal);

		setLayout(null);

		setBounds(300, 250, 250, 200);

		label = new JLabel("Esta es la ventana secundaria");
		label.setBounds(35, 30, 300, 30);
		add(label);

		botonsec = new JButton("Volver");
		botonsec.setBounds(40, 80, 150, 30);
		add(botonsec);
		botonsec.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonsec) {
			setVisible(false);
		}

	}

}

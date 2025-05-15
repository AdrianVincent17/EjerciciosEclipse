package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ForzadoContraseña extends JFrame implements ActionListener {

	private JPanel panel;
	private JTextField usuariotxt;
	private JPasswordField contratxt;
	private JPasswordField contratxtconfi;
	private JMenuBar menubar;
	private JMenu menu;
	private JMenuItem requisitos, salir;
	private JButton comprobar, limpiar;
	private JLabel usuario, contraseña, confircontraseña;

	public ForzadoContraseña() {

		setBounds(100, 100, 367, 372);

		menubar = new JMenuBar();
		setJMenuBar(menubar);

		JMenu menu = new JMenu("Menú");
		menubar.add(menu);

		requisitos = new JMenuItem("Requisitos");
		menu.add(requisitos);
		requisitos.addActionListener(this);

		// Botón con la acción de salir de la ventana
		salir = new JMenuItem("Salir");
		menu.add(salir);
		salir.addActionListener(this);

		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panel);
		panel.setLayout(null);

		usuario = new JLabel("Usuario:");
		usuario.setBounds(75, 32, 128, 14);
		panel.add(usuario);

		contraseña = new JLabel("Contraseña:");
		contraseña.setBounds(75, 90, 171, 14);
		panel.add(contraseña);

		confircontraseña = new JLabel("Confirmar contraseña:");
		confircontraseña.setBounds(75, 147, 194, 14);
		panel.add(confircontraseña);

		usuariotxt = new JTextField();
		usuariotxt.setBounds(75, 59, 208, 20);
		panel.add(usuariotxt);
		usuariotxt.setColumns(10);

		contratxt = new JPasswordField();
		contratxt.setBounds(75, 115, 208, 20);
		panel.add(contratxt);

		contratxtconfi = new JPasswordField();
		contratxtconfi.setBounds(75, 172, 208, 20);
		panel.add(contratxtconfi);

		comprobar = new JButton("Comprobar");

		// Boton con la acción de comprobar
		comprobar.addActionListener(this);
		comprobar.setBounds(75, 229, 103, 23);
		panel.add(comprobar);

		// Botón limpiar con la acción de limpar (borrar todos los textfields)
		limpiar = new JButton("Limpiar");
		limpiar.setBounds(194, 229, 89, 23);
		panel.add(limpiar);
		limpiar.addActionListener(this);

	}

	public static void main(String[] args) {

		ForzadoContraseña f = new ForzadoContraseña();

		f.setVisible(true);
		f.setTitle("Fortaleza de contraseñas");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == requisitos) {

			ventanarequisitos vr = new ventanarequisitos(this, true);
			vr.setVisible(true);
			vr.setLocationRelativeTo(null);
			vr.setTitle("Requisitos");
		}

		if (e.getSource() == salir) {
			System.exit(0);
		}

		if (e.getSource() == limpiar) {
			usuariotxt.setText("");
			contratxt.setText("");
			contratxtconfi.setText("");

		}
		if (e.getSource() == comprobar) {
			String usuario = usuariotxt.getText();
			String contra = contratxt.getText();
			String contraconfi = contratxtconfi.getText();

			// Comprobar que el usuario no esté vacio
			if (usuario.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Debes introducir un login de usuario", "Aviso",
						JOptionPane.WARNING_MESSAGE);
			}

			// Comproborar que contraseña no está vacio
			else if (contra.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Debes introducir una contraseña", "Aviso",
						JOptionPane.WARNING_MESSAGE);
			}

			// Comprobar que confirmar contraseña no está vacio
			else if (contraconfi.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Debes confirmar la contraseña", "Aviso",
						JOptionPane.WARNING_MESSAGE);
			}

			// Comprobar que las contraseñas no coinciden
			else if (!contra.equals(contraconfi)) {
				JOptionPane.showMessageDialog(null, "No coinciden las contraseñas introducidas", "Error",
						JOptionPane.ERROR_MESSAGE);

			}

			// Comprobar que la contraseña no tenga menos de 8 caracteres
			else if (contraconfi.length() < 8) {
				JOptionPane.showMessageDialog(null, "La contraseña debe tener más de 8 caracteres",
						"Contraseña no válida", JOptionPane.WARNING_MESSAGE);
			}

			// Comprobar que la contraseña no tenga más de 24 caracteres
			else if (contraconfi.length() > 24) {
				JOptionPane.showMessageDialog(null, "La contraseña debe tener un máximo de 24 caracteres",
						"Contraseña no válida", JOptionPane.WARNING_MESSAGE);
			}

			// Comprobar que la contraseña no "Contenga" el nombre de usuario
			else if (contraconfi.contains(usuario)) {
				JOptionPane.showMessageDialog(null, "La contraseña la contraseña no puede contener el login del usario",
						"Contraseña no válida", JOptionPane.WARNING_MESSAGE);
			}
			// comprobar que contenga al menos una minuscula
			else if (contraconfi.equals(contraconfi.toUpperCase())) {
				JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una letra minúscula",
						"Contraseña no válida", JOptionPane.WARNING_MESSAGE);
			}

			// comprobar que contenga al menos una mayuscula
			else if (contraconfi.equals(contraconfi.toLowerCase())) {
				JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una letra mayúscula",
						"Contraseña no válida", JOptionPane.WARNING_MESSAGE);
			}

			// comprobar que contenga al menos un numero
			else if (!contraconfi.matches(".*\\d.*")) {
				JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos un número",
						"Contraseña no válida", JOptionPane.WARNING_MESSAGE);
			}

			// Mensaje que la contraseña cumple todos los requisitos
			else {
				JOptionPane.showMessageDialog(null, "La contraseña cumple los requisitos", "Contraseña válida",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

}

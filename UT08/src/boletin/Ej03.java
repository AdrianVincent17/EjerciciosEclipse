package boletin;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ej03 extends JFrame implements ActionListener {

	/*
	 * componentes de la ventana
	 */

	private JLabel contacto, telefono;
	private JTextField campocontacto, campotelefono;
	private JButton nuevo, buscar, limpiar;
	private JPanel plabels, pbotones;
	private static String FICHERO = "C:\\Users\\Asun\\Desktop\\Agenda.txt";

	public Ej03() {

		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 30));

		plabels = new JPanel();
		plabels.setLayout(new GridLayout(2, 2, 10, 10));
		add(plabels);

		pbotones = new JPanel();
		pbotones.setLayout(new GridLayout(0, 3, 10, 0));
		add(pbotones);

		contacto = new JLabel("Nombre del contacto: ");
		plabels.add(contacto);

		telefono = new JLabel("Telefono: ");
		plabels.add(telefono);

		campocontacto = new JTextField();
		plabels.add(campocontacto);

		campotelefono = new JTextField();
		plabels.add(campotelefono);

		nuevo = new JButton("Nuevo");
		pbotones.add(nuevo);
		nuevo.addActionListener(this);

		buscar = new JButton("Buscar");
		pbotones.add(buscar);
		buscar.addActionListener(this);

		limpiar = new JButton("Limpiar");
		pbotones.add(limpiar);
		limpiar.addActionListener(this);

	}

	public static void main(String[] args) {

		Ej03 e = new Ej03();

		e.setVisible(true);
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setLocationRelativeTo(null);
		e.setTitle("Agenda telefonica");
		e.setSize(400, 250);

	}

	/**
	 * Añade un nuevo contacto a la agenda
	 * 
	 * @param neme nombre del contacto a añadir
	 * @param tlf  telefono del contacto a añadir
	 */

	private static void addContacto(String name, int tlf) {

		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			fw = new FileWriter(FICHERO, true);
			pw = new PrintWriter(fw);
			pw.println(name + " > " + tlf);

		} catch (Exception e) {
			System.out.println("Se ha producido un error con el archivo de la agenda");
		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (Exception e2) {
				System.out.println("Error en el cierre del archivo de la agenda");
			}
		}

	}

	/**
	 * Busca un contacto en la agenda por su nombre
	 * 
	 * @param name - es el nombre del contacto a buscar
	 * @return el telefono del contacto, si lo ha encontrado 0 si no lo ha
	 *         encontrado
	 */
	private static int BuscarContacto(String name) {
		// Buscamos el name en la agenda
		File f = new File(FICHERO);
		int res = 0;
		boolean encontrado = false;

		try {
			// Lectura
			Scanner s = new Scanner(f);
			while (s.hasNextLine() && !encontrado) {
				String linea = s.nextLine();
				String nameagenda = linea.substring(0, linea.indexOf('>')).trim();
				if (name.compareToIgnoreCase(nameagenda) == 0) {
					encontrado = true;
					String tlf = linea.substring(linea.indexOf('>') + 1).trim();
					res = Integer.parseInt(tlf);
				}
			}
		} catch (FileNotFoundException lupita) {
			return 0;
		}

		return res;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == nuevo) {
			if ((campocontacto.getText().isBlank()) || (campotelefono.getText().isEmpty())) {
				JOptionPane.showMessageDialog(null, "Debes indicar el nombre y telefono del nuevo contacto", "Aviso",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				String nombre = campocontacto.getText().trim();
				if (BuscarContacto(nombre) != 0) {
					JOptionPane.showMessageDialog(null, "El contacto ya se encuentra en la agenda", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					int numero = Integer.parseInt(campotelefono.getText());
					if (campotelefono.getText().length() < 9) {
						JOptionPane.showMessageDialog(null, "El telefono debe tener al menos 9 digitos", "Aviso",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						addContacto(nombre, numero);
						campocontacto.setText("");
						campotelefono.setText("");
						JOptionPane.showMessageDialog(null, "El nuevo contacto ha sido guardado en la agenda",
								"Nuevo Contacto", JOptionPane.INFORMATION_MESSAGE);
					}

				}

			}

		}
		if (e.getSource() == limpiar) {
			campocontacto.setText("");
			campotelefono.setText("");
		}

		if (e.getSource() == buscar) {
			if (campocontacto.getText().isBlank()) {
				JOptionPane.showMessageDialog(null, "Debes indicar el nombre del contacto a buscar", "Aviso",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				String nombre = campocontacto.getText().trim();
				int telefono = BuscarContacto(nombre);
				if (telefono != 0) {
					campotelefono.setText(String.valueOf(telefono));
				} else {
					JOptionPane.showMessageDialog(null, "El telefono no se encuentra en la agenda", "Aviso",
							JOptionPane.INFORMATION_MESSAGE);
				}

			}
		}

	}

}

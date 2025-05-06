package menu;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class EditorTextos extends JFrame implements ActionListener {

	private JMenuBar menubar;
	private JMenu archivo;
	private JMenuItem nuevo, abrir, guardar, salir;
	private JTextArea area;
	private JScrollPane scpanel;

	public EditorTextos() {

		setLayout(new GridLayout(0, 1, 0, 0));

		menubar = new JMenuBar();
		setJMenuBar(menubar);

		archivo = new JMenu("Archivo");
		menubar.add(archivo);

		nuevo = new JMenuItem("Nuevo");
		archivo.add(nuevo);
		nuevo.addActionListener(this);

		abrir = new JMenuItem("Abrir");
		archivo.add(abrir);
		abrir.addActionListener(this);

		guardar = new JMenuItem("Guardar");
		archivo.add(guardar);
		guardar.addActionListener(this);

		salir = new JMenuItem("Salir");
		archivo.add(salir);
		salir.addActionListener(this);

		area = new JTextArea();
		area.setLineWrap(true);

		scpanel = new JScrollPane(area);
		add(scpanel);

	}

	public static void main(String[] args) {

		EditorTextos e = new EditorTextos();

		e.setVisible(true);
		e.setLocationRelativeTo(null);
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setSize(450, 450);
		e.setTitle("Bloc de Notas");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == salir) {
			System.exit(0);
		}

		if (e.getSource() == nuevo) {
			area.setText("");
		}

		if (e.getSource() == abrir) {
			abrir();
		}
		if (e.getSource() == guardar) {
			guardar();
		}

	}

	public void guardar() {
		JFileChooser filechooser = new JFileChooser("C:\\Users\\AdrianV\\Desktop\\programacion");
		filechooser.showSaveDialog(filechooser);

		FileWriter fw = null;
		PrintWriter pw = null;

		try {

			fw = new FileWriter(filechooser.getSelectedFile().getAbsolutePath());
			pw = new PrintWriter(fw);

			// escritura en el fichero
			pw.println(area.getText());

		} catch (Exception s) {
			JOptionPane.showMessageDialog(null, "Se ha producido un error con el archivo especificado", "Error",
					JOptionPane.ERROR_MESSAGE);
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}

			} catch (Exception s) {
				JOptionPane.showMessageDialog(null, "Error en el cierre del archivo", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public void abrir() {

		// Creamos el filechooser
		// Indicamos que la ventana se abra en el directorio indicado
		JFileChooser filechooser = new JFileChooser("C:\\Users\\AdrianV\\Desktop\\programacion");

		// Creamos el filtro
		// el primer parametro es el mensaje que se muestra
		// el segundo parametro es la extension del fichero que se va a mostrar

		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de textos (.txt)", "txt");

		// Asignamos el filtro al filechooser

		filechooser.setFileFilter(filtro);

		// mostramos la ventana

		filechooser.showOpenDialog(filechooser);

		try {
			String ruta = filechooser.getSelectedFile().getAbsolutePath();
			File f = new File(ruta);

			Scanner s = new Scanner(f);
			area.setText("");
			while (s.hasNextLine()) {
				area.append(s.nextLine());
				area.append("\n");
			}
			s.close();

		} catch (FileNotFoundException e0) {

			JOptionPane.showMessageDialog(null, "No se encontro el archivo ", "Error", JOptionPane.ERROR_MESSAGE);

		} catch (NullPointerException e1) {

			JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun archivo", "Mensaje",
					JOptionPane.INFORMATION_MESSAGE);

		} catch (Exception e2) {

			JOptionPane.showMessageDialog(null, "No se ha podido encontrar el archivo especificado ", "Error",
					JOptionPane.ERROR_MESSAGE);

		}
	}

}

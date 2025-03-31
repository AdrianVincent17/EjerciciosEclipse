package agenda;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Agenda {

	private static final String FICHERO = "C:\\Users\\AdrianV\\Desktop\\MiAgenda.txt";

	/**
	 * Menu
	 */
	public static void menu() {

		System.out.println("\n*************************");
		System.out.println("* 1)  Nuevo contacto	*");
		System.out.println("* 2)  Listar contacto	*");
		System.out.println("* 3)  Buscar contacto	*");
		System.out.println("* 4)  Salir             *");
		System.out.println("*************************");
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
	 * Muestra por pantalla los contactos de la agenda
	 */

	private static void ListarContactos() {
		File f = new File(FICHERO);
		try {
			Scanner s = new Scanner(f);

			int conta = 0;
			while (s.hasNextLine()) {
				String linea = s.nextLine();
				conta++;
				System.out.println(conta + ". " + linea);
			}
			s.close();
			if (conta == 0)
				System.out.println("Agenda vacia");
		} catch (FileNotFoundException lupita) {
			System.out.println("Agenda no encontrada o vacia");
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

	private static void EliminarContacto(String name) {
		FileWriter fw = null;
		PrintWriter pw = null;

		File f = new File(FICHERO);
		File f2 = new File("C:\\Users\\AdrianV\\Desktop\\MiAgenda2.txt");
		boolean encontrado = false;

		try {
			// fw = new FileWriter("C:\\Users\\AdrianV\\Desktop\\MiAgenda2.txt", true);
			pw = new PrintWriter(fw);
			// Lectura
			Scanner s = new Scanner(f);
			while (s.hasNextLine() && !encontrado) {
				String linea = s.nextLine();
				String nameagenda = linea.substring(0, linea.indexOf('>')).trim();
				if (name.compareToIgnoreCase(nameagenda) != 0) {

				}
			}
			s.close();
		} catch (FileNotFoundException lupita) {

		}

	}

	/**
	 * Programa principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcion; // opcion a elegir
		int telefono; // telefono del contacto
		String nombre; // nombre del contacto

		boolean introducido = false;
		try {

			do {
				menu();
				do {
					System.out.print("Elige una opcion: ");
					opcion = Integer.parseInt(sc.nextLine());

					switch (opcion) {

					case 1: // AÑADIR CONTACTO
							// Pedimos el nombre del contacto a añadir
						System.out.println("\n> NUEVO CONTACTO");
						System.out.print("> Nombre: ");
						nombre = sc.nextLine().trim();
						// Comprobamos si el contacto ya esta en la agenda
						if (BuscarContacto(nombre) != 0)
							System.out.println(">> El contacto '" + nombre + "' ya se encuentra en la agenda");
						else

							System.out.print("> Telefono: ");
						telefono = Integer.parseInt(sc.nextLine());
						addContacto(nombre, telefono);
						break;
					case 2: // LISTAR CONTACTO
						System.out.println("\n> CONTACTOS");
						ListarContactos();
						break;
					case 3: // BUSCAR CONTACTO
						// Pedimos el nombre del contacto a buscar
						System.out.println("\n> BUSCAR CONTACTO");
						System.out.print("> Nombre: ");
						nombre = sc.nextLine().trim();
						int resultado = BuscarContacto(nombre);
						if (resultado != 0)
							System.out.println("> Telefono: " + resultado);
						else
							System.out.println(">> No se ha encontrado '" + nombre + "' en la agenda");

						break;
					case 4:
						break;
					case 5:
						System.out.println("De acuerdo, Hasta pronto...");
						break;
					default:
						System.out.println("Opcion elegida no valida");
						break;

					}

				} while (opcion < 1 || opcion > 4);

			} while (opcion != 4);

		} catch (InputMismatchException lupita) {
			System.out.println("Error, dato introducido no valido");

		} catch (AssertionError ea) {
			System.out.println(ea.getMessage());

		} finally {
			sc.close();
		}

	}

}

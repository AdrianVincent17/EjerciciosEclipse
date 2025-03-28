package ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DiccionarioInglesEspañol {

	public static void main(String[] args) {
		// Pedir al usuario que introduzca la palabra a buscar
		Scanner sc = new Scanner(System.in);
		System.out.print("Search word: ");
		String palabra = sc.nextLine().trim();
		sc.close();

		File f = new File("C:\\Users\\AdrianV\\Downloads\\wordlist.txt");
		boolean encontrado = false;

		try {

			Scanner s = new Scanner(f);
			while (s.hasNextLine() && !encontrado) {
				String linea = s.nextLine();
				String word = linea.substring(0, linea.indexOf('='));

				if (word.compareToIgnoreCase(palabra) == 0) {
					String Traduccion = linea.substring(linea.indexOf('=') + 1);
					System.out.println("Translation: " + Traduccion);
					encontrado = true;
				}

			}

			s.close();
			if (!encontrado)
				System.out.println("La palabra no se encuentra en el diccionario...");

		} catch (FileNotFoundException e) {
			System.out.println("El archivo no ha sido encontrado" + f.getName());
		}

	}

}

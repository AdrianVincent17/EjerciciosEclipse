package ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordListEcontrarpalabra {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce una palabra: ");
		String palabra = sc.nextLine();
		sc.close();

		File f = new File("C:\\Users\\AdrianV\\Downloads\\wordlist.txt");
		boolean encontrado = false;

		try {

			Scanner s = new Scanner(f);
			while (s.hasNextLine() && !encontrado) {
				String linea = s.nextLine();
				if (palabra.compareToIgnoreCase(linea) == 0)
					encontrado = true;

			}

			s.close();

			System.out.println("La palabra: '" + palabra.toLowerCase() + "'");
			if (encontrado)
				System.out.println("La palabra ha sido encontrada en el wordlist...");
			else
				System.out.println("La palabra no se encuentra en el wordlist...");

		} catch (FileNotFoundException e) {
			System.out.println("El archivo no ha sido encontrado");
		}

	}

}

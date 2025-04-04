package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaLinea {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\AdrianV\\Desktop\\Quijote.txt");

		try {

			Scanner sc = new Scanner(f);
			int conta = 1;
			while (sc.hasNextLine()) {
				String linea = sc.nextLine().toUpperCase();
				System.out.println("(" + conta + ")" + linea);
				conta++;
			}

			sc.close();

		} catch (FileNotFoundException lupita) {
			System.out.println("ERROR, no se encuentra el archivo expecificado");
		} catch (Exception e) {
			System.out.println("ERROR, Ha ocurrido otro error que no es que no haya encontrado el archivo");
		}

	}

}

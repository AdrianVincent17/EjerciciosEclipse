package ejemplos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscrituraFin {

	public static void main(String[] args) {
		FileWriter fw = null;
		PrintWriter pw = null;

		try {

			fw = new FileWriter("C:\\Users\\AdrianV\\Desktop\\mifile03.txt"); // si le añades TRUE al lado entonecs no
																				// sobreescribe sino que añade
			pw = new PrintWriter(fw);

			// Escritura
			System.out.println("Introduce texto (Para acabar teclea FIN)");
			Scanner sc = new Scanner(System.in);
			String linea = sc.nextLine();
			while (!linea.equalsIgnoreCase("fin")) {
				pw.println(linea);

				linea = sc.nextLine();
			}
			sc.close();

		} catch (Exception e1) {
			System.out.println("Error, se ha producido un error con el archivo especificado");

		} finally {
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e2) {
				System.out.println("Error en el cierre del archivo");

			}
		}

	}

}

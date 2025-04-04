package ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AddLinea {

	public static void main(String[] args) {

		FileWriter fw = null;
		PrintWriter pw = null;

		try {

			// Apertura del archivo
			fw = new FileWriter("C:\\Users\\AdrianV\\Desktop\\mifile02.txt"); // si no existe lo crea
			pw = new PrintWriter(fw); // permite escribir sobre el archivo

			// Escritura
			for (int conta = 1; conta <= 10; conta++) // Crea 10 lineas de texto
				pw.println("Linea " + conta);

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

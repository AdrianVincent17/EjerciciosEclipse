package ficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrituraBasica {

	public static void main(String[] args) {

		FileWriter fw = null;
		PrintWriter pw = null;

		try {

			fw = new FileWriter("C:\\Users\\AdrianV\\Desktop\\mifile01.txt");
			pw = new PrintWriter(fw);

			pw.println("Desarrollo de aplicaciones Web");

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

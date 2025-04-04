package ficheros;

import java.io.FileReader;
import java.io.IOException;

public class CambiarMinMay {

	public static void main(String[] args) {
		FileReader fr = null;

		try {

			// Apertura del fichero
			fr = new FileReader("C:\\Users\\AdrianV\\Desktop\\Quijote.txt");

			// lectura del caracter
			int valor = fr.read();

			while (valor != -1) {

				if (valor >= 65 && valor <= 90)
					valor += 32;
				else if (valor >= 97 && valor <= 122)
					valor -= 32;
				System.out.print((char) valor);
				valor = fr.read();
			}

		} catch (Exception e1) {
			System.out.println("Error, se ha producido un error con el archivo especificado");

		} finally {
			try {
				if (fr != null)
					fr.close();
			} catch (IOException e2) {
				System.out.println("Error en el cierre del archivo");

			}
		}

	}

}

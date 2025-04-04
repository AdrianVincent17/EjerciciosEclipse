package ficheros;

import java.io.File;

public class FicheroDeshabilitarEscritura {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\AdrianV\\Desktop\\Quijote.txt");
		if (!f.exists()) {
			System.out.println("El archivo " + f.getName() + " no existe");
		} else {

			// Deshablitamos el permiso de escritura
			if (f.setWritable(true))
				System.out.println("Deshabilitamos el permiso de escritura del fichero " + f.getPath());
			else {
				System.out.println("La operacion ha fallado ");
				System.out.println("El usuario no tiene los permisos para realizar esta operacion ");

				if (f.canWrite())
					System.out.println("Podemos escribir sobre el fichero");
				else
					System.out.println("no podemos escribir sobre el fichero");
			}
		}
	}

}

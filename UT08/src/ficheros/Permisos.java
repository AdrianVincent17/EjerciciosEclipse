package ficheros;

import java.io.File;

public class Permisos {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\AdrianV\\Desktop\\Quijote.txt");
		if (f.exists()) {
			System.out.println("El archivo " + f.getName() + " existe");
			System.out.println("Ruta: " + f.getPath());
			System.out.println("Directorio Padre: " + f.getParent());
			System.out.println("tamanho: " + f.length() + " bytes");
			System.out.print("Permisos: ");
			if (f.canRead())
				System.out.print("r");
			else
				System.out.print("-");
			if (f.canWrite())
				System.out.print("w");
			else
				System.out.print("-");
			if (f.canExecute())
				System.out.print("x");
			else
				System.out.print("-");

		} else {
			System.out.println("El archivo " + f.getName() + " no existe");
		}
	}

}

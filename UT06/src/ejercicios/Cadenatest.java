package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cadenatest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Mete una frase: ");
			String entrada = sc.nextLine();
			Cadena c1 = new Cadena(entrada);

			System.out.println(c1.getCadenita());

			System.out.print("Numero de vocales: ");
			System.out.println(c1.contarvocales());

			System.out.print("Numero de consonantes: ");
			System.out.println(c1.contarconsonantes());

			System.out.print("Numero de blancos: ");
			System.out.println(c1.contarespacios());

			System.out.print("Consonantes: ");
			System.out.println(c1.muestraconsonantes());

			System.out.print("Vocales: ");
			System.out.println(c1.muestravocales());

			System.out.print("Dime un caracter: ");
			char c = sc.nextLine().charAt(0);
			System.out.print("Has quitado la: " + c + " y te quedas con ");
			System.out.println(c1.eliminarcaracter(c));

			System.out.print("Ahora quita una palabra: ");
			String subcad = sc.nextLine();
			System.out.println(c1.eliminarcadena(subcad));

		} catch (InputMismatchException lupita) {
			System.out.println("Dato incorrecto, no valido");
		} finally {
			sc.close();
		}

	}
}

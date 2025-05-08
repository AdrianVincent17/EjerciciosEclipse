package ficheros;

import java.util.Scanner;

public class Cifrado {

	public static final int CESAR = 3; // Clave a aplicar en el cifrado del cesar
	public static final int ROT13 = 13; // Clave a aplicar en el cifrado ROT13

	/**
	 * Cifrado por sustitucion Sustituye cada caracter del mensaje a cifrar por el
	 * caracter que ocupa 'clave' posiciones en adelante en el alfabeto Cifra solo
	 * los caracteres del alfabeto 'A'..'Z' y 'a'..'z' (sin incluir la Ñ ni la ñ)
	 * cualquier otro caracter (incluidos espacios en blanco) se copiaran igual, sin
	 * cifrar. Considera el alfabeto circular, de forma que despues de la 'Z'
	 * continuaria la 'A' y despues de la 'z' iria la 'a'.
	 * 
	 * @param mensaje - mensaje a cifrar
	 * @param clave   - Clave a aplicar en el cifrado
	 * @return criptograma al que se ha aplicado el cifrado por sustitucion
	 */

	public static String sustitucion(String mensaje, int clave) {
		String criptograma = "";

		// Recorremos el mensaje y ciframos caracter a caracter
		for (int i = 0; i < mensaje.length(); i++) {
			// si el caracter a cifrar se encuentra entre la 'A'(65) y la 'Z'(90)
			if (mensaje.charAt(i) >= 'A' && mensaje.charAt(i) <= 'Z') {
				int caracter = mensaje.charAt(i) + clave;
				if ((char) caracter > 'Z')
					caracter = caracter - 26;
				criptograma += (char) caracter;

			} // si el caracter a cifrar se encuentra entre la 'a'(97) y la 'z'(122)
			else if (mensaje.charAt(i) >= 'a' && mensaje.charAt(i) <= 'z') {
				int caracter = mensaje.charAt(i) + clave;
				if ((char) caracter > 'z')
					caracter = caracter - 26;
				criptograma += (char) caracter;

			} // En otro caso, no se trata de un caracter del alfabeto, y lo copiamos tal cual
				// (sin aplicar cifrado)
			else {
				criptograma += mensaje.charAt(i);
			}

		}
		return criptograma;
	}

	/**
	 * Cifrar con la transposicion de Riel El mensaje se cifra alternando las letras
	 * en dos cadenas separadas, y concatenando estas dos cadenas.
	 * 
	 * @param mensaje - Mensaje a cifrar
	 * @return criptograma que se obtiene al aplicar la transposicion de Riel
	 */

	public static String trasposicionRiel(String mensaje) {

		String cad1 = "";
		String cad2 = "";

		for (int i = 0; i < mensaje.length(); i++) {
			if (i % 2 == 0) {
				cad1 += mensaje.charAt(i);
			} else {
				cad2 += mensaje.charAt(i);
			}
		}

		return cad1 + cad2;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe el mensaje a cifrar: ");
		String texto = sc.nextLine();
		sc.close();

		System.out.println("Texto Plano " + texto);
		System.out.println("Criptograma (Cesar) " + sustitucion(texto, CESAR));
		System.out.println("Criptograma (ROT13) " + sustitucion(texto, ROT13));
		System.out.println("Criptograma (T.Riel) " + trasposicionRiel(texto));

	}

}

package ejercicios;

public class Cadena {

	// atributos
	private String cadenita;

	/**
	 * Constructor con un parametro
	 *
	 * @param Cadena
	 */

	public Cadena(String cadenita) {
		this.cadenita = cadenita;
	}

	/**
	 * @return devuelve la cadena
	 */

	public String getCadenita() {
		return cadenita;
	}

	/**
	 * Metodo que establece una cadena de String a traves de un parametro
	 *
	 * @param cadena a establecer
	 */

	public void setCadenita(String cadenita) {
		this.cadenita = cadenita;
	}

	/**
	 * metodo que cuenta las vocales que se encuentran en una cadena de caracteres
	 *
	 * @param cadena de string
	 * @return numero de vocales
	 */

	public int contarvocales() {
		int vocales = 0;
		char c;
		for (int i = 0; i < cadenita.length(); i++) {
			c = cadenita.toUpperCase().charAt(i);
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				vocales++;
			}
		}
		return vocales;

	}

	/**
	 * metodo que cuenta las consonantes de una cadena de caracteres pasada como
	 * parametro
	 *
	 * @param cadena de caracteres
	 * @return numero de consonantes
	 */

	public int contarconsonantes() {
		int consonantes = 0;
		char c;
		for (int i = 0; i < cadenita.length(); i++) {
			c = cadenita.toUpperCase().charAt(i);
			if (c >= 'B' && c <= 'Z') {
				if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
					consonantes++;
				}
			}
		}
		return consonantes;

	}

	/**
	 * metodo que devuelve la cadena con las vocales
	 *
	 * @return cadena con las vocales
	 */

	public String muestravocales() {

		String vocales = "";
		char c;
		for (int i = 0; i < cadenita.length(); i++) {
			c = cadenita.charAt(i);
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				vocales += c + " ";
			}
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vocales += c + " ";
			}

		}
		return vocales;

	}

	/**
	 * metodo que devuelve la cadena con las consonantes
	 *
	 * @return cadena con las consonantes
	 */

	public String muestraconsonantes() {

		String consonantes = "";
		char c;
		for (int i = 0; i < cadenita.length(); i++) {
			c = cadenita.charAt(i);
			if (c >= 'B' && c <= 'Z') {
				if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
					consonantes += c + " ";
				}
			}
			if (c >= 'b' && c <= 'z') {
				if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
					consonantes += c + " ";
				}
			}

		}
		return consonantes;

	}

	/**
	 * metodo que cuenta los espacios
	 *
	 * @return numero de espacios
	 */

	public int contarespacios() {
		int espacios = 0;
		for (int i = 0; i < cadenita.length(); i++) {
			if (cadenita.charAt(i) == ' ') {
				espacios++;
			}
		}

		return espacios;
	}

	/**
	 * Funcion que devuelve una cadena de caracteres donde se ha eliminado un
	 * caracter
	 *
	 * @param c - char
	 * @return cadena sin el caracter c
	 */

	public String eliminarcaracter(char c) {

		String res = "";
		for (int i = 0; i < cadenita.length(); i++) {
			if (cadenita.charAt(i) != c) {
				res += cadenita.charAt(i);
			}
		}
		return res;

	}

	/**
	 * Funcion que elimina una subcadena que contiene la cadena principal y devuelve
	 * la cadena sin la subcadena
	 *
	 * @param subcad -subcadena
	 * @return cadena sin la subcadena elegida
	 */
	public String eliminarcadena(String subcad) {
		String cad = "";
		if (cadenita.indexOf(subcad) != -1) {
			cad = cadenita.replace(subcad, "");
		}

		if (cadenita.indexOf("  ") != -1) {
			while (cadenita.indexOf("  ") != -1) {
				cad = cadenita.replace("  ", " ");
			}
		}
		return cad;
	}

}

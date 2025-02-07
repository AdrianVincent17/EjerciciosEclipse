package strings.ejercicios;

import java.util.Scanner;

public class Ejercicio02 {
	
	/**
	 * Funcion que convierte un string y le da la vuelta y le resta el primer caracter
	 * @param cadena
	 * @return devuelve un string con la cadena original y el espejo
	 */
	
	public static String cadespejo(String cadena) {
		
		StringBuffer espejo= new StringBuffer(cadena);
		
		espejo.reverse().deleteCharAt(0);
		return cadena+espejo.toString();
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1. Pedimos al usuario que introduzca una cadena de caracteres
		
		System.out.print("Introduce una palabra: ");
		String cad=sc.nextLine();
		sc.close();
		
		//2. hacemos la llamada a la funcion
		
		System.out.println("Cadena espejo: "+cadespejo(cad));
		
		
		
		
		
		

	}

}

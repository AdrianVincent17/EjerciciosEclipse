package strings.ejemplos;

import java.util.Scanner;

public class Subcadenas {

	public static void main(String[] args) {
		
		//1. Pedimos al usuario que introduzca una cadena de caracteres

		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Introduce una cadena: ");
		String cadena = teclado.nextLine();
		
		
		//2. Pedimos al usuario que introduzca una subcadena de caracteres
		
		System.out.print("Introduce una subcadena: ");
		String subcadena = teclado.nextLine();
		
		//3. Indicamos por pantalla si la subcadena introducida forma parte de la cadena inicial
		
		if(cadena.indexOf(subcadena)==-1)
			System.out.println("No hemos encontrado la subcadena "+subcadena+" dentro de la cadena");
		else
			System.out.println("La subcadena "+subcadena+" se encuentra en la cadena");
			
		teclado.close();
	}

}

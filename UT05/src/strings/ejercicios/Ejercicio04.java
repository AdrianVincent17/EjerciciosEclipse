package strings.ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una cadena: ");
		String cadena=sc.nextLine();
		
		System.out.print("Introduce otra cadena: ");
		String subcadena=sc.nextLine();
		
		String devolver = "";
		
		//2. Reemplazamos la subcadena (en mayusculas) dentro de la cadena
		
		cadena=cadena.replaceAll(subcadena, subcadena.toUpperCase());
			
		//3. Mostramos el resultado por pantalla
		System.out.println(cadena);
		
		
		sc.close();

	}

}

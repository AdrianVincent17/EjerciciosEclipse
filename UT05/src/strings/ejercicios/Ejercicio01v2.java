package strings.ejercicios;

import java.util.Scanner;

public class Ejercicio01v2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1. Pedimos al usuario que introduzca una cadena de caracteres
		
		System.out.print("Introduce una palabra: ");
		String cad=sc.nextLine();
		sc.close();
		
		//2.  Invertimos la cadena de caracteres introducida
		
		String invertida = new String();
		
		for(int i=cad.length()-1; i>=0; i--) {
			invertida=invertida +cad.charAt(i);
		}
		
		//3. MOstramos por pantalla la cadena invertida
		
		System.out.println("Cadena invertida: "+invertida);
		
		
		

	}

}

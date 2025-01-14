package ejercicios2;

import java.util.Scanner;

public class EJ08adivinas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in); 

		int menor=0;
		int mayor=100; 
		int intentos = 0; 
		int respuesta;
		int medio;
		boolean encontrado = false; 

		System.out.println("Piensa en un número entre 1 y 100."); 
		System.out.println("Responde con '1' para menor, '2' para mayor o '3' para igual: ");

		while (!encontrado) { 
			medio = (menor + mayor) / 2; 
			System.out.print("¿Es tu número el " + medio + "? : ");
			 
			respuesta = teclado.nextInt();
			intentos++; 



			switch(respuesta) {
			case 1: 
				mayor = medio - 1; break;
				
				
			case 2:
				menor = medio + 1; break;
			case 3:
				
				System.out.println("¡He encontrado tu número! Es " + medio);

				System.out.println("Número de intentos: " + intentos);
				
				encontrado=true;break;
				
			default:System.out.println("Por favor, responde con '1', '2' o '3'.");break;
			}


		} 
	} 
}



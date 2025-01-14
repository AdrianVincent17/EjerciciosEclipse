package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ31mayordivisor {
	
	/**
	 * Funcion que devuelve el mayor divisor de un numero pasado 
	 * como parametro, distinto dle propio numero
	 * @param N numero entero
	 * @return numero entero
	 */
	public static int mayordivisor(int N) {
		
		int num=Math.abs(N); //para trabajar con numeros positivos
		
		int md=1;
		
		for(int i=2; i<=num/2; i++) {
			if(num%i==0)
				md=i;
		}
		return md;

	}

	public static void main(String[] args) {
		
		//Abrimos el lector
				Scanner teclado=new Scanner(System.in);

				try {

					System.out.println("dime un valor");
					int num=teclado.nextInt();

					System.out.println("\nMayor Divisor: "+mayordivisor(num));

					//Cerramos el lector
					teclado.close();

				}catch(InputMismatchException ime) {
					System.out.println("Error, dato no valido");
				}

	}

}

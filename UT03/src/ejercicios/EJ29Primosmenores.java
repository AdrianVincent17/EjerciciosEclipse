package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ29Primosmenores {

	/**
	 * Funcion que indica si un numero pasado como parametro es o no primo
	 * "Un numero primo es aquel mayor que 1 que tiene
	 * como divisories el 1 y el propio numero unicamente"
	 * @param N numero entero
	 * @return TRUE si N es primo FALSE en otro caso
	 */
	
	public static boolean esprimo(int N) {

		if(N<=1) 
			return false;
		else {
			for(int i=2; i<=N/2; i++) {
				if(N%i==0)
					return false;
			}
			return true;
		}


	}

	public static void primosmenores(int N) {
		
		System.out.print(">Los primos menores de "+N+" son: ");
		for(int i=2; i<N; i++) {
			
			if(esprimo(i))
				System.out.print(i+" ");
		}


	}


	public static void main(String[] args) {

		//Abrimos el lector
		Scanner teclado=new Scanner(System.in);

		try {

			System.out.println("dime un numero positivo");
			int num=teclado.nextInt();

			primosmenores(num);

			//Cerramos el lector
			teclado.close();

		}catch(InputMismatchException ime) {
			System.out.println("Error, dato no valido");
		}


	}

}

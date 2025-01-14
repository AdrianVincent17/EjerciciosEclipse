package ejercicios;

import java.util.Scanner;

public class EJ14numdigitos {

	/**
	 * funcion que devuelve el numero de digitos de un numero pasado por parametro
	 * @param N numero entero
	 * @return numero de digitos totales
	 */

	public static int contadigit(int N) {

		int conta=0;
		while(N>0) {
			if(N>0) 
				N=N/10;
			conta++;
		}	
		return conta;
	}
	public static void main(String[] args) {

		//Abrimos el lector
		Scanner teclado = new Scanner(System.in);
		try {

			System.out.println("Dime un digito: ");
			int num=teclado.nextInt();
			//Cerramos el lector
			teclado.close();


			System.out.println("En el numero "+num+" hay "+contadigit(num)+" digitos");
		
		}catch(Exception lupita) {
			
			System.out.println("Error, dato introducido no valido");
		}
	}

}

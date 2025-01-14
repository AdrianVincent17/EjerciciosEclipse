package boletin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ03 {

	/**
	 * procedimiento que muestra por pantalla un numero pasado como parametro en letras
	 * @param N numero entero
	 */

	public static void cuenta(int N) {

		switch(N) {
		case 1:System.out.print("UNO ");break;
		case 2:System.out.print("DOS ");break;
		case 3:System.out.print("TRES ");break;
		case 4:System.out.print("CUATRO ");break;
		case 5:System.out.print("CINCO ");break;
		case 6:System.out.print("SEIS ");break;
		case 7:System.out.print("SIETE ");break;
		case 8:System.out.print("OCHO ");break;
		case 9:System.out.print("NUEVE ");break;
		case 10:System.out.print("DIEZ ");break;
		default:System.out.print("numero no valido");break;

		}
	}

	public static void main(String[] args) {
		//Abrimos el lector
		Scanner teclado=new Scanner(System.in);

		try {
			int num;

			do {
				System.out.print("Dime un numero entre 1 y 10: ");
				num=teclado.nextInt();
			}while(num<1 || num>10);
			

			System.out.println();

			for(int i=1; i<=num; i++) {

				//hacemos la llamada al procedimietno
				cuenta(i);
			}


		}catch(InputMismatchException ime) {
			System.out.println("Error, dato invalido");

		}



		//cerramos el lector
		teclado.close();


	}

}

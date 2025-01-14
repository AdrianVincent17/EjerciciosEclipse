package ejercicios;

import java.util.Scanner;

public class EJ13tablamultipli {
	
	/**
	 * prodcedimiento que muestra la tabla de multiplicar de un numero entero pasado como parametro
	 * @param num numero entero
	 */
	
	public static void tabla(int num) {
		for(int conta=1; conta<=10; conta++)
			System.out.println(num+" x "+conta+" = "+(num*conta));
		
		System.out.println();

	}

	public static void main(String[] args) {
		
		//Abrimos el lector
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dime una tabla de multiplicar: ");
		int num=teclado.nextInt();
		tabla(num);
		
		
		//cerramos el lector
		teclado.close();
	}

}

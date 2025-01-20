package arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	final static int TAM=5;

	/**
	 * Funcion que devuelve el mayor de los numeros introducidos en un array de enteros
	 * @param array de numeros enteros
	 * @return numeros enteros
	 */

	public static int mayor(int[] array) {

		int mayor=array[0];

		for(int i=0; i<array.length; i++) {
			if(mayor<array[i])
				mayor=array[i];
		}
		return mayor;


	}

	/**
	 * Funcion que devuelve el menor de los numeros introducidos en un array de enteros
	 * @param array de numeros enteros
	 * @return numeros enteros
	 */

	public static int menor(int[] array) {

		int menor=array[0];

		for(int i=0; i<array.length; i++) {
			if(menor>array[i])
				menor=array[i];
		}
		return menor;


	}

	/**
	 * Funcion que devuelve la media de un array de numeros enteros introducidos por teclado
	 * @param array - numeros enteros
	 * @return media 
	 */
	public static double media(int[] array) {

		int suma=0;

		for(int i=0; i<array.length; i++) {
			suma+=array[i];
		}	
		return (double)suma/array.length;




	}


	public static void main(String[] args) {

		// Creamos el vector que almacenará los números leídos por teclado
		int[] vector = new int[TAM];
		// Leemos los números introducidos por teclado y los almacenamos en vector
		Scanner teclado = new Scanner(System.in);
		try {
			for (int i=0; i<TAM; i++) {
				System.out.print("Introduce un número: ");
				vector[i]=teclado.nextInt();
			}
		} catch (Exception e) {

			System.out.println("Error en la introducción de datos");

		}
		teclado.close();
		// Mostramos los valores obtenidos
		System.out.println("\nMedia: "+media(vector));
		System.out.println("Mayor: "+mayor(vector));
		System.out.println("Menor: "+menor(vector));
	}
}

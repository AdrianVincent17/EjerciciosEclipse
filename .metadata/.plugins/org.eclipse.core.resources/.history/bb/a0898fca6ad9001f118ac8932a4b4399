package arrays.ejercicios.chungos;

import java.util.Scanner;

public class Ejercicio05 {

	/**
	 * Funcion que determina si un valor se encuentra almacenado en un array 
	 * @param vector - array de valores enteros
	 * @param valor - valor entero
	 * @param pos - posicion del array hasta la que comparemos los valores
	 * @return TRUE si valor se encuentra entre los valores almacenados en el array y FALSE si no 
	 */

	public static boolean encontrado(int [] vector, int valor, int pos) {

		for(int i=0; i<pos; i++)
			if(vector[i]==valor)
				return true;
		return false;
	}

	public static void visualiza(int [] array) {

		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	final static int TAM=5;

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);


		int []A=new int[TAM];
		
		try {
			boolean repetido=false;
			int i=0;
			System.out.println("Introduzca "+TAM+" valores comprendidos entre 1 y 10");
			
			for(i=0; i<A.length; i++) {
				do {
				System.out.print("valor["+(i+1)+"]: ");
				A[i]=teclado.nextInt();
				if((A[i]<1) || (A[i]>10)){
					System.out.println("> El valor no se encuentra entre 1 y 10");
				}else {
					repetido=encontrado(A, A[i], i);
					if(repetido) {
				
						System.out.print("--> Numero repetido, vuelva a introducirlo: \nvalor["+(i+1)+"]: ");
						A[i]=teclado.nextInt();

					}
				}

				}while( (A[i]<1) || (A[i]>10) || (repetido));
			}
			
			System.out.print("Array introducido: ");
			visualiza(A);




		}catch(Exception e) {
			System.out.println("Error");

		}finally {
			teclado.close();
		}

	}

}

package arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	final static int TAM=10;
	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);

		try {
			
			int[] vector=new int[TAM];
			
			System.out.println("Introduce "+TAM+" valores enteros por teclado");
			for(int i=0; i<vector.length; i++) {
				System.out.print("Valor["+(i+1)+"]: ");
				vector[i]=teclado.nextInt();
			}
			//ahora mostramos los 10 numeros introducidos
			System.out.print("Orden normal: ");
			for(int i=0; i<vector.length; i++)
				System.out.print(vector[i]+" ");
			System.out.println();
			
			//ahora lo mostramos en orden inverso
			System.out.print("Orden inverso: ");
			for(int i=vector.length-1; i>=0; i--) 
				System.out.print(vector[i]+" ");
			System.out.println();

		}catch(Exception lupita) {
			System.out.println("Error, dato introducido no valido");
		}finally {
			teclado.close();
		}

	}

}

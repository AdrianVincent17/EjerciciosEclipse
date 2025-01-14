package arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio04 {
	
	final static int TAM=10;

	public static void main(String[] args) {

		int[] array=new int[10];
		Scanner teclado=new Scanner(System.in);

		try {

			System.out.println("Introduce "+TAM+" valores de tipo entero...");
			for(int i=0; i<array.length; i++) {
				System.out.print("Valor["+(i+1)+"]: ");
				array[i]=teclado.nextInt();
			}

		}catch(Exception lupita) {

		}finally {
			teclado.close();
		}

		System.out.print("\nValores: ");
		for(int i=0; i<TAM/2; i++) {
			System.out.print(array[i]+" ");
			System.out.print(array[array.length-1-i]+" ");
		}

	}

}

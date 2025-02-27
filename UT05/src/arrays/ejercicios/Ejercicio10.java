package arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	final static int TAM=9;

	/**
	 * Procedimiento que visualiza un array de numeros enteros por pantalla
	 * @param array de numeros enteros
	 * @param num - tamaño del array
	 */

	public static void visualiza(int[] array, int num) {

		for(int i=0; i<num; i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {

		Scanner teclado= new Scanner(System.in);

		int[] vector=new int[TAM];
		int posicion=TAM;
		try {

			

			System.out.println("Elementos de la tabla: ");
			for(int i=0; i<vector.length; i++) {
				System.out.print("[Elemento "+(i+1)+"]: ");
				vector[i]=teclado.nextInt();
			}

			//pedimos la posicion de queremos eliminar 
			do {
				System.out.print("posicion a eliminar entre 0 y "+(TAM-1)+": ");
				posicion=teclado.nextInt();


			}while(posicion<0 || posicion>=TAM);

		}catch(Exception e) {
			System.out.println("Error");
		}
			teclado.close();
		
		
		//mostramos la tabla
		System.out.print("Tabla original: ");
		visualiza(vector,TAM);
		
		//Desplazamos desde posicion hasta el final todos los elementos un lugar a la izquierda
		for(int i=posicion; i<TAM-1; i++)
			vector[i]=vector[i+1];

		
		System.out.print("\nTabla con un elemento eliminado: ");
		visualiza(vector,TAM-1);
	}

}

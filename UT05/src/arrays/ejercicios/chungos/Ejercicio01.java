package arrays.ejercicios.chungos;

import java.util.Scanner;

public class Ejercicio01 {

	final static int TAM=5;
	
	/**
	 * Procedimiento que muestra por pantalla un array de numeros enteros pasados por parametros 
	 * @param array de numeros enteros
	 */
	
	public static void mostrar(int [] array) {
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	/**
	 * Funcion booleana que determina si un array es igual a otro o contiene los mismos valores
	 * @param A - array de numeros enteros
	 * @param B - array de numeros enteros
	 * @return TRUE si son iguales ambos arrays o FALSE si no lo son
	 */
	
	public static boolean iguales(int [] A,int [] B) {
		
		for(int i=0; i<A.length; i++) 
			if(A[i]!=B[i])
				return false;
			return true;
		
	}
	
	/**
	 * Procedimiento que ordena un array de numeros enteros de manera ascendente
	 * @param array - de numeros enteros
	 */
	
	public static void ordenar(int[]array) {
		
		int aux;
		boolean cambio=false;
		for(int i=array.length; i>0; i--) {
			cambio=false;
			for(int j=0; j<i-1; j++) {
				if(array[j]>array[j+1]) {
					aux=array[j+1];
					array[j+1]=array[j];
					array[j]=aux;
					cambio=true;
				}
			}
			if(!cambio)
				return;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		//declaramos dos arrays 
		int []A=new int [TAM];
		int []B=new int [TAM];
		
		try {
			
			//llenamos los arrays con valores por entrada de teclado
			System.out.println("Vector A");
			for(int i=0; i<A.length; i++) {
				System.out.print("valor["+(i+1)+"]: ");
				A[i]=teclado.nextInt();
			}
			
			
			System.out.println("\nVector B");
			for(int i=0; i<B.length; i++) {
				System.out.print("valor["+(i+1)+"]: ");
				B[i]=teclado.nextInt();
			}
			
			//mostramos ambos conjuntos de valores almacenados en sendos arrays
			System.out.print("\nVECTOR A: ");
			mostrar(A);
			
			System.out.print("\nVECTOR B: ");
			mostrar(A);
			
			
			
			
		}catch(Exception e) {
			System.out.println("Error, dato introducido no valido");
		}finally {
			teclado.close();
		}
		
		if(iguales(A,B)) {
			System.out.println("\n\nAmbos Arrays son iguales");
		}else
			System.out.println("\n\nArray A y B no son iguales");
		
		
		//y ahora ordenamos ambos arrays para saber si tienen el mismo conjunto de valores
		ordenar(A);
		ordenar(B);
		
		if(iguales(A,B)) {
			System.out.println("Ambos arrays Tienen el mismo conjunto de valores");
		}else
			System.out.println("No tienen el mismo conjunto de valores");
		
	}

}

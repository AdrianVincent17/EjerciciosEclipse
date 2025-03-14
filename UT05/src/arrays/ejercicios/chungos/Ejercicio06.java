package arrays.ejercicios.chungos;

import java.util.Scanner;

public class Ejercicio06 {
	
	/**
	 * Funcion booleana que determina si un array es igual a otro o contiene los mismos valores
	 * @param A - array de numeros enteros
	 * @param B - array de numeros enteros
	 * @return TRUE si son iguales ambos arrays o FALSE si no lo son
	 */
	
	public static boolean iguales(int [] A,int [] B) {
		
		for(int i=0; i<A.length; i++) 
			for(int j=0; j<B.length; j++) 
				if(A[i]==B[j])
					return true;
		return false;
	}
	
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

	
	/**
	 * procedimiento que muestra por pantalla un array de numeros enteros
	 * @param array de numeros enteros
	 */
	
	public static void visualiza(int [] array) {

		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static int aleatorio(int N) {
		
		return (int)(Math.random()*N+1);
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
	
	final static int TAM=6;
	final static int LIMITE=49;


	public static void main(String[] args) {
		
		int [] vector1=new int[TAM];
		int [] vector2=new int[TAM];
		
		Scanner teclado=new Scanner(System.in);
		boolean repetido=false;
		int i=0;
		try {
			
			System.out.println("Elige "+TAM+" numeros para la primitiva");	
			for(i=0; i<vector1.length; i++) {
				do {
					
				System.out.print("["+(i+1)+"] Numero: ");
				vector1[i]=teclado.nextInt();
				
				if((vector1[i]<1) || (vector1[i]>49)){
					System.out.println("> El valor no se encuentra entre 1 y 49");
				}else {
					repetido=encontrado(vector1, vector1[i], i);
					if(repetido) { 
						System.out.print("--> Numero repetido, vuelva a introducirlo \n");
					}
					
				}

				}while( (vector1[i]<1) || (vector1[i]>49) || (repetido));
				
			}
		}catch(Exception e) {
			System.out.println("Error");
		}finally {
			teclado.close();
		}
		ordenar(vector1);
		System.out.print("\nNumeros apostados: ");
		visualiza(vector1);
		int j=0;
		repetido=encontrado(vector2, vector1[j], j);
		for(j=0; j<vector2.length; j++) {
			do {
			vector2[j]=aleatorio(LIMITE);
			}while(repetido);
		}
		ordenar(vector2);
		System.out.print("\nNumeros ganadores: ");
		visualiza(vector2);
		
		int conta=0;
		if(iguales(vector1, vector2)){
			conta++;
		}
			

		System.out.println("\nNº aciertos: "+conta);
		
	}
}

			
	



package arrays.ejercicios.chungos;

public class Ejercicio04 {
	
	/**
	 * Funcion que obtiene numeros aleatorio con un limite de un numero entero pasado por parametro
	 * @param num numero enteros
	 * @return numero aleatorio
	 */
	
	public static int aleatorio(int num) {
		
		return (int)(Math.random()*num+1);
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
	
	public static void visualiza(int [] array) {
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	final static int TAM=5;
	public static void main(String[] args) {
		
		int []A=new int [TAM];
		
		System.out.print("Generando valores aleatorios: ");

		for(int i=0; i<A.length; i++)
			do {
				A[i]=aleatorio(10);
			}while(encontrado(A, A[i], i));	
			
		visualiza(A);
	}

}

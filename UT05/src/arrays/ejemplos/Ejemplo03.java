package arrays.ejemplos;

public class Ejemplo03 {

	final static int TAM=10;
	
	public static void main(String[] args) {
		
		//Creamos el vector
		int[] vector= {5,10,15,20,25,30,35,40,45,50};
		
		//mostramos el vector
		System.out.print("Vector: ");
		for(int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
		
		//mostramos las posiciones del vector
		System.out.print("\nPrimero: "+vector[0]);
		System.out.print("\nUltimo: "+vector[vector.length-1]);
		System.out.print("\nSegundo: "+vector[1]);
		System.out.print("\nPenultimo: "+vector[vector.length-2]);
		System.out.print("\nTercero: "+vector[2]);
		System.out.print("\nAntepenultimo: "+vector[vector.length-3]);
		
	}

	}



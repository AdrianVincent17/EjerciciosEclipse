package arrays.ejercicios.chungos;

public class Ejercicio03 {

	public static int aleatorio(int N) {

		return (int)(Math.random()*N+1);
	}

	public static boolean encontrado(int A[], int N, int pos) {

		for(int i=0; i<pos; i++) 
			if(N==A[i])
				return true;
		return false;

	}

	final static int TAM=5;
	final static int LIMITE=10;

	public static void main(String[] args) {

		int[] array=new int[TAM];

		//Generamos valores aleatorios y los almacenamos en el array
		System.out.print("\n--PRIMERA VERSION--");
		System.out.println("\n\nGeneramos valores aleatorios...");
		for(int i=0; i<array.length; i++) {
			array[i]=aleatorio(LIMITE);

			System.out.print("[i="+i+"]"+array[i]);

			//Recorremos todos los valores anteriores almacenados
			System.out.print("   ---> anteriores ");
			for(int j=0; j<i; j++) {
				System.out.print(array[j]+" ");

			}
			System.out.println();
		}
		System.out.print("\n--SEGUNDA VERSION--");
		System.out.println("\n\nGeneramos valores aleatorios...");
		for(int i=0; i<array.length; i++) {
			array[i]=aleatorio(LIMITE);

			System.out.print(array[i]);

			//Recorremos todos los valores anteriores almacenados
			for(int j=0; j<i; j++) {
				if(array[i]==array[j]) {
					System.out.print("    ---> repetido");
					break;
				}
			}
			System.out.println();
		}
		System.out.print("\n--TERCERA VERSION--");
		System.out.println("\n\nGeneramos valores aleatorios...");
		for(int i=0; i<array.length; i++) {
			array[i]=aleatorio(LIMITE);

			System.out.print(array[i]);

			//Recorremos todos los valores anteriores almacenados
			if(encontrado(array, array[i], i)==true) 
				System.out.print("    ---> repetido");

			System.out.println();
		}
		
	}

}



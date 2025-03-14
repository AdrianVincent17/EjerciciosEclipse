package arrays.ejercicios.chungos;

public class Ejercicio02 {

	/**
	 * procedimiento que muestra por pantalla un array de numeros enteros
	 * @param array - de numeros enteros
	 */

	public static void mostrar(int[] array) {

		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	/**
	 * funcion que genera un numero aleatorio mediante un parametro 
	 * @param N - numero entero
	 */

	public static int aleatorio(int N) {
		return (int)(Math.random()*N+1);
	}

	final static int TAM=5;
	final  static int LIMITE=10;

	public static void main(String[] args) {

		int[] A=new int [TAM];
		int[] B	=new int [TAM];

		for(int i=0; i<TAM; i++) {
			A[i]=aleatorio(LIMITE);
			B[i]=aleatorio(LIMITE);
		}


		System.out.print("vector A: ");
		mostrar(A);

		System.out.print("\nVector B: ");
		mostrar(B);

		int conta=0;
		for(int i=0; i<A.length; i++) 
			for(int j=0; j<B.length; j++) 
				if(A[i]==B[j])
					conta++;
		
		System.out.println("\nAmbos arrays contienen "+conta+" valores comunes");
	}

}

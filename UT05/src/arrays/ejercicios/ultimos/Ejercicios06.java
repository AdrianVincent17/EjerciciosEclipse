package arrays.ejercicios.ultimos;

public class Ejercicios06 {

	public static void ordena(int[] array) {

		int aux;
		int i=0;
		boolean cambio=false;

		for(i=array.length; i>0; i--) {
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

	public static void visualiza(int [] array) {
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static int aleatorio(int N) {
		
		return (int)(Math.random()*N+1);
	}


	final static int TAM=100;
	final static int LIMIT=1000;

	public static void main(String[] args) {

		int [] A=new int[TAM];
		
		for(int i=0; i<A.length; i++) {
			A[i]=aleatorio(LIMIT);
		}
		
		System.out.print("array normal: ");
		visualiza(A);
		
		ordena(A);
		System.out.print("\narray ordenado: ");
		visualiza(A);
		
		System.out.print("\nUltimos 10 mayores en orden ascendente: ");
		for(int i=A.length-10; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}
		
		System.out.print("\nUltimos 10 mayores en orden descendente: ");
		for(int i=A.length-1; i>=A.length-10; i--) {
			System.out.print(A[i]+" ");
		}

		
	}

}

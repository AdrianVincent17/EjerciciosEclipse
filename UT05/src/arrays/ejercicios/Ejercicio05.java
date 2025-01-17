package arrays.ejercicios;

public class Ejercicio05 {
	
	final static int TAM=5; // numero de elementos de los vectores A y B
	
	public static void imprimir(int[] array) {
		
		for(int i=0; i<array.length; i++) 
			
			System.out.print(array[i]+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		

		
		 int [] A= {1,2,3,4,5};
		 int [] B= {6,7,8,9,10};
		 
		 int[] C= new int[A.length+B.length];
		 
		
		 
		//Asignamos los elementos a la tabla C
		 int i=0;
		 
		 for(int j=0; i<A.length; j++) {
			 C[i]=A[j];
			 i++;
			 C[i]=B[j];
			 i++;
		 }
		 System.out.print("A: ");
		 imprimir(A);
		 System.out.print("B: ");
		 imprimir(B);
		 System.out.print("C: ");
		 imprimir(C);
		
		

	}

}

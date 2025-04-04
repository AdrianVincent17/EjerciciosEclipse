package arrays.ejemplos;

public class Ejemplo07 {

	public static void imprimir(int[] array) {

		for(int i=0; i<array.length; i++) 
			System.out.print(array[i]+" ");
		System.out.println();

	}

	public static void main(String[] args) {

		int A[]= {1,3,5,7,9};
		int[] B= {2,4,6,8,10};

		System.out.print("a: ");
		imprimir(A);
		System.out.print("b: ");
		imprimir(B);

		//Creamos un tercer array C que almacene los valores de A y B
		//C ={1,3,5,7,9,2,4,6,8,10}

		int[] C= new int[A.length+B.length];
		System.out.print("C: ");
		imprimir(C);

		//Copiamos los valores de A en C 
		//Es decir: C[0]=A[0], C[1]=A[1], C[2]=A[2]...

		int i;
		
		for(i=0; i<A.length; i++)
			C[i]=A[i];
		
		System.out.print("C: ");
		imprimir(C);
		
		for(int j=0; j<B.length; j++) {
			C[i]=B[j];
			i++;
		}
		
		System.out.print("C: ");
		imprimir(C);
	}

}

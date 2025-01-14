package arrays.ejemplos;

public class Ejemplo02 {

	public static void main(String[] args) {

		//primer array
		int A[]= new int [10];

		//segundo array 
		int B[]= {10,20,30,40};

		//mostramos las longitudes de los arrays 
		System.out.println("Longitud de A: "+A.length);
		System.out.println("Longitud de B: "+B.length);

		//mostramos los valores que contienen los dos arrays 
		System.out.print("\nA: ");
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");
		}

		System.out.print("\nB: ");
		for(int i=0; i<B.length; i++) {
			System.out.print(B[i]+" ");
		}

		//Mostramos en orden inverso los valores almacenados en B	

		System.out.print("\nB (inverso): ");
		for(int i=B.length-1; i>=0; i--) {
			System.out.print(B[i]+" ");
		}

		//Almacenamos nuevos valores en el array A
		for(int i=0; i<A.length; i++) {
			A[i]=i+1;
		}

		//Mostramos los valores almacenados en el array A
		System.out.print("\nA: ");
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i]+" ");

		}

	}
}

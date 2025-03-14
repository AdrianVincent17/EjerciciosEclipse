package arrays.ejercicios.ultimos;

public class Ejercicios05 {
	
	
	public static int aleatorios(int num) {
		
		return (int)(Math.random()*num+1);
	}

	public static int mayor(int [] array) {

		int mayor=array[0];

		for(int i=0; i<array.length; i++) {
			if(mayor<array[i]) {
				mayor=array[i];
			}
		}
		return mayor;

	}

	public static int menor(int [] array) {

		int menor=array[0];

		for(int i=0; i<array.length; i++) {
			if(menor>array[i]) {
				menor=array[i];
			}
		}
		return menor;

	}

	public static double media(int [] array) {

		double media=0;

		for(int i=0; i<array.length; i++) {

			media+=array[i];

		}
		return (media/array.length);

	}
	
	public static void ordenav2(int [] array) {
		
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
	
	


	final static int TAM=50; // Tamaño del array 
	final static int LIMIT=50; //limite de numeros aleatorios 

	public static void main(String[] args) {

		int[] A=new int[TAM]; //Declaramos un array con una posicion con un entero constante
		
		for(int i=0; i<A.length; i++) {	//añadimos a cada posicion del array (TAM=50) un numeor aleatorio
			
			A[i]=aleatorios(LIMIT);
		}
		
		
		
		System.out.print("Array: ");
		for(int i=0; i<A.length; i++)
			System.out.print(A[i]+" ");
	
		
		System.out.print("\nMayor con funcion: "+mayor(A));
		System.out.print("\nMenor con funcion: "+menor(A));
		System.out.print("\nMedia con funcion: "+media(A));
		
		ordenav2(A);
		System.out.print("\nMayor sin funcion: "+A[A.length-1]);
		System.out.print("\nMenor sin funcion: "+A[0]);
		System.out.print("\nMedia sin funcion: "+media(A));
	}

}

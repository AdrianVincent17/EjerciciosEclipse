package arrays.ejercicios.ultimos;

public class Ejercicios04 {
	
	
	/**
	 * Procedimiento que muestra por pantalla un array de numeros enteros
	 * @param array de numeors enteros
	 */
	
	public static void visualiza(int [] array) {
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	
	/**
	 * Funcion que combina dos arrays de numeros enteros y devuelve un array con los numeros de ambos arrays 
	 * @param A array de numeros enteros
	 * @param B array de numeros enteros
	 * @return array combinado
	 */
	public static int[] combina(int[] A, int[] B) {
		
	
		int[] C=new int[A.length+B.length];
		int i=0;
		
		for(int j=0; j<A.length; j++) {
			C[i]=A[j];
			i++;
		}
		for(int j=0; j<B.length; j++) {
			C[i]=B[j];
			i++;
		}
		return C;
	}
	
	
	/**
	 * Procedimiento que ordena un array de numeros enteros 
	 * @param array de numeros enteros 
	 */
	
	public static void burbujamejor(int [] array) {
		
		int aux;
		boolean cambio;
		
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
	
	/**
	 * Funcion que obtiene numeros aleatorio con un limite de un numero entero pasado por parametro
	 * @param num numero enteros
	 * @return numero aleatorio
	 */
	
	public static int aleatorio(int num) {
		
		return (int)(Math.random()*num+1);
	}
	
	final static int TAM=10;
	final static int LIMITE=100;

	public static void main(String[] args) {
		
		
		int [] array1=new int[TAM];
		int [] array2=new int[TAM];
		
		
		System.out.print("Primer array: ");
		for(int i=0; i<array1.length; i++) 
			array1[i]=aleatorio(LIMITE);
		
		visualiza(array1);
		
		System.out.print("\nSegundo array: ");
		for(int i=0; i<array2.length; i++) 
			array2[i]=aleatorio(LIMITE);
		
		visualiza(array2);
		
		System.out.print("\nTercer array: ");
		int [] array3=combina(array1, array2);
		
		burbujamejor(array3);
		visualiza(array3);
		
	}

}

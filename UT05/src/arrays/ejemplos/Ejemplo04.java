package arrays.ejemplos;

public class Ejemplo04 {

	/**
	 * Procedimiento que imprime por pantalla los valores almacenados en un array de numeros enteros
	 * @param array de valores enteros
	 */
	public static void imprimir(int[] array) {

		for(int i=0; i<array.length; i++) 
			System.out.print(array[i]+" ");
		System.out.println();
		
	}

	public static void main(String[] args) {

		//Declaramos e inicializamos el array
		int[] vector= {1,2,3,4,5,6,7,8};
		
		//Visualizamos el array
		imprimir(vector);
		
		//Incrementamos los valores pares y decrementamos los valores impares
		for(int i=0; i<vector.length; i++) 
			if(vector[i]%2==0) 
				vector[i]++;
			else
				vector[i]--;
		
		
		//Visualizamos el array
		imprimir(vector);
		
		//Multiplicamos por 10 los valores impares
		for(int i=0; i<vector.length; i++) 
			if(vector[i]%2!=0)
				vector[i]*=10;
		
		
		//Visualizamos el array
		imprimir(vector);
		
		
	}

}

package arrays.ejemplos;



public class Ejemplo06 {

	final static int TAM=5;

	/**
	 * imprime por pantalla un array de valores enteros
	 * @param array de valores enteros
	 */

	public static void imprime(int[] array) {

		for(int i=0; i<array.length; i++) 
			System.out.print(array[i]+" ");
	}


	/**
	 * imprime por pantalla los valores almacenados de forma inversa en un array de enteros
	 * @param array de numeros enteros
	 */

	public static void imprimeinverso(int array[]) {

		for(int i=array.length-1; i>=0; i--)
			System.out.print(array[i]+" ");
	}

	/**
	 * funcion que devuelve el mayor valor almacenado en un array de enteros
	 * @param vector - array de numeros enteros 
	 * @return numero entero(el mayor valor almacenado en el array)
	 */

	public static int mayor(int [] vector) {
		int mayor = vector[0];


		for(int i=1; i<vector.length; i++) 

			if(mayor<vector[i])
				mayor=vector[i];

		return mayor;	
	}

	/**
	 * funcion que devuelve el menor valor almacenado en un array de enteros
	 * @param vector - array de numeros enteros 
	 * @return numero entero(el menor valor almacenado en el array)
	 */

	public static int menor(int [] vector) {
		int menor = vector[0];


		for(int i=1; i<vector.length; i++) 

			if(menor>vector[i])
				menor=vector[i];

		return menor;	
	}

	/**
	 * Funcion que devuelve la media de los valores almacenados en un array
	 * @param array de numeros enteros
	 * @return
	 */
	public static float media(int[] array) {

		float suma=0;

		for(int i=1; i<array.length; i++) {
			suma+=array[i];
		}

		return suma/array.length;

	}

	public static void main(String[] args) {

		//Creamos un array de numeros enteros
		int[] tabla= {11,23,32,4,51,21,8,10,17};

		//mostramos el array por pantalla
		System.out.print("Valores almacenados en el array: ");
		imprime(tabla);

		//mostramos el array por pantalla en orden inverso
		System.out.print("\nValores almacenados en el array (inverso): ");
		imprimeinverso(tabla);

		//Mostramos el mayor valor almacenados en el array
		System.out.print("\nMayor valor almacenado: "+mayor(tabla));

		//mostramos el menor valor almacenado en el array 
		System.out.println("\nMenor valor almacenado: "+menor(tabla));
		
		//Mostramos la media de los valores almacenados en el array 
		System.out.println("Media de los valores almacenados: "+media(tabla));
		

	}

}

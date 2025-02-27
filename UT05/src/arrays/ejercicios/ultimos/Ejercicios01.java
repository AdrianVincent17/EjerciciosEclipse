package arrays.ejercicios.ultimos;

public class Ejercicios01 {

	/**
	 * Funcion que devuelve un numero entero de un numero pasado como parametro
	 * @param num numero entero
	 */

	public static int aleatorio(int num) {
		return (int)(Math.random()*num+1);
	}

	/**
	 * Procedimiento que muestra por pantalla un array de numeros enteros
	 * @param array de numeros enteros
	 */

	public static void visualiza(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	/**
	 * Procedimiento que ordena por el metodo burbuja 
	 * @param array de numeros enteros
	 */
	public static void burbuja(int [] array) {

		int aux;
		
		//Damos tantas pasadas como posiciones tenga el array 
		for(int i=array.length; i>0; i--) {
			for(int j=0; j<i-1; j++) {
				if(array[j]>array[j+1]) {
					
					//Intercambiamos valores
					aux=array[j+1];
					array[j+1]=array[j];
					array[j]=aux;

				}
			}
		}

	}

	final static int POS=50;
	final static int LIMITE=100;

	public static void main(String[] args) {

		//Creamos una lista y generamos los valores que se van a almacenar
		int[] vector=new int[POS];

		for(int i=0; i<POS; i++) {
			vector[i]=aleatorio(LIMITE);
		}
		
		//Mostramos la lista desordenada
		System.out.println("Lista desordenada: ");
		visualiza(vector);
		
		//Ordenamos la lista y la mostramos 
		burbuja(vector);
		System.out.println("\nLista ordenada: ");
		visualiza(vector);
	}

}

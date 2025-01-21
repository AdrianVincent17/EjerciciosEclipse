package arrays.ejercicios.ultimos;

public class Ejercicios02 {
	
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
	 * Procedimiento que mejora al anterior metodo y añade un flag para evitar pasadas innecesarias
	 * el cual ordena en modo burbuja un array de numeros enteros
	 * @param array de numeros enteros
	 */
	public static void burbujamejor(int[] array) {
		
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
	
	final static int POS=7;
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
				burbujamejor(vector);
				System.out.println("\nLista ordenada: ");
				visualiza(vector);
			}

	}



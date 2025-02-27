package arrays.ejercicios.ultimos;

public class Ejercicios03 {
	
	public static void cocktail(int[] array) {
		
		int aux;
		int i=0, j=array.length-1;
		
		while(i<j) {
			
			for(int k=i; k<j; k++) {
				if(array[k]>array[k+1]) {
					aux=array[k+1];
					array[k+1]=array[k];
					array[k]=aux;
				}
			}
			j--;
			
			for(int k=j; k>i; k--) {
				if(array[k]<array[k-1]) {
					aux=array[k-1];
					array[k-1]=array[k];
					array[k]=aux;
				}
			}
			i++;
		}
		
	}
	
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
		cocktail(vector);
		System.out.println("\nLista ordenada: ");
		visualiza(vector);
		

	}

}

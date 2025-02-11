package strings;

import java.util.Scanner;

public class Arraycaracteres {
	
	final static int TAM=5;
	
	/**
	 * Funcion que devuelve el indice del nombre mas largo almacenado en un array de nombres pasado com parametro
	 * @param array de nombres
	 * @return un entero(el indice del nombre mas largo almacenado en el array)
	 */

	public static int mayor(String [] array) {

		int mayor=0;
		
			for(int i=1; i<array.length; i++) {
				if(array[i].length()>array[mayor].length()) {
					mayor=i;
					
				}
			}

		return mayor;

	}
	
	/**
	 * Funcion que devuelve el indice del nombre mas corto almacenado en un array de nombres pasado com parametro
	 * @param array de nombres
	 * @return un entero(el indice del nombre mas corto almacenado en el array)
	 */

	public static int menor(String [] array) {

		int menor=0;
		
			for(int i=1; i<array.length; i++) {
				if(array[i].length()<array[menor].length()) {
					menor=i;
					
				}
			}
		
			

		
		return menor;


	}
	

	
	/**
	 * procedimiento que ordena en metodo burbuja un array de enteros
	 * @param vector array con numero entero
	 */

	public static void ordenaburbuja(String vector[]) {
		String aux;
		boolean cambio;
		for(int i=TAM; i>0; i--) {
			cambio=false;
			for(int j=0; j<i-1; j++) {
				if(vector[j].compareTo(vector[j+1])>0) {
					aux=vector[j];
					vector[j]=vector[j+1];
					vector[j+1]=aux;
					cambio=true;
				}
			}
			if(cambio==false)
				return;
		}
	}
	
	public static void visualiza(String [] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	
	

	public static void main(String[] args) {

		String array[] = new String[TAM];
		
		Scanner sc=new Scanner(System.in);
		
		try {
			
			System.out.println("Introduce "+TAM+" nombres: " );
			for(int i=0; i<array.length; i++) {
				System.out.print("Nombre "+(i+1)+": ");
				array[i]=sc.nextLine();
			}
			
			System.out.print(">Nombres introducidos: ");
			visualiza(array);
			
			System.out.println("\n> Nombre mas largo: "+array[mayor(array)]);
			System.out.println("> Nombre mas corto: "+array[menor(array)]);
			
			System.out.print("> Nombres ordenador: ");
			ordenaburbuja(array);
			visualiza(array);
			
			System.out.println("\n> Nombre elegido al azar "+array[(int)Math.random()*array.length]);
			
			
		}catch(Exception e) {
			
		}finally {
			sc.close();
		}
		
		

	}

}

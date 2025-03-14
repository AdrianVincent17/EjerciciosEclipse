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
	
	/**
	 * Procedimiento que muestra pr pantalla el array de String pasado como parametro
	 * @param array de String 
	 */
	
	public static void visualiza(String [] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	/**
	 * Funcion que devuelve un numero aleatorio hasta el numero pasado como parametro
	 * @param num limite 
	 * @return numero aleatorio de entre 0 y num
	 */
	public static int ale(int num) {
		return (int)(Math.random()*num);
	}

	/**
	 * funcion que devuelve un array de String de un array de String pasados como parametro pero con la primera letra mayuscula
	 * @param cad - array de nombres
	 * @return array de nombres con la primera letra capitalizada
	 */
	
	  public static String[] PrimeraMayus(String[] cad) {
	        for (int i = 0; i < cad.length; i++) {
	         cad[i] = cad[i].substring(0, 1).toUpperCase() + cad[i].substring(1).toLowerCase();    
	        }
	        return cad;
	    }
	  
	public static void main(String[] args) {

		String array[] = new String[TAM];
		String [] nombres= {"loco","berto","lucas","moro","perico"};
		Scanner sc=new Scanner(System.in);
		
		try {

			System.out.println("\n>>NOMBRES PREESTABLECIDOS<<");
			System.out.print("> Nombres introducidos: ");
			visualiza(nombres);
			
			System.out.println("\n> Nombre mas largo: "+nombres[mayor(nombres)]);
			System.out.println("> Nombre mas corto: "+nombres[menor(nombres)]);
			
			System.out.print("> Nombres ordenador: ");
			ordenaburbuja(nombres);
			visualiza(nombres);
			
			System.out.println("\n> Nombre elegido al azar "+nombres[ale(nombres.length)]);
			
			String [] primayu1=PrimeraMayus(nombres);
			System.out.print("> Primera letra en mayuscula: ");
			visualiza(primayu1);
		
			
			System.out.println("\n\n>>NOMBRES INTRODUCIDOS<<");
			
			System.out.println("Introduce "+TAM+" nombres: " );
			for(int i=0; i<array.length; i++) {
				System.out.print("Nombre "+(i+1)+": ");
				array[i]=sc.nextLine().toLowerCase().trim();
			}
			
			System.out.print(">Nombres introducidos: ");
			visualiza(array);
			
			System.out.println("\n> Nombre mas largo: "+array[mayor(array)]);
			System.out.println("> Nombre mas corto: "+array[menor(array)]);
			
			System.out.print("> Nombres ordenador: ");
			ordenaburbuja(array);
			visualiza(array);
			
			System.out.println("\n> Nombre elegido al azar "+array[ale(array.length)]);
			
			String [] primayu=PrimeraMayus(array);
			
			System.out.print("\n> Primera letra en mayuscula: ");
			visualiza(primayu);
		
			
		}catch(Exception e) {
			
		}finally {
			sc.close();
		}
		
		

	}

}

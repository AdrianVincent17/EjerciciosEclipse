package ejmplos;

public class Dobleytriple {
	
	/**
	 * funcion que devuelve la mitad de un numero
	 * @param num numero por parametro
	 * @return mitad del numero
	 */
	
	public static double mitad(int num) {
		return num/2.0;
	}
	
	/**
	 * Funcion que devuelve el triple de un numero 
	 * @param num numero por parametro
	 * @return triple de un numero
	 */
	public static int triple(int num) {
		return num*3;
	}
	
	/**
	 * Funcion que devuelve el doble de un numero 
	 * @param num numero pasado por parametro
	 * @return el doble de un numero
	 */
	
	public static int doble(int num) {
		return num*2;
	}

	public static void main(String[] args) {
		
		//Creamos e inicializamos las variables
		
		int num=5;
		
		System.out.println("El doble del "+num+" es: "+doble(5));
		System.out.println("El triple del "+num+" es: "+triple(5));
		System.out.println("La mitad de "+num+" es: "+mitad(5));



	}

}

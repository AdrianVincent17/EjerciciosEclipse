package ejmplos;

public class Dado02 {
	
	/**
	 * Funcion que genera un numero aleatorio simulando el lanzamiento de un dado
	 * @return un numero entero entre 1 y 6
	 */
	
	public static int dado() {
		//creamos la variable int que sera el resultado de la generacion de un numero aleatorio
		int res=(int)(Math.random()*6+1);
		return res;
		
	}
	//programa principal
	public static void main(String[] args) {
		
		//mostramos por pantalla el resultado de la funcion declarada anteriormente
		System.out.println("Primera tirada: "+dado());
		System.out.println("Segunda tirada: "+dado());
		System.out.println("Tercera tirada: "+dado());
		System.out.println("Cuarta tirada: "+dado());
		System.out.println("Quinta tirada: "+dado());
		

	}

}

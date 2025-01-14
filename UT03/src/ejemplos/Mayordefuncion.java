package ejemplos;

import java.nio.channels.AsynchronousSocketChannel;

public class Mayordefuncion {
	
	/**
	 * Funcion que devuelve el mayor entre dos numeros
	 * @param x numero entero
	 * @param y numero entero
	 * @return x si X>Y, Y en caso contrario
	 */
	
	public static int mayor(int x, int y) {
		
		if(x>y)
			return x;
		return y;
	}

	public static void main(String[] args) {

		//Declaracion e inicializacion de variables
		//Generamos dos numeros aleatorios entre 1 y 100
		
		int a=5,
			b=15;

		System.out.println("Valores: "+a+" y "+b);
		System.out.println("Mayor: "+mayor(a,b));
		
	}

}

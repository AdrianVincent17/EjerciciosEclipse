package ejemplos;

public class MayordefuncionconAleatorio {
	
	/**
	 * Funcion que devuelve un numero mayor a otro 
	 * @param x numero entero
	 * @param y numero entero
	 * @return X si X>Y, Y en caso contrario
	 */
	
	public static int mayor(int x, int y) {
		
		if(x>y)
			return x;
		return y;
	}
	
	/**
	 * funcion que devuelve un numero aleatorio entre 1 y N
	 * @param a variable elegido
	 * @return devuelve numero aleatorio entre 1 y N
	 */
	
	public static int aleatorio(int N) {
		return (int)(Math.random()*N+1);
	}

	public static void main(String[] args) {

		//Declaracion e inicializacion de variables
		//Generamos dos numeros aleatorios entre 1 y 100
		
		int a=aleatorio(50),
			b=aleatorio(50);

		System.out.println("Valores: "+a+" y "+b);
		System.out.println("Mayor: "+mayor(a,b));
		
		
		
	}

}

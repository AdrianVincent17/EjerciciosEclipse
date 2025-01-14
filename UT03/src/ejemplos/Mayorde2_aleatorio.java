package ejemplos;

public class Mayorde2_aleatorio {
	
	
	/**
	 * Funcion que genera un numero aleatorio entre 1 y N
	 * @param N numero entero
	 * @return devuelve un numero aleatorio entre 1 y un numero entero 
	 */
	
	public static int aleatorio(int N) {
		return (int)(Math.random()*N+1);
	}

	public static void main(String[] args) {

		//Declaracion e inicializacion de variables

		int a=aleatorio(50),
			b=aleatorio(50);

		if(a>b) 
			System.out.println(a+" es mayor que "+b);
		else if(a==b) 
			System.out.println(a+" es igual que "+b);
		else 
			System.out.println(b+" es mayor que "+a);
		
	}

}

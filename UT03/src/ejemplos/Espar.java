package ejemplos;

public class Espar {

	/**
	 * funcion que genera un numero aleatorio entre uno y N
	 * @param N numeor entero 
	 * @return devuelve un numero aleatorio entre uno y N
	 */
	
	public static int aleatorio(int N) {
		return(int)(Math.random()*N+1);
	}

	/**
	 * funcion que declara si el numero pasado por parametro es par o impar
	 * @param N numero entero
	 * @return true si es par y false si es impar
	 */
	
	public static boolean espar(int N) {
		if(N%2==0) 
			return true;
		return false;	
	}
	
	
	/**
	 * parametro que muestra por pantalla el condicional de par e impar
	 * @param N numero entero
	 */
	
	public static void parimpar(int N) {
		
		if(espar(N))
			System.out.println("El numero "+N+" es par");
		else 
			System.out.println("El numero "+N+" es impar");
	}
	
	public static void main(String[] args) {

		//Declaramos e inicializamos variables con numero aleatorio
		int a=aleatorio(100);
		
		//hacemos la llamada al procedimiento
		parimpar(a);

	}

}

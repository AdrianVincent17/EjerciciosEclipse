package ejemplos;

public class While {

	/**
	 * Procedimiento que declara un numero N hasta 10
	 * @param N numero entero
	 */

	public static void contarhastadiez(int N) {

		while(N<=10) {
			System.out.print(N+" ");
			N++;
		}
	}

	/**
	 * Procedimiento que muestra un numero de N hasta 1
	 * @param N numero entero
	 */

	public static void contardesdediez(int N) {

		while(N>=1) {
			System.out.print(N+" ");
			N--;
		}
	}

	//Programa principal
	public static void main(String[] args) {


		//Declaracion e inicializacion de variables y numero aleatorios
		int num=(int)(Math.random()*10+1);

		//llamada a los procedimientos

		contarhastadiez(num);

		System.out.println();

		contardesdediez(num);

	}

}

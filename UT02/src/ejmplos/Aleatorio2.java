package ejmplos;

public class Aleatorio2 {

	/**
	 * Genera un numero aleatorio entre 1 y N
	 * @param n limite superior (nº entero)
	 * @return nº aleatorio entre 1 y N
	 */

	public static int aleatorio(int N) {
		return (int)(Math.random()*N+1);
	}

	//programa principal
	public static void main(String[] args) {

		//hacemos la llamada a la funcion a traves de un print 

		//el primer numero sera entre 1 y 6
		System.out.println("El primer numero aleatorio entre 1 y 6: "+aleatorio(6));

		//el segundo numero sera entre 1 y 10
		System.out.println("El segundo numero aleatorio entre 1 y 10: "+aleatorio(10));

		//el tercer numero sera entre 1 y 50
		System.out.println("El tercer numero aleatorio entre 1 y 50: "+aleatorio(50));

		//el cuarto numero sera entre 1 y 100
		System.out.println("El cuarto numero aleatorio entre 1 y 100: "+aleatorio(100));

		//el quinto numero sera entre 1 y 1000
		System.out.println("El quinto numero aleatorio entre 1 y 1000: "+aleatorio(1000));
	}

}

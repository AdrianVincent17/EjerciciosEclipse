package ejemplos;

public class DoWhile {
	
	/**
	 * procedimiento que muestra un bucle dowhile de un numero N hasta cien
	 * @param N numero entero
	 */
	public static void Nacien(int N) {

		do {
			System.out.print(N+++" ");
		}while(N<=100);
	}

	public static void cienaN(int N) {

		do {
			System.out.print(N--+" ");
		}while(N>=1);
	}

	public static void main(String[] args) {

		int num=(int)(Math.random()*100+1);
		
		Nacien(num);
		System.out.println();
		cienaN(num);
	}

}

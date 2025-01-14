package ejmplos;

public class Sumas {
	
	/**
	 * suma dos valores enteros
	 * @param a primer sumando
	 * @param b seugndo sumando
	 * @return suma entre a y b
	 */
	
	public static int sumas(int a, int b) {
		
		return a+b;
		
	}
	
	/**
	 * suma dos valores enteros
	 * @param a primer sumando
	 * @param b seugndo sumando
	 * @param c tercer sumando
	 * @return suma entre a, b y c
	 */
	
	public static int sumas(int a, int b, int c) {
		
		return a+b+c;
		
	}

	public static void main(String[] args) {
		
		System.out.println(sumas(5,10));
		System.out.println(sumas(5,10,15));
		

	}

}

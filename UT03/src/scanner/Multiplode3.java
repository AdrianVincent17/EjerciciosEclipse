package scanner;

import java.util.Scanner;

public class Multiplode3 {
	
	/**
	 * Funcion que devuelve un booleano en caso verdadero o falso de un numero par o impar
	 * @param N numero entero
	 * @return true si es par y false si es impar
	 */

	public static boolean multiplo(int N) {

		if(N%3==0)
			return true;
		return false;

	}

	/**
	 * Procedimiento que muestra si un numero es par o impar 
	 * @param N numero entero 
	 */
	public static void multiplomuetra(int N) {

		if(multiplo(N))
			System.out.println("El numero "+N+" SI es multiplo de 3");
		else
			System.out.println("El numero "+N+" NO es multiplo de 3");

	}
	public static void main(String[] args) {
		
		//Cremos el lector
		Scanner teclado=new Scanner(System.in);
		
		try {
			
			System.out.print("Dime un numero: ");
			int num=teclado.nextInt();
			multiplomuetra(num);
			
			
		//Añadimos un control de excepciones
		}catch(Exception lupita) {
			System.out.println("ERROR, El dato no es correcto");
		}
		
		
		
		//Cerramos el lector
		teclado.close();


	}

}

package scanner;

import java.util.Scanner;

public class ParImpar {
	
	/**
	 * Funcion que devuelve verdadero o falso para un numero par o impar
	 * @param N Numero entero
	 * @return true si es par y false si es impar
	 */
	
	public static boolean par(int N) {
		
		if(N%2==0)
			return true;
		return false;
	}
	
	
	/**
	 * Procedimiento que muesra si un numero introducido es par o impar
	 * @param N numero entero
	 */
	
	public static void parmuestra(int N) {
		
		if(par(N))
			System.out.println("El numero "+N+" es par");
		else
			System.out.println("El numero "+N+" es impar");
	}

	//Programa principal
	public static void main(String[] args) {
		
		//Creamos el lector
		Scanner teclado = new Scanner(System.in);
		
		
		try {
			
			System.out.print("Dime un numero y te digo si es par o no: ");
			int num=teclado.nextInt();
			parmuestra(num); //Hacemos llamada al procedimiento parmuestra
			
		//Cremos control de excepciones	
		}catch(Exception lupita) {
			System.out.println("ERROR, No has introducido un valor entero");
		}
		
		//Cerramos el lector
		teclado.close();
		
		
		
	}

}

package scanner;

import java.util.Scanner;

public class PositivoNegativo {
	
	/**
	 * Procedimiento que muesras si un numero es multiplo de 3
	 * @param N numero entero 
	 */
	
	public static void posneg(int N) {
		
		if(N>0)
			System.out.println("El numero "+N+" es positivo");
		else if(N<0)
			System.out.println("El numero "+N+" es negativo");
		else
			System.out.println("Has introducido el 0");
		
	}

	//Programa principal
	public static void main(String[] args) {
		
		
		//Abrimos el lector
		Scanner teclado=new Scanner(System.in);
		
		try {
			
			System.out.print("Dime un numero: ");
			int num=teclado.nextInt();
			posneg(num);
			
		//Añadimos control de excepciones	
		}catch(Exception lupita) {
			System.out.println("ERROR, dato introducido incorrecto");
		}
		
		//Cerramos el lector
		teclado.close();

	}

}

package ejercicios;

import java.util.Scanner;

public class EJ03multiplo {


	/**
	 * procedimiento que muestra los multiplos de un numero entero
	 * @param a numero entero
	 */
	
	public static void multiplo(int a) {

		if(a>0) {
			if(a%2==0) 
				System.out.println("el numero "+a+" es multiplo de 2");
			if(a%3==0)
				System.out.println("el numero "+a+" es multiplo de 3");
			if(a%5==0)
				System.out.println("el numero "+a+" es multiplo de 5");
			if(a%7==0)
				System.out.println("el numero "+a+" es multiplo de 7");
			else 
				System.out.println("el numero "+a+" no es multiplo de 2,3,5 o 7");
		}else {
			System.out.println("el numero es 0 o negativo");
		}
	}




	public static void main(String[] args) {


		//Abrimos el lector
		Scanner teclado= new Scanner(System.in);

		try {

			System.out.println("Introduce un numero ");
			int num=teclado.nextInt();

			//Cerramos el lector
			teclado.close();
			//hacmos llamada al procedimiento 
			multiplo(num);
		}catch(Exception lupita) {
			System.out.println("Error, dato introducido invalido");
		}









	}

}

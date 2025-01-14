package scanner;

import java.util.Scanner;

public class LogitudyArea {
	
	final static double PI=3.141516;

	/**
	 * Funcion que devuelve la longitud de una circunferencia
	 * @param a numero entero
	 * @return longitud de la circunferencia
	 */

	public static double longit(int a) {
		return 2*PI*a;
	}

	/**
	 * Funcion que devuelve el area del circulo
	 * @param a numero entero
	 * @return area de un circulo
	 */
	
	public static double area(int a) {
		return PI*(a*a);
	}
	public static void main(String[] args) {

		//Creamos el lector 
		Scanner teclado = new Scanner(System.in);
		//Declaramos la variable de radio
		int radio;


		try {
			//Leemos el valor del radio introducido por el teclado
			System.out.print("Dime el radio: ");
			radio=teclado.nextInt();

			//Mostramos los resultados
			System.out.println("Longitud de la circunferencia de radio "+radio+" es: "+longit(radio));
			System.out.println("Area del circulo de radio "+radio+" es "+area(radio));

		}catch(Exception lupita) {
			System.out.println("Error en la entrada de datos");
		}



		//Cerramos el lector
		teclado.close();

	}

}

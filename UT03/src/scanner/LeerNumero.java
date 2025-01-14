package scanner;

import java.util.Scanner;

public class LeerNumero {

	public static void main(String[] args) {


		//Creamos el lector 
		Scanner teclado= new Scanner(System.in);

		//ahora mostramos una palabra
		System.out.print("Dime una palabra cualquiera: ");
		String palabra=teclado.nextLine();

		//Mostramos por pantalla el numero leido
		System.out.println("Has introducido la palabra "+palabra);

		//leemos desde teclado un numero entero
		System.out.print("\nDime un numero entero: ");
		int num=teclado.nextInt();

		//Mostramos por pantalla el numero leido
		System.out.println("Has introducido el "+num);

		//cerramos el lector
		teclado.close();
	}

}

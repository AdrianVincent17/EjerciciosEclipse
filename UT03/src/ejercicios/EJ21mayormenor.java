package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ21mayormenor {

	final static int valores=5;

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);


		int num;
		try {
			System.out.println("introduce "+valores+" valores enteros por teclado");

			System.out.println("Dime un valor: ");
			num=teclado.nextInt();

			int mayor,menor;
			mayor=menor=num;
			
			for(int i=1; i<valores; i++) {
				//Pedimos la introduccion por teclado de un numero
				System.out.println("Dime otro valor: ");
				num=teclado.nextInt();

				if(num<menor)
					menor=num;


				if(num>mayor)
					mayor=num;
			}
				System.out.println("El mayor valor introducido es: "+mayor);
				System.out.println("El menor valor introducido es: "+menor);
			
		}catch(InputMismatchException ime) {
			System.out.println("Error, dato introducido no valido");
		}

		teclado.close();


	}

}

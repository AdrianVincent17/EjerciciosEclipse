package scanner;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		//Introducimos un control de excepciones
		try {
			
			//Creamos el lector 
			Scanner teclado=new Scanner(System.in);
			//Leer desde teclado un numero entero
			System.out.print("Dime un valor entero: ");
			int num=teclado.nextInt();
			
			//Mostramos por pantalla el numero entero que hemos leido
			System.out.println("\nHas introducido el numero: "+num);
			
			
			//cerramos el lector
			teclado.close();
			
		//añañdimos una excepcion en forma de mensaje 
		}catch(Exception lupita) {
			System.err.println("Error, el dato introducido es incorrecto");
			System.err.println("Debes introducir un numero entero");
		}
		
		
		

	}

}

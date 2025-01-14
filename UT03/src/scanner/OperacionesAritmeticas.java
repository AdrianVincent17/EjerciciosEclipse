package scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperacionesAritmeticas {
	
	public static void operacionesArit(int a, int b) {
		
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));	
		System.out.println(a+" % "+b+" = "+(a%b));
		System.out.println(a+" / "+b+" = "+((float)a/b));
		
	}

	public static void main(String[] args) {
		
		
		//Creamos el lector 
		Scanner teclado=new Scanner(System.in);
		
		
		try {	
		//Instroduccion de dos numeros enteros
		System.out.println("Introduce dos numeros enteros");
		System.out.print("Introduce un numero: ");
		int a=teclado.nextInt();
		
		System.out.print("Introduce otro numero: ");
		int b=teclado.nextInt();
		
		/*	Mostramos el resultado de las operaciones aritmeticas
			Haciendo una llamada al procedimiento
		*/
		operacionesArit(a,b);
		
		/*	Añadimos control de excepciones con el error exacto 
			que queremos evitar
		*/
		}catch(InputMismatchException ime) {
			System.out.println("Error en la entrada de datos");
		}catch(ArithmeticException ae) {
			System.out.println("No se puede dividir entre 0");
		}
				
		teclado.close();
	}

}

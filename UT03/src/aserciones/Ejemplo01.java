package aserciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		try {

			System.out.println("Introduce la edad: ");

			num=teclado.nextInt();

			assert num>=0 && num<=120: "Edad fuera del rango permitido";

		}catch(InputMismatchException ime) {

			System.out.println("Error, dato no valido");

		}catch(AssertionError ae) {

			System.out.println(ae.getMessage());

		}finally{

			teclado.close();

		}
	}


}



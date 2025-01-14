package boletin2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ03 {

	/**
	 * Funcion que devuelve el resultado de un numero factorial
	 * @param N numero entero
	 * @return resultado del numero elegido
	 */

	public static int factorecurvo(int N) {

		if(N==1)
			return 1;
		return N*factorecurvo(N-1);

	}

	/**
	 * Funcion de devuelve el mayor divisor 
	 * @param N numero entero
	 * @return devuelve el mayor divisor
	 */
	public static int mayordiv(int N) {


		int num=Math.abs(N);

		int md=1;

		for(int i=2; i<=num/2; i++)
			if(num%i==0)
				md=i;

		return md;

	}

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);

		try {
			
			int num;
			do {
				System.out.print("Dime un numero: ");
				num=teclado.nextInt();
				
				if (num<0)
					System.out.println("error, numero negativo no valido");

			}while(num<1 || num>10);
			
		
			if(num%2==0)
				System.out.println("> "+num+" ES PAR");
			else
				System.out.println("> "+num+" ES IMPAR");
			
			System.out.println("> "+num+"! = "+factorecurvo(num));
			System.out.println("> Mayor divisor de "+num+" es "+mayordiv(num));
			
			
		}catch(InputMismatchException lupita) {
			System.out.println(">> ERROR, dato introducido no valido");

		}catch(AssertionError ea) {
			System.out.println(ea.getMessage());

		}finally {
			teclado.close();
		}

	}

}

package ejercicios;

import java.util.Scanner;

public class EJ07pidenum {

	public static void main(String[] args) {


		Scanner teclado = new Scanner(System.in);
		int num;
		do {
			System.out.println("introduce un numero: ");
			num=teclado.nextInt();
		}while(num>=0 && num>10);
		System.out.println("Has introducido el numero "+num);
		
		
		
		
		teclado.close();

	}

}

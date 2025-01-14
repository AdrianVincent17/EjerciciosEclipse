package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ30primoOno {
	
	/**
	 * funcion que devuelve verdadero o falso al introducir un numero y ser primo o no
	 * @param N numero entero
	 * @return TRUE si es primo y FALSE si no lo es 
	 */
	
	public static boolean esprimo(int N) {
		
		if(N<=1) {
			return false;
		}else
			for(int i=2; i<=N/2; i++) {
				if(N%i==0)
					return false;
			}return true;
		
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num;
		try {
			System.out.print("dime un numero: ");
			num=teclado.nextInt();
			
			while(num!=0){
				if(num<0)
					System.out.println(">> ERROR, No es un numero positivo");
				else
					if(esprimo(num))
						System.out.println("> Es primo");
					else {
						System.out.println("> No es primo");
					}	
				System.out.print("dime otro numero: ");
				num=teclado.nextInt();
				
			}
				System.out.println("FIN");
			
			
			
			
		}catch(InputMismatchException ime) {
			System.out.println("Error, dato no valido");
		}
		
		
		
		
		teclado.close();

	}

}

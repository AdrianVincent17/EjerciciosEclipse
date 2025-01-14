package ejercicios;

import java.util.Scanner;

public class EJ01menor {
	
	/**
	 * funcion que devuelve el menor de los numeros enteros pasados como parametro
	 * @param a numero entero
	 * @param b numero entero
	 * @return a si es menor que b o b si es menor que a
	 */
	
	public static int menor(int a, int b) {
		if(a<b)
			return a;
		return b;
	}

	public static void main(String[] args) {
		
		
		//Abrimos lector
		Scanner teclado = new Scanner(System.in);
		
		try {
			
			System.out.println("Vamos a determinar el menor entre dos numeros");
			System.out.println("Dime un numero entero: ");
			int num=teclado.nextInt();
			
			System.out.println("Dime otro numero entero: ");
			int num2=teclado.nextInt();
			
			//Cerramos el lector
			teclado.close();
			
			System.out.println("El menor de los dos numero entre "+num+" y "+num2+" es: "+menor(num,num2));
			
			
			
		}catch(Exception lupita) {
			System.out.println("ERROR, dato introducido no valido");
		}
		
		
		
		
		

	}

}

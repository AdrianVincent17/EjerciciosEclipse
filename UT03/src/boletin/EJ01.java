package boletin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ01 {
	
	/**
	 * funcion que determina el mayor de dos numeros introducidos como parametro
	 * @param a numero entero
	 * @param b numero entero
	 * @return el mayor de los dos numeros
	 */
	
	public static int mayor(int a, int b) {
		
		if(a>b)
			return a;
		return b;
	}
	
	
	/**
	 * Funcion que devuelve el mayor de tres numeros introducidos como parametro
	 * @param a numero entero
	 * @param b numero entero
	 * @param c numero entero
	 * @return mayor de los tres
	 */
	
	public static int mayor(int a, int b, int c) {
		
		return mayor(mayor(a,b),c);
	}
	
	/**
	 * funcion que devuelve el mayor de cuatro numeros introducidos como parametro
	 * @param a numero entero
	 * @param b numero entero
	 * @param c numero entero
	 * @param d numero entero
	 * @return devuelve el mayor de cuatro 
	 */
	
	public static int mayor(int a, int b, int c, int d) {
		
		return mayor(mayor(a,b),mayor(c,d));
	}

	public static void main(String[] args) {
		
		//abrimos lector
		Scanner teclado= new Scanner(System.in);
		
		try {
			//pedimos cuatro numeros por teclado
			System.out.print("Dime el primer numero: ");
			int num=teclado.nextInt();
			System.out.print("Dime el segundo numero: ");
			int num2=teclado.nextInt();
			System.out.print("Dime el tercer numero: ");
			int num3=teclado.nextInt();
			System.out.print("Dime el cuarto numero: ");
			int num4=teclado.nextInt();
			
			//cerramos el lector
			teclado.close();
			//mostramos resultado
			System.out.println("> Mayor numero introducido: "+mayor(num,num2,num3,num4));
			
		}catch(InputMismatchException ime) {
			System.out.println("Error, dato no valido");
		}
		
		
		
		
		
		
	}

}

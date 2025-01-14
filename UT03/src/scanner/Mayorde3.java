package scanner;

import java.util.Scanner;

public class Mayorde3 {
	
	/**
	 * Funcion que no da el mayor de lo valores pasados por parametro
	 * @param a numero entero
	 * @param b numero entero
	 * @return devuelve el mayor entre los dos 
	 */
	
	public static int mayor(int a,int  b) {
		
		if(a>b)
			return a;
		return b;
	}
	
	
	/**
	 * funcion que devuelve el mayor valor introducido por parametro
	 * @param a numero entero
	 * @param b numero entero
	 * @param c numero entero
	 * @return devuelve el mayor de los tres parametros
	 */
	public static int mayor(int a, int b, int c) {
		
		if(a>b) {
			if(a>c)
				return a;
			return c;
		}else if(b>c)
				return b;
			return c;
	}
	

	public static void main(String[] args) {
		
		//Creamos el lector
		Scanner teclado = new Scanner(System.in);
		
		try {
			
			System.out.println("Dime tres numeros y te digo cual es mayor: ");
			System.out.print("Primer numero: ");
			int num=teclado.nextInt();
			
			System.out.print("Segundo numero: ");
			int num2=teclado.nextInt();
			
			System.out.print("tercer numero: ");
			int num3=teclado.nextInt();
			
			System.out.print("El mayor dentre "+num+ " , "+num2+" y "+num3+" es "+mayor(mayor(num, num2),num3));
			
		}catch(Exception lupita) {
			System.out.println("Error en la entrada de datos");
		}
		
		
		teclado.close();

	}

}

package ejercicios;

import java.util.Scanner;

public class EJ02menorde3 {
	
	public static int menor(int a, int b) {
		if (a<b)
			return a;
		return b;
	}
	
	public static int menor(int a, int b, int c) {
		
		return(menor(menor(a,b),c));
	}


	public static void main(String[] args) {
		
		//Abrimos el lector
		Scanner teclado = new  Scanner(System.in);
		
		try {
			
		System.out.println("Vamos a determinar el menor entre tres numeros ");
		System.out.println("Dime el primer numero: ");
		int num=teclado.nextInt();
		
		System.out.println("Dime el segundo numero: ");
		int num2=teclado.nextInt();
		
		System.out.println("Dime el tercer numero: ");
		int num3=teclado.nextInt();
		
		teclado.close();
		
		System.out.println("El menor de los tres numeros entre \n"+num+" "+num2+" "+num3+" es "+menor(num,num2,num3));
		//Cerramos el lector
		
		
		}catch(Exception lupita) {
			System.out.println("Error, dato introducido no valido");
		}
		
		
		
		
		
		
	}

}

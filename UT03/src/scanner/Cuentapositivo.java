package scanner;

import java.util.Scanner;

public class Cuentapositivo {
	
	public static void cuentahastaN(int N) {
	
		if(N>0) {
		System.out.println("\nContamos desde 1 hasta "+N+" (bucle FOR)");
		for(int conta=1; conta<=N; conta++)
			System.out.print(conta+" ");
		}else {
			System.out.println("Has introducido un numero negativo");
		}
	}

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		
		try {
			
			System.out.print("Dime un numero positivo: ");
			int num=teclado.nextInt();
			
			teclado.close();
			
			int conta;
			conta=1;
			
			if(num>0) {
				
				System.out.println("\nContamos desde 1 hasta "+num+" (bucle WHILE)");
				while(conta<=num) {
					System.out.print(conta+" ");
				conta++;	
			
				}
			
			System.out.println("\nContamos desde 1 hasta "+num+" (bucle  DO WHILE)");
			conta=1;
			do {
				System.out.print(conta+" ");
				conta++;
			}while(conta<=num);
			
			
			System.out.println("\nContamos desde 1 hasta "+num+" (bucle FOR)");
			for( conta=1; conta<=num; conta++)
				System.out.print(conta+" ");
			
			cuentahastaN(num);
		}else {
				System.out.println("numero negativo o cero");
			}
		}catch(Exception lupita) {
			System.out.println("Error dato introducido incorrecto");
		}
		
		
		
	}

}

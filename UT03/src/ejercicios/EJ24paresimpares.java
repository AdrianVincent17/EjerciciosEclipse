package ejercicios;

import java.util.Scanner;

public class EJ24paresimpares {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		try {
			int num, pares=0, impares=0;
			System.out.println("Dime un numero entero: ");
			num=teclado.nextInt();
			while(num!=0) {
				
				if(num%2==0) 
					pares++;
				else
					impares++;
				
				System.out.println("Dime otro entero: ");
				num=teclado.nextInt();
				
				
			}
			System.out.println("numero total de pares: "+pares);
			System.out.println("numero total de impares: "+impares);
			
		}catch(Exception lupita) {
			System.out.println("erro, dato no valido");
		}
		
		
		teclado.close();

	}

}

package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ32divisorescorrectos {
	
	public static int mayordiv(int N) {
		

		int num=Math.abs(N);
		
		int md=1;
		
			for(int i=2; i<=num/2; i++)
				if(num%i==0)
					 md=i;
			
			return md;
		
	}

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			int correctos=0; int fuera=0;
			System.out.println("Dime un numero positivo entre 1 y 100");
			int num=teclado.nextInt();
			while(num!=0) {
				
				if(num>=1 && num<=100) {
					System.out.println("El mayor divisor de "+num+" es "+mayordiv(num));
					correctos++;
				}else {
					System.out.println("Error, debes introducir un numero en rango");
					fuera++;
				}
				
				System.out.println("Dime un numero positivo entre 1 y 100");
				num=teclado.nextInt();	
				
			}
			System.out.println("FIN");
			System.out.println("Numeros correctos: "+correctos);
			System.out.println("Fuera de rango: "+fuera);
			
		}catch(InputMismatchException ime) {
			System.out.println("Error, dato no valido");
			
		}finally {
			teclado.close();
		}
		
		
		
		

	}

}

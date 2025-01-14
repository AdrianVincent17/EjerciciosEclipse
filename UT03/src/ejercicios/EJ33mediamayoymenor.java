package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ33mediamayoymenor {

	public static void main(String[] args) {


		Scanner teclado =new Scanner(System.in);
		
		try {
			int N, num, mayor, menor, suma = 0;
			do {
				System.out.print("Dime un numero positivo");
				N=teclado.nextInt();
			}while(N<=0);
			
				System.out.print("(1) Dime un numero: ");
				num=teclado.nextInt();
				
				mayor=menor=num;
				
				for(int i=2; i<=N; i++) {
					System.out.print("("+i+") Dime un numero: ");
					num=teclado.nextInt();
					
					suma+=num;
					if(num>mayor)
						mayor=num;
					if(num<menor)
						menor=num;
				}
				System.out.println("media: "+(float)suma/N);
				System.out.println("Mayor: "+mayor);
				System.out.println("Menor: "+menor);
			
		}catch(InputMismatchException lupita) {
			System.out.println("Error, dato no valido");
		}
		
		
		teclado.close();

	}

}

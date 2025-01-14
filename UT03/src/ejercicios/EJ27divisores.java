package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ27divisores {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		try {
			int num;
			do {
				System.out.print("Dime un valor positivo: ");
				num=teclado.nextInt();
				
			}while(num<=0);
			
			System.out.println();
			for(int i=1; i<=num; i++) {
				if(num%i==0)
				System.out.print(i+" ");
			}
		}catch(InputMismatchException ime) {
			System.out.println("Error, dato no valido");
			
		}
		

		teclado.close();
	}

}

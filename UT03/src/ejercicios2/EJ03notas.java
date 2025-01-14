package ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ03notas {
	
	public static void notas(int N) {
		
		switch(N) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:System.out.println("INSUFICIENTE");break;
		case 5:System.out.println("SUFICIENTE");break;
		case 6:
		case 7:System.out.println("BIEN");break;
		case 8:
		case 9:System.out.println("NOTABLE");break;
		case 10:System.out.println("SOBRESALIENTE");break;
		}
	}

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		try {
			int num;
			do {
				System.out.print("Dime una nota: ");
				num=teclado.nextInt();
			}while(num<0 || num>10);
			
				notas(num);
		
		
		}catch(InputMismatchException lupita) {
			System.out.println("Error, dato no valido");
		}finally {
			teclado.close();
		}
	}

}

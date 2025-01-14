package ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ02capicua {
	
	/**
	 * funcion que indica si un numero de 5 cifras es o no capicua
	 * un numero es capicua si se lee igual de izquierda a derecha que de derecha a izquierda
	 * @param N numero entero
	 * @return TRUE si N es capicua, y FALSE si no lo es
	 */
	public static boolean escapicua(int N) {
		
		int u,d,c,um,dm;
		int num;
		
		u=N%10;
		num=N/10;
		d=num%10;
		num=num/10;
		c=num%10;
		num=num/10;
		um=num%10;
		num=num/10;
		dm=num%10;
		num=num/10;
		
		if(dm==u && um==d) 
			return true;
		if(dm==0 && um==u && d==c)
			return true;
		if(dm==0 && um==0 && c==u)
			return true;
		if(dm==0 && um==0 && c==0 && u==d)
			return true;
		
		return false;
	
	}

	

	

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		int num;
		try {
			do {
				
				System.out.println("Dime un numero: ");
				num=teclado.nextInt();
				
				
				
			}while(num<1 || num>99999) ;
			
			if(escapicua(num))
				System.out.println("Es capicua");
			else
				System.out.println("No es capicua");
			
			
		}catch(InputMismatchException lupita) {
			System.out.println();
		}catch(AssertionError ea) {
			System.out.println(ea.getMessage());
		}finally {
			teclado.close();
		}
		
		
		

	}

}

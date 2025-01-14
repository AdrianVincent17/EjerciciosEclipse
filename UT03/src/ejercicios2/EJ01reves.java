package ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ01reves {
	
	public static void delreves(int N) {
		int unidades, decenas, centenas;
		
		centenas=N/100;
		unidades=N%100;
		
		decenas=unidades/10;
		unidades%=10;
		
		
		if(centenas>0)
			System.out.println(unidades+""+decenas+""+centenas);
		else if(decenas>0)
			System.out.println(unidades+""+decenas);
		else
			System.out.println("Error, numero menor de 10");
		
		assert N<1 || N>999: "Numero fuera de rango";
		assert N<1: "Error, numero menor de 10";
		
	}

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
	
		try {
			int num;
			
			do {
			System.out.println("Dime un numero del 1 al 999");
			num=teclado.nextInt();
			}while(num<1 || num>999);
			
			if(num>=1 && num<=999) {
				delreves(num);
			}
			
			
		}catch(InputMismatchException lupita) {
			System.out.println("Error, dato no valido");
		}catch(AssertionError ea) {
			System.out.println(ea.getMessage());
		}finally {
			teclado.close();
		}
		
		
		

	}

}

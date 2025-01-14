package ejercicios;

import java.util.Scanner;

public class EJ22hasta0 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		try {
			int num, mayor, menor;
			
			System.out.println("Dime un numero: ");
			num=teclado.nextInt();
			
			if(num!=0) {
				
				mayor=num; menor=num;
				while(num!=0) {
					
					if(num>mayor)
						mayor=num;
					if(num<menor)
						menor=num;
				System.out.println("dime otro numero: ");
				num=teclado.nextInt();
				}
				System.out.println("mayor numero introducido es: "+mayor);
				System.out.println("menor numero introducido es: "+menor);
			
			}else
				System.out.println("has introducido el cero");
			
		}catch(Exception lupita) {
			System.out.println("Error, dato no valido");
		}
		
		
		teclado.close();

	}

}

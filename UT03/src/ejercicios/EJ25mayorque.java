package ejercicios;

import java.util.Scanner;

public class EJ25mayorque {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int num, mayor, menor, errores;
		errores=0;
		
		try {
			
			System.out.println("introduce un numero mayor cada vez: ");
			System.out.println("empezamos con el primero: ");
			num=teclado.nextInt();
			mayor=menor=num;
			while(num!=0) {
				
				System.out.println("otro numero: ");
				num=teclado.nextInt();
				if(num!=0) {
					
				if(num>mayor) {
					mayor=num;
				}else {
					System.out.println("el numero: "+num+" no es mayor que: "+mayor);
					errores++;
				}
				}
			}
				System.out.println("Errores: "+errores);
			
		}catch(Exception lupita) {
			System.out.println("Error, dato no valido");
		}
		
		
		teclado.close();

	}

}

package scanner;

import java.util.Scanner;

public class Descuento {

	public static void main(String[] args) {
		
		
		try {
			
			Scanner teclado=new Scanner(System.in);
			System.out.print("Nombre del producto: ");
			String palabra=teclado.nextLine();
			
			System.out.print("Precio (€): ");
			float precio=teclado.nextFloat();
			
			System.out.print("Descuento (%): ");
			int desc=teclado.nextInt();
			
			float pf=precio*(100-desc)/100;
			System.out.println("Precio final del producto "+palabra+" es: "+pf+"€");
			
			
			teclado.close();
			
			
		}catch(Exception lupita) {
			System.out.println("Dato introducido incorrecto");
		}
		

	}

}

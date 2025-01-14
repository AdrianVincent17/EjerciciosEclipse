package scanner;

import java.util.Scanner;

public class PrecioyDescuento {
	
	

	public static void main(String[] args) {
		
		//Creamos el lector
		Scanner teclado=new Scanner(System.in);
		
		try {
			System.out.print("Dime un precio: ");
			float precio=teclado.nextFloat();
			
			System.out.print("Dime un descuento: ");
			int descuento=teclado.nextInt();
			
			double descuentototal=precio*descuento/100;
			double preciofinal=precio-descuentototal;
			
			System.out.print("\nPrecio (€): "+precio);
			System.out.print("\ndescuento (%): "+descuento);
			System.out.print("\ndescuento (€): "+descuentototal);
			System.out.print("\nPrecio final (€): "+preciofinal);
			
			
			
			
		}catch(Exception lupita) {
			System.err.println("ERROR, Dato introducido incorrecto");
		}
		
		
		
		
		teclado.close();

	}

}

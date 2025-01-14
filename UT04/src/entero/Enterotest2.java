package entero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Enterotest2 {

	public static void main(String[] args) {
		
		
		Entero num=new Entero();
		
		Scanner teclado=new Scanner(System.in);
	
		try {
			
			System.out.print("Dime un numero entero: ");
			num.setNumero(teclado.nextInt());
			
			if(!num.escero())
				System.out.println("Valor del numero "+num.getNumero());
			else
				System.out.println("Valor del numero "+num.getNumero()+ " (CERO)");
			
				
				
			
			if(num.espositivo())
				System.out.println("El numero "+num.getNumero()+" es positivo");
			else
				System.out.println("El numero "+num.getNumero()+" es negativo");
			
			
			
			
			
		}catch(InputMismatchException lupita) {
			System.out.println("Error, tipo de dato introducido no valido.");
			
		}finally {
			teclado.close();
		}
		

	

	}

}

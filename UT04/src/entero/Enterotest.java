package entero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Enterotest {

	public static void main(String[] args) {
		
		Entero e=new Entero();
		Scanner teclado=new Scanner(System.in);
	
		try {
			
			System.out.println("Nº entero inicial: "+e.getNumero());
			
			e.setNumero(12);
			System.out.println("Nº entero actualizado: "+e.getNumero());
			
			if(e.espositivo())
				System.out.println("El numero "+e.getNumero()+" es positivo");
			else
				System.out.println("El numero "+e.getNumero()+" es negativo");
			
			
			
			
			
		}catch(InputMismatchException lupita) {
			System.out.println("Error, tipo de dato introducido no valido.");
			
		}finally {
			teclado.close();
		}
		

	}

}

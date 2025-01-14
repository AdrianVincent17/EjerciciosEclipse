package aserciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {

		//Abrimos el lector
		Scanner teclado = new Scanner(System.in);
		
		try {
			//Pedimo la introduccion por teclado de un numero positivo
			System.out.println("Introduce un numero positivo: ");
			int N=teclado.nextInt();
			
			//asercion para verificar que el numero es positivo
			assert N>0: "No has introducido un numero positivo";
			
			for(int i=1; i<=N; i+=2) {
				System.out.println(i+" ");
			}
				
			
			
		}catch(InputMismatchException ime) {
			System.out.println("Error, dato no valido");
		}catch(AssertionError ae) {
			System.out.println(ae.getMessage());
		}finally {
			//Cerramos el lector
			teclado.close();
		}
		
		
		

	}

}

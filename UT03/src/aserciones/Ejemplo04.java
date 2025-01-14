package aserciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {
		
		
		Scanner teclado= new Scanner(System.in);
		int horas, min, sec;
		
		try {
			
			 System.out.println("Dime las horas: ");
			 horas=teclado.nextInt();
			 assert horas >=0 && horas<=23: ">>Las horas nos son correctas";
			 
			 System.out.println("Dime las minutos: ");
			 min=teclado.nextInt();
			 assert min >=0 && min<=59: ">>Los minutosw nos son correctos";
			 
			 System.out.println("Dime las sec: ");
			 sec=teclado.nextInt();
			 assert sec >=0 && sec<=59: ">>Los segundos nos son correctos";
		
			 
			 
			 System.out.println("La hora introducida es correcta");
			 
			
			 
			
			
		}catch(InputMismatchException ime) {
			System.out.println("Error, dato no valido");
		}catch(AssertionError ea) {
			System.out.println(ea.getMessage());
		}
		
		
		
		teclado.close();

	}

}

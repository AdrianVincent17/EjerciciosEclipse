package estudiantes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Estudiantetest {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		try {
			
			System.out.print("\nNombre del estudiante: ");
			String nombre=teclado.nextLine();
			System.out.print("Introducir la nota de la 1ª Evaluacion (1-10): ");
			int nota1=teclado.nextInt();
			System.out.print("Introducir la nota de la 2ª Evaluacion (1-10): ");
			int nota2=teclado.nextInt();
			System.out.print("Introducir la nota de la 3ª Evaluacion (1-10): ");
			int nota3=teclado.nextInt();
			
			Estudiante e= new Estudiante(nombre,nota1,nota2,nota3);
			
			
			System.out.println();
			e.mostraestudiante();
			
			System.out.print("Estado: ");
			
			if(e.aprueba()) 
				System.out.print("Aprueba\\n");
			else 
				System.out.print("Suspende\n");

			
		}catch(InputMismatchException lupita) {
			System.out.println("Error, tipo de dato introducido incorrecto");
		}catch(AssertionError ea) {
			System.out.println(ea.getMessage());
			
		}finally {
			teclado.close();
		}
		
		
		
		
	}

}

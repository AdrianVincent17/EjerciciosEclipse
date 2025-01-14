package scanner;

import java.util.Scanner;

public class Leerdatos {

	public static void main(String[] args) {
		
		
		Scanner teclado=new Scanner(System.in);
		
		try {
			//Leemos el nombre del alumno(cadena de caracteres)
			System.out.print("Datos del alumno: \nNombre: ");
			String nombre=teclado.nextLine();
			
			//Leemos la edad del alumno(numero entero)
			System.out.print("Edad: ");
			int edad=teclado.nextInt();
			
			//Leemos la nota media del alumno(float)
			System.out.print("Nota media: ");
			float nota=teclado.nextFloat();
			
			//Mostramos por pantalla los datos introducidos por teclado
			System.out.println("El alumno "+nombre+" de edad "+edad+" tiene una nota media de "+nota);
			
		//añadimos una excepcion en caso de introducir mal los datos	
		}catch(Exception lupita){
			System.err.println("Error en la introduccin de datos");
		}
		
		//Cerramos el lector
		teclado.close();

	}

}

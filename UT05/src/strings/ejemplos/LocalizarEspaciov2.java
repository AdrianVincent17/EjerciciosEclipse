package strings.ejemplos;

import java.util.Scanner;

public class LocalizarEspaciov2 {

	public static void main(String[] args) {
		
		//1. Pedimos al usuario que introduzca su nombre y apellidos por teclado
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dime tu nombre y apellidos: ");
		String nombre=teclado.nextLine().trim();
		
		teclado.close();

		//2. mostramos por pantalla el nombre y el paellido por separado
		int pos = nombre.indexOf(' ');
		
		

		if(pos>=0) {
			System.out.println("Nombre: "+nombre.substring(0,pos));
			System.out.println("Apellido: "+nombre.substring(pos+1));
		}else 
			System.out.print("Nombre introducido: "+nombre);

	}

}

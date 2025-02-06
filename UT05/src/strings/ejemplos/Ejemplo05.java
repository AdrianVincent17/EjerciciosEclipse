package strings.ejemplos;

import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Introduce una cadena de caracteres: ");
		String cadena=sc.nextLine();
		sc.close();
		
		//2. Transformamos el string a un array de caracteres
		
		char[]array = cadena.toCharArray();
		
		//3. Mostramos el primer caracter del String y el primero del array 
		
		System.out.println("Primer caracter del String "+cadena.charAt(0));
		System.out.println("Primer caracter del array "+array[0]);
		
		//4. Mostramos elultimo caracter del string y el ultimo del array
		
		System.out.println("Primer caracter del String "+cadena.charAt(cadena.length()-1));
		System.out.println("Primer caracter del array "+array[array.length-1]);
		
		// 5. Mostramos el String y mostramos el array
		
		System.out.println("String "+cadena);
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]);
		
		
	}

}

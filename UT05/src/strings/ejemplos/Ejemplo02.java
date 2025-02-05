package strings.ejemplos;

import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Dime tu nombre: ");

		String nombre = sc.nextLine();

		sc.close();



		//1. Mostramos el nombre por pantalla

		System.out.println("Nombre: "+nombre);



		//2. Número de caracteres de la cadena

		System.out.println("Longitud: "+nombre.length()+" caracteres");



		//3. Nombre en mayusculas y en minúsculas

		System.out.println("En mayúsculas: "+nombre.toUpperCase());

		System.out.println("En minúsculas: "+nombre.toLowerCase());



		//4. Nombre + Apellidos

		nombre.concat(" Apellido");

		System.out.println("Nombre y apellido: "+nombre.concat(" Apellido"));



		//5. Mostramos la inicial y la última letra del nombre

		System.out.println("Inicial: "+nombre.charAt(0));

		System.out.println("Inicial: "+nombre.charAt(nombre.length()-1));



		//6. Mostramos el nombre intercalando espacios en blanco

		System.out.print("Espaciado: ");

		for(int i=0; i<nombre.length();i++)

			System.out.print(nombre.charAt(i)+" ");



		//7. Mostramos el nombre del reves

		System.out.print("\nNombre al reves: ");

		for(int i=nombre.length()-1; i>=0;i--)

			System.out.print(nombre.charAt(i));



		//8. Imprimimos solo las vocales

		System.out.println("\nVocales: ");

		char c;

		for(int i=0; i<nombre.length();i++) {

			c=nombre.charAt(i);

			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')

				System.out.println(c+" ");

		}

	}



}



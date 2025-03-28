package strings;

import java.util.Scanner;

public class Repaso {

	/**
	 * Funcion que cuenta el numero de vocales de una cadena pasada como parametro
	 * @param nombre -  cadena de caracteres
	 * @return numero de vocales
	 */

	public static int numvocales(String nombre) {

		int conta=0;
		char c;

		for(int i=0; i<nombre.length(); i++) {
			c=nombre.toUpperCase().charAt(i);

			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
				conta++;
		}
		return conta;
	}
	/**
	 * Funcion que cuenta el numero de vocales de una cadena pasada como parametro
	 * @param nombre -  cadena de caracteres
	 * @return numero de vocales
	 */

	public static int numconsonantes(String nombre) {

		int conta=0;
		char c;

		for(int i=0; i<nombre.length(); i++) {
			c=nombre.toUpperCase().charAt(i);

			if(c>='B' && c<='Z') {
				if(c!='A' && c!='E' && c!='I' && c!='O' && c!='U')
					conta++;
			}
		}
		return conta;
	}

	public static String consonantes(String nombre) {

		String consonantes="";
		char c;

		for(int i=0; i<nombre.length(); i++) {
			c=nombre.charAt(i);

			if(c>='B' && c<='Z') {
				if(c!='A' && c!='E' && c!='I' && c!='O' && c!='U')
					consonantes+=c;
			}
			if(c>='b' && c<='z') {
				if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u')
					consonantes+=c;
			}


		}
		return consonantes;

	}

	public static String vocales(String nombre) {

		String vocales="";
		char c;

		for(int i=0; i<nombre.length(); i++) {
			c=nombre.charAt(i);

			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {

				vocales+=c;
			}
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {

				vocales+=c;
			}


		}
		return vocales;

	}

	/**
	 * Funcion que devuelve una cadena de caracteres donde se ha eliminado un caracter
	 * @param cad - String
	 * @param c - char
	 * @return cad sin el caracter c
	 */

	public static String eliminarcaracter(String cad, char c) {

		String res="";
		for(int i=0; i<cad.length(); i++) {
			if(cad.charAt(i)!=c)
				res+=cad.charAt(i);
		}
		return res;

	}


	/**
	 * Funcion que elimina una subcadena que contiene la cadena principal y devuelve la cadena sin la subcadena
	 * @param cad - cadena 
	 * @param subcad -subcadena
	 * @return cadena sin la subcadena elegida
	 */
	public static String eliminarcadena(String cad, String subcad) {

		if(cad.indexOf(subcad)!=-1)
			cad=cad.replace(subcad, "");

		if(cad.indexOf("  ")!=-1)
			while(cad.indexOf("  ")!=-1)
				cad=cad.replace("  "," ");
		return cad;
	}

	public static boolean encontrado(char[] m, int valor) {
		int i;
		//Recorremos todos los valores almacenados en filas anteriores
		for(i=0; i<m.length; i++) {
			if(m[i]==valor) 
				return true;	
		}
		return false;
	}


	public static void main(String[] args) {


		// Pedimos al usuario que introduczca su nombre
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce tu nombre: ");
		String nombre=sc.nextLine();
		System.out.print ("introduce cadena a eliminar: ");
		String nombreeli=sc.nextLine();

		String eli=eliminarcadena(nombre, nombreeli);

		System.out.println(eli);

		//Mostramos informacion sobre el nombre introducido

		System.out.print("\n> Nombre: "+nombre);

		//Mostramos la cadena en mayusculas
		System.out.print("\n> Nombre en mayusculas: "+nombre.toUpperCase());

		//Mostramos la cadena en minusculas
		System.out.print("\n> Nombre en minusculas: "+nombre.toLowerCase());

		//Mostramos el numero de vocales de nuestro nombre
		System.out.print("\n> Cantidad de vocales: "+numvocales(nombre));

		//Mostramos un String con solo las vocales de nuestro nombre
		System.out.print("\n> Vocales: "+vocales(nombre));
		


		//Mostramos el numero de consonantes de nuestro nombre
		System.out.print("\n> Cantidad de consonantes: "+numconsonantes(nombre));

		//Mostramos un String con solo las consonantes de nuestro nombre
		System.out.print("\n> Consonantes: "+consonantes(nombre));

		//Leer por teclado un caracter
		System.out.print("\n> Dime un caracter a eliminar del nombre: ");
		char c=sc.nextLine().charAt(0);

		sc.close();

		//Elminimamos el caracter leido del nombre

		System.out.println("> nombre sin "+c+": "+eliminarcaracter(eli,c));



	}

}

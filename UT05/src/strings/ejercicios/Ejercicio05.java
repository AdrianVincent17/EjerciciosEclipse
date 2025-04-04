package strings.ejercicios;

import java.util.Scanner;

public class Ejercicio05 {


	/**
	 * Indica si un caracter pasado com parametro es una vocal 
	 * @param c - caracter 
	 * @return TRUE si c es una vocal (a, e, i, o, u, y sus mayusculas correspondientes) y FALSE en caso contrario
	 */
	public static boolean esVocal(char c) {
		
		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			return true;
		if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
			return true;
		return false;
	}

	/**
	 * Indica si un caracter pasado como parametro es una consonante 
	 * @param c - caracter 
	 * @return TRUE si c es una consonante y sus mayusculas correspondientes, y FALSE en caso contrario
	 */
	public static boolean esConsonante(char c) {
		
		
		if(esVocal(c))
			return false;
		
		if(c>='b' && c<='z')

			return true;
		if(c>='B' && c<='Z')

			return true;

		// en caso de que sea cualquier otro caracter
		return false;

	}

	public static void main(String[] args) {


		Scanner sc =new Scanner(System.in);


		System.out.print("Introduce cadena: ");
		String cadena=sc.nextLine();
		sc.close();


		//2. Declaramos e inicializamos las variables contadores

		int blancos=0; 			//Contador de espacios en blanco
		int vocales=0;			//Contadore de vocales
		int consonantes=0; 		//Contador de consonantes

		//3. Recorremos la cadena caracter a caracter para realizar el conteo
		for(int i=0; i<cadena.length(); i++) {
			
			if(cadena.charAt(i)==' ') 
				blancos++;
			
			if(esVocal(cadena.charAt(i)))
				vocales++;
			
			if(esConsonante(cadena.charAt(i))) 
				consonantes++;
				
		

		}

		//4. Mostramos los resultados
		System.out.println("> Espacios en blanco: "+blancos);
		System.out.println("> Vocales: "+vocales);
		System.out.println("> Consonantes: "+consonantes);




	}

}

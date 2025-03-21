package strings.ejercicios;

import java.util.Scanner;

public class Palindromo {
	
	/**
	 * funcion que devuelve un boleano true o false si la palabra es o no un palindromo
	 * @param cad palabra pasada como parametro
	 * @return TRUE si es palindromo FALSE si no lo es
	 */
	
	public static boolean esPalindromo(String cad) {
		
		//pasamos la cadena a mayusculas y eliminamos los espacios en blanco del principio y final
		cad=cad.toUpperCase().replace(" ", "").trim();
		
		//ahora le daremos la vuelva a la cadena utilizando la funcion StringBuffer
		StringBuffer invertida=new StringBuffer(cad);
		
		//y ahora devolvemos la cadena como String
		String espejo= invertida.reverse().toString();
		
		//por ultimo retornamos el booleano comparando ambas palabras y si son iguales entonces sera palindromo
		return cad.equals(espejo);
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		//Pedimos un nombre por teclado
		System.out.print("Dime un nombre: ");
		String palabra = sc.nextLine();
		
		//creamos condicional y mostrara si es correcta o no la funcion si es palindromo o no
		if(esPalindromo(palabra))
			System.out.println("La palabra "+palabra.toUpperCase()+" es palindromo");
		else
			System.out.println("La palabra "+palabra.toUpperCase()+" no es palindromo");
		sc.close();

	}

}

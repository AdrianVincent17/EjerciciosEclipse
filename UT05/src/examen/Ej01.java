package examen;

import java.util.Scanner;

public class Ej01 {
	
	public static boolean espalindromo(String cadena) {
		 
		cadena=cadena.replace(" ","").trim().toLowerCase();
		
		StringBuffer cadenita=new StringBuffer(cadena);
		
		String invertida=cadenita.reverse().toString();
		
		return cadena.equals(invertida);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime una frase: ");
		String frase=sc.nextLine().trim().toLowerCase();
		
		if(espalindromo(frase))
			System.out.println("\n> La frase introducida es un PALINDROMO");
		else
			System.out.println("\n> La frase introducida NO es un palindromo");
		
		sc.close();

	}

}

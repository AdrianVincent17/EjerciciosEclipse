package strings.ejemplos;

import java.util.Scanner;

public class Ejemplo01 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.print("Dime tu primer nombre: ");
		String nombre1=sc.nextLine();

		System.out.print("Dime tu segundo nombre: ");
		String nombre2=sc.nextLine();


		sc.close();
		
		//Comprobamos si son iguales
		
		//Este primer metodo con el igual no compara las cadenas de caracteres si no el espacio en memoria 
		//por tanto si no estan en el mismo espacio de memoria siempre te dira que son distintos
		
		if(nombre1==nombre2)
			System.out.println(nombre1+" y "+nombre2+" son iguales");
		else
			System.out.println(nombre1+" y "+nombre2+" son distintos");
		

		//En este segundo metodo si compara los contenidos y por tanto si tendra efecto el resultado que queremos
		
		if(nombre1.equals(nombre2))
			System.out.println(nombre1+" y "+nombre2+" son iguales");
		else
			System.out.println(nombre1+" y "+nombre2+" son distintos");
		
		//Tamaño del String 
		
		System.out.println(nombre1+" tiene "+nombre1.length()+" caracteres");
		
		//Mayusculas y minusculas
		System.out.println("Nombre 1: "+nombre1);
		System.out.println("Nombre 1 en mayusculas: "+nombre1.toUpperCase());
		System.out.println("Nombre 1 en minusculas: "+nombre1.toLowerCase());


	}

}

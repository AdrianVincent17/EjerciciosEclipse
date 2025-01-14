package wrappers;

import java.util.Scanner;

public class Entradatest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//Aqui hacemos un ejemplo de que necesitamos parsear un integer antes que un String 
		//dado que si no lo tomara como un espacio y saltara directamente la entrada string
		System.out.print("Introduce tu edad: ");
		int edad=sc.nextInt();
		System.out.print("Introduce tu nombre: ");
		String nombre=sc.nextLine();
		
		
		System.out.println(nombre+" , "+edad+" años."+"\n");
		
		
		//aqui hacemos un parseo a la entrada para que la tome como string y no pase lo del caso anterior
		//si pusieramos un string antes que un int entonces no daria este resultado y no tendriamos problema
		System.out.println("Aqui viene la rectificacion...");
		System.out.print("Introduce tu edad: ");
		edad=Integer.parseInt(sc.nextLine());
		System.out.print("Introduce tu nombre: ");
		nombre=sc.nextLine();
		
		System.out.println(nombre+" , "+edad+" años.");
		sc.close();

	}

}

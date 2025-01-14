package wrappers;

import java.util.Scanner;

public class Doubletest {

	public static void main(String[] args) {


		double num=25.76;
		Double numwrapper=num;
		
		System.out.println("Valor (Double): "+numwrapper);
		
		double numdesenvuelto=numwrapper;
		
		System.out.println("Valor (double): "+numdesenvuelto);
		
		String textonum="123.45";
		Double numconvertido=Double.parseDouble(textonum);
		
		System.out.println("Conversion de String a Double: "+numconvertido);
		
		Double numvalueof=Double.valueOf("20.25");
		
		System.out.println("Creado con ValueOf desde un string: "+numvalueof);
		
		String textonum2=numwrapper.toString();
		
		System.out.println("Conversion de Double a String: "+textonum2);
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Introduce un numero decimal: ");
		
		String entrada=scanner.nextLine();
		
		try {
			
			Double numerousuario=Double.parseDouble(entrada);
			
			System.out.println("Has introducido el numero: "+numerousuario);
			
			
			
		}catch(NumberFormatException e) {
			System.out.println("No se pudo convertir "+entrada+" a un numero decimal");
		}
		scanner.close();
	}

}

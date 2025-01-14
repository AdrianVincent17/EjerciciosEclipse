package scanner;

import java.util.Scanner;

public class Diadesemanaswitch {
	
	public static void diasemana(int N) {
		
		switch(N) {
		case 1:System.out.println("LUNES");break;
		case 2:System.out.println("MARTES");break;
		case 3:System.out.println("MIERCOLES");break;
		case 4:System.out.println("JUEVES");break;
		case 5:System.out.println("VIERNES");break;
		case 6:System.out.println("SABADO");break;
		case 7:System.out.println("DOMINGO");break;
		default:System.out.println("La semana solo llega hasta 7 dias");break;
		}
	}

	public static void main(String[] args) {
		
		//Creamos el lector
		Scanner teclado=new Scanner(System.in);
		
		//Añadimos control de excepciones
		try {
			System.out.print("Dime un dia de la semana: ");
			int dia=teclado.nextInt();
		//Hacemos la llamada al procedimiento que nos muestra el dia de la semana	
			diasemana(dia);
			
		}catch(Exception lupita) {
			System.out.println("Error, dato no correcto");
		}
		
		
		teclado.close();
	}

}

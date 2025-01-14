package ejercicios;

import java.util.Scanner;

public class EJ05horas {
	
	

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime una hora: ");
		int hora=teclado.nextInt();
		System.out.println("Dime unos minutos: ");
		int min=teclado.nextInt();
		System.out.println("Dime los segundos: ");
		int seg=teclado.nextInt();
		
		teclado.close();

		if(hora>0 && hora<=23)
			if(min>0 && min<=59)
				if(seg>0 && min<=59)
					System.out.println("la hora es correcta: "+hora+":"+min+":"+seg );
	
				else
					System.out.println("Los segundos no son correctos");
			else
				System.out.println("Los minutos no son correctos");
		else
			System.out.println("Las horas no son correctas");
	}
	

}

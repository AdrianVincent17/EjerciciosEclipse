package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ26media {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		try {
			int num, mayor, menor;
			do {
				System.out.print("dime un numero: ");
				num=teclado.nextInt();
			}while(num<-100 || num>100);
			mayor=menor=num;

			while(num!=0)
			{
				if(num<-100 || num>100) {
					System.out.println("El valor no se encuentra en rango ");
				}else {
					if(num>mayor)
						mayor=num;
					if(num<menor)
						menor=num;	
				}	
				System.out.print("dime un numero: ");
				num=teclado.nextInt();

			}
			System.out.println("Mayor valor introducido: "+mayor);
			System.out.println("Menor valor introducido: "+menor);
			double media=(mayor+menor)/2.0;
			System.out.println("media: "+media);

		}catch(InputMismatchException ime) {
			System.out.println("Error dato introducido invalido");
		}


		teclado.close();

	}

}

package ejercicios;

import java.util.Scanner;

public class EJ23medianumneg {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		try {
			int conta=0;
			int suma=0;
			System.out.println("Dime un numero entero: ");
			int num=teclado.nextInt();
			
			while(num>=0) {
				suma+=num;
				conta++;
				System.out.println("Dime otro entero: ");
				num=teclado.nextInt();
			}
			if(num!=0)
				System.out.println("La media de los numeros es: "+(float)suma/conta);
			
		}catch(Exception lupita) {
			System.out.println("error");
		}
		
		
		
		teclado.close();

	}

}

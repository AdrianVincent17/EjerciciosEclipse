package ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ05suspensos {

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		try {
			int num;
			boolean suspensos=false;
			for(int i=1; i<=5; i++) {
				do {
					System.out.println("Alumno "+i+"");
					System.out.println("("+i+") Dime una nota: ");
					num=teclado.nextInt();


					if(num<0 || num>10)
						System.out.println("El numero tiene que estar enre 1 y 10");


				}while(num<0 || num>10);
				
				if(num<5)
					suspensos=true;
			}

			if(suspensos)
				System.out.println("hay alumnos suspensos");
			else
				System.out.println("bien, estan todos aprobados");



		}catch(InputMismatchException lupita) {
			System.out.println("Error, en la entrada de datos");
		}finally {
			teclado.close();
		}

	}

}

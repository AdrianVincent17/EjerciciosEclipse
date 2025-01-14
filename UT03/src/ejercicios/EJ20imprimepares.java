package ejercicios;

import java.util.Scanner;

public class EJ20imprimepares {

	/**
	 * procedimiento que muestra por pantalla los numeros 
	 * pares desde a hasta b
	 * requisito que a sea menor que b
	 * @param num numero entero
	 * @param num2 numero entero
	 */

	public static void imprimepares(int a, int b) {

		if(a<b) {
			for(int i=a; i<=b; i++) {
				if(i%2==0)
					System.out.println(i+" ");
			}
		}

	}

	public static void main(String[] args) {

		//añadimos control de excepciones

		try {
			Scanner teclado = new Scanner(System.in);
			int num, num2;
			//abrimos el lector
			do {

				System.out.println("Dime un numero: ");
				num=teclado.nextInt();
			}while(num<=0);

			do {
				System.out.println("Dime otro numero: ");
				num2=teclado.nextInt();

			}while(num2<=0);

			//cerramos el lector
			teclado.close();
			
			if(num<num2)
				imprimepares(num,num2);
			else
				imprimepares(num2,num);
			
		}catch(Exception lupita) {
			System.out.println("Error, dato introducido no valido");
		}

	}

}

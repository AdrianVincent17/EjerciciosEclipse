package examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ03 {

	/**
	 * Funcion que devuelve true si un numero pasado por parametro es primo o no 
	 * @param N numero entero
	 * @return true si es primo false si no lo es
	 */

	public static boolean esprimo(int N) {

		if(N<=1) {
			return false;
		}else {
			for(int i=2; i<=N/2; i++)
				if(N%i==0)
					return false;
		}
		return true;
	}

	public static void main(String[] args) {

		//Declaramos e inicializamos algunas variables
		int num, contapri=0, contanopri=0, mayor, menor, fuera=0;

		Scanner teclado=new Scanner(System.in);

		try {

			do {
				System.out.print("Dime un numero: ");
				num=teclado.nextInt();
				/**
				 * Creamos un condicional para un error probable en la introduccion de los datos
				 */
				if(num <1 || num>100) {
					System.out.println(">> El numero introducido no se encuentra en el intervalo 1..100");
					fuera++;
				}
				

			}while(num <1 || num>100);

			//Inicializamos las variables mayor y menor que tomen el mismo valor que num
			mayor=menor=num;

			while(num !=0) {

				if(num>=1 && num<=100) {
					if(esprimo(num)) {
						System.out.println("> "+num+" es primo");
						contapri++;
					}else {
						System.out.println("> "+num+" NO es primo");
						contanopri++;
					}

					//condicionales que indican si num es mayor que la variable mayor tome y guarde en ella ese valor ultimo
					if(num>mayor)
						mayor=num;

					//condicional que inidica que si num es menor que la variable menor tome y guarde ese mismo valor ultimo
					if(num<menor)
						menor=num;



				}else {
					System.out.println(">> El numero introducido no se encuentra en el intervalo 1..100");
					fuera++;

				}
				System.out.print("Dime otro numero: ");
				num=teclado.nextInt();
			}


			System.out.println();
			System.out.println("> Primos: "+contapri);
			System.out.println("> No Primos: "+contanopri);
			System.out.println("> Mayor numero introducido: "+mayor);
			System.out.println("> Menor numeor introducido: "+menor);
			System.out.println("> Fuera de rango, (1...100): "+fuera);




		}catch(InputMismatchException lupita) {
			System.out.println(">> ERROR, El tipo de dato introducido no es correcto.");
		}finally {
			teclado.close();
		}

	}

}

package arrays;

import java.util.Scanner;

public class BoletinArrays {

	final static int tam=3;
	final static int lim=3;

	/**
	 * Menu que muestra por pantalla una serie de mensajes
	 */

	private static void menu() {
		System.out.println("\n---------------MENU------------------");
		System.out.println("1) Introducir valores de la matriz A");
		System.out.println("2) Introducir valores de la matriz B");
		System.out.println("3) Mostrar valores almacenados de la matriz A");
		System.out.println("4) Mostrar valores almacenados de la matriz B");
		System.out.println("5) sumar matrices A+B");
		System.out.println("6) Indicar si las matrices A y b son iguales");
		System.out.println("7) Salir");

	}
	
	/**
	 * Procedimiento que muestra por pantalla la matriz introducida previamente
	 * @param vector - matriz introducida
	 */

	public static void imprimematriz(int[][] vector) {
		for(int i=0; i<vector.length; i++) {
			for(int j=0; j<vector[i].length; j++) {
				System.out.print(vector[i][j]+"\t");

			}
			System.out.println();
		}

	}

	/**
	 * procedimiento que ordena en metodo burbuja un array de enteros
	 * @param vector array con numero entero
	 */

	public static void ordenaburbuja(int vector[]) {
		int aux;
		boolean cambio;
		for(int i=tam; i>0; i--) {
			cambio=false;
			for(int j=0; j<i-1; j++) {
				if(vector[j]>vector[j+1]) {
					aux=vector[j];
					vector[j]=vector[j+1];
					vector[j+1]=aux;
					cambio=true;
				}
			}
			if(cambio==false)
				return;
		}
	}

	/**
	 * funcion que indica si dos arrays de valores enteros son iguales
	 * @param vector1 -arrays de valores enteros
	 * @param vector2 - arrays de valores enteros
	 * @return TRUE si array 1 y array 2 son iguales, es decir, contienen los mismos valores
	 * en las mismas posiciones, FALSE en caso contrario
	 */

	public static boolean iguales(int[][] vector1, int[][] vector2) {
		for(int i=0; i<vector1.length; i++)
			for(int j=0; j<vector1[i].length; j++){
				if (vector1[i][j]!=vector2[i][j])
					return false;
			}
		return true;
	}
	public static void main(String[] args) {

		int[][] A=new int[tam][tam];
		int[][] B=new int[tam][tam];
		int[][] C=new int[tam][tam];

		int opcion=0;
		boolean introducido1=false;
		boolean introducido2=false;


		Scanner teclado=new Scanner(System.in);

		try {



			do {
				menu();
				System.out.print("\nElige una opcion: ");
				opcion=teclado.nextInt();
				int j;
				int i;

				switch (opcion) {
				case 1: System.out.println("has elegido la opcion 1");


				for(i=0; i<A.length; i++) {
					for( j=0; j<A[i].length; j++) {
						System.out.print("Valor["+i+"]["+j+"]: ");
						A[i][j]=teclado.nextInt();
					}
				}
				introducido1=true;
				break;
				case 2: System.out.println("has elegido la opcion 2 ");

				for(i=0; i<B.length; i++) {
					for( j=0; j<B[i].length; j++) {
						System.out.print("Valor["+i+"]["+j+"]: ");
						B[i][j]=teclado.nextInt();
					}
				}
				introducido2=true;
				break;
				case 3: System.out.println("has elegido la opcion 3 ");
				if(introducido1) {
					System.out.println("Matriz A:");
					imprimematriz(A);
				}else
					System.out.println("Debes introducir antes valores en la matriz A");

				break;
				case 4: System.out.println("has elegido la opcion 4 ");
				if(introducido1) {
					System.out.println("Matriz B:");
					imprimematriz(B);
				}else
					System.out.println("Debes introducir antes valores en la matriz B");
				break;
				case 5: System.out.println("has elegido la opcion 5 ");
				if(introducido1 && introducido2){
					for (i=0; i<A.length; i++) 
						for (j=0; j<A[i].length; j++) {
							C[i][j]=A[i][j]+B[i][j];
						}

					imprimematriz(C);

				}else
					System.out.println("Debes introducir ambas matrices anteriores");

				break;
				case 6: System.out.println("has elegido la opcion 6 ");
				if(introducido1 && introducido2){
					if(iguales(A,B)) {
						System.out.println(">> las matrices son iguales");
					}else
						System.out.println(">> las matrices no son iguales");
				}else
					System.out.println("Debes introducir ambas matrices anteriores");
				break;
				case 7: System.out.println("has elegido la opcion 7 ");
				System.out.println("Salir");
				break;
				default: System.out.println("La opcion elegida no es correcta");
				}
			}while(opcion!=7);
			
			

		}catch(Exception lupita) {
			System.out.println("Error, valor introducido incorrecto");
		}


		teclado.close();


	}

}




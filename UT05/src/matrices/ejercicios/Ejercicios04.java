package matrices.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicios04 {

	final static int FIL=5;
	final static int COL=3;

	public static int mayor(int [][] matriz) {

		int mayor=matriz[0][0];
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(mayor<matriz[i][j]) 
					mayor=matriz[i][j];

			}
		}
		return mayor;
	}

	public static int menor(int [][] matriz) {

		int menor=matriz[0][0];
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(menor>matriz[i][j]) 
					menor=matriz[i][j];

			}
		}
		return menor;
	}

	public static double media(int[][] matriz) {

		double suma=0;
		int conta=0;
		int i=0;
		int j=0;

		for(i=0; i<matriz.length; i++) {
			for(j=0; j<matriz[i].length; j++) {
				suma+=matriz[i][j];
				conta++;
			}
		}
		if(conta!=0)
			return suma/conta;
		return 0;
	}



	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		try {
			int [][] matriz=new int[FIL][COL];
			int i=0;
			int j=0;
			System.out.println("Introduce los valores de una matriz "+FIL+" X "+COL);
			for(i=0; i<matriz.length; i++) {
				for(j=0; j<matriz[i].length; j++) {
					System.out.print("valor[FILA "+(i+1)+"][COLUMNA "+(j+1)+"]: ");	
					matriz[i][j]=sc.nextInt();
				}

			}

			System.out.println("\n      Matriz");
			for(i=0; i<matriz.length; i++) {
				for(j=0; j<matriz[i].length; j++) {
					System.out.print(matriz[i][j]+"\t");

				}
				System.out.println();
			}

			System.out.println("\nMayor: "+mayor(matriz));
			System.out.println("Menor: "+menor(matriz));
			System.out.println("Media: "+media(matriz));

		}catch(InputMismatchException lupita) {
			System.out.println("Error, dato introducido no valido");
		}finally {
			sc.close();
		}





	}

}

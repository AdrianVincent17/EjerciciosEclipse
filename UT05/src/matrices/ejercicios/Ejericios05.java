package matrices.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejericios05 {
	final static int TAM=3;

	public static void mostrarmatriz(int [][] a) {

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++)
				System.out.print(a[i][j]+"\t");
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int [][]A, B, C;
		A=new int [TAM][TAM];
		B=new int [TAM][TAM];
		C=new int [TAM][TAM];
		
		Scanner sc=new Scanner(System.in);
		
		try {
			int i=0;
			int j=0;
			
			System.out.println("Matriz A "+TAM+"x"+TAM+":");
			for(i=0; i<A.length; i++) {
				for(j=0; j<A[i].length; j++) {
					System.out.print("A[FILA "+(i+1)+"][COLUMNA "+(j+1)+"]: ");	
					A[i][j]=sc.nextInt();
				}

			}
			
			System.out.println("Matriz B "+TAM+"x"+TAM+":");
			for(i=0; i<B.length; i++) {
				for(j=0; j<B[i].length; j++) {
					System.out.print("B[FILA "+(i+1)+"][COLUMNA "+(j+1)+"]: ");	
					B[i][j]=sc.nextInt();
				}

			}
			
			for(i=0; i<B.length; i++) {
				for(j=0; j<B[i].length; j++) {
					C[i][j]=A[i][j]+B[i][j];
				}

			}
			
			
			
			
			System.out.println("\nMatriz A ");
			mostrarmatriz(A);
			
			System.out.println("\nMatriz B ");
			mostrarmatriz(B);
			
			System.out.println("\nMatriz suma ");
			mostrarmatriz(C);
			
		}catch(InputMismatchException e) {
			System.out.println("Error");
		}finally {
			sc.close();
		}
		


		

	}

}

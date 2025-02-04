package arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	final static int TAM=5;

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		try {

			int[] vector=new int[TAM];

			int posiciones;

			System.out.println("Introduce "+TAM+" numeros");

			for(int i=0; i<vector.length; i++) {

				System.out.print("Valor ["+(i+1)+"]: ");
				vector[i]=sc.nextInt();

			}

			System.out.print("Cuantas posiciones quieres mover: ");
			posiciones=sc.nextInt();

			

			for(int j=0; j<posiciones; j++) {
				
				int ultimo= vector[vector.length-1];

				for(int i=vector.length-1; i>0; i--) 

					vector[i]=vector[i-1];
			
				
				vector[0]=ultimo;
			}
			



			for(int i=0; i<vector.length; i++) {
				System.out.print(vector[i]+" ");
			}
			System.out.println();

		}catch(Exception e) {
			System.out.println("Error");
		}finally {
			sc.close();
		}


	}


}

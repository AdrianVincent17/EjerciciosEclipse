package matrices;

import java.util.Scanner;

public class Ejemplo04 {
	
	public static void MostrarMatriz( int[][] a) {

		for(int i=0;i<a.length;i++) {

			for(int j=0;j<a[i].length;j++) {

				System.out.print(a[i][j]+"\t");

			}

			System.out.println();

		}

	}
	
	final static int TAM=3;

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		try {
			
			int[][]matriz=new int[TAM][TAM];
			
			System.out.println("Vamos a rellenar la matriz...");
			
			for(int i=0; i<matriz.length; i++) {
				for(int j=0; j<matriz[i].length; j++ ) {
					System.out.print("Matriz ["+(i+1)+"]["+(j+1)+"]:  ");
				matriz[i][j]=teclado.nextInt();
				}
			}
			System.out.println();
			MostrarMatriz(matriz);
			
		}catch(Exception e) {
			
		}finally {
			teclado.close();
		}
		
		
		

	}

}

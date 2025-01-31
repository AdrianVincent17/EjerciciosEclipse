package matrices.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicios03 {
	
	final static int FIL=3;
	final static int COL=4;

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int[][] matriz=new int[FIL][COL];
		try {
			
			int i=0;
			int j=0;
			System.out.println("Introduce los valores de una matriz 3x4");
			for(i=0; i<matriz.length; i++) {
				for(j=0; j<matriz[i].length; j++) {
					System.out.print("valor[FILA "+(i+1)+"][COLUMNA "+(j+1)+"]: ");	
					matriz[i][j]=sc.nextInt();
				}
				
			}
			System.out.println("\n\t  Matriz");
			int suma;
			for(i=0; i<matriz.length; i++) {  			//esta linea es referida a las filas
				suma=0; 								// esto sirve para que cada vez que vuelva el bucle a esta parte reinicie el contador
				for( j=0; j<matriz[i].length; j++) { 	//esta linea es referida a las columnas
					System.out.print(matriz[i][j]+"\t");
					suma+=matriz[i][j];
				}
				
				System.out.println("----> suma "+suma);//al final de cada fila saldra la suma total de todas las columnas de esa fila
			}
			
		}catch(InputMismatchException lupita) {
			System.out.println("Error, dato introducido no valido");
		}finally {
			sc.close();
		}

	}

}

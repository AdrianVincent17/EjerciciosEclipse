package matrices;

public class Ejemplo03 {
	
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
		
		int[][] matriz=new int[TAM][TAM];
		
		System.out.println("Matriz: ");
		MostrarMatriz(matriz);
		
		//Incrementamos el valor de la matriz en 1
		for(int i=0; i<matriz.length; i++)
			for(int j=0; j<matriz[i].length; j++)
				matriz[i][j]++;
		
		
		System.out.println("\nMatriz aumentada ");
		MostrarMatriz(matriz);
		
		

	}

}

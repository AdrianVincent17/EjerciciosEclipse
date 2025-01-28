package matrices;

public class Ejemplo02 {
	
	public static void MostrarMatriz( int[][] a) {

		for(int i=0;i<a.length;i++) {

			for(int j=0;j<a[i].length;j++) {

				System.out.print(a[i][j]+"\t");

			}

			System.out.println();

		}

	}

	public static void main(String[] args) {
		
		// Definimos y creamos la matriz

				int[][] matriz1 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

				int[][] matriz2 = {{1,2,3,},{8,9,10},{13,14,15}};



				

				System.out.println("Filas: "+matriz1.length);

				System.out.println("Columnas: "+matriz1[0].length+"\n");

				

				MostrarMatriz(matriz1);

				

				System.out.println("\nFilas: "+matriz2.length);

				System.out.println("Columnas: "+matriz2[0].length+"\n");

				

				MostrarMatriz(matriz2);

	}

}

package matrices;

public class Ejemplo01 {

	public static void MostrarMatriz( int[][] a) {

		for(int i=0;i<a.length;i++) {

			for(int j=0;j<a[i].length;j++) 

				System.out.print(a[i][j]+"\t");

			

			System.out.println("");

		}

	}

	

	

	public static void main(String[] args) {

		// Definimos y creamos la matriz

		int[][] matriz = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};

		System.out.println("Filas: "+matriz.length);

		System.out.println("Columnas: "+matriz[0].length+"\n");

		

		//Mostramos la matriz sin funcion
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}

		

		

	}

}



package matrices;

public class Ejemplo05 {
	
	public static void MostrarMatriz( int[][] a) {

		for(int i=0;i<a.length;i++) {

			for(int j=0;j<a[i].length;j++) {

				System.out.print(a[i][j]+"\t");

			}

			System.out.println();

		}

	}
	
	final static int FILAS=3;
	final static int COLUMNAS=4;
	final static int RANGO=20;
	

	public static int aleatorios(int num) {
		return (int)(Math.random()*num+1);
	}

	public static void main(String[] args) {
		
		//Declaramos y creamos las matrices
		int[][]matriz=new int[FILAS][COLUMNAS];
		
		int i=0;
		int j=0;
		//Generamos de forma aleatoria los valores que se van almacenando en la matriz
		for(i=0; i<matriz.length; i++) {
			for(j=0; j<matriz[i].length; j++) {
				matriz[i][j]=aleatorios(RANGO);
			}
		}
		
		//Mostramos por pantalla los valores almacenados en la matriz
		System.out.println("\t Matriz ");
		MostrarMatriz(matriz);
		
		
		System.out.println();
		
		//Mostramos los numeros pares
		for(i=0; i<matriz.length; i++) {
			for(j=0; j<matriz[i].length; j++) {
				if(matriz[i][j]%2==0) {
					System.out.print(matriz[i][j]+"\t");
				}else
					System.out.print("*\t");
			}
			System.out.println();
			
		}
		
		
		
		
		
		

	}

}

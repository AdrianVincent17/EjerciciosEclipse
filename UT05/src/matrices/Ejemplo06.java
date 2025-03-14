package matrices;

public class Ejemplo06 {
	
	public static void MostrarMatriz( int[][] a) {

		for(int i=0;i<a.length;i++) {

			for(int j=0;j<a[i].length;j++) {

				System.out.print(a[i][j]+"\t");

			}

			System.out.println();

		}

	}
	
	public static int aleatorios(int num) {
		return (int)(Math.random()*num+1);
	}
	
	final static int FILAS=3;
	final static int COLUMNAS=4;
	final static int RANGO=20;

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
		
		//declaramos e inizializamos los valores de mayor 
		int mayor, menor;
		mayor=menor=matriz[0][0];
		
		for(i=0; i<matriz.length; i++) {
			for(j=0; j<matriz[0].length; j++) {
				
				//Actualizamos el valor de mayor
				if(mayor<matriz[i][j])
					mayor=matriz[i][j];
				//Actualizamos el valor de menor
				if(menor>matriz[i][j])
					menor=matriz[i][j];
			}
		}
		
		System.out.println("\t  Matriz");
		MostrarMatriz(matriz);
		
		System.out.println();
		System.out.println("Mayor: "+mayor);
		System.out.println("Menor: "+menor);
		

	}

}

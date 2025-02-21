package matrices.ejercicios;

public class Ejercicios01 {
	
	public static void mostrarmatriz(int[][] a) {
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) 
				System.out.print(a[i][j]+"\t");
			
			System.out.println("");
		}
	}
	
	final static int TAM=5;

	public static void main(String[] args) {
		
		int[][] matriz=new int[TAM][TAM];
		
		
		System.out.println("\t Matriz principal\n");
		mostrarmatriz(matriz);
		
		//con este metodo tambien sirve pero mas simple seria el mostrado abajo
		/*
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(i==j)
					matriz[i][j]=1;
				else 
					matriz[i][j]=0;
			}
		}
		*/
		
		for(int i=0; i<matriz.length; i++) {
			matriz[i][i]=1;
		}
		
		System.out.println("\n\t Diagonal Prinicipal\n");
		mostrarmatriz(matriz);

		

	}

}

package matrices.ejercicios;

public class Ejercicios02 {
	
	final static int FIL=6;
	final static int COL=8;

	public static void main(String[] args) {
		int[][] matriz=new int[FIL][COL];
		
		for(int i=0; i<FIL; i++){
			for(int j=0; j<COL; j++) {

				//primera fila y ultima fila
				if(i==0 || i==FIL-1)
					matriz[i][j]=1;
				//primera y ultima columna
				if (j==0 || j==COL-1)
					matriz[i][j]=1;
			}
		}
		System.out.println("\t\t\tMatriz marco ");
		for(int i=0; i<FIL; i++){
			for(int j=0; j<COL; j++) 
				System.out.print(matriz[i][j]+"\t");
			System.out.println();
		}

	}

}

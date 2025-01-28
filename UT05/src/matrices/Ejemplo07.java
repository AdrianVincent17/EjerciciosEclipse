package matrices;

public class Ejemplo07 {

	public static void muestramatriz(int[][] a) {

		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"\t");

			}
			System.out.println();
		}
	}


	public static int aleatorio(int N) {

		return(int)(Math.random()*N+1);
	}

	final static int TAM=4;
	final static int LIMITE=50;
	public static void main(String[] args) {

		int [][] matriz=new int[TAM][TAM];

		int i=0;
		int j=0;

		for(i=0; i<matriz.length; i++) {
			for(j=0; j<matriz[i].length; j++) {
				matriz[i][j]=aleatorio(LIMITE);
			}
		}
		System.out.println("Matriz aleatoria");
		muestramatriz(matriz);
		System.out.println();
		//mostramos la diagonal principal 
		System.out.println("diagonal principal");
		for(i=0; i<matriz.length; i++) {
			for(j=0; j<matriz[i].length; j++) {
				if(i==j) {
					System.out.print(matriz[i][j]+"\t");
				}else
					System.out.print("*\t");
			}
			System.out.println();

		}
		System.out.println();
		System.out.println("Diagonal principal");
		for(i=0; i<TAM; i++) {
			System.out.print(matriz[i][i]+" ");
		}
	}
}

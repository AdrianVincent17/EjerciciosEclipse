package ejercicios;

public class EJ17astericosV2 {

	public static void main(String[] args) {

		int altura=4;

		for(int i=1; i<=altura; i++) {	//filas

			//imprimimos los espacios en blanco
			for(int j=1; j<=altura-i; j++) 
				System.out.print(" ");	

			//imprimiimos los asteriscos
			for(int j=1; j<=i; j++)
				System.out.print("*");

			//imprimios el salto de linea
			System.out.println();


		}



	}
}

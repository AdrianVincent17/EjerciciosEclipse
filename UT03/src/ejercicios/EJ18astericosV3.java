package ejercicios;

public class EJ18astericosV3 {

	public static void main(String[] args) {
		int altura=4;

		for(int i=1; i<=altura; i++) {	//filas
			
			int blancos=altura-i;
			//imprimimos los espacios en blanco
			for(int j=1; j<=blancos; j++) 
				System.out.print(" ");	
			
			int asteriscos=i*2-1;
			//imprimiimos los asteriscos
			for(int j=1; j<=asteriscos; j++)
				System.out.print("*");

			//imprimios el salto de linea
			System.out.println();


		}

	}

}

package piramides;

public class Izquierda {

	public static void main(String[] args) {
		
		
		int altura=4;
		for(int i=1; i<=altura; i++) {
			for(int j=1; j<=altura-i; j++) 
				System.out.print(" ");

			for(int k=1; k<=i; k++)
				System.out.print("*");

			System.out.println();

		}

	}

}

package piramides;

public class Derechaambos {

	public static void main(String[] args) {
		
		int altura=4;

		for(int i=1; i<=altura; i++) {
			for(int j=1; j<=i; j++)
				System.out.print("*");

			System.out.println();
		}
		for(int i=1; i<altura; i++) {
			for(int j=1; j<=altura-i; j++)
				System.out.print("*");

			System.out.println();
		}
		

	}

}

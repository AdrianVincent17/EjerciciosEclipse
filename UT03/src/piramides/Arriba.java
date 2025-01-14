package piramides;

public class Arriba {

	public static void main(String[] args) {
		
		int altura=5;
		int asteriscos;
		int blancos;

		for(int i=1; i<=altura; i++) {
			blancos=altura-i;
			for(int j=1; j<=blancos; j++) {
				System.out.print(" ");
			}
			asteriscos=2*i-1;
			for(int j=1; j<=asteriscos; j++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

}

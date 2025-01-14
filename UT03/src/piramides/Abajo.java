package piramides;

public class Abajo {

	public static void main(String[] args) {
		
		int altura=4;
		int blancos;
		int asteriscos;

		for(int i=altura; i>=1; i--) {
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

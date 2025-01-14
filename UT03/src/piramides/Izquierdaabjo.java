package piramides;

public class Izquierdaabjo {

	public static void main(String[] args) {
		
		int altura=4;
		int blancos;

		for(int i=altura; i>=1; i--) {
			blancos=altura-i;
			for(int j=1; j<=blancos; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}

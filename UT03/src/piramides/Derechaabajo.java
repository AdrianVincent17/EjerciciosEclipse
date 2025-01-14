package piramides;

public class Derechaabajo {

	public static void main(String[] args) {
		
		int altura=4;
		for(int i=altura; i>=1; i--) {
		for(int k=1; k<=i; k++) {
			System.out.print("*");

		}
		System.out.println();
		}

	}

}

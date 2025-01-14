package boletin2;

public class EJ02 {

	public static void main(String[] args) {

		int altura=4;
		int blancos;
		int asteriscos;
		
		for(int i=1; i<=altura; i++) {
			blancos=altura-i;
			for(int j=1; j<=blancos; j++) {
				System.out.print(" ");
			}
			asteriscos=2*i-1;
		for(int k=1; k<=asteriscos; k++) {
			System.out.print("*");
			
		}
		System.out.println();
		}
		for(int i=altura-1; i>=1; i--) {
			blancos=altura-i;
			for(int j=1; j<=blancos; j++) {
				System.out.print(" ");
			}
			asteriscos=2*i-1;
		for(int k=1; k<=asteriscos; k++) {
			System.out.print("*");
			
		}
		System.out.println();
		}


	}

	}



package examen;

public class EJ02 {

	public static void main(String[] args) {
		
		//Declaramos e inicializamos una variable para indicar la altura de nuestra figura
		int altura=4;
		
		//Primera figura del triangulo que va hacia abajo a la derecha
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



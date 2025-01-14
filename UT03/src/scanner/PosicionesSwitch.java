package scanner;

import java.util.Scanner;

public class PosicionesSwitch {
	
	/**
	 * Procedimiento que indica en que posicin se ha quedado un corredor
	 * @param N numero entero
	 */
	public static void posicion(int N) {
		
		switch(N) {
		case 1:System.out.println("ORO");break;
		case 2:System.out.println("PLATA");break;
		case 3:System.out.println("BRONCE");break;
		case 4:
		case 5:System.out.println("DIPLOMA");break;
		default:System.out.println("SIN PREMIO");break;
		}
	}

	public static void main(String[] args) {
		
		//Creamos el lector
		Scanner teclado=new Scanner(System.in);
		
		//Añadimos control de excepciones
		try {
			System.out.print("Dime en que posicion te has quedado: ");
			int pos=teclado.nextInt();
		//Hacemos la llamada al procedimiento que muestra la posicion
			posicion(pos);
			
		}catch(Exception lupita) {
			System.out.println("ERROR, dato no correcto");
		}
		teclado.close();

	}

}

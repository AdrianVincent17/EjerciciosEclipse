package ejercicios;

import java.util.Scanner;

public class EJ08numpos {

	public static void main(String[] args) {
		
		//Abrimos el lector
		Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.print("Dime un numero: ");
			//Declaramos e inicializamos la entrada de datos
			int num=teclado.nextInt();
			
			//CErramos el lector
			teclado.close();
			//Creamos el condicional para que sea un numero positivo
			if(num>0)
				//Bucle que cuenta desde el primer impar a partir del 2 hasta el numero introducido
				for(int conta=3; conta<=num; conta+=2)
					System.out.print(conta+" ");
			else
				System.out.println("No has introducido un numero positivo");
			
		}catch(Exception lupita) {
			System.out.println("Error, dato introducido no valido");
		}
		
		
		

	}

}

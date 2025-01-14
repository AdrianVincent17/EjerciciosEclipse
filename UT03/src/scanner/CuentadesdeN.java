package scanner;

import java.util.Scanner;

public class CuentadesdeN {

	public static void cuentadeN(int N) {

		if(N>0) {
			for(int conta=1; conta<=N; N--)
				System.out.print(N+" ");
		}else {

			System.out.println("has introducido un numero negativo");
		}

	}

	public static void main(String[] args) {


		Scanner teclado=new Scanner(System.in);

		try {

			System.out.print("Dime un numero positivo: ");
			int num=teclado.nextInt();
			teclado.close();

			cuentadeN(num);

		}catch(Exception luupita) {
			System.out.println("Error, dato introducido no valido");
		}




	}

}

package strings.ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Introduce una cadena: ");
		String introducida=sc.nextLine();
		
		System.out.print("Introduce cadena a buscar: ");
		String buscada=sc.nextLine();
		
		int conta=0;
		int pos=0;
		while(pos!=-1) {
			pos=introducida.indexOf(buscada, pos);
			if(pos>=0) {
				conta++;
				pos++;
			}
		
		
		}
		System.out.println("Aparece "+conta+" veces");
		
		sc.close();

	}

}

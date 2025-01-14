package ejercicios;

import java.util.Scanner;

public class EJ11tabladoblestriples {

	public static void main(String[] args) {
		
		try {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num=teclado.nextInt();
		teclado.close();
		
		if(num>0) {
			System.out.println("num\tDoble\tTriple");
			for(int i=1; i<=num; i++)
				System.out.println(i+"\t"+(2*i)+"\t"+(3*i));
		}else
			System.out.println("No has introducido un numero positivo");
			
		}catch(Exception lupita) {
			System.out.println("Error, dato introducido invalido");
		}
		

	}

}

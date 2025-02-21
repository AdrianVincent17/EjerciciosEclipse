package strings.Boletin;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Introduce una frase: ");
		
		String entrada=sc.nextLine();
		
		String[] frase=entrada.split(" ");
		
		for(int i=0; i<frase.length; i++) {
			System.out.println("palabra: "+(i+1)+" "+frase[i]);
		}
		
		
		
		
		
		sc.close();

	}

}

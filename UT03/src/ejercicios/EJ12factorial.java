package ejercicios;

import java.util.Scanner;

public class EJ12factorial {
	
	public static int factorecurvo(int N) {
		
		if(N==1)
			return 1;
		return N*factorecurvo(N-1);
			
	}
	
	public static int facto(int N) {
		int res=1;
		for(int i=1; i<=N; i++)
			res=res*i;
		return res;
	}

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		
		System.out.println("dime un numero");
		int num=teclado.nextInt();
		teclado.close();
		System.out.println("factorial de: "+num+" es: "+facto(num));
		
		
		System.out.println("factorial de: "+num+" es: "+factorecurvo(num));
	}

}

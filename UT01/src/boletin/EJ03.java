package boletin;

public class EJ03 {

	public static void main(String[] args) {
		
		//declaramos e inicializamos las variables
		
		int paga=50;
		int cobra=7;
		
		int t=paga-cobra;
		int b20=t/20;
		int b10=(t%20)/10;
		int b5=(t%10)/5;
		int m2=(t%5)/2;
		int m1=(t%2);
		
		 
		System.out.println("Billetes de 20; "+b20);
		System.out.println("Billetes de 10; "+b10);
		System.out.println("Billetes de 5; "+b5);
		System.out.println("Billetes de 2; "+m2);
		System.out.println("Billetes de 1; "+m1);
	}

}

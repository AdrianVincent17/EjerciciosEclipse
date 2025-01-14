package bucles;

public class TablaMultiplicar {
	
	public static void tabla(int num) {
		for(int conta=1; conta<=10; conta++)
			System.out.println(num+" x "+conta+" = "+(num*conta));
		
		System.out.println();

	}
	
	public static void main(String[] args) {
		
		for(int n=1; n<=10; n++)
			tabla(n);
	}	

}

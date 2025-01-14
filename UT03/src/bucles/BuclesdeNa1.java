package bucles;

public class BuclesdeNa1 {

	public static void main(String[] args) {

		int num=(int)(Math.random()*25+1);
		int conta=num;

		System.out.println("Contamos desde "+num+" a N con WHILE");
		while(conta>=1) {
			System.out.print(conta+" ");
			conta--;
		}

		conta=num;
		System.out.println("\n\nContamos desde "+num+" a N con DO WHILE");
		do {
			System.out.print(conta+" ");
			conta--;
		}while(conta>=1);

		System.out.println("\n\nContamos desde "+num+" a N con FOR");
		for(conta=num; conta>=1; conta--) {
			System.out.print(conta+" ");
		}
	}

}

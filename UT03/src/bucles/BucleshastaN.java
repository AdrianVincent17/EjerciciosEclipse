package bucles;

public class BucleshastaN {
	
	

	public static void main(String[] args) {
		
		//declaramos e inicializamos variables para que nos de un numero aleatorio
		int num=(int)(Math.random()*25+1);
		
		//Mostramos por pantalla el titulo del bucle fuera del bucle para que solo nos lo muestre una vez
		System.out.println("Contamos del 1 hasta "+num+" con WHILE: ");
		
		//inicializamos la variable conta y creamos el bucle
		int conta=1;
		while(conta<=num) {
			System.out.print(conta+" ");
			conta++;	
		}
		
		//Cremos el bucle DO WHILE
		conta=1;
		System.out.println("\n\nContamos del 1 hasta "+num+" con DO WHILE");
		do {
			System.out.print(conta+" ");
			conta++;
		}while(conta<=num);
	
		//Contamos desde el 1 hasta N con el bucle FOR
		System.out.println("\n\nContamos del 1 hasta "+num+" con FOR");
		for(conta=1; conta<=num; conta++) {
			System.out.print(conta+" ");
		}
	}

}

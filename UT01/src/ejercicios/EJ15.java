package ejercicios;

public class EJ15 {

	public static void main(String[] args) {
		
		/*
		 * declaramos e inicializamos la variable dado con la 
		 * clase math, la cual va desde 0 hasta 0.9 y por tanto tendremos
		 * que hacerla empezar desde uno hasta 7 
		 * porque a la hora de castear a int y quitar los decimales 
		 * nos de el numero que queremos
		 */
		
		int dado=(int)(Math.random()*100+1);
		int dado2=(int)(Math.random()*250+1);
		
		
		System.out.println("\n\t   El numero del primer dado es \n");
		
		System.out.println("\t\t\t"+dado);
		
		System.out.print("\n\t   El numero del segundo dado es \n");

		System.out.print("\n\t\t\t"+dado2);
	}

}

package ejmplos;

public class Aleatorio {

	public static void main(String[] args) {
		
		//generar un numero aleatorio entre 1 y 10
		int num=(int)(Math.random()*10+1);
		System.out.println(num);

		//generar un numero aleatorio entre 1 y 50
		num=(int)(Math.random()*50+1);
		System.out.println(num);

		//generar un numero aleatorio entre 1 y 100
		num=(int)(Math.random()*100+1);
		System.out.println(num);

		//generar un numero aleatorio entre 1 y 1000
		num=(int)(Math.random()*1000+1);
		System.out.println(num);
		
		//simular el lanzamiento de un dado
		num=(int)(Math.random()*6+1);
		System.out.println(num);
		
		

	}

}

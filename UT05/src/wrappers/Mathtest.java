package wrappers;

public class Mathtest {

	public static void main(String[] args) {
		
		int a=5, b=8;
		
		//Mayor y menor
		System.out.println("Mayor("+a+","+b+"): "+Math.max(a, b));
		System.out.println("Menor("+a+","+b+"): "+Math.min(a, b));
		
		//Potencias
		System.out.println("\nCuadrado de "+a+": "+Math.pow(a,2));
		System.out.println("Cubo de "+a+": "+Math.pow(a, 3));
		
		//Numeros aleatorios
		System.out.print("\nNumero aleatorio entre 1 y 100: ");
		System.out.println((int)(Math.random()*100+1));
		System.out.print("Numero aleatorio entre 1 y 5: ");
		System.out.println(Math.round(Math.random()*a));
		
		//Area de un circulo
		int radio=3;
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("\nArea circulo de radio "+radio+": "+area);
		

	}

}

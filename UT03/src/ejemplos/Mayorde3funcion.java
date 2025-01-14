package ejemplos;

public class Mayorde3funcion {

	/**
	 * funcion que devuelve un numero mayor entre tres numeros
	 * @param x numero entero
	 * @param y numero entero
	 * @param z numero entero 
	 * @return devuelve un numero mayor de entre 3
	 */

	public static int mayor(int x, int y, int z) {

		if(x>y) {
			if(x>z)
				return x;
			else 
				return z;
		}else if(y>z)
			return y;
		else
			return z;
	}

	public static void main(String[] args) {

		int a=MayordefuncionconAleatorio.aleatorio(500);
		int b=MayordefuncionconAleatorio.aleatorio(500);
		int c=MayordefuncionconAleatorio.aleatorio(500);
		int d=MayordefuncionconAleatorio.aleatorio(500);
		int e=MayordefuncionconAleatorio.aleatorio(500);


		System.out.println("Entre los numeros "+a+" "+b+" "+c+" "+d+" "+e);
		System.out.println("El mayor de dos (a y b) es: "+Mayordefuncion.mayor(a,b));
		System.out.println("El mayor de tres (a,b y c)  es: "+mayor(a,b,c));
		System.out.println("El mayor de cuatro es (a,b,c y d): "+(Mayordefuncion.mayor(mayor(a,b,c), d)));
		System.out.println("El mayor de cinco es (a,b,c,d y e): "+(mayor(mayor(a,b,c), d,e)));
	}

}

package ejemplos;

public class Mayorde3_4_5funcionv2 {
	
	/**
	 * Funcion que devuelve el mayor entre dos numeros
	 * @param x numero entero
	 * @param y numero entero
	 * @return x si X>Y, Y en caso contrario
	 */
	
	public static int mayor(int x, int y) {
		
		if(x>y)
			return x;
		return y;
	}
	
	/**
	 * funcion que devuelve el mayor de tres numero pasados por parametro
	 * @param x numero entero
	 * @param y numero entero
	 * @param z numero entero
	 * @return el mayor entre x,y,z
	 */
	public static int mayor(int x, int y, int z) {
		
		return mayor(mayor(x,y),z);
		
	}
	
	/**
	 * funcion que devuelve el mayor de cuatro numeros pasados por parametro
	 * @param x numero entero
	 * @param y numero entero
	 * @param w numero entero
	 * @param z numero entero
	 * @return el mayor de x,y,w y z
	 */
	
	public static int mayor(int x, int y, int w, int z) {
		
		return mayor(mayor(x,y),mayor(w,z));
		
	}
	
	/**
	 * funcion que devuelve el mayor de cinco numeros pasados por parametro
	 * @param x numero entero
	 * @param y numero entero
	 * @param z numero entero
	 * @param w numero entero
	 * @param v numero entero 
	 * @return el mayor entre x,y,z,w y v
	 */
	public static int mayor(int x, int y, int z, int w, int v) {
		
	return mayor(mayor(x,y),mayor(w,z),v);
		
	}

	public static void main(String[] args) {
		
		int a=MayordefuncionconAleatorio.aleatorio(1000),
			b=MayordefuncionconAleatorio.aleatorio(1000),
			c=MayordefuncionconAleatorio.aleatorio(1000),
		   	d=MayordefuncionconAleatorio.aleatorio(1000),
			e=MayordefuncionconAleatorio.aleatorio(1000);

		System.out.println("Entre los numeros "+a+" "+b+" "+c+" "+d+" "+e);
		System.out.println("El mayor de dos (a y b) es: "+mayor(a,b));
		System.out.println("El mayor de tres (a,b y c)  es: "+mayor(a,b,c));
		System.out.println("El mayor de cuatro es (a,b,c y d): "+mayor(a,b,c,d));
		System.out.println("El mayor de cinco es (a,b,c,d y e): "+mayor(a,b,c,d,e));
	}

}

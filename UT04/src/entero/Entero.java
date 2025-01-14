package entero;

public class Entero {

	//Atributos

	private int numero;

	//Metrodos

	/**
	 * Constructor con valor predeterminado e inizializado a 0
	 */
	public Entero() {
		numero=0;
	}

	/**
	 * Constructor
	 * @param numero
	 */
	public Entero(int num) {

		numero = num;
	}

	/**
	 * Deevuelve el numero 
	 * @return el numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Establece el numero 
	 * @param numero el numero a establecer
	 */
	public void setNumero(int num) {
		numero = num;
	}
	
	/**
	 * Indica si el numero es positivo o negativo 
	 * @return TRUE en caso de ser positivo, FALSE en caso contrario.
	 */
	public boolean espositivo() {
		
		if(numero>0)
			return true;
		
		return false;
	}
	
	/**
	 * Indica si el numero es cero 
	 * @return TRUE si es 0 y FASLSE en caso contrario.
	 */
	public boolean escero() {
		
		if(numero==0)
			return true;
		return false;
	}
	
	/**
	 * Indica si el numero es mayor al valor pasado por parametro
	 * @param num numero pasado por parametro
	 * @return TRUE si es mayor y fALSE si no lo es.
	 */
	public boolean esmayor(int num) {
		
		if(numero>num)
			return true;
		return false;
	}
	
	/**
	 * Devuelve un numero entero con el doble del valor de numero 
	 * @return Doble del numero
	 */
	public int doble() {
		return numero*2;
	}
	
	/**
	 * Devuelve un numero entero con el triple del valor de numero 
	 * @return triple del numero
	 */
	public int triple() {
		return numero*3;
	}
	
	
	/**
	 * Devuelve un numero entero con la mitad del valor de un numero
	 * @return Mitad del valor
	 */
	public double mitad() {
		return numero/2.0;
	}
	
	/**
	 * Devuelve un numero entero en forma de potencia indicando como parametro el numero de la potencia
	 * @param pot numero entero asignado a potencia
	 * @return valor total del calculo
	 */
	public int potencia(int pot) {
		
		return (int) Math.pow(numero, pot);
		
	}
	
	/**
	 * Devuelve TRUE O FALSE si el numero es par o impar
	 * @return TRUE si es par y FALSE si no lo es
	 */
	public boolean espar() {
		if(numero%2==0)
			return true;
		return false;
	}
	
	
	/**
	 * Devuelve true o false si el numero es primo o no 
	 * @return TRUE si es primo y FALSE si no lo es
	 */
	public boolean esprimo() {
		
		if(numero<=1)
			return false;
			for(int i=2; i<=numero/2; i++) {
				if(numero%i==0)
					return false;
			}
			return true;
	}
	
	
	/**
	 * Convierte un numero entero a double
	 * @return un numero double qu eera entero
	 */
	public double todouble() {
		
		return (double)numero;
	}
	
	
	/**
	 * Muestra la informacion
	 */
	public void mostrarnumero() {
		
		System.out.println("El numero que muestras es: "+numero);
		
	}
	
	
	




}

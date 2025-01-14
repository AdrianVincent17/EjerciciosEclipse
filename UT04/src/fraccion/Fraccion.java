package fraccion;

public class Fraccion {

	//Atributos

	private int numerador; 			//numerador de la fraccion (parte de arriba).
	private int denominador;		//denominador de la fraccion (parte de abajo).

	/**
	 * Contructor
	 * @param numerador
	 * @param denominador
	 */
	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		if(denominador==0)
			denominador=1;
		else
			this.denominador = denominador;
	}

	/**
	 * Constructor por defecto (vacio)
	 */
	public Fraccion() {

		numerador=0;
		denominador=1;
	}

	/**
	 * Devuelve el numerador de la fraccion (parte de arriba).
	 * @return el numerador
	 */
	public int getNumerador() {
		return numerador;
	}

	/**
	 * Esteblece el numerador de la fraccion (parte de arriba).
	 * @param  el numerador a establecer
	 */
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	/**
	 * Devuelve el denominador de la fraccion (parte de abajo).
	 * @return el denominador
	 */
	public int getDenominador() {
		return denominador;
	}

	/**
	 * Establece el denominador de la fraccion (parte de abajo).
	 * @param el denominador a establecer
	 */
	public void setDenominador(int denominador) {

		if(denominador==0)
			denominador=1;
		else
			this.denominador = denominador;
	}

	/**
	 * Devuelve una fraccion con la suma de dos fracciones (la del constructor y la del parametro).
	 * @return Fraccion producto de una suma de ambas fracciones.
	 */
	public Fraccion sumarfraccion(Fraccion f) {
		Fraccion aux=new Fraccion();
		aux.numerador=this.numerador*f.denominador + this.denominador*f.numerador;
		aux.denominador=f.denominador*this.denominador;
		return aux;
	}

	/**
	 * Devuelve una fraccion con la resta de dos fracciones (la del constructor y la del parametro).
	 * @return Fraccion producto de una resta de ambas fracciones.
	 */
	public Fraccion restarfraccion(Fraccion f) {
		Fraccion aux=new Fraccion();
		aux.numerador=this.numerador*f.denominador - this.denominador*f.numerador;
		aux.denominador=this.denominador*f.denominador;
		return aux;
	}
	
	/**
	 * Devuevle una fraccion con la multiplicacion de dos fracciones (la del constructor y la del parametro)
	 * @param f Fraccion
	 * @return Fraccion productor de la multiplicacion de las dos fracciones
	 */
	public Fraccion multiplicar(Fraccion f) {
		
		return (new Fraccion(this.numerador*f.numerador, this.denominador*f.denominador));
	}
	
	/**
	 * Devuevle una fraccion con la division de dos fracciones (la del constructor y la del parametro)
	 * @param f Fraccion
	 * @return Fraccion productor de la division de las dos fracciones
	 */
	public Fraccion dividir(Fraccion f) {
		
		return(new Fraccion(this.numerador*f.denominador, this.denominador*f.numerador));
	}
	
	/**
	 * Obtiene el maximo comun divisor del numerador y el denominador
	 * Para ello, utilizaremos el algoritmo de euclides.
	 * @return maximo comun divisor(nº Entero).
	 */
	private int mcd() {
		
		int u=Math.abs(numerador);
		int v=Math.abs(denominador);
		
		if(v==0)
			return u;
		
		int r;
		
		while(v!=0) {
			r=u%v;
			u=v;
			v=r;
		}
		return u;
	}

	
	/**
	 * Simplifica la fraccion haciendo uso del maximo comun divisor
	 */
	public void simplificar() {
		
		int n=mcd();  //Calculamos el maximo comun divisor de la fraccion
		
		numerador= numerador/n;
		denominador= denominador/n;
	}
	/**
	 * Devuelve una cadena de caracterees que representa la fraccion
	 */
	@Override
	public String toString() {
		
		if(denominador==1)
			return numerador+"";
		return numerador+" / "+denominador;
	}
	
	







}

package boletin;

public class Matriz {

	//Atributos

	int[][] valores;

	/**
	 * Consturctor por defecto
	 */
	public Matriz() {
		valores = new int[3][3];
	}

	/**
	 * Constructor con dos parametros
	 * @param N
	 */
	public Matriz(int N) {
		valores = new int[N][N];
	}

	/**
	 * Constructor con tres parametros
	 * @param N numero de filas
	 * @param M numero de columnas
	 */
	public Matriz(int N, int M) {
		valores = new int[N][M];
	}

	/**
	 * metodo que devuelve el numero de filas que hay 
	 * @return numero de filas
	 */
	public int nfilas() {
		return valores.length;
	}

	/**
	 * metodo que devuelve el numero de columnas
	 * @return numero de columnas
	 */

	public int ncolumnas() {
		return valores[0].length;
	}

	/**
	 * Metodo que devuelve el valor de una matriz
	 * @param i posicion de las filas
	 * @param j posicion de las columnas
	 * @return numero resultante del valor entre las posiciones pasadas como parametros
	 */
	public int getValor(int i, int j) {
		if(i>=nfilas() || j<=ncolumnas())
		return valores[i][j];
		return -1;
	}


	/**
	 * metodo que introduce un valor pasado como parametro 
	 * @param i posicion de las filas
	 * @param j posicion de las columnas
	 * @param v valor a establecer
	 */
	public void setValor(int i, int j, int v) {
		if(i>=nfilas() || j<=ncolumnas())
		valores[i][j]=v;
	}

	/**
	 * metodo que devuelve un numero entero como el mayor valor de la matriz
	 * @return numero entero como el valor mayor de la matriz
	 */
	public int mayor() {
		int mayor=valores[0][0];

		for(int i=0; i<nfilas(); i++) {
			for(int j=0; j<ncolumnas(); j++) {
				if(mayor<valores[i][j]) {
					mayor=valores[i][j];
				}
			}
			
		}
		return mayor;
	}
	
	
	/**
	 * metodo que devuelve un numero entero como el menor valor de la matriz
	 * @return numero entero como el valor menor de la matriz
	 */
	public int menor() {
		int menor=valores[0][0];

		for(int i=0; i<nfilas(); i++) {
			for(int j=0; j<ncolumnas(); j++) {
				if(menor>valores[i][j]) {
					menor=valores[i][j];
				}
			}
			
		}
		return menor;
	}

	/**
	 * metodo que genera valores aleatorios para una matriz
	 */
	public void generarValores() {
		for(int i=0; i<nfilas(); i++) {
			for(int j=0; j<ncolumnas(); j++) {
				valores[i][j]=(int)(Math.random()*10);
			}
		}
	}

	/**
	 * Metodo que devuelve una cadena con la informacion de la matriz osease la matriz 
	 */

	@Override
	public String toString() {
		String cadena="";
		for(int i=0; i<nfilas(); i++) {
			for(int j=0; j<ncolumnas(); j++) {
				cadena+=valores[i][j]+" \t";

			}
			cadena+=" \n";
		}

		return cadena;
	}





}

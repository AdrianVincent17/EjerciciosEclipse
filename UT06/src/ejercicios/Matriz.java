package ejercicios;

public class Matriz {

	// atributos

	private int[][] matriz; // atributo de una matriz de numeros enteros
	private int filas;
	private int columnas;

	/**
	 * Constructor por defecto que inicializa una amtriz de 3x3 a ceros;
	 *
	 * @param matriz
	 */
	public Matriz() {
		this.columnas = 3;
		this.filas = 3;
		this.matriz = new int[this.filas][this.columnas];
	}

	/**
	 * @param matriz
	 */
	public Matriz(int N) {
		this.matriz = new int[N][N];
	}

	/**
	 * @return devuelve el numero de filas
	 */
	public int getFilas() {
		return matriz.length;
	}

	/**
	 * @return devuevle el numero de columnnas
	 */
	public int getColumnas() {
		return matriz[0].length;
	}

	/**
	 * @return devuelve la matriz
	 */
	public int[][] getMatriz() {
		return matriz;
	}

	/**
	 * @param matriz el matriz a establecer
	 */
	public void setMatriz(int filas, int columnas) {
		this.matriz = new int[filas][columnas];
	}

	/**
	 * metodo que establece un valor para la matriz
	 *
	 * @param posicion en fila
	 * @param posicion en columna
	 * @param valor    a establecer
	 */

	public void setValor(int filas, int columnas, int valor) {
		matriz[filas][columnas] = valor;
	}

	/**
	 * Devuelve un valor para la matriz
	 *
	 * @param posicion de las filas
	 * @param posicion de las columnas
	 * @return devuelve el valor
	 */
	public int getValor(int filas, int columnas) {
		return matriz[filas][columnas];
	}

	/**
	 * metodo que genera valores aleatorios automaticament en la matriz
	 */
	public void ValoresAleatorios() {

		for (int i = 0; i < getFilas(); i++) {
			for (int j = 0; j < getColumnas(); j++) {
				matriz[i][j] = (int) (Math.random() * 10 + 1);
			}
		}
	}

	/***
	 * metodo que ordena una matriz por filas
	 */
	public void OrdenaMatriz() {

		for (int k = 0; k < getFilas(); k++) {
			for (int i = 0; i < getFilas(); i++) {
				for (int j = 0; j < getColumnas(); j++) {
					if (matriz[i][j] > matriz[i][j + 1]) {
						int aux = matriz[i][j];
						matriz[i][j] = matriz[i][j + 1];
						matriz[i][j + 1] = aux;
					}
				}
			}
		}

	}

	/**
	 * Devuelve el numero mayor que se encuentre en la matriz
	 *
	 * @return
	 */

	public int ObtenerMayor() {
		int mayor = matriz[0][0];
		for (int i = 0; i < getFilas(); i++) {
			for (int j = 0; j < getColumnas(); j++) {
				if (mayor < matriz[i][j]) {
					mayor = matriz[i][j];
				}
			}
		}

		return mayor;
	}

	/**
	 * Devuelve el numero menor que se encuentre en la matriz
	 *
	 * @return
	 */

	public int ObtenerMenor() {
		int menor = matriz[0][0];
		for (int i = 0; i < getFilas(); i++) {
			for (int j = 0; j < getColumnas(); j++) {
				if (menor > matriz[i][j]) {
					menor = matriz[i][j];
				}
			}
		}

		return menor;
	}

	/**
	 * metodo que devuelve el numero de numeros pares que contiene la matriz
	 *
	 * @return numeros pares totales contenidos en la matriz
	 */

	public int ContarPares() {
		int pares = 0;
		for (int i = 0; i < getFilas(); i++) {
			for (int j = 0; j < getColumnas(); j++) {
				if (matriz[i][j] % 2 == 0) {
					pares++;
				}
			}
		}

		return pares;
	}

	/**
	 * metodo que devuelve el numero de numeros impares que contiene la matriz
	 *
	 * @return numeros impares totales contenidos en la matriz
	 */

	public int ContarImpares() {
		int impares = 0;
		for (int i = 0; i < getFilas(); i++) {
			for (int j = 0; j < getColumnas(); j++) {
				if (matriz[i][j] % 2 != 0) {
					impares++;
				}
			}
		}

		return impares;
	}

	public void numImpares() {

		System.out.print("Numero de Impares en la martiz: ");
		for (int i = 0; i < getFilas(); i++) {
			for (int j = 0; j < getColumnas(); j++) {
				if (matriz[i][j] % 2 != 0) {
					System.out.print(matriz[i][j] + " ");
				}
			}
		}
		System.out.println();
	}

	/**
	 * metodo que muestra todos los numeros pares de la matriz
	 */
	public void numPares() {

		System.out.print("Numero de Pares en la matriz: ");
		for (int i = 0; i < getFilas(); i++) {
			for (int j = 0; j < getColumnas(); j++) {
				if (matriz[i][j] % 2 == 0) {
					System.out.print(matriz[i][j] + " ");
				}
			}
		}
		System.out.println();
	}

	/**
	 * metodo que muestra los numeros de la diagonal de la matriz
	 */
	public void diagonal() {

		for (int i = 0; i < getFilas(); i++) {
			System.out.print(matriz[i][i] + " ");
		}

	}

	/**
	 * metodo que devuelve la suma de los numeros de la diagonal de la matriz
	 *
	 * @return numero resultado de la suma
	 */
	public int sumadiagonal() {
		int suma = 0;
		for (int i = 0; i < getFilas(); i++) {
			suma += matriz[i][i];
		}
		return suma;
	}

	/**
	 * metodo que devuelve una matriz resultado de la suma de la matriz generada por
	 * la clase y otra introducida por parametro
	 *
	 * @param matriz por parametro
	 * @return devuelve la matriz suma de las dos
	 */

	public int[][] sumamatrices(int[][] a) {
		int[][] tercera = new int[filas][columnas];
		for (int i = 0; i < getFilas(); i++) {
			for (int j = 0; j < getColumnas(); j++) {
				tercera[i][j] = this.matriz[i][j] + a[i][j];
			}
		}
		return tercera;
	}

	/**
	 * Muesrra la matriz psada como parametro
	 */
	@Override
	public String toString() {
		String cadena = "";

		for (int i = 0; i < getFilas(); i++) {
			for (int j = 0; j < getColumnas(); j++) {
				cadena += matriz[i][j] + "\t";
			}
			cadena += "\n";
		}
		return cadena;
	}

	/**
	 * muestra una matriz pasada como parametro
	 *
	 * @param a
	 */
	public void mostrarmatriz(int[][] a) {
		for (int i = 0; i < getFilas(); i++) {
			for (int j = 0; j < getColumnas(); j++) {
				System.out.print(a[i][j] + " \t");

			}
			System.out.println();
		}

	}
}

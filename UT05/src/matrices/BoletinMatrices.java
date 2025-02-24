package matrices;

import java.util.Arrays;
import java.util.Scanner;

public class BoletinMatrices {
	
	final static int FIL=4;
	final static int COL=4;
	
	final static int NUMEROS=16;
	final static int LIMITE=50;
	
	/**
	 * Menu que muestra por pantalla una serie de mensajes
	 */

	private static void menu() {
		System.out.println("Opciones: ");
		System.out.println("1) Generar nuevos valores");
		System.out.println("2) Mostrar valores");
		System.out.println("3) Ordenar valores");
		System.out.println("4) Buscar valor");
		System.out.println("5) Salir");
		

	}
	
	/**
	 * Procedimiento que muestra por pantalla una matriz pasada por parametro
	 * @param matriz - matriz introducida por parametro
	 */
	
	public static void mostrarmatriz(int [][] matriz) {
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");

			}
			System.out.println();
		}
	}
	/**
	 * Funcion que genera un valor aleatorio
	 * @param ale limite hasta el que vaa a ser aleatorio
	 * @return numero aleatorio
	 */
	
	public static int aleatorio(int ale) {
		return (int)(Math.random()*ale+1);
	}
	
	/**
	 * procedimiento que ordena en metodo burbuja un array de enteros
	 * @param vector array con numero entero
	 */

	public static void ordenaburbuja(int vector[]) {
		int aux;
		boolean cambio;
		for(int i=vector.length; i>0; i--) {
			cambio=false;
			for(int j=0; j<i-1; j++) {
				if(vector[j]<vector[j+1]) {
					aux=vector[j];
					vector[j]=vector[j+1];
					vector[j+1]=aux;
					cambio=true;
				}
			}
			if(cambio==false)
				return;
		}
	}
	
	/**
	 * PROCEDIMIENTO que ordena de mayor a menor los valores de cada fila de una matriz de enteros.
	 * @param matriz --> La matriz de enteros cuyos valores queremos ordenar (int[][])
	 */
	public static void ordenarFilasMatriz(int[][] matriz) {
	  
	    
	    // Recorremos cada fila de la matriz
	    for (int i = 0; i < matriz.length; i++) 
	        // Usamos Bubble Sort para ordenar cada fila
	     ordenaburbuja(matriz[i]);
	                
	       
	}
	
	
	
	/**
	 * Funcion que determina si un valor se encutnra almacenado en una matriz
	 * @param m - array bidimensional de valores enteros
	 * @param valor - valor enero (que vamos a ver si se encuenta ya o no almacenada en la matriz)
	 * @param fila- fila de la matriz hasta la que comparamos los valores
	 * @param columna - columna de la matriz, dentro de la fila indicada como parametro, 
	 * @return true si N se encuentra entre los valores almacenados en la matriz y false en caso contrario
	 */

	public static boolean encontrado(int [][] m, int valor) {
		int i;
		//Recorremos todos los valores almacenados en filas anteriores
		for(i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) 

				if(m[i][j]==valor) 
					return true;	
		}
		return false;
	}
	
	

	public static void main(String[] args) {
		
		// Matrices, Arrays y Variables
					int[][] matriz = new int[FIL][COL];
					int opcion;	// Almacenará la opción del usuario.
					boolean introducido=false; // Baliza para comprobar que se elige la opción 1) antes que cualquier otra.
					int buscar;
					// Preguntamos al usuario para que elija una de las opciones válidas
					try {
						Scanner sc = new Scanner(System.in);
						menu();
						do {
							do {
								// Mostramos el menú y preguntamos al usuario para que elija una opción.
								
								System.out.print("Elige una opción: ");
								opcion = sc.nextInt();
								
								// Recordamos al usuario que debe elegir una opción válida en caso de no hacerlo.
								if (opcion<1||opcion>5)
									System.out.println(">> La opcion elegida no es valida");
								
								switch (opcion) {
									case 1:
				
										System.out.println("\nGenerar nuevos valores");
										for (int i = 0; i < matriz.length; i++) {
											for (int j = 0; j < matriz[i].length; j++) {
												matriz[i][j]=aleatorio(LIMITE);
											}
										}
										System.out.println();
										
										System.out.println(">> Se han almacenado nuevos valores en la matriz");
										System.out.println(">> MATRIZ: ");
										mostrarmatriz(matriz);
										System.out.println();
										introducido=true;
										break;
									case 2:
										
										if (introducido) {
											System.out.println("\n>> MATRIZ: ");
											mostrarmatriz(matriz);
										} else {
											System.out.println("[]  Primero debes generar los valores (Opcion 1)");
										}
										
										break;
									case 3:
										
										if (introducido) {
											System.out.println("\n>> Los valores de la matriz han sido ordenados por filas");
											ordenarFilasMatriz(matriz);
											
											System.out.println("\n>> MATRIZ: ");
											mostrarmatriz(matriz);
										} else {
											System.out.println("[]  Primero debes generar los valores (Opcion 1)");
										}
										
										break;
									case 4:
										
										if (introducido) {
											System.out.print("\n >> Introducimos un valor a buscar: ");
											buscar=sc.nextInt();
											if(encontrado(matriz, buscar))
												System.out.println(" >> El valor "+buscar+ " se encuenra entre los valores almacenados en la matriz");
											else
												System.out.println(" >> El valor "+buscar+ " no se encuenra entre los valores almacenados en la matriz");
										} else {
											System.out.println("[]  Primero debes generar los valores (Opcion 1)");
										}
										
										break;
										
									case 5:
										
										introducido=true;
										System.out.println("salir");
										break;
								
								}				
								
								 
							} while (opcion<1 || opcion>5 || !introducido);
						} while (opcion!=5);
						
						
						
						sc.close();
					} catch (Exception e) {
						System.out.println(">> ERROR, No has introducido un valor valido.");
						System.out.println(">> FIN DEL PROGRAMA");
					}

	}

}

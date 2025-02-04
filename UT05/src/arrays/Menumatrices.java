package arrays;

import java.util.Scanner;

public class Menumatrices {
	
	

	

		/*
		 * Realizar el siguiente menú funcional para una matriz cuadrada 3x3.
		 * 
		 * ----------------- MENÚ MATRICES -----------------
		 * Opciones:
		 * 	1) Introducir valores de la matriz.
		 * 	2) Mostrar valores almacenados en la matriz.
		 * 	3) Mostrar la diagonal principal de la matriz.
		 * 	4) Calcular la media de los valores almacenados en la matriz.
		 * 	5) Mostrar el mayor valor almacenado en la matriz.
		 * 	6) Mostrar el menor valor almacenado en la matriz.
		 * 	7) Ordenar cada fila de la matriz de menor a mayor.
		 * 	8) Ordenar todos los valores de la matriz de mayor a menor.
		 * 	9) Salir.
		 * Elige una opción: 3
		 * > Antes debes ejecutar la opción '1) Introducir valores de la matriz'.
		 * 
		 */
		
		/**
		 * PROCEDIMIENTO que muestra un menú de matrices con distintas opciones, incluida la de salida.
		 */
	
		public static void menu() {
			System.out.println("----------------- MENÚ MATRICES -----------------");
			System.out.println("Opciones: ");
			System.out.println(" 1) Introducir valores de la matriz.");
			System.out.println(" 2) Mostrar valores almacenados en la matriz.");
			System.out.println(" 3) Mostrar la diagonal principal de la matriz.");
			System.out.println(" 4) Calcular la media de los valores almacenados en la matriz.");
			System.out.println(" 5) Mostrar el mayor valor almacenado en la matriz.");
			System.out.println(" 6) Mostrar el menor valor almacenado en la matriz.");
			System.out.println(" 7) Ordenar cada fila de la matriz de menor a mayor.");
			System.out.println(" 8) Ordenar todos los valores de la matriz de mayor a menor.");
			System.out.println(" 9) Salir.");
			
		}
		
		final static int TAM =3; // Tamaño de filas y columnas de las matrices cuadradas 3x3
		
		/**
		 * PROCEDIMIENTO que muestra los valores almacenados en una matriz de enteros.
		 * @param M --> Matriz de enteros cuyos valores queremos mostrar (int[][])
		 */
		public static void mostrarMatriz(int[][] M) {
			for (int i = 0; i < M.length; i++) {
				for (int j = 0; j < M[i].length; j++) {
					System.out.print(M[i][j]+"\t");
				}
				System.out.println("\n");
			}
		}
		
		/**
		 * PROCEDIMIENTO que muestra los valores almacenados en la diagonal principal de una matriz 
		 * de enteros (el resto de valores se mostrarán con asteriscos).
		 * @param M --> Matriz de enteros cuya diagonal queremos mostrar (int[][])
		 */
		public static void mostrarDiagonal(int[][] M) {
			for (int i = 0; i < M.length; i++) {
				for (int j = 0; j < M[i].length; j++) {
					if (i==j)
						System.out.print(M[i][j]+"\t");
					else
						System.out.print("*\t");
				}
				System.out.println("\n");
			}
		}
		
		/**
		 * FUNCIÓN que devuelve la media de los valores almacenados en una matriz de enteros.
		 * @param matriz --> Matriz de números enteros (int[][])
		 * @return La media de los valores almacenados en una matriz (siempre que en la matriz haya al menos 1 elemento). 
		 * IMPORTANTE: Las matrices de tamaño 0 devolverán 0.
		 */
		public static double mediaValoresMatriz(int[][] matriz) {
			double media;
			int suma=0, conta=0;
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					suma+=matriz[i][j];
					conta++;
				}
			}
			
			// Controlamos que el divisor nunca puede ser 0
			if (conta!=0) {
				media=(double)suma/conta;
				return media;
			}
			
			return 0;
		}
		
		/**
		 * FUNCIÓN que devuelve el mayor valor de los almacenados en una matriz de enteros.
		 * @param matriz --> Matriz de enteros cuyo mayor valor queremos conocer (int[][])
		 * @return El mayor valor de la matriz (int)
		 */
		public static int mayorValorMatriz(int[][] matriz) {
			int mayor;
			mayor=matriz[0][0];	// Inicializamos mayor al primer valor (de momento)	
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					if (matriz[i][j]>mayor) 
						mayor=matriz[i][j];
				}
			}
			
			return mayor;
		}
		
		/**
		 * FUNCIÓN que devuelve el menor valor de los almacenados en una matriz de enteros.
		 * @param matriz --> Matriz de enteros cuyo menor valor queremos conocer (int[][])
		 * @return El menor valor de la matriz (int)
		 */
		public static int menorValorMatriz(int[][] matriz) {
			int menor;
			menor=matriz[0][0];	// Inicializamos menor al primer valor (de momento)	
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					if (matriz[i][j]<menor) 
						menor=matriz[i][j];
				}
			}
			
			return menor;
		}
		
		/**
		 * PROCEDIMIENTO que ordena de menor a mayor los valores de cada fila de una matriz de enteros.
		 * @param matriz --> La matriz de enteros cuyos valores queremos ordenar (int[][])
		 */
		public static void ordenarFilasMatriz(int[][] matriz) {
		    int aux;
		    
		    // Recorremos cada fila de la matriz
		    for (int i = 0; i < matriz.length; i++) {
		        // Usamos Bubble Sort para ordenar cada fila
		        for (int j = 0; j < matriz[i].length - 1; j++) {
		            for (int k = 0; k < matriz[i].length - 1 - j; k++) {
		                // Si el valor actual es mayor que el siguiente, los intercambiamos
		                if (matriz[i][k] > matriz[i][k + 1]) {
		                    aux = matriz[i][k];
		                    matriz[i][k] = matriz[i][k + 1];
		                    matriz[i][k + 1] = aux;
		                }
		            }
		        }
		    }
		}
		
		/**
		 * PROCEDIMIENTO que ordena de mayor a menor todos los valores de una matriz de enteros.
		 * @param matriz --> La matriz de enteros cuyos valores queremos ordenar (int[][])
		 */
		public static void ordenarMatriz(int[][] matriz) {
			int aux;
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					for (int x = 0; x < matriz.length; x++) {
						for (int y = 0; y < matriz[x].length; y++) {
							if (matriz[i][j]>matriz[x][y]) { // Para ordenar de menor a mayor sólo hay que cambiar el símbolo (cambiar < por >)
								aux=matriz[i][j];
								matriz[i][j]=matriz[x][y];
								matriz[x][y]=aux;
							}
						}
					}
				}
			}
		}
		
		public static void main(String[] args) {
			
			// Matrices, Arrays y Variables
			int[][] matriz = new int[TAM][TAM];
			int opcion;	// Almacenará la opción del usuario.
			boolean introducido=false; // Baliza para comprobar que se elige la opción 1) antes que cualquier otra.
			
			// Preguntamos al usuario para que elija una de las opciones válidas
			try {
				Scanner sc = new Scanner(System.in);
				
				do {
					do {
						// Mostramos el menú y preguntamos al usuario para que elija una opción.
						menu();
						System.out.print("Elige una opción: ");
						opcion = sc.nextInt();
						
						// Recordamos al usuario que debe elegir una opción válida en caso de no hacerlo.
						if (opcion<1||opcion>9)
							System.err.println("> Debes elegir una opción válida (1-7).");
						
						switch (opcion) {
							case 1:
		
								System.out.println("\nIntroduciendo valores de la matriz...");
								for (int i = 0; i < matriz.length; i++) {
									for (int j = 0; j < matriz[i].length; j++) {
										System.out.print("Valor["+i+"]["+j+"]: ");
										matriz[i][j]=sc.nextInt();
									}
								}
								System.out.println();
								
								introducido=true;
								break;
							case 2:
								
								if (introducido) {
									System.out.println("\nMatriz: ");
									mostrarMatriz(matriz);
								} else {
									System.err.println("> Antes debes ejecutar la opción '1) Introducir valores de la matriz'");
								}
								
								break;
							case 3:
								
								if (introducido) {
									System.out.println("\nDiagonal Principal: ");
									mostrarDiagonal(matriz);
								} else {
									System.err.println("> Antes debes ejecutar la opción '1) Introducir valores de la matriz'");
								}
								
								break;
							case 4:
								
								if (introducido) {
									System.out.println("\nMedia de los valores de la matriz: "+mediaValoresMatriz(matriz));
									System.out.println();
								} else {
									System.err.println("> Antes debes ejecutar la opción '1) Introducir valores de la matriz'");
								}
								
								break;
							case 5:
								
								if (introducido) {
									System.out.println("\nMayor valor de la matriz: "+mayorValorMatriz(matriz));
									System.out.println();
								} else {
									System.err.println("> Antes debes ejecutar la opción '1) Introducir valores de la matriz'");
								}
								
								break;
							case 6:
								
								if (introducido) {
									System.out.println("\nMenor valor de la matriz: "+menorValorMatriz(matriz));
									System.out.println();
								} else {
									System.err.println("> Antes debes ejecutar la opción '1) Introducir valores de la matriz'");
								}
								
								break;
							case 7:
								
								if (introducido) {
									System.out.println("\nOrdenando filas de la matriz de menor a mayor...");
									ordenarFilasMatriz(matriz);
									System.out.println("Matriz ordenada por filas:");
									mostrarMatriz(matriz);
									System.out.println();
								} else {
									System.err.println("> Antes debes ejecutar la opción '1) Introducir valores de la matriz'");
								}
								
								break;
							case 8:
								
								if (introducido) {
									System.out.println("\nOrdenando todos los valores de la matriz de mayor a menor...");
									ordenarMatriz(matriz);
									System.out.println("Matriz ordenada por completo:");
									mostrarMatriz(matriz);
									System.out.println();
								} else {
									System.err.println("> Antes debes ejecutar la opción '1) Introducir valores de la matriz'");
								}
								
								break;
							case 9:
								introducido=true;
								System.out.println("\nSaliendo...");
								
								break;
						}				
						
						
					} while (opcion<1||opcion>9||introducido==false);
				} while (opcion!=9);
				
				System.out.println("¡Hasta pronto! :D");
				
				sc.close();
			} catch (Exception e) {
				System.err.println("ERROR en la introducción del tipo de dato.");
			}

		

}
}




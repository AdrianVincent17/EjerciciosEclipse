package boletin;

public class Matriztest {

	public static void main(String[] args) {
		
		Matriz m=new Matriz(4);
		
		System.out.println("Matriz: ");
		m.generarValores();
		System.out.println(m.toString());
		
		System.out.print("Mayor numero almacenado en la matriz: ");
		System.out.println(m.mayor());
		
		System.out.print("Menor numero almacenado en la matriz: ");
		System.out.println(m.menor());
		
		
		/*
		 * aqui hacemos la suma de la diagonal
		 */
		
		int suma=0;
		for(int i=0; i<m.nfilas(); i++) {
			suma+=m.getValor(i,i);
		}
		
		System.out.println("suma de la diagonal almacenada en la matriz: "+suma);

		/**
		 * Matriz modificada para que la ultima fila sean 0
		 */
		
		System.out.println("\nMatriz modificada: ");
			for(int j=0; j<m.ncolumnas(); j++) {
				m.setValor(3, j, 0);
			}
			
			System.out.println(m.toString());
		}
		
	}



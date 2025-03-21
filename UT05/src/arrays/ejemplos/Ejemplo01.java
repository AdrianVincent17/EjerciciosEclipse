package arrays.ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo01 {
	
	//añadimos una constante para que siempre tenga el mismo valor
	final static int arrays=5;

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int[] vector= new int[arrays]; //añadimos la constante anterior
		
		try {
			
			System.out.println("Tamaño del array: "+vector.length);
			
			//mostramos por pantalla los valores almacenados
			//(como no hemos introducido nada por defecto todos seran 0)
			
			for(int i=0; i<vector.length; i++) {
				
				System.out.print(vector[i]+" ");
			}
			System.out.println();
			
			//ahora rellenamos con algunos numeros 
			
			for(int i=0; i<vector.length; i++) {
				
			System.out.print("["+(i+1)+"] Dime un valor: ");
			vector[i]=teclado.nextInt();
			
			}
			
			System.out.println();
			
			//ahora imprimimos por pantalla los numeros introducidos
			System.out.print("Valores introducidos: ");
			for(int i=0; i<vector.length; i++) {
				
				System.out.print(vector[i]+" ");	
			}
			System.out.println();
			
			
			//ahora lo imprimimos en orden inverso al introducido
			System.out.print("Valores introducidos inversos: ");
			for(int i=vector.length-1; i>=0; i--) {
				
				System.out.print(vector[i]+" ");	
			}
			System.out.println();
			
		}catch(InputMismatchException monoculo) {
			System.out.println("Error, dato no valido");
			
		}catch(Exception lupita){
			System.out.println(">> Se ha producido un ERROR");
			
		}finally {
			teclado.close();
		}

	}

}

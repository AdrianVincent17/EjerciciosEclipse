package arrays.ejemplos;

import java.util.Scanner;

public class Ejemplo05 {
	
	final static int TAM=5;

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		try {
			//Creamos el array con la longitud de la constante
			int[] array=new int[TAM];
			
			//Introducimos los valores por teclado
			System.out.println("Introduce "+TAM+" valores de tipo entero...");
			for(int i=0; i<array.length; i++) {
				System.out.print("Valor["+(i+1)+"]: ");
				array[i]=teclado.nextInt();
			}
			
			//mostramos el mayor y el menor de los valores introducidos
			int mayor,menor;
			mayor=menor=array[0];
			for(int i=1; i<array.length; i++) {
				
				if(mayor<array[i])
					mayor=array[i];
				
				if(menor>array[i])
					menor=array[i];
				
			}	
			
			System.out.print("\nMayor: "+mayor+"\nMenor: "+menor);
			
			
			
		}catch(Exception lupita) {
			System.out.println("Error");
		}finally {
			teclado.close();
		}

	}

}

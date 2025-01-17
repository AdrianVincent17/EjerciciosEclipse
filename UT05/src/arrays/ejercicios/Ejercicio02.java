package arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	final static int TAM =10;
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		try {
			
			int[]array=new int[TAM];
			int mayor, menor;
			
			
			mayor=menor=array[0];
			int i=0;
			
			System.out.print("Introduce "+TAM+" numeros...");
			for(i=0; i<array.length; i++) {
				
				array[i]=teclado.nextInt();
			}
			
			if(mayor<array[i])
				mayor=array[i];
			
			if(menor>array[i])
				menor=array[i];
			
			float media=array[i]/array.length;
			
			System.out.print("MAYOR: "+mayor);
			System.out.print("MENOR: "+menor);
			System.out.println(media);
			
		}catch(Exception e) {
			System.out.println("Error, dato introducido no valido ");
		}finally {
			teclado.close();
		}
		
		

	}

}

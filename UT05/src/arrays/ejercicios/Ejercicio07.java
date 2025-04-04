package arrays.ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		
		
		Scanner teclado=new Scanner(System.in);
		
		int[] tabla=new int[10];
		int posicion=0;
		int nuevo=0;
		try {
			
			
			//Introducimos valores a la tabla
			System.out.println("Elementos de la tabla: ");
			for(int i=0; i<8; i++) {
				System.out.print("valor: ");
				tabla[i]=teclado.nextInt();
			}
			
			//Pedimos un nuevo valor a insertar
			System.out.print("\nNuevo valor a insertar: ");
			nuevo=teclado.nextInt();
			
			
			//Pedimos la posicion donde insertar hasta que se introduzca en el rango
			do {
				
				System.out.print("Poscion donde insertar: ");
				posicion=teclado.nextInt();
				
			}while(posicion<0 || posicion>8);
				
				
			
		}catch(Exception e) {
			System.out.println("Error, dato introducido no valido ");
		}finally {
			teclado.close();
		}
		
		
		//Desplazamos los elementos de la tabla desde la posicion hasta el ultimo 
		for(int i=8; i>posicion; i--)
			tabla[i]=tabla[i-1];
		
		//Insertamos el nuevo elemento
		tabla[posicion]=nuevo;
		
		//mostramos los elementos almacenados y le quitamos uno para que no nos salga 0 al final 
		System.out.print("Tabla: ");
		for(int i=0; i<tabla.length-1; i++)
			System.out.print(tabla[i]+" ");
	}

}

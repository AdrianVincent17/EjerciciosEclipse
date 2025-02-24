package examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ej03 {

	public static void mostrarray(int [] array) {

		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}

	}


	final static int tam=8;

	public static int aleatorio(int N) {

		return (int)(Math.random()*N+1);
	}

	public static void main(String[] args) {


		int [] array=new int[tam];

		for(int i=0; i<array.length; i++) {
			array[i]=aleatorio(10);
		}

		Scanner sc=new Scanner(System.in);

		System.out.print("> Lista: ");
		mostrarray(array);

		System.out.print("\nDime un valor a eliminar: ");
        int valor = sc.nextInt();

        boolean encontrado = false;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                encontrado = true;
               
            }
        }

        if (encontrado) {
            System.out.print("Dime un valor por el que cambiar: ");
            int cambio = sc.nextInt();

          
            for (int i = 0; i < array.length; i++) {
                if (array[i] == valor) {
                    array[i] = cambio;
                }
            }

            System.out.print("> Lista con valores cambiados: ");
            mostrarray(array);
        } else {
            System.out.println("El valor " + valor + " no se encuentra en el array.");
            System.out.print("> Lista: ");
    		mostrarray(array);
        }

		sc.close();

		
	}
}







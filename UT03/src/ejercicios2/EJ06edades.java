package ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ06edades {

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
	
	
			int edad, mayores=0,altos=0 ;
			double altura, sumaaltura=0,sumaedad = 0, numeros=0;
			
			
			try {
				
			for(int i=1; i<=3; i++) {
				
			do {
				
				System.out.println("Alumno ("+i+"): ");
				System.out.print("Edad: ");
				
				edad=teclado.nextInt();
				sumaedad+=edad;
				
				System.out.print("Altura: ");
				altura=teclado.nextDouble();
				sumaaltura+=altura;
				
				numeros++;
				
			}while(edad<1 || edad>120);
			
				if(edad>18) {
					mayores++;
				}
				
				if(altura>1.75)
					altos++;
					
			}
			
			double edadM=sumaedad/numeros;
			double alturaM=sumaaltura/numeros;
			
			
			System.out.println("\n>>Mayores de 18: "+mayores);
			System.out.println(">>Alumnos mas altos de 1.75: "+altos);
			System.out.println(">>Media de edad: "+edadM);
			System.out.println(">>Media de altura: "+alturaM);
			
			}catch(InputMismatchException e) {
				System.out.println("Error, dato no valido");
			}finally {
				teclado.close();
			}
			
		

	}

}

package ejercicios2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ07adivina {

	public static void main(String[] args) {
		
		int ale=(int)(Math.random()*100+1);
		
		Scanner teclado=new Scanner(System.in);
		
		int num, intentos=0;
		try {
			
			 do{
				 
				System.out.print("Dime un numero: ");
				num=teclado.nextInt();
				intentos++;
				
				if(ale>num)
					System.out.println("El numero es mayor");
				else if(ale<num)
					System.out.println("El numero es menor");
				else
					break;
				
			}while(ale!=num);
				
		
			
			System.out.println("\n>>ACERTASTE!!");
			System.out.println(">>intantos: "+intentos);
			System.out.println(">>Numero elegido: "+ale);
			
		}catch(InputMismatchException lupita) {
			System.out.println("Error, dato no valido");
			
		}finally {
			teclado.close();
		}

	}

}

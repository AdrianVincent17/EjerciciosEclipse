package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu02 {

	public static void menu() {

		System.out.println(" _________________________");
		System.out.println("|___________MENU__________|");
		System.out.println("|                         |");
		System.out.println("|    >>     SUMA     <<   |");
		System.out.println("|                         |");
		System.out.println("|         TECLA: 1        |");
		System.out.println("|                         |");
		System.out.println("|    >>    RESTA     <<   |");
		System.out.println("|                         |");
		System.out.println("|         TECLA: 2        |");
		System.out.println("|                         |");
		System.out.println("|   >> MULTIPLICACION <<  |");
		System.out.println("|                         |");
		System.out.println("|         TECLA: 3        |");
		System.out.println("|                         |");
		System.out.println("|    >>   DIVISION   <<   |");
		System.out.println("|                         |");
		System.out.println("|         TECLA: 4        |");
		System.out.println("|                         |");
		System.out.println("|    >>   POTENCIA   <<   |");
		System.out.println("|                         |");
		System.out.println("|         TECLA: 5        |");
		System.out.println("|                         |");
		System.out.println("|    >>    SALIR     <<   |");
		System.out.println("|                         |");
		System.out.println("|         TECLA: 6        |");
		System.out.println("|_________________________|");
		System.out.print("      ELIGE UNA OPCION:");
	}

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);

		int opcion,a,b;
		try {

			do {
				menu();
				do {

					opcion=sc.nextInt();

					switch(opcion) {
					case 1: System.out.println("\nSUMA");
						System.out.print("Dime el primer sumando: ");
						a=sc.nextInt();
						System.out.print("Dime el segundo sumando: ");
						b=sc.nextInt();
						System.out.println("\n"+a+" + "+b+" = "+(a+b));break;
					case 2: System.out.println("\nRESTA");
						System.out.print("Dime el minuendo: ");
						a=sc.nextInt();
						System.out.print("Dime el sustraendo: ");
						b=sc.nextInt();
						System.out.println("\n"+a+" - "+b+" = "+(a-b));break;
					case 3: System.out.println("\nMULTIPLICACION");
						System.out.print("Dime el multiplicando: ");
						a=sc.nextInt();
						System.out.print("Dime el multiplicador: ");
						b=sc.nextInt();
						System.out.println("\n"+a+" X "+b+" = "+(a*b));break;
					case 4: System.out.println("\nDIVISION");
						System.out.print("Dime el divisor: ");
						a=sc.nextInt();
						System.out.print("Dime el dividendo: ");
						b=sc.nextInt();
						if(b!=0) 
						System.out.println("\n"+a+" / "+b+" = "+((float)a/b));
						else 
							System.out.println("El numero no se puede dividir entre 0");
						break;
					case 5: System.out.println("\nPOTENCIA");
						System.out.print("Dime la base: ");
						a=sc.nextInt();
						System.out.print("Dime la potencia: ");
						b=sc.nextInt();
						System.out.println("\n"+a+" ^ "+b+" = "+(int)Math.pow(a, b));break;
					case 6: System.out.println("\nFIN DEL PROGRAMA...ADIOS");break;
					default: System.out.println("Opcion elegida no valida");break;
							
					
					}

				}while(opcion<1 || opcion>6);

			}while(opcion!=6);

		}catch(InputMismatchException lupita) {
			System.out.println("Error, dato introducido no valido");

		}catch(AssertionError ea) {
			System.out.println(ea.getMessage());

		}finally {
			sc.close();
		}



	}

}

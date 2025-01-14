package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu01 {
	
	public static void menu() {
		
		System.out.println(" _________________________");
		System.out.println("|___________MENU__________|");
		System.out.println("|                         |");
		System.out.println("|    >>   OPCION 1   <<   |");
		System.out.println("|                         |");
		System.out.println("|         TECLA: 1        |");
		System.out.println("|                         |");
		System.out.println("|    >>   OPCION 2   <<   |");
		System.out.println("|                         |");
		System.out.println("|         TECLA: 2        |");
		System.out.println("|                         |");
		System.out.println("|    >>   OPCION 3   <<   |");
		System.out.println("|                         |");
		System.out.println("|         TECLA: 3        |");
		System.out.println("|                         |");
		System.out.println("|    >>   OPCION 4   <<   |");
		System.out.println("|                         |");
		System.out.println("|         TECLA: 4        |");
		System.out.println("|                         |");
		System.out.println("|_________________________|");
		System.out.print("      ELIGE UNA OPCION:");
	}
		
		

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int opcion;
		try {
			
			
			do {
				menu();
				do {
				opcion=sc.nextInt();
				
				switch(opcion) {
				case 1:System.out.println("Has elegido la opcion 1");break;
				case 2:System.out.println("Has elegido la opcion 2");break;
				case 3:System.out.println("Has elegido la opcion 3");break;
				case 4:System.out.println("De acuerdo, vuelva pronto");break;
				default:System.out.println("Opcion elegida no valida");break;
				}
				
			}while(opcion<1 || opcion>4);
			}while(opcion!=4);
			
		}catch(InputMismatchException lupita) {
			System.out.println(">> Error, dato introducido no valido");
		}catch(AssertionError ea) {
			System.out.println(ea.getMessage());
		}finally {
			sc.close();
		}
		
		

	}

}

package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Mayoriaedad {
	
	/**
	 * Funcion que determina si una persona es mayor de edad o no, 
	 * en funcion de su fecha de nacimiento introducida como parametro
	 * @param a - año
	 * @param m - mes
	 * @param d - dia
	 * @return TRUE si es mayor de edad y FALSE si no lo es
	 */
	
	public static boolean mayoredad(int a, int m, int d) {
		
		//Creamos la fecha actual y la formateamos para obtener el año, mes y dia
		Date hoy=new Date();
		
		int ahoy=Integer.parseInt(new SimpleDateFormat("yyyy").format(hoy));
		int mhoy=Integer.parseInt(new SimpleDateFormat("MM").format(hoy));
		int dhoy=Integer.parseInt(new SimpleDateFormat("dd").format(hoy));
		
		if(ahoy-18>a)
			return true;
		else if(ahoy-18<a)
			return false;
		else {
			if(mhoy>m)
				return true;
			else if(mhoy<m)
				return false;
			else {
				if(dhoy>=d)
					return true;
				return false;
			}
		}
		
	}

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);
		
		try {
			
			System.out.println("Introduce tu fecha de naciemieto...");

			System.out.print("Dia: ");
			int d=teclado.nextInt();
			System.out.print("Mes: ");
			int m=teclado.nextInt();
			System.out.print("Año: ");
			int a=teclado.nextInt();
			
			if(mayoredad(a,m,d))
				System.out.println("\n >Es mayor de edad");
			else
				System.out.println("\n >No es mayor de edad");
			
			
		}catch(Exception e) {
			System.out.println("Error, dato introducido no valido");
		}finally {
			teclado.close();
		}

	}

}

package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Edadtest {

	public static void main(String[] args) {
		
		
		
		Scanner teclado=new Scanner(System.in);
		
		try {
			
			System.out.print("Introduce tu año de nacimiento: ");
			int anhos=teclado.nextInt();
			System.out.print("Introduce tu mes de nacimiento: ");
			int meses=teclado.nextInt();
			System.out.print("Introduce tu dia de nacimiento: ");
			int dias=teclado.nextInt();
			
			System.out.println("\nFecha de nacimiento: "+dias+"/"+meses+"/"+anhos);
			
			
			
			//Crear la fecha actual
			Date hoy=new Date();
			System.out.println("Hoy: "+hoy);
			
			SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
			String fechaformateada=formato.format(hoy);
			System.out.println("Fecha Actual formateada: "+fechaformateada);
			
			formato=new SimpleDateFormat("dd");
			String d=formato.format(hoy);
			
			formato=new SimpleDateFormat("MM");
			String m=formato.format(hoy);
			
			formato=new SimpleDateFormat("yyyy");
			String a=formato.format(hoy);
			
			System.out.println("\nAño: "+a+"\nMes: "+m+"\nDia: "+d);
			
			System.out.println();
			
			int año, dia, mes;
			
			//fecha de hoy pasada a integer
			año=Integer.parseInt(a);
			mes=Integer.parseInt(m);
			dia=Integer.parseInt(d);
			
			if(meses<mes)
				System.out.println("Tienes: "+(año-anhos)+" años");
			else if(meses>mes)
				System.out.println("Tienes: "+((año-anhos)-1)+" años");
			else if(mes==meses && dias>dia)
				System.out.println("Tienes: "+((año-anhos)-1)+" años");
			if(mes==meses && dias==dia)
				System.out.println("Tienes: "+((año-anhos))+" felicidades");
			
		}catch(Exception lupita) {
			System.out.println("Error, dato introducido no valido");
		}finally {
			teclado.close();
		}

	}

}

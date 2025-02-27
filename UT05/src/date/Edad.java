package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		
		//Creamos la fecha de hoy y la formateamos para obtener el año el mes y el dia 
		Date hoy= new Date();
		SimpleDateFormat formato;
		
		formato=new SimpleDateFormat("yyyy");
		String year=formato.format(hoy);
		
		formato=new SimpleDateFormat("MM");
		String month=formato.format(hoy);
		
		formato=new SimpleDateFormat("dd");
		String day=formato.format(hoy);
		
		System.out.println("Fecha actual: "+day+"/"+month+"/"+year);
		
		//Convertimos a int los strings con el parseint
		int yhoy=Integer.parseInt(year);
		int mhoy=Integer.parseInt(month);
		int dhoy=Integer.parseInt(day);
		
		//Pedimos los datos del usuario por teclado
		
		Scanner teclado=new Scanner(System.in);
		
		try {
			
			System.out.println("\nIntroduce una fecha de nacimiento...");
			
			System.out.print(" Dia: ");
			int d=teclado.nextInt();
			
			System.out.print(" Mes: ");
			int m=teclado.nextInt();
			
			System.out.print(" Año: ");
			int a=teclado.nextInt();
			
			//Calculamos la edad
			int edad=yhoy-a;
			if(mhoy<m)
				edad--;
			else if(mhoy==m) {
				if(dhoy<d)
					edad--;
			}
			
			System.out.println("\nEdad: "+edad);
			if(mhoy==m)
				if(dhoy==d)
					System.out.println("Enhorabuena es tu cumple!");
			
		}catch(Exception e) {
			System.out.println("Error, dato introducido no valido ");
		}finally {
			teclado.close();
		}
	}

}

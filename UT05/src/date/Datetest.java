package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datetest {

	public static void main(String[] args) {
		
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

		
		formato=new SimpleDateFormat("HH");
		String h=formato.format(hoy);
		
		formato=new SimpleDateFormat("mm");
		String min=formato.format(hoy);
		
		formato=new SimpleDateFormat("ss");
		String s=formato.format(hoy);
		
		System.out.println("\nHoras: "+h+"\nMinutos: "+min+"\nSegundos: "+s);
	}

}

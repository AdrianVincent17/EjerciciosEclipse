package examen;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ej02 {

	public static void main(String[] args) {
		
		Date horahoy=new Date();
		
		SimpleDateFormat formato= new SimpleDateFormat("HH:mm:ss");
		
		String hora=new SimpleDateFormat("HH").format(horahoy);
		String minutos=new SimpleDateFormat("mm").format(horahoy);
		String segundos=new SimpleDateFormat("ss").format(horahoy);
		
		int horita=Integer.parseInt(hora);
		
		System.out.println("La hora en España es: ");
		System.out.println(horita+":"+minutos+":"+segundos+" en la Peninsula");
		System.out.println((horita-1)+":"+minutos+":"+segundos+" en las islas canarias");
		
		//porque al restarle una hora cuando lleguen las 00 pondraa las -1
		if(horita<0)
			horita=horita+1;

	}

}

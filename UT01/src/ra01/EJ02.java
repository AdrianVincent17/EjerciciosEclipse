package ra01;

public class EJ02 {

	public static void main(String[] args) {
		
		
		//Declaramos e inicializamos variables
		int h=2;
		int m=59;
		int s=61;
		
		 //pasamos todo a segundos 
		int totalsegundos=((h*3600)+(m*3600/60)+s);
		
		
		//volvemos a convertir todo a horas minutos y segundos
		int h2=totalsegundos/3600;
		int m2=totalsegundos%3600/60;
		int s2=totalsegundos%60;
		
		
		//mostrmaos por pantalla
		System.out.println( +h+"h "+m+"m "+s+"s");
		System.out.println( +h2+"h "+m2+"m "+s2+"s");
		

	}

}

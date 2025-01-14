package ejmplos;

public class Segundos {
	
	/**
	 * funcion que devuelve el total de segundos a partir del numero
	 * del numero de horas, minutos y segundos pasados como parametro
	 * @param h horas
	 * @param m minutos
	 * @param s segundos
	 * @return el calculo total de segundos
	 */
	
	public static int totalsegundos(int h, int m, int s) {
		int total=3600*h+60*m+s;
		return total;
	}
	
	//Programa principal
	public static void main(String[] args) {
		
		int h=0, m=1, s=10;
		
		System.out.println(h+" h "+m+" m "+s+" s "+">> total: "+totalsegundos(h,m,s));
		
		h=1;
		m=1;
		s=1;
		
		System.out.println(h+" h "+m+" m "+s+" s "+">> total: "+totalsegundos(h,m,s));
	
		h=3;
		m=40;
		s=15;
		
		System.out.println(h+" h "+m+" m "+s+" s "+">> total: "+totalsegundos(h,m,s));
	
		h=0;
		m=59;
		s=59;
		
		System.out.println(h+" h "+m+" m "+s+" s "+">> total: "+totalsegundos(h,m,s));
	}

}

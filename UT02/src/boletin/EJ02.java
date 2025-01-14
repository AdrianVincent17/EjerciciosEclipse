package boletin;

public class EJ02 {
	
	/**
	 * funcion que convierte las horas, minutos y segundos dados en segundos totales
	 * @param h horas dadas
	 * @param m minutos dados
	 * @param s segundos dados
	 * @return total de los segundos
	 */
	
	public static int totalseg(int h, int m, int s) {
		int total=3600*h+60*m+s;
		return total;
		
	}

	public static void main(String[] args) {
		
		
		//declaramos e inicializamos variables
		 
		int h, m, s;
		
		h=10;
		m=15;
		s=50;
		
		System.out.println("Horas: "+h+":"+m+":"+s);
		System.out.println("Total Segundos: "+totalseg(h,m,s));
		

	}

}

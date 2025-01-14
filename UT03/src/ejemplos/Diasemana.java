package ejemplos;

public class Diasemana {
	
	
	/**
	 * Procedimiento que declara un dia de la semana 
	 * @param N numero entero
	 */
	public static void diasemana(int N) {
		
		System.out.print("El dia de la semana de hoy es ");
		
		switch(N) {
		case 1: System.out.println("LUNES");break;
		case 2: System.out.println("MARTES");break;
		case 3: System.out.println("MIERCOLES");break;
		case 4: System.out.println("JUEVES");break;
		case 5: System.out.println("VIERNES");break;
		case 6: System.out.println("SABADO");break;
		case 7: System.out.println("DOMINGO");break;
		}
	}

	//Progrmaa principal
	public static void main(String[] args) {
		
		//Declaramos e inicializamos las variables
		int dia=(int)(Math.random()*7+1);
		
		//Hacemos la llamada al procedimiento
		diasemana(dia);
		

	}

}

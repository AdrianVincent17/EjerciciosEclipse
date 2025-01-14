package ejemplos;

public class EjemSwitch {
	
	/**
	 * Procedimiento que declara un premio por cada posicion
	 * @param N numero entero
	 */
	
	 public static void premio(int N) {

		System.out.println("la posicion "+N);
		
		switch (N) {
		case 1: System.out.println("ORO");break;
		case 2: System.out.println("PLATA");break;
		case 3: System.out.println("BRONCE");break;
		case 4:
		case 5: System.out.println("DIPLOMA");break;
		default: System.out.println("Sin premio");break;
	}
	 }
	 
	 //Programa principal

	public static void main(String[] args) {
		
		//Declaramos e inicializamos variable
		int pos=(int)(Math.random()*10+1);
		//llamamos al metoro premio
		premio(pos);
		}

	}



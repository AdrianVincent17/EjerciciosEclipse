package ejmplos;

public class Bienvenida3 {

	public static void main(String[] args) {
		
		/*aqui hacemos llamada a un metodo directamente a otra clase
		 * a traves de Bienvenida2
		 */
		
		Bienvenida2.saluda("Adrian", "Python");
		Bienvenida2.saluda("Marlon", "Java");
		Bienvenida2.saluda("Edu", "PHP");

	}

}

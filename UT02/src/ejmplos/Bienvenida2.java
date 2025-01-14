package ejmplos;

public class Bienvenida2 {
	
	/**
	 * Procedimiento oque me muestra el nombre y la tecnologia de un mensaje
	 * @param nombre nombre de la persona  que quiero que salude
	 * @param tecno tecnologia que va a prender la persona del saludo
	 */
	
	public static void saluda(String nombre, String tecno) {
		 
		//Creamos el mensaje o lo que se vaya a mostrar luego en el main
		System.out.println("Hola "+nombre+"!");
		System.out.println("Bienvenido/a al C.E.S Vega Media.");
		System.out.println("Este curso aprenderas a programar en "+tecno+".");
		System.out.println("Espero que te guste!\n");
	}

	public static void main(String[] args) {
		
		//hacemos una llamada al metodo (procedimiento)
		saluda("Adrian","JAVA");
		saluda("Erik","JAVA");
		saluda("Jesus","JAVA");
		saluda("Angel","PHP");
		saluda("Alvaro","JAVA");
		saluda("Alberto","PHP");
		saluda("Adam","JAVA");
		saluda("Marlon","PHP");
		saluda("Maria Consuelo","C#");
		saluda("Elena","PYTHON");
		
	}

}

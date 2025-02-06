package strings.ejemplos;

public class Ejemplo04 {

	public static void main(String[] args) {
		
		//trim()
		
		String nombre=new String ("   Harry Potter      ");
		System.out.println(nombre.toString());
		System.out.println(nombre.trim());
		System.out.println(nombre);
		nombre=nombre.trim();
		System.out.println(nombre);
		
		//Replace()
		System.out.println(nombre.replace('r', 'X'));
		System.out.println(nombre);
		
		//Substring()
		System.out.println(nombre.substring(6));
		System.out.println(nombre.substring(0, 5));
		
		//startswith()
		System.out.println(nombre.startsWith("Hary"));
		System.out.println(nombre.startsWith("Harry") || nombre.startsWith("harry"));
		
		//endswith()
		if(nombre.endsWith("ter"))
			System.out.println("El nombre termina en 'ter'");
		else
			System.out.println("El nombre no termina en 'ter'");
		
		
		
		
	}

}

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
		
	}

}

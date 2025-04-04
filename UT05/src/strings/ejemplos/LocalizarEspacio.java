package strings.ejemplos;

public class LocalizarEspacio {
	
	/**
	 * Localiza la posicion del primer espacio en blanco que contiene un 
	 * String pasado como parametro 
	 * @param s String
	 * @return -1 si no hay espacios en blanco, 
	 * 			un numero mayor o igual que 0 con la posicion del primer espacio en blanco
	 */

	public static int primerBlanco(String s) {

		for(int i=0; i<s.length(); i++) 
			if(s.charAt(i)==' ')
				return i;
		return -1;
		
	}



	public static void main(String[] args) {

		String nombre="Harry Potter";
		
		System.out.println(primerBlanco(nombre));
		 
		System.out.println("Nombre: "+nombre.substring(0, primerBlanco(nombre)));
		System.out.println("Apellido: "+nombre.substring(primerBlanco(nombre)+1));
		
		int pos=primerBlanco(nombre);
		if(pos>=0) {
			System.out.println("Nombre: "+nombre.substring(0, pos));
			System.out.println("Apellido: "+nombre.substring(pos+1));
		
		}else {
			System.out.println("Nombre: "+nombre);
		}

	}

}

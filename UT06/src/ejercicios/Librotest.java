package ejercicios;

public class Librotest {

	public static void main(String[] args) {
		
		Libro l1=new Libro("Las memorias de un Abeto","5469878GH","Alberto Gambin",258);
		Libro l2=new Libro("El vacio infinito","4659812JK","Gimena Lopez",365);
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		System.out.println();
		
		if(l1.getNumpaginas()>l2.getNumpaginas())
			System.out.println("El libro '"+l1.getTitulo()+"' tiene mas paginas con "+l1.getNumpaginas()+".");
		else
			System.out.println("El libro '"+l2.getTitulo()+"' tiene mas paginas con "+l2.getNumpaginas()+".");

		
	}

}

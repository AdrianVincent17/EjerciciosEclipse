package biblioteca;

public class librotest {

	public static void main(String[] args) {
		
		
		Libro l1=new Libro("Don Quijote de la Mancha","Miguel de Cervantes",830);
		Libro l2=new Libro("1984","George Orwerll",545);
		Libro l3=new Libro("El retrato de Dorian Grey","Oscar Wilde",450);
		
		//aumentamos el numero de paginas de cada libro en 100 paginas mas
		
		l1.setNumpaginas(l1.getNumpaginas()+100);
		l2.setNumpaginas(l2.getNumpaginas()+100);
		l3.setNumpaginas(l3.getNumpaginas()+100);
		
		//Mostramos la informacion de cada libro
		l1.mostrarliro();
		
		l2.mostrarliro();
	
		l3.mostrarliro();

	}

}

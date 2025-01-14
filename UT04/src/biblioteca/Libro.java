package biblioteca;

public class Libro {
	
	//Atributos
	private String titulo; 			//Titulo del libro
	private String autor;			//Nombre del autor del libro 	
	private int numpaginas;		//Numero total de paginas del libro

	/**
	 * Constructor
	 * @param titulo Titulo del libro
	 * @param autor Nombre del autor del libro
	 * @param numpaginas Numero total de paginas del libro
	 */
	public Libro(String tit, String aut, int numpag) {
		
		titulo = tit;
		autor = aut;
		numpaginas = numpag;
	}

	/**
	 * Devuelve el titulo del libro
	 * @return el titulo del libro
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Establece el titulo del libro
	 * @param titulo el titulo a establecer
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Devuelve el nombre del autor del libro
	 * @return el autor del libro
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Establece el nombre del autor del libro
	 * @param autor el autor a establecer
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Devuelve el numero total de paginas que tiene el libro
	 * @return el numpaginas del libro
	 */
	public int getNumpaginas() {
		return numpaginas;
	}

	/**
	 * Establece el numero total de paginas del libro
	 * @param numpaginas el numpaginas a establecer
	 */
	public void setNumpaginas(int numpaginas) {
		this.numpaginas = numpaginas;
	}
	
	/**
	 * Muestra la informacion sobre el libro 
	 */
	public void mostrarliro() {
		
		System.out.println("'"+titulo+"' ("+autor+"), "+numpaginas+" paginas");
		
		
	}

}

package ejercicios;

public class Libro {

	//atributos
	
	private String ISBN;
	private String titulo;
	private String autor;
	private int numpaginas;
	
	/**
	 * Constructor con 4 parametros
	 * @param iSBN
	 * @param titulo
	 * @param autor
	 * @param numpaginas
	 */
	public Libro(String titulo,String iSBN, String autor, int numpaginas) {
		this.titulo = titulo;
		ISBN = iSBN;
		this.autor = autor;
		this.numpaginas = numpaginas;
	}

	public Libro() {
		
	}

	/**
	 * @return el iSBN
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * @param iSBN el iSBN a establecer
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	/**
	 * @return el titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo el titulo a establecer
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return el autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor el autor a establecer
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return el numpaginas
	 */
	public int getNumpaginas() {
		return numpaginas;
	}

	/**
	 * @param numpaginas el numpaginas a establecer
	 */
	public void setNumpaginas(int numpaginas) {
		this.numpaginas = numpaginas;
	}

	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBN " + ISBN + " creado por el autor " + autor + "  tiene " + numpaginas + " paginas";
	}
	
	
	
	
}

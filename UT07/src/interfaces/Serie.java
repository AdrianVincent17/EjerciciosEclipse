package interfaces;

public class Serie implements Entregable {
	// constatnes
	private final static int NUM_TEMP_DEF = 3; // numero de temporadas por defecto

	// atributos
	private String titulo; // titulo de la serie
	private int num_temp; // numero de temporadas
	private String genero; // genero de la serie
	private String creador; // creador de la serie
	private boolean prestado; // atributo que dira si esta prestado o no

	/**
	 * Constructor por defecto
	 */
	public Serie() {
		this("", NUM_TEMP_DEF, "", "");

	}

	/**
	 * Constructor con dos atributos como parametros
	 * 
	 * @param titulo  de la serie
	 * @param creador de la serie
	 */
	public Serie(String titulo, String creador) {
		this(titulo, NUM_TEMP_DEF, "", creador);
	}

	/**
	 * Construcotr con todos los atributos como parametros
	 * 
	 * @param titulo   de la serie
	 * @param num_temp de la serie
	 * @param genero   de la serie
	 * @param creador  de la serie
	 */
	public Serie(String titulo, int num_temp, String genero, String creador) {
		this.titulo = titulo;
		this.num_temp = num_temp;
		this.genero = genero;
		this.creador = creador;
		prestado = false;
	}

	/**
	 * devuelve el titulo de la serie
	 * 
	 * @return titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * establece el titulo de la serie
	 * 
	 * @param titulo a establecer
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * devuelve el numero de temporadas de la serie
	 * 
	 * @return numero de temporadas
	 */
	public int getNum_temp() {
		return num_temp;
	}

	/**
	 * establece el numero de termporadas de la serie
	 * 
	 * @param numero de temporadas a establecer
	 */
	public void setNum_temp(int num_temp) {
		this.num_temp = num_temp;
	}

	/**
	 * devuelve el genero de la serie
	 * 
	 * @return genero de la serie
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Establece el genero de la serie
	 * 
	 * @param genero a establecer
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * devuelve el creador de la serie
	 * 
	 * @return creador de la serie
	 */
	public String getCreador() {
		return creador;
	}

	/**
	 * establece el creador de la serie
	 * 
	 * @param creador a establecer
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}

	/**
	 * metodo que cambia el estado de prestado a true, osea presta el articulo
	 */
	@Override
	public void entregar() {
		prestado = true;

	}

	/**
	 * metodo que cambia el estado de prestado a false, osea deuvelve el articulo
	 */
	@Override
	public void devolver() {
		prestado = false;

	}

	/**
	 * metodo que devuelve si esta prestado o no
	 */
	@Override
	public boolean isprestado() {
		return prestado;
	}

	/**
	 * metodo que devuelve la informacion de la serie
	 */

	@Override
	public String toString() {
		if (titulo.equals("")) {
			return "Serie: sin informacion registrada";
		}
		return "Serie: " + titulo + "\nnumero temporadas: " + num_temp + "\ngenero: " + genero + "\ncreador: "
				+ creador;
	}

}

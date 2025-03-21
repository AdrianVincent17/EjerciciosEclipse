package interfaces;

public class Serie implements Entregable {
	// constatnes
	private final static int num_temp_def = 3;

	// atributos
	private String titulo;
	private int num_temp;
	private String genero;
	private String creador;
	private boolean prestado;

	/**
	 * Constructor por defecto
	 */
	public Serie() {
		this("", num_temp_def, "", "");

	}

	/**
	 * @param titulo
	 * @param creador
	 */
	public Serie(String titulo, String creador) {
		this(titulo, num_temp_def, "", creador);
	}

	/**
	 * @param titulo
	 * @param num_temp
	 * @param genero
	 * @param creador
	 */
	public Serie(String titulo, int num_temp, String genero, String creador) {
		this.titulo = titulo;
		this.num_temp = num_temp;
		this.genero = genero;
		this.creador = creador;
		prestado = false;
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
	 * @return el num_temp
	 */
	public int getNum_temp() {
		return num_temp;
	}

	/**
	 * @param num_temp el num_temp a establecer
	 */
	public void setNum_temp(int num_temp) {
		this.num_temp = num_temp;
	}

	/**
	 * @return el genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero el genero a establecer
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return el creador
	 */
	public String getCreador() {
		return creador;
	}

	/**
	 * @param creador el creador a establecer
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public void entregar() {
		prestado = true;

	}

	@Override
	public void devolver() {
		prestado = false;

	}

	@Override
	public boolean isprestado() {
		return prestado;
	}

	@Override
	public String toString() {
		if (titulo.equals("")) {
			return "Serie: sin informacion registrada";
		}
		return "Serie: " + titulo + "\nnumero temporadas: " + num_temp + "\ngenero: " + genero + "\ncreador: "
				+ creador;
	}

}

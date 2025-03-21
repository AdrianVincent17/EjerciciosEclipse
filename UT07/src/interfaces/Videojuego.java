package interfaces;

public class Videojuego implements Entregable {

	// constantes
	private static final int horas_estimadas_def = 100;

	// Atributos
	private String titulo;
	private int horas_estimadas;
	private String genero;
	private String desarrollador;
	private boolean prestado;

	/**
	 *
	 */
	public Videojuego() {
		this("", horas_estimadas_def, "", "");
	}

	/**
	 * @param titulo
	 * @param desarrollador
	 */
	public Videojuego(String titulo, String desarrollador) {
		this(titulo, horas_estimadas_def, "", desarrollador);
	}

	/**
	 * @param titulo
	 * @param horas_estimadas
	 * @param genero
	 * @param desarrollador
	 */
	public Videojuego(String titulo, int horas_estimadas, String genero, String desarrollador) {
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
		this.genero = genero;
		this.desarrollador = desarrollador;
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
	 * @return el horas_estimadas
	 */
	public int getHoras_estimadas() {
		return horas_estimadas;
	}

	/**
	 * @param horas_estimadas el horas_estimadas a establecer
	 */
	public void setHoras_estimadas(int horas_estimadas) {
		this.horas_estimadas = horas_estimadas;
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
	 * @return el desarrollador
	 */
	public String getDesarrollador() {
		return desarrollador;
	}

	/**
	 * @param desarrollador el desarrollador a establecer
	 */
	public void setDesarrollador(String desarrollador) {
		this.desarrollador = desarrollador;
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
			return "Videojuego: sin informacion registrada";
		}

		return "Videojuego: " + titulo + "\nhoras estimadas: " + horas_estimadas + "\ngenero: " + genero
				+ "\ndesarrollador: " + desarrollador;
	}

}

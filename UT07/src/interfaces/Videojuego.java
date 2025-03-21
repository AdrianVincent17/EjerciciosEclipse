package interfaces;

public class Videojuego implements Entregable {

	// constantes
	private static final int HORAS_ESTIMADAS_DEF = 100;

	// Atributos
	private String titulo;
	private int horas_estimadas;
	private String genero;
	private String desarrollador;
	private boolean prestado;

	/**
	 * Constructor por defecto
	 */
	public Videojuego() {
		this("", HORAS_ESTIMADAS_DEF, "", "");
	}

	/**
	 * Constructor con dos atributos como parametros
	 * 
	 * @param titulo        del videojuego
	 * @param desarrollador del videojuego
	 */
	public Videojuego(String titulo, String desarrollador) {
		this(titulo, HORAS_ESTIMADAS_DEF, "", desarrollador);
	}

	/**
	 * Contructor con 4 atributos como parametros
	 * 
	 * @param titulo          del videojuego
	 * @param horas_estimadas del videojuego
	 * @param genero          del videojuego
	 * @param desarrollador   del videojuego
	 */
	public Videojuego(String titulo, int horas_estimadas, String genero, String desarrollador) {
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
		this.genero = genero;
		this.desarrollador = desarrollador;
	}

	/**
	 * devuelve el titulo del videojuego
	 * 
	 * @return titulo del videojuego
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * establece el titulo del videojuego
	 * 
	 * @param titulo a establecer
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * devuelve las horas estimadas del videojuego
	 * 
	 * @return horas_estimadas del videojuego
	 */
	public int getHoras_estimadas() {
		return horas_estimadas;
	}

	/**
	 * establece las horas estimadas del videojuego
	 * 
	 * @param horas_estimadas a establecer
	 */
	public void setHoras_estimadas(int horas_estimadas) {
		this.horas_estimadas = horas_estimadas;
	}

	/**
	 * devuelve el genero del videojuego
	 * 
	 * @return genero del videojuego
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * genero del videojuego a establecer
	 * 
	 * @param genero a establecer
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * devuelve el desarrollador del videojuego
	 * 
	 * @return desarrollador del videojuego
	 */
	public String getDesarrollador() {
		return desarrollador;
	}

	/**
	 * establece el desarrollador del videojuego
	 * 
	 * @param desarrollador a establecer
	 */
	public void setDesarrollador(String desarrollador) {
		this.desarrollador = desarrollador;
	}

	/**
	 * metodo que cmabia el estado entregado a true, osea esta prestado
	 */
	@Override
	public void entregar() {
		prestado = true;

	}

	/**
	 * metodo que cambia el estado entregado a false, osea esta devuelto
	 */
	@Override
	public void devolver() {
		prestado = false;

	}

	/*
	 * metodo que devuelve si esta prestado o no
	 */
	@Override
	public boolean isprestado() {
		return prestado;
	}

	/**
	 * metodo que devuelve la informacion del videojuego
	 */

	@Override
	public String toString() {
		if (titulo.equals("")) {
			return "Videojuego: sin informacion registrada";
		}

		return "Videojuego: " + titulo + "\nhoras estimadas: " + horas_estimadas + "\ngenero: " + genero
				+ "\ndesarrollador: " + desarrollador;
	}

}

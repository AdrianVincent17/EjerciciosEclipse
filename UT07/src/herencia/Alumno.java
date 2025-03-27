package herencia;

public abstract class Alumno {

	// constantes
	protected final static double notaMedDef = 7.50;

	// Atributos
	private String nombre;
	private double notaMedia;
	private String titulacion;

	/**
	 * Constructor con dos atributos pasados como parametros
	 * 
	 * @param nombre     del Alumno
	 * @param titulacion del alumno
	 */
	public Alumno(String nombre, String titulacion) {
		this.nombre = nombre;
		this.titulacion = titulacion;
		this.notaMedia = notaMedDef;
	}

	/**
	 * Constructor con todos atributos pasados como parametro
	 * 
	 * @param nombre     del Alumno
	 * @param notaMedia  del Alumno
	 * @param titulacion del Alumno
	 */
	public Alumno(String nombre, double notaMedia, String titulacion) {
		this.nombre = nombre;
		this.notaMedia = notaMedia;
		this.titulacion = titulacion;
	}

	/**
	 * devuelve el nombre del alumno
	 * 
	 * @return nombre del Alumno
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del Alumno
	 * 
	 * @param nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * devuelve la nota media del Alumno
	 * 
	 * @return notaMedia del Alumno
	 */
	public double getNotaMedia() {
		return notaMedia;
	}

	/**
	 * Establece la nota media del Alumno
	 * 
	 * @param notaMedia a establecer
	 */
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	/**
	 * Devuelve la titulacion del Alumno
	 * 
	 * @return titulacion del Alumno
	 */
	public String getTitulacion() {
		return titulacion;
	}

	/**
	 * Establece la titulacion del Alumno
	 * 
	 * @param titulacion a establecer
	 */
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	/**
	 * Devuelve la intormacion del alumno
	 */
	@Override
	public String toString() {
		return "Alumno: " + nombre + "\nnotaMedia: " + notaMedia + "\ntitulacion: " + titulacion;
	}

	/*
	 * metodo que calcula la nota final del alumno (implementado en clases hijas)
	 */
	public abstract double notafinal();

}

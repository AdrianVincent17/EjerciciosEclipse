package herencia;

public class Doctorado extends Alumno {

	// Constantes
	protected double notaTesisDef = 8.50;

	// Atributos
	private String nombreTesis;
	private double notaTesis;

	/**
	 * Devuelve el nombre de la tesis
	 * 
	 * @return nombreTesis es el nombre de la tesis
	 */
	public String getNombreTesis() {
		return nombreTesis;
	}

	/**
	 * Establece el nombre de la tesis
	 * 
	 * @param nombre de la tesis a establecer
	 */
	public void setNombreTesis(String nombreTesis) {
		this.nombreTesis = nombreTesis;
	}

	/**
	 * Devuelve la nota de la tesis
	 * 
	 * @return nota de la Tesis
	 */
	public double getNotaTesis() {
		return notaTesis;
	}

	/**
	 * Establece la nota de la tesis
	 * 
	 * @param nota de la Tesis a establecer
	 */
	public void setNotaTesis(double notaTesis) {
		this.notaTesis = notaTesis;
	}

	/**
	 * Constructor con todos los atributos como parametros incluidos los heredados
	 * 
	 * @param nombre      Alumno
	 * @param notaMedia   del Alumno
	 * @param titulacion  del Alumno
	 * @param notaTesis   del alumno
	 * @param nombreTesis del alumno
	 */
	public Doctorado(String nombre, double notaMedia, String titulacion, double notaTesis, String nombreTesis) {
		super(nombre, notaMedia, titulacion);
		this.notaTesis = notaTesis;
		this.nombreTesis = nombreTesis;

	}

	/**
	 * metodo que establece la nota final del alumno
	 */

	@Override
	public double notafinal() {
		double notatesis;
		notatesis = (super.getNotaMedia() + getNotaTesis()) / 2;
		return notatesis;
	}

	/**
	 * metodo que meustra la informacin sobre el alumno
	 */
	@Override
	public String toString() {
		return super.toString() + "\nNombre Tesis: " + nombreTesis + "\nnota final: " + notafinal();
	}

}

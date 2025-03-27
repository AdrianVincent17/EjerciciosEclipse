package examen;

public class Cocinero extends Empleado {

	// Atributos
	private int Experiencia;

	/**
	 * Constructor con un atributo heredado
	 * 
	 * @param nombre del cocinero
	 */
	public Cocinero(String nombre, int experiencia) {
		super(nombre);
		this.Experiencia = experiencia;
	}

	/**
	 * Constructor con todos los parametros como atributos
	 * 
	 * @param nombre      del cocinero
	 * @param horas       del cocinero
	 * @param experiencia del cocinero
	 */
	public Cocinero(String nombre, int horas, int experiencia) {
		super(nombre, horas);
		Experiencia = experiencia;

	}

	/**
	 * devuelve la exp
	 * 
	 * @return experiencia devuelta
	 */
	public int getExperiencia() {
		return Experiencia;
	}

	/**
	 * Extablece la exp
	 * 
	 * @param experiencia a establecer
	 */
	public void setExperiencia(int experiencia) {
		Experiencia = experiencia;
	}

	/**
	 * Metodo que devuelve el salario final del cocinero
	 */

	@Override
	public double salarioFinal() {

		return super.salarioBase() + (this.Experiencia * 75);
	}

	/**
	 * Metodo que devuelve la info del cocinero
	 */

	@Override
	public String toString() {
		return "COCINERO/A " + super.toString() + "\n Experiencia: " + Experiencia + "\n Salario: " + salarioFinal();
	}

}

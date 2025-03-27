package examen;

public abstract class Empleado {

	// constantes
	protected final static double SALARIO_MIN = 1000;
	protected final static int HORAS_MIN = 20;

	// Atributos
	private String nombre;
	private int horas;

	/**
	 * Constructor con todos los atributos como parametros
	 * 
	 * @param nombre del empleado
	 * @param horas  contratado
	 */
	public Empleado(String nombre, int horas) {
		this.nombre = nombre;
		if (horas > HORAS_MIN)
			this.horas = horas;
		else
			this.horas = HORAS_MIN;
	}

	/**
	 * Constructor con un atributo cmo parametro
	 * 
	 * @param nombre del empleado
	 */
	public Empleado(String nombre) {
		this.nombre = nombre;
		this.horas = HORAS_MIN;
	}

	/**
	 * metodo que devuelve el nombre del empleado
	 * 
	 * @return nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * metodo que establece el nombre del empleado
	 * 
	 * @param nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * metodo que devuelve el numero de horas del empleado
	 * 
	 * @return horas contratado
	 */
	public int getHoras() {
		return horas;
	}

	/**
	 * Emetodo que establece el numero de horas del empleado
	 * 
	 * @param horas a establecer
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}

	/**
	 * metodo que devuelve el salario base de un empleado tomando en cuenta sus
	 * horas
	 * 
	 * @return salario base
	 */

	public double salarioBase() {

		double salariobase = 0;

		if (horas > HORAS_MIN)
			salariobase = SALARIO_MIN + ((HORAS_MIN - horas) * 50);
		else
			salariobase = SALARIO_MIN;

		return salariobase;
	}

	/**
	 * Metodo implementado en las clases hijas
	 * 
	 * @return salario final del empleado
	 */
	public abstract double salarioFinal();

	/**
	 * metodo que devuelve la informacion sobre el empleado
	 */

	@Override
	public String toString() {
		return "\n Nombre: " + nombre + "\n contrato: " + horas;
	}

}

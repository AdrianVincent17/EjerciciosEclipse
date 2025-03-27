package examen;

public class Camarero extends Empleado {

	// Atributo
	private double propina;

	/**
	 * Constructor con un atributo y uno heredado
	 * 
	 * @param nombre  del camarero
	 * @param propina del camarero
	 */

	public Camarero(String nombre, double propina) {
		super(nombre);
		this.propina = propina;

	}

	/**
	 * Constructor con todos los atributos como parametro
	 * 
	 * @param nombre del camarero
	 * @param horas  del camarero
	 */
	public Camarero(String nombre, int horas, double propina) {
		super(nombre, horas);
		this.propina = propina;

	}

	/**
	 * devuelve la propina del camarero
	 * 
	 * @return propina del camarero
	 */
	public double getPropina() {
		return propina;
	}

	/**
	 * Establece la propina del camarero
	 * 
	 * @param propina a establecer
	 */
	public void setPropina(double propina) {
		this.propina = propina;
	}

	/**
	 * Metodo que devuelve el salario final del camarero
	 */
	@Override
	public double salarioFinal() {

		if (propina > 0)
			return super.salarioBase() + propina;
		else
			return super.salarioBase();

	}

	/**
	 * metodo que devuelve la informacion del empleado
	 */

	@Override
	public String toString() {
		return "CAMARERO/A " + super.toString() + "\n propina: " + propina + "\n salario: " + salarioFinal();
	}

}

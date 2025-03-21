package herencia;

public class Comercial extends Empleados {

	// Atributos
	private double comision;

	/**
	 * @param nombre
	 * @param edad
	 * @param salario
	 */
	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	/**
	 * @return el comision
	 */
	public double getComision() {
		return comision;
	}

	/**
	 * @param comision el comision a establecer
	 */
	public void setComision(int comision) {
		this.comision = comision;
	}

	@Override
	public boolean PLUS() {

		if (getEdad() > 30 && comision > 200)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "Comercial: " + super.toString() + "\ncomision: " + comision + " €";
	}

}

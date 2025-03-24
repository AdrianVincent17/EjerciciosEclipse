package herencia;

public class Repartidor extends Empleados {

	// Atributos
	private String zona;

	/**
	 * Contructor de todos los atributos como parametros
	 * 
	 * @param nombre  del repartidor
	 * @param edad    del repartidor
	 * @param salario del repartidor
	 */
	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;

	}

	/**
	 * @return el zona
	 */
	public String getZona() {
		return zona;
	}

	/**
	 * @param zona el zona a establecer
	 */
	public void setZona(String zona) {
	}

	@Override
	public String toString() {
		return "Repartidor:  " + super.toString() + "\nzona: " + zona;
	}

	@Override
	public boolean PLUS() {
		if (super.getEdad() < 25 && this.zona.equalsIgnoreCase("zona 3")) {
			double nuevosalario = super.getSalario() + super.PLUS;
			super.setSalario(nuevosalario);
			return true;
		}
		return false;
	}

}

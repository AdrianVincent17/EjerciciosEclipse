package herencia;

abstract class Empleados {

	// constantes
	private static final int PLUS = 300; // contante que define el plus del salario

	// Atributos
	private String nombre; // nombre del empleado
	private int edad; // edad del empleado
	private double salario; // salario del empleado

	/**
	 * constructor con todos los atributos como parametros
	 * 
	 * @param nombre  del empleado
	 * @param edad    del empleado
	 * @param salario del empleado
	 */

	public Empleados(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad el edad a establecer
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return el salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario el salario a establecer
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "nombre: " + nombre + "\nedad: " + edad + "\nsalario: " + salario + " €";
	}

	public abstract boolean PLUS();

}

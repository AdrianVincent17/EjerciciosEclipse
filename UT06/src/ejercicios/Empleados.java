package ejercicios;

public class Empleados {

//Atributos (deben estar encapsulados):
//nombre (String)
//edad (int)
//salarioBase (double)
//añosExperiencia (int)
//puesto (String, puede ser "Junior", "SemiSenior" o "Senior")
//Valores por defecto:
//nombre: cadena vacía.
//edad: 18.
//salarioBase: 1000.0.
//añosExperiencia: 0.
//puesto: "Junior".
//Constructores:
//1. Constructor por defecto (valores iniciales por defecto).
//2. Constructor con nombre, edad y puesto (los demás valores serán los predeterminados).
//3. Constructor con todos los parámetros.
//Métodos:
//calcularSalarioFinal(): Calcula el salario total del empleado según estas reglas:
//Si el puesto es "Junior", el salario es salarioBase.
//Si el puesto es "SemiSenior", el salario aumenta en un 20%.
//Si el puesto es "Senior", el salario aumenta en un 40%.
//Si el empleado tiene más de 5 años de experiencia, se le suma un 10% adicional al salario total.
//esElegibleParaAscenso(): Devuelve true si el empleado tiene más de 3 años de experiencia y su puesto no es "Senior".
//toString(): Devuelve toda la información del empleado (nombre, edad, salario final, etc.).
//Métodos set y get para cada atributo.
//Ejemplo de uso:
//Realiza un programa que pida por teclado el nombre, la edad, el salario base, los años de experiencia y el puesto del empleado. Luego:
//1. Calcula y muestra el salario final.
//2. Indica si es elegible para ascenso.
//3. Muestra toda la información del empleado.

//atributos

	private String nombre;
	private int edad;
	private double salariobase;
	private int experiencia;
	private String puesto;

	/**
	 * Constructor por defecto
	 */
	public Empleados() {

		nombre = "";
		edad = 18;
		salariobase = 1000.0;
		experiencia = 0;
		puesto = "Junior";
	}

	/**
	 * Constructor con 3 parametros
	 *
	 * @param nombre del empleado
	 * @param edad   del empleado
	 * @param puesto puesto del empleado
	 */
	public Empleados(String nombre, int edad, String puesto) {
		this.nombre = nombre;
		this.edad = edad;
		salariobase = 1000.0;
		experiencia = 0;
		this.puesto = puesto;
	}

	/**
	 * Constructor con todos los parametros
	 *
	 * @param nombre      empleados
	 * @param edad        empleados
	 * @param salariobase empleados
	 * @param experiencia empleados
	 * @param puesto      empleados
	 */
	public Empleados(String nombre, int edad, double salariobase, int experiencia, String puesto) {
		this.nombre = nombre;
		this.edad = edad;
		this.salariobase = salariobase;
		this.experiencia = experiencia;
		this.puesto = puesto;
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
	 * @return el salariobase
	 */
	public double getSalariobase() {
		return salariobase;
	}

	/**
	 * @param salariobase el salariobase a establecer
	 */
	public void setSalariobase(double salariobase) {
		this.salariobase = salariobase;
	}

	/**
	 * @return el experiencia
	 */
	public int getExperiencia() {
		return experiencia;
	}

	/**
	 * @param experiencia el experiencia a establecer
	 */
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	/**
	 * @return el puesto
	 */
	public String getPuesto() {
		return puesto;
	}

	/**
	 * @param puesto el puesto a establecer
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	/**
	 * metodo que calcula segun el puesto y los años de experiencia un sueldo con
	 * pluses
	 *
	 * @return salario total con los pluses añadidos
	 */

	public double calcularsalariofinal() {

		double salariofinal;
		if (puesto.equals("SemiSenior")) {
			salariofinal = salariobase * 1.20;
		} else if (puesto.equals("Senior")) {
			salariofinal = salariobase * 1.40;
		} else {
			salariofinal = salariobase;
		}

		if (experiencia > 3) {
			salariofinal = salariofinal * 1.10;
		}

		return salariofinal;
	}

	/**
	 * metodo que devuelve true o false en caso de que se apto para el ascenso
	 * @return true si cumple las condiciones o false si no.
	 */
	public boolean esposibleascenso() {

		if (experiencia < 3) {
			return false;
		} else if (puesto.equals("Senior")) {
			return false;
		} else {
			return true;
		}
	}
	
	
	/***
	 * metodo que muestra una cadena de caracteres con la informacion 
	 */
	
	@Override
	public String toString() {
		return "nombre: " + nombre + "\nedad: " + edad + "\nsalariobase: " + salariobase + "\nexperiencia: "
				+ experiencia + "\npuesto: " + puesto + "\nsalario final: " + calcularsalariofinal();
	}

}

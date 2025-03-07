package ejercicios;

public class Alumno {
	private String nombre;
	private int edad;
	private double[] calificaciones;

	/**
	 * Constructor con dos parametros
	 *
	 * @param nombre
	 * @param edad
	 */
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.calificaciones = new double[5];
		
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
	 * @return el calificaciones
	 */
	public double[] getCalificaciones() {
		return calificaciones;
	}

	/**
	 * @param calificaciones el calificaciones a establecer
	 */
	public void setCalificaciones(double[] calificaciones) {
		for (int i = 0; i < this.calificaciones.length; i++) {
			this.calificaciones[i] = calificaciones[i];
		}
	}

	public void agregarcalificaciones(double calific) {

		for (int i = 0; i < calificaciones.length; i++) {
			if (calificaciones[i] == 0) {
				calificaciones[i] += calific;
				break;
			}
		}
	}

	public double Calcularpromedio() {

		double suma = 0;
		int contador = 0;

		for (int i=0; i<calificaciones.length; i++) {
			suma += calificaciones[i];
			contador++;
		}

		return suma / contador;

	}

	public boolean estaaprobado() {

		if (Calcularpromedio() >= 5) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Alumno: " + nombre + "\nedad: " + edad + "\npromedio: " + Calcularpromedio();
	}

}

package ligabasket;

public class Jugador {
	
	
	//Atributos
	
	private String nombre;
	private int dorsal;
	private double altura;
	private String puesto;
	private int salario;
	
	/**
	 * Constructor vacio
	 */
	public Jugador() {
		nombre="";
		dorsal=0;
		altura=2.0;
		puesto="base";
		salario=72000;
	}

	/**
	 * Constructor 
	 * @param nombre
	 * @param dorsal
	 * @param altura
	 * @param puesto
	 * @param salario
	 */
	public Jugador(String nombre, int dorsal, double altura, String puesto, int salario) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.altura = altura;
		this.puesto = puesto;
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
	 * @return el dorsal
	 */
	public int getDorsal() {
		return dorsal;
	}

	/**
	 * @param dorsal el dorsal a establecer
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	/**
	 * @return el altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura el altura a establecer
	 */
	public void setAltura(double altura) {
		this.altura = altura;
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
	 * @return el salario
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * @param salario el salario a establecer
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	/**
	 * Devuelve una cadena con toda la informacion del jugador
	 * @return cadena con la informacion del jugador
	 */
	public String mostrarjugador() {
		String cad="";
		
		cad+="Nombre: "+nombre+"\nPuesto: "+puesto+"\nDorsal: "+dorsal;
		cad+="\nAltura: "+altura+" mt\nSueldo Anual: "+salario+" €\n";
		
		return cad;
		
	}

	
	
}

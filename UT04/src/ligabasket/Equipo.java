package ligabasket;

public class Equipo {

	//Atributos

	private int codigo; 			//Codigo del equipo
	private String nombre; 			//Nombre del equipo
	private String ciudad; 			//Ciudad donde juega el equipo
	private String pabellon; 		//Nombre del pabellon donde juega el equipo
	
	/**
	 * Constructor
	 * @param codigo
	 * @param nombre
	 * @param ciudad
	 * @param pabellon
	 */
	
	public Equipo() {
		
	}
	
	public Equipo(int codigo, String nombre, String ciudad, String pabellon) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pabellon = pabellon;
	}

	/**
	 * Devuelve el codigo del equipo
	 * @return el codigo del equipo
	 */
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * Establece el codigo del equipo
	 * @param cod el codigo a establecer
	 */
	public void setCodigo(int cod) {
		codigo = cod;
	}
	
	/**
	 * Devuelve el nombre del equipo
	 * @return el nombre del equipo
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Esteblece el nombre del equipo
	 * @param nom el nombre a establecer
	 */
	public void setNombre(String nom) {
		nombre = nom;
	}
	
	/**
	 * Devuelve el nombre de la diudad del equipo
	 * @return la ciudad del equipo
	 */
	public String getCiudad() {
		return ciudad;
	}
	
	/**
	 * Establece el nombre de la ciudad del equipo
	 * @param ciu la ciudad a establecer
	 */
	public void setCiudad(String ciu) {
		ciudad = ciu;
	}
	/**
	 * Devuelve el nombre del pabellon del equipo
	 * @return el pabellon del equipo
	 */
	public String getPabellon() {
		return pabellon;
	}
	/**
	 * Establece el nombre del pabellon del equipo
	 * @param pab el pabellon a establecer
	 */
	public void setPabellon(String pab) {
		pabellon = pab;
	}
	
	/**
	 *Mostrar toda la informacion referente al equipo
	 */
	
	public  void mostrarequipo() {
		
		System.out.println("Equipo: "+codigo);
		System.out.println("Nombre: "+nombre);
		System.out.println("Ciudad: "+ciudad);
		System.out.println("Pabellon: "+pabellon);
		
	}
	
	@Override
	/**
	 * Devuelve una cadena de caracteres con toda la informacion sobre un equpo
	 * @return un string con toda la informacion sobre un equipo
	 */
	
	public String toString() {
		return "Equipo [codigo=" + codigo + ", nombre=" + nombre + ", ciudad=" + ciudad + ", pabellon=" + pabellon
				+ "]";
	}
	
	


	

}

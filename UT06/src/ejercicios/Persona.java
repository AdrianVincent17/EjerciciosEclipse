package ejercicios;

public class Persona {
	
	//Atributos
	
	private String nombre;
	private int edad;
	private char sexo;
	private double peso;
	private double altura;
	
	
	/**
	 * Constructor por defecto
	 */
	public Persona() {
		
		this.nombre="";
		this.edad=0;
		this.sexo='H';
		this.peso=0;
		this.altura=0;
		
	}

	/**
	 * @param nombre
	 * @param edad
	 * @param sexo
	 */
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso=0;
		this.altura=0;
	}

	/**
	 * @param nombre
	 * @param edad
	 * @param sexo
	 * @param peso
	 * @param altura
	 */
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
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
	 * @return el sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo el sexo a establecer
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return el peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso el peso a establecer
	 */
	public void setPeso(double peso) {
		this.peso = peso;
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

	@Override
	public String toString() {
		String sexo = "";
		if(this.sexo=='H' || this.sexo=='h')
				sexo="Hombre";
		if(this.sexo=='M'|| this.sexo=='M')
				sexo="Mujer";
		
		return "\nInformacion de la persona: \n"+"Nombre: " + nombre + " \nEdad " + edad + 
				" \nSexo " + sexo + " \nPeso " + peso + " kg "+" \nAltura "
				+ altura + " m\n";
	}
	
	public int CalcularIMC() {
		
		int imc=(int) (this.peso/(Math.pow(altura, 2)));
		
		if(imc<20)
			return -1;
		else if(imc>=20 && imc<=25)
			return 0;
		else
			return 1;
	}
	
	public boolean mayoredad() {
	
		if(this.edad>=18)
			return true;
		else 
			return false;
	}



}

package herencia;

public class Lavadora extends Electrodomestico {

	// constantes
	public final static int carga_def = 5;

	// atributos
	private int carga;

	/**
	 * Constructor por defecto
	 */
	public Lavadora() {
		super();
		this.carga = carga_def;
	}

	/**
	 * Constructor con dos parametros heredados de la superclase y el resto por
	 * defecto
	 *
	 * @param precio_base introducido como parametro
	 * @param peso        introducido como parametro
	 */
	public Lavadora(int precio_base, int peso) {
		super(precio_base, peso, consumo_energetico_def, color_def);
		this.carga = carga_def;
	}

	/**
	 * Constructor con todos los atributos como parametros incluidos los heredados
	 *
	 * @param precio_base        como parametro
	 * @param peso               como parametro
	 * @param consumo_energetico como parametro
	 * @param color              como parametro
	 */
	public Lavadora(int precio_base, int peso, char consumo_energetico, String color, int carga) {
		super(precio_base, peso, consumo_energetico, color);
		this.carga = carga;
	}

	/**
	 * metodo que devuelve la carga de la lavadora
	 *
	 * @return carga de la lavadora
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * metodo que establece la carga de la lavadora
	 *
	 * @param carga a establecer
	 */
	public void setCarga(int carga) {
		this.carga = carga;
	}

	/**
	 * metodo que devuelve el precio final de la lavadora con las nuevas condiciones
	 * empleadas
	 */
	@Override
	public double preciofinal() {
		double preciofinal = super.preciofinal();
		if (carga > 30) {
			preciofinal += 50;
		}

		return preciofinal;

	}

	/**
	 * metodo que devuelve la informacion de la lavadora
	 */
	@Override
	public String toString() {
		return "color: " + getColor() + "\npeso: " + getPeso() + " kg" + "\nconsumo energetico: "
				+ getConsumo_energetico() + "\ncarga: " + carga + " kg" + "\nprecio final: " + preciofinal() + " €\n";
	}

}

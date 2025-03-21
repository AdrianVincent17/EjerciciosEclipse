package herencia;

public class Lavadora extends Electrodomestico {

	// constantes
	private final static int CARGA_DEF = 5; // carga de la lavadora por defecto

	// atributos
	private int carga; // carga de la lavadora

	/**
	 * Constructor por defecto
	 */
	public Lavadora() {
		this(PRECIO_BASE_DEF, PESO_DEF, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
	}

	/**
	 * Contructor con dos atributos como parametros ademas de los heredados de la
	 * superclase
	 */
	public Lavadora(double precio_base, double peso) {
		this(precio_base, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF, CARGA_DEF);
	}

	/**
	 * Constructor con todos los atributos como parametros incluidos los heredados
	 *
	 * @param precioBaseDef      de la lavadora
	 * @param pesoDef            de la lavadora
	 * @param consumo_energetico de la lavadora
	 * @param color              de la lavadora
	 * @param carga              de la lavadora
	 */
	public Lavadora(double precioBaseDef, double pesoDef, char consumo_energetico, String color, int carga) {
		super(precioBaseDef, pesoDef, consumo_energetico, color);
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
	 * metodo que devuelve el precio final de la lavadora con las nuevas condiciones
	 * empleadas
	 */

	@Override
	public double preciofinal() {

		double preciofin = super.preciofinal();
		if (carga > 30) {
			preciofin += 50;
		}

		return preciofin;

	}

	/**
	 * metodo que devuelve la informacion de la lavadora
	 */
	@Override
	public String toString() {
		return "Lavadora: " + color + "\npeso: " + peso + " kg" + "\nconsumo energetico: " + consumo_energetico
				+ "\ncarga: " + carga + " kg" + "\nprecio final: " + preciofinal() + " €\n";
	}

}

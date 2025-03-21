package herencia;

public class Electrodomestico {

	// Constantes
	protected static final int precio_base_def = 100;
	protected static final int peso_def = 5;
	protected static final char consumo_energetico_def = 'F';
	protected static final String color_def = "blanco";

	// Atributos
	protected double precio_base;
	protected double peso;
	protected char consumo_energetico;
	protected String color;

	/**
	 * Constructor por defecto con valores por defecto
	 */
	public Electrodomestico() {

		precio_base = precio_base_def;
		peso = peso_def;
		consumo_energetico = consumo_energetico_def;
		color = color_def;
	}

	/**
	 * Constructor con dos parametros y el resto por defecto
	 *
	 * @param precio_base del electrodomestico
	 * @param peso        del electrodomestico
	 */
	public Electrodomestico(int precio_base, int peso) {
		this.precio_base = precio_base;
		this.peso = peso;
		consumo_energetico = consumo_energetico_def;
		color = color_def;
	}

	/**
	 * Constructor con todos los atributos como parametros
	 *
	 * @param precio_base        del electrodomestico
	 * @param peso               del electrodomestico
	 * @param consumo_energetico del electrodomestico
	 * @param color              del electrodomestico
	 */
	public Electrodomestico(int precio_base, int peso, char consumo_energetico, String color) {
		this.precio_base = precio_base;
		this.peso = peso;
		if (comprobarConsumoEnergetico(consumo_energetico)) {
			this.consumo_energetico = consumo_energetico;
		} else {
			this.consumo_energetico = consumo_energetico_def;
		}
		if (comprobarColor(color)) {
			this.color = color;
		} else {
			this.color = color_def;
		}
	}

	/**
	 * metodo que devuelve el precio base del electrodomestico
	 *
	 * @return el precio_base del electrodomestico
	 */
	public double getPrecio_base() {
		return precio_base;
	}

	/**
	 * metodo que establece el precio base del electrodomestico
	 *
	 * @param precio_base a establecer
	 */
	public void setPrecio_base(int precio_base) {
		this.precio_base = precio_base;
	}

	/**
	 * metodo que devuelve el peso del electrodomestico
	 *
	 * @return el peso del electrodomestico
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * metodo que establece el peso del electrodomestico
	 *
	 * @param peso a establecer
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * metodo que devuelve el consumo energetico del electrodomestico
	 *
	 * @return el consumo_energetico como char del electrodomestico
	 */
	public char getConsumo_energetico() {
		return consumo_energetico;
	}

	/**
	 * metodo que establece el consumo del electrodomestico
	 *
	 * @param consumo_energetico a establecer
	 */
	public void setConsumo_energetico(char consumo_energetico) {
		this.consumo_energetico = consumo_energetico;
	}

	/**
	 * metodo que devuelve el color del electrodomestico
	 *
	 * @return el color del electrodomestico
	 */
	public String getColor() {
		return color;
	}

	/**
	 * metodo que establece el color del electrodomestico
	 *
	 * @param color a establecer
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * metodo que devuelve verdadero o falso si el consumo energetico es el correcto
	 * o no
	 *
	 * @param letra a comprobar
	 * @return devuelve TRUE si la letra del parametro esta en rango o FALSE si no
	 *         lo esta
	 */

	private boolean comprobarConsumoEnergetico(char letra) {
		if (letra >= 'A' && letra <= 'F') {
			return true;
		}
		return false;
	}

	/**
	 * metodo que devuelve un verdadero o falso si el color es correcto o no
	 *
	 * @param color pasado como parametro
	 * @return TRUE si pertenece a un color valido o FALSE si no lo es
	 */
	private boolean comprobarColor(String color) {

		if (color.equals("blanco") || color.equals("rojo") || color.equals("azul") || color.equals("gris")
				|| color.equals("negro")) {
			return true;
		}

		return false;

	}

	/**
	 * metodo que devuelve el precio final del electrodomestido dadas unos
	 * parametros de consumo y peso
	 *
	 * @return numero entero con el precio final
	 */
	public double preciofinal() {
		double preciofinal = 0;

		if (consumo_energetico == 'A') {
			preciofinal = 100;
		}
		if (consumo_energetico == 'B') {
			preciofinal = 80;
		}
		if (consumo_energetico == 'C') {
			preciofinal = 60;
		}
		if (consumo_energetico == 'D') {
			preciofinal = 50;
		}
		if (consumo_energetico == 'E') {
			preciofinal = 30;
		}
		if (consumo_energetico == 'F') {
			preciofinal = 10;
		}

		if (peso >= 0 && peso <= 19) {
			preciofinal += 10;
		}
		if (peso >= 20 && peso <= 49) {
			preciofinal += 50;
		}
		if (peso >= 50 && peso <= 79) {
			preciofinal += 80;
		}
		if (peso >= 80) {
			preciofinal += 100;
		}

		return preciofinal + precio_base;
	}

	/**
	 * metodo que devuelve la informacion sobre el electrodomestico
	 */
	@Override
	public String toString() {
		return "color: " + color + "\npeso: " + peso + " kg" + "\nconsumo energetico: " + consumo_energetico
				+ "\nprecio final: " + this.preciofinal() + " €\n";
	}

}

package herencia;

public class Electrodomestico {

	// Constantes
	protected static final double PRECIO_BASE_DEF = 100; // precio base por defecto
	protected static final double PESO_DEF = 5; // peso por defecto
	protected static final char CONSUMO_ENERGETICO_DEF = 'F'; // consumo por defecto
	protected static final String COLOR_DEF = "blanco"; // color por defecto

	// Atributos
	protected double precio_base; // precio base del electrodomestico
	protected double peso; // peso base del electrodomestico
	protected char consumo_energetico; // consumo energetico del electrodomestico
	protected String color; // color del electrodomestico

	/**
	 * Constructor por defecto con valores por defecto
	 */
	public Electrodomestico() {

		precio_base = PRECIO_BASE_DEF;
		peso = PESO_DEF;
		consumo_energetico = CONSUMO_ENERGETICO_DEF;
		color = COLOR_DEF;
	}

	/**
	 * Constructor con dos parametros y el resto por defecto
	 *
	 * @param precio_base del electrodomestico
	 * @param peso        del electrodomestico
	 */
	public Electrodomestico(double precio_base, double peso) {
		this(precio_base, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF); // metodo que hace referencia al constructor de 4
		// parametros
		/*
		 * this.precio_base = precio_base; this.peso = peso; consumo_energetico =
		 * CONSUMO_ENERGETICO_DEF; color = COLOR_DEF;
		 */
	}

	/**
	 * Constructor con todos los atributos como parametros
	 *
	 * @param precio_base        del electrodomestico
	 * @param peso               del electrodomestico
	 * @param consumo_energetico del electrodomestico
	 * @param color              del electrodomestico
	 */
	public Electrodomestico(double precio_base, double peso, char consumo_energetico, String color) {
		this.precio_base = precio_base;
		this.peso = peso;
		comprobarConsumoEnergetico(consumo_energetico);
		comprobarColor(color);
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
	 * metodo que devuelve el peso del electrodomestico
	 *
	 * @return el peso del electrodomestico
	 */
	public double getPeso() {
		return peso;
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
	 * metodo que devuelve el color del electrodomestico
	 *
	 * @return el color del electrodomestico
	 */
	public String getColor() {
		return color;
	}

	/**
	 * comprueba el consumo energetico solo mayusculas, si es una 'a' no lo
	 * detectara como una 'A'
	 *
	 * @param letra a comprobar
	 * @return devuelve TRUE si la letra del parametro esta en rango o FALSE si no
	 *         lo esta
	 */

	private void comprobarConsumoEnergetico(char letra) {

		if (letra >= 'A' && letra <= 'F') {
			consumo_energetico = letra;
		} else {
			consumo_energetico = CONSUMO_ENERGETICO_DEF;
		}

	}

	/**
	 * metodo que devuelve un verdadero o falso si el color es correcto o no
	 *
	 * @param color pasado como parametro
	 * @return TRUE si pertenece a un color valido o FALSE si no lo es
	 */

	private void comprobarColor(String color) {

		String colores[] = { "blando", "negro", "rojo", "azul", "gris" };

		boolean encontrado = false;

		for (int i = 0; i < colores.length && !encontrado; i++) {
			if (colores[i].equals(color)) {
				encontrado = true;
			}

		}
		if (encontrado) {
			this.color = color;
		} else {
			this.color = COLOR_DEF;
		}

	}

	/**
	 * metodo que devuelve el precio final del electrodomestido dadas unos
	 * parametros de consumo y peso
	 *
	 * @return numero entero con el precio final
	 */
	public double preciofinal() {
		double preciofin = 0;

		switch (consumo_energetico) {
		case 'A':
			preciofin = 100;
			break;
		case 'B':
			preciofin = 80;
			break;
		case 'C':
			preciofin = 60;
			break;
		case 'D':
			preciofin = 50;
			break;
		case 'E':
			preciofin = 30;
			break;
		case 'F':
			preciofin = 10;
			break;
		}

		if (peso >= 0 && peso <= 19) {
			preciofin += 10;
		}
		if (peso >= 20 && peso <= 49) {
			preciofin += 50;
		}
		if (peso >= 50 && peso <= 79) {
			preciofin += 80;
		}
		if (peso >= 80) {
			preciofin += 100;
		}

		return preciofin + precio_base;
	}

	/**
	 * metodo que devuelve la informacion sobre el electrodomestico
	 */

	@Override
	public String toString() {
		return "color: " + color + "\npeso: " + peso + " kg" + "\nconsumo energetico: " + consumo_energetico
				+ "\nprecio final: " + preciofinal() + " €\n";
	}

}

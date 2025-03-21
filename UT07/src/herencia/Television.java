package herencia;

public class Television extends Electrodomestico {

	// constantes
	public static final int pulgadas_def = 20;

	// atributos
	private int pulgadas;

	public Television() {
		super();
		this.pulgadas = pulgadas_def;
	}

	/**
	 * constructor con todos los atributos como parametros incluidos los heredados
	 *
	 * @param precio_base
	 * @param peso
	 * @param consumo_energetico
	 * @param color
	 */
	public Television(int precio_base, int peso, char consumo_energetico, String color, int pulgadas) {
		super(precio_base, peso, consumo_energetico, color);
		this.pulgadas = pulgadas;
	}

	/**
	 * constructor con dos parametros y el resto por defecto
	 *
	 * @param precio_base
	 * @param peso
	 */
	public Television(int precio_base, int peso) {
		super(precio_base, peso, CONSUMO_ENERGETICO_DEF, COLOR_DEF);
		this.pulgadas = pulgadas_def;
	}

	/**
	 * metodo que devuelve las pulgadas
	 *
	 * @return pulgadas
	 */
	public int getPulgadas() {
		return pulgadas;
	}

	/**
	 * metodo que establece las pulgadas
	 *
	 * @param pulgadas a establecer
	 */
	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	/**
	 * metodo que devuelve el precio final de la television con unas condiciones
	 */

	@Override
	public double preciofinal() {
		double preciofin = super.preciofinal();
		if (pulgadas > 40) {
			preciofin += precio_base * 0.30;
		}

		return preciofin;
	}

	/**
	 * metodo que devuelve la informacion de la Television
	 */
	@Override
	public String toString() {
		return "color: " + getColor() + "\npeso: " + getPeso() + " kg" + "\nconsumo energetico: "
				+ getConsumo_energetico() + "\nresolucion: " + getPulgadas() + " pulgadas" + "\nprecio final: "
				+ preciofinal() + " €\n";
	}

}

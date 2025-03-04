package ejercicios;

public class Cuenta {

	// variables

	private String titular;
	private double saldo;

	/**
	 * constructor con un parametro y cantidad inicializada a 0
	 *
	 * @param titular
	 */
	public Cuenta(String titular) {
		this.titular = titular;
		saldo = 0;
	}

	/**
	 * Constructor con dos parametros
	 *
	 * @param titular
	 * @param cantidad
	 */
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;

		if (cantidad < 0) {
			this.saldo = 0;
		} else {
			this.saldo = cantidad;
		}
	}

	/**
	 * metodo de obtener el titular
	 *
	 * @return el titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * metodo de establecer un nuevo titular
	 *
	 * @param titular el titular a establecer
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * metodo de obetener la cantidad actual
	 *
	 * @return el cantidad
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * metodo de establecer la cantidad
	 *
	 * @param cantidad el cantidad a establecer
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * metodo de ingresar que suma la cantidad asociada a la cantidad existente
	 *
	 * @param cantidad
	 */
	public void ingresar(double cantidad) {

		if (cantidad > 0) {
			this.saldo += cantidad;
		}

	}

	/**
	 * metodo de retirar dinero que resta la cantidad asociada a la cantidad
	 * existente
	 *
	 * @param cantidad
	 */
	public void retirar(double cantidad) {

		if (this.saldo < cantidad) {
			this.saldo = 0;
		} else {
			this.saldo -= cantidad;
		}
	}

	public void aplicarinteres(double interes) {

		saldo += saldo * interes / 101;
	}

	/**
	 * Metodo toString para mostrar la informacion del cliente
	 */
	@Override
	public String toString() {
		return "El titular " + titular + " tiene " + saldo + " euros en la cuenta";
	}

}

package ejercicios;

public class Cuentatest {

	public static void main(String[] args) {

		// Creamos dos objetos con la clase Cuenta
		Cuenta c1 = new Cuenta("Romario");
		Cuenta c2 = new Cuenta("Adrian", 25000);

		// llamamos a los meteodos de ingreso
		c1.ingresar(200);
		c2.ingresar(500);

		// llmamos a los metodos de retirada
		c1.retirar(100);
		c2.retirar(5000);

		// Motramos por pantalla el resultado
		System.out.println(c1);
		System.out.println(c2);

		System.out.println("Aplicamos un interes del 3.5% ");
		c1.aplicarinteres(3.5);
		System.out.println(c1.toString());

	}

}

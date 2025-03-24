package herencia;

public class Empeadotest {

	public static void main(String[] args) {

		// Creamos los objetos
		Comercial c1 = new Comercial("Javier Sanz", 38, 1000, 300);
		Comercial c2 = new Comercial("Amparo Gil", 28, 1200, 350);
		Repartidor r1 = new Repartidor("Fernando Ruiz", 24, 900, "zona 3");
		Repartidor r2 = new Repartidor("Alfonso Cano", 28, 1000, "zona 1");
		// Llamamos a plus
		if (c1.PLUS())
			System.out.println("Se le añadido el plus al comercial " + c1.getNombre());
		if (c2.PLUS())
			System.out.println("Se le añadido el plus al comercial " + c2.getNombre());
		if (r1.PLUS())
			System.out.println("Se le añadido el plus al repartidor " + r1.getNombre());
		if (r2.PLUS())
			System.out.println("Se le añadido el plus al repartidor " + r2.getNombre());

		System.out.println();
		// Mostramos la información
		System.out.println(c1 + "\n");
		System.out.println(c2 + "\n");
		System.out.println(r1 + "\n");
		System.out.println(r2 + "\n");

	}

}

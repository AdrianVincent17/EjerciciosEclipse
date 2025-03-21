package herencia;

public class Electrodomesticotest {

	public static void main(String[] args) {

		// Creamos un array de objetos
		Electrodomestico[] e1 = new Electrodomestico[5];

		// indicamos cada obejto en la posicion del array
		e1[0] = new Electrodomestico(200, 60, 'C', "verde");
		e1[1] = new Lavadora(150, 30);
		e1[2] = new Television(500, 80, 'E', "negro", 42);
		e1[3] = new Electrodomestico();
		e1[4] = new Television(250, 70);

		// Creamos una variable que recogera la suma total de todos los precios de los
		// electrodomesticos
		int preciototal = 0;

		// recorremos todos los electrodomestico y mostramos los datos de cada uno
		for (Electrodomestico element : e1) {
			System.out.println(element.toString());
			preciototal += element.preciofinal();
		}
		System.out.println("El precio total de todos los electrodomesticos es: " + preciototal);
	}

}

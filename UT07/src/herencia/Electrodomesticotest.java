package herencia;

import java.util.ArrayList;
import java.util.Iterator;

public class Electrodomesticotest {

	public static void main(String[] args) {

		// Creamos un array de objetos
		ArrayList<Electrodomestico> listaelectrodomestico = new ArrayList<Electrodomestico>();

		// indicamos cada obejto en la posicion del array
		listaelectrodomestico.add(new Electrodomestico(200, 60, 'C', "verde"));
		listaelectrodomestico.add(new Lavadora(150, 30));
		listaelectrodomestico.add(new Television(500, 80, 'E', "negro", 42));
		listaelectrodomestico.add(new Electrodomestico());
		listaelectrodomestico.add(new Television(250, 70));

		// Creamos una variable que recogera la suma total de todos los precios de los
		// electrodomesticos
		int preciototal = 0;

		// recorremos todos los electrodomestico y mostramos los datos de cada uno
		Iterator<Electrodomestico> i = listaelectrodomestico.iterator();
		while (i.hasNext()) {
			System.out.println(i.next().toString());
			preciototal += i.next().preciofinal();
		}
		System.out.println("El precio total de todos los electrodomesticos es: " + preciototal);

	}

}

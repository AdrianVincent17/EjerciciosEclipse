package conjutos;

import java.util.HashSet;
import java.util.Set;

public class Set02 {

	public static void main(String[] args) {

		Set<String> numberSet = new HashSet<String>();
		
		numberSet.add("Uno");
		numberSet.add("Dos");
		numberSet.add("Tres");
		numberSet.add("Cuatro");
		numberSet.add("Dos");
		numberSet.add("Uno");
		
		System.out.println("Conjunto: "+numberSet.toString());
		System.out.println("Tamaño: "+numberSet.size());
		
		if(!numberSet.add("Cinco"))
			System.out.println("Error al insertar el Cinco");
		
		if(numberSet.contains("Cuatro"))
			System.out.println("El numero cuatro ya esta en el conjunto");
		
		System.out.println("Conjunto: "+numberSet.toString());
		

	}

}

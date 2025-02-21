package colecciones.conjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set01 {
	
	final static int tam=10;

	public static void main(String[] args) {
		
		Set<Integer> numberSet = new TreeSet<Integer>();
		
		//Insertamos 6 elementos en el conjunto
		Integer ale=(int)(Math.random()*50+1);
		
		for(int i=0; i<tam; i++) {
			ale=(int)(Math.random()*50+1);
			numberSet.add(ale);
		}
		
		System.out.println("Conjunto: "+numberSet.toString());
		System.out.println("Tamaño: "+numberSet.size());
		
		if(!numberSet.add(ale))
			System.out.println("Error al insertar "+ale);
		
		if(numberSet.contains(ale))
			System.out.println("El valor "+ale+" ya esta en el conjunto");

	}

}

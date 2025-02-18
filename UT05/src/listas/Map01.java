package listas;

import java.util.HashMap;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		
		Map<Integer,String> ciudades=new HashMap<Integer, String>();
		
		ciudades.put(30500, "Molina de Segura");
		ciudades.put(30560, "Alguazas");
		ciudades.put(30520, "Alcantarilla");
		ciudades.put(30600, "Archena");
		
		//obtenemos el valor de una clave
		int codpostal=30500;
		
		System.out.println("La ciudad con codigo postal "+codpostal+" es "+ciudades.get(codpostal));
		
		
		System.out.println("Ciudades: "+ciudades);
		
		String nombre=ciudades.remove(codpostal);
		
		if(nombre!=null)
			System.out.println("La ciudad "+nombre+" ha sido eliminada");
		else
			System.out.println("La ciudad "+nombre+" no ha sido eliminada");

	}

}

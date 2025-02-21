package colecciones.listas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Map03 {

	public static void main(String[] args) {
		
		Map<Integer, String> ciudades= new HashMap<Integer, String>();
		
		//Añadimos las ciudades
		ciudades.put(30500, "Molina de Segura");
		ciudades.put(30560, "Alguazas");
		ciudades.put(30520, "Alcantarilla");
		ciudades.put(30565, "Las torres de Cotillas");
		ciudades.put(30600, "Archena");
		
		//Pedimos la introduccion por teclado de los codigos postales
		Scanner sc=new Scanner(System.in);
		
		try {
			
			System.out.print("Introduce un codigo postal: ");
			int codpostal=Integer.parseInt(sc.nextLine());
			
			if(ciudades.containsKey(codpostal))
				System.out.println("La ciudad de codigo postal "+codpostal+" es: "+ciudades.get(codpostal));
			else
				System.out.println("La ciudad con codigo postal "+codpostal+" no se encuentra en nuestro diccionario" );
			
			
		}catch(Exception e) {
			System.out.println("error");
		}
		
		//Pedimos la introduccion por teclado del nombre de la ciudad 
		System.out.print("ingresa tu ciudad: ");
		String ciudad=sc.nextLine();
		
		
		
		sc.close();
		
		if(ciudades.containsValue(ciudad))
			System.out.println("La ciudad "+ciudad+" se encuentra en el diccionario");
		else
			System.out.println("La ciudad "+ciudad+" no se encuentra en el diccionario");
		
		//imprimimos recorriendo con el iterator
		Set conjunto=ciudades.entrySet();
		Iterator i=conjunto.iterator();
		
		System.out.println("\n> Ciudades: ");
		System.out.println(" CP\tNombre: \n-----\t---------------");
		
		while(i.hasNext()) {
			Map.Entry m=(Map.Entry)i.next();
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}

}

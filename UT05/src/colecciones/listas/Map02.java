package colecciones.listas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {

		Map<Integer,String> ciudades= new HashMap<Integer, String>();
		
		ciudades.put(30500, "Molina de Segura");
		ciudades.put(30560, "Alguazas");
		ciudades.put(30520, "Alcantarilla");
		ciudades.put(30600, "Archena");
		ciudades.put(30565, "Las torres de cotillas");
		
		Scanner sc=new Scanner(System.in);
		
		try {
			
			System.out.print("Introduce un CP:");
			int codpostal=sc.nextInt();
			
			if(ciudades.containsKey(codpostal))
				System.out.println("> La ciudad con CP "+codpostal+" es "+ciudades.get(codpostal));
			else
				System.out.println("> La ciudad con CP "+codpostal+" no se encuentra entre nuestras ciudades");
		
		}catch(Exception e) {
			System.out.println("Error");
		}
		
		
		sc.close();
		


	}

}

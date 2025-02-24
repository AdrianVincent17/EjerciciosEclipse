 package colecciones.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList <String> nombres= new ArrayList<String>();
		
		nombres.add("Maria");
		nombres.add("Alfonso");
		nombres.add("Juan");
		nombres.add("Bernardo");
		nombres.add("Lucas");
		nombres.add("Juan");
		
		System.out.println("lista: "+nombres.toString());
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime un nombre: ");
		String nombrecito=sc.nextLine();
		
		if(nombres.contains(nombrecito))
			System.out.println(" > "+nombrecito+" ya se encuentra en la lista");
		else
			System.out.println(" > "+nombrecito+" no se encuentra en la lista");
			
		System.out.print("Dime otro nombre: ");
		String quitar=sc.nextLine();
		
		if(nombres.remove(quitar)) {
			System.out.println(" > "+quitar+" se ha eliminado de la lista");
		}else
			System.out.println(" > "+quitar+" no se encuentra en la lista");
		
		sc.close();
		
		Iterator<String> i= nombres.iterator();
		System.out.print("> Lista: ");
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
	

	}

}

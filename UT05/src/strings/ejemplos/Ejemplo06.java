package strings.ejemplos;

public class Ejemplo06 {

	public static void main(String[] args) {
		
		//Ejemplo con String 
		
		String nombre1 = "Harry Potter";
		
		nombre1.toUpperCase();  //esto es un ejemplo de que los string no se modifican 
		System.out.println(nombre1);
		System.out.println(nombre1.toUpperCase());
		nombre1=nombre1.toUpperCase();  //para ello debemos de hacer una asignacion si no no se guardaran
		System.out.println(nombre1);
		
		// Ejemplos con StringBuffer
		
		StringBuffer nombre2 = new StringBuffer("Hermione Granger");
		
		System.out.println(nombre2);
		
		nombre2.reverse();  //esto ya si mostrara el nombre al reves
		 //tanto si lo haces fuera como dentro del print podemos ver que se guardan
		System.out.println(nombre2);
		
		//5. para convertir string a StringBuffer seria de esta forma
		
		String s = "Adrian";
		StringBuffer sb = new StringBuffer(s); //hemos pasado el string a StringBuffer
		
		s= sb.toString(); // y ahora volvemos a pasar el StingBuffer a String
		
		String nombre3 = nombre2.reverse().toString();
		System.out.println(nombre3);
		
		StringBuffer nombre4= new StringBuffer(nombre3.substring(0, 8).toUpperCase()).reverse();
		
		System.out.println(nombre4);
		
		//ahora hacemos un poco de popurri y le damos la vuelta al apellido y le damos la vuelta 
		//a nombre4 y lo convertimos a string de nuevo y podremos ponerlo en minusculas.
		
		System.out.println(nombre3.substring(9, nombre3.length())+" "+nombre4.reverse().toString().toLowerCase());
		
		

	}

}

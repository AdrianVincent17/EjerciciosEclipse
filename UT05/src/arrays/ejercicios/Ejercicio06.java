package arrays.ejercicios;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		int[] vector= {9,8,7,6,5};
		
		
		boolean creciente=false;
		boolean decreciente=false;
		
		for(int i=0; i<vector.length-1; i++) {
			if(vector[i]<vector[i+1])
				creciente = true;
			
			if(vector[i]>vector[i+1])
				decreciente = true;
		}
		
		/**
		 * Los posibles valores para creciente y decreciente 
		 * 		creciente		decreciente
		 * 		  true			   false		-->Orden creciente
		 * 		  false			   true			-->Oden decreciente
		 * 		  true			   true			-->Desordenado
		 * 		  false			   false		-->Iguales
		 */
		
		if(creciente==true && decreciente==false)
			System.out.println("Orden creciente");
		
		if(creciente==false && decreciente==true)
			System.out.println("Orden decreciente");
		
		if(creciente==true && decreciente==true)
			System.out.println("Desordenado");
		
		if(creciente==false && decreciente==false)
			System.out.println("Iguales");

		
		

	}

}

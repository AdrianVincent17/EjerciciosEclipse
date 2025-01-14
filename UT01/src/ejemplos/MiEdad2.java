package ejemplos;

public class MiEdad2 {

	public static void main(String[] args) {
		
		//Definimos una constante (su valor no cambriara durante la ejecucion del programa)
		final int MAYORIAEDAD;
		MAYORIAEDAD = 18;

		//Definimos una variable (su valor prodra cambiar durante la ejecucion del programa)

		int edad;
		edad = 19;

		/*
		 * Las dos lineas anteriores son equivalentes en una linea a lo siguiente: 
		 * int edad = 19;
		 */

		System.out.println("Mi edad es: "+edad+" años");

		//vamos a variar el valor de la variable
		edad=edad+1;
		System.out.println("Mi edad el año que viene sera: "+edad+" años");

		edad=edad-2;
		System.out.println("Mi edad el año pasado era: "+edad+" años");

		System.out.println("La mayoria de edad es de: "+MAYORIAEDAD+" años");

		/*
		 * Esto no se podra hacer con una constante
		 * 		MAYOREDAD = MAYOREDAD+2;
		 * 		MAYOREDAD = 20;
		 */

		edad=MAYORIAEDAD+2;
		System.out.println("Mi edad ahora es de: "+edad+" años");

		//Recuerda la diferencia entre + aplicado a cadenas (CONCATENACION) y el + aplicado a numeros (SUMA)
		//Orden de preferencia siempre primero los PARENTESIS
		
		System.out.println("Si la mayoria de edad subiese 10 años, estaria en: "+(MAYORIAEDAD+10));

	}

}

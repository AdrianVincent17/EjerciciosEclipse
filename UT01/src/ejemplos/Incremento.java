package ejemplos;

public class Incremento {

	public static void main(String[] args) {

		//Declaramos e inicializamos la variable
		int a =10;

		//mostramos la variable por pantalla
		System.out.println(a);

		//hacemos un incremento de la variable 
		a++;

		//mostramos la variable
		System.out.println(a);

		//volvemos a hacer un incremento de la variable
		++a;

		//mostramos la variable
		System.out.println(a);

		/*
		 * Ahora probamos que muestra por pantalla primero el numero
		 * y luego hace el incremento, pero no lo muestra en el momento
		 */
	
		System.out.println(a++);

		//aqui mostramos el incremento antes realizado
		System.out.println(a);

		//En este caso si mostramos primero el incremento y luego el valor de a
		System.out.println(++a);

		//aqui hacemos un incremento de mas de uno
		a+=2;

		//Mostramos la variable
		System.out.println(a);

	}

}

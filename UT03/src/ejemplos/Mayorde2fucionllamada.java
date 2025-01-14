package ejemplos;

public class Mayorde2fucionllamada {

	public static void main(String[] args) {

		//Declaracion e inicializacion de variables
		//Generamos dos numeros aleatorios entre 1 y 100 haciendo una llamada a la funcion desde otra clase

		int a=MayordefuncionconAleatorio.aleatorio(50),
			b=MayordefuncionconAleatorio.aleatorio(50);

		//Mostramos por pantalla y hacemos una llamada a funcion desde otra clase
		
		System.out.println("Valores: "+a+" y "+b);
		System.out.println("Mayor: "+Mayordefuncion.mayor(a, b));

	}

}

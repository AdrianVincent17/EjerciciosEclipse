package strings.ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Creamos el scanner para pedir la entrada por teclado
		
		String cad; //Çreamos una variable cad de string para hacer una cadena de caracteres
		
		System.out.print("Introduce una cadena de caracteres: "); //Pedimos entrada por tecldo
		cad=sc.nextLine(); //Introducimos la cadena de caracteres
		
		StringBuffer cad1= new StringBuffer(cad); // hacemos una variable de StringBuffer para asignarle el valor del String cad
		
		System.out.println(cad1.reverse()); // mostramos el contenido de la variable con el atributo del StringBuffer que le da la vuelta a la cadena
		
		sc.close(); //Cerramos la entrada de tecla

	}

}

package bienvenida;

import ejmplos.Bienvenida2; 	/*aqui vemos como despues de poner el procedimiento 
								en el main me genera este archivo que hace la llamada 
								hasta el origen de la ubicacion del procedimiento
								*/
public class Bienvenida4 {

	public static void main(String[] args) {
		
		/*Creamos un paquete nuevo para comprobar que un procedimiento o funcion,
		si esta publico se puede comprobar entre paquetes.
		*/
		Bienvenida2.saluda("Adrian", "Python");
		

	}

}

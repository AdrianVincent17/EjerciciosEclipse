package strings.Boletin;

import java.util.Scanner;

public class Ej01 {

	/**
	 * funcion que devuelve un boleano true o false si String es o no capicua
	 * @param cad String pasada como parametro
	 * @return TRUE si es capicua FALSE si no lo es
	 */

	public static boolean escapicua(String cad) {

		//pasamos el Sting a mayusculas y eliminamos los espacios en blanco del principio y final
		cad=cad.toUpperCase().replace(" ", "").trim();

		//ahora le daremos la vuelva al String utilizando la funcion StringBuffer
		StringBuffer invertida=new StringBuffer(cad);

		//y ahora devolvemos el StringBuffer como String
		String espejo= invertida.reverse().toString();

		//por ultimo retornamos el booleano comparando ambos Stromgs y si son iguales entonces sera capicuas
		return cad.equals(espejo);
	}


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.print("Dime un numero: ");

		String capi="";
		try {


			int numero=sc.nextInt();

			if(numero<0) {
				System.out.println("> Debes introducir un numero entero positivo");
			}else if(numero<10) {
				System.out.println(" Debe tener al menos dos numeros");
			}else { 
				
				capi=capi.valueOf(numero);

				if(escapicua(capi)) {
					System.out.println("> El numero "+capi+" es capicua");
				}else {
					System.out.println("> El numero "+capi+" NO es capicua");
				}
			}


		}catch(Exception e) {
			System.out.println("> Error en la entrada de datos \n> El programa finalizara");
		}finally {
			sc.close();
		}



	}

}

package boletin2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ01 {


	/**
	 * funcion que devuelve el numero de dias que tiene un mes 
	 * Enero, marzo, mayo, julio, agosto, octubre, diciembre, tienen 31 dias
	 * Abril, junio,septiembre,noviembre tienen 30 dias
	 * Febrero tiene 28 dias sin contar bisiesto
	 * @param mes Numero correspondiente al mes denro del año
	 * @return numero entero correspondiente al numero de dias que tiene ese mes
	 */

	private static int diasmes(int mes) {
		int  numdias=31;

		if(mes==4 || mes==6 || mes==9 || mes==11)
			numdias=30;
		if(mes==2)
			numdias=28;

		return numdias;

	}
	
	/**
	 * Procedimiento que muestra por letra el numero del mes
	 * @param mes
	 */
	
	public static void meses(int mes) {

		switch(mes) { 
		case 1:System.out.print(" Enero");break;
		case 2:System.out.print(" febrero");break;
		case 3:System.out.print(" Marzo");break;
		case 4:System.out.print(" Abril");break;
		case 5:System.out.print(" Mayo");break;
		case 6:System.out.print(" Junio");break;
		case 7:System.out.print(" Julio");break;
		case 8:System.out.print(" Agosto");break;
		case 9:System.out.print(" Septiembre");break;
		case 10:System.out.print(" Octubre");break;
		case 11:System.out.print(" Noviembre");break;
		case 12:System.out.print(" Diciembre");break;
		

		}
		
	}

	public static void main(String[] args) {


		Scanner teclado= new Scanner(System.in);


		try {

			System.out.print("Dime un año: ");
			int año=teclado.nextInt();
			//pedimos el mes
			System.out.print("Dime un mes: ");
			int mes=teclado.nextInt();

			//asercion para los meses
			assert mes >=1 && mes<=12: ">> Los meses van desde el 1 hasta el 12";

			//pedimos el dia 
			System.out.print("Dime un dia: ");
			int dia=teclado.nextInt();

			/*añadimos aserccion con la funcion 
			 * de los dias del mes creada para saber 
			 * hasta donde llegan los dias de cada mes
			 */

			assert dia >=1 && dia<=diasmes(mes): ">> El numero de dia del mes que has introducido no es correcto";

			int diasaño=0;
			
			for(int i=1; i<mes; i++) {
				
				diasaño+=diasmes(i);
			}
			diasaño+=dia;
			
			//Imprimimos por pantalla el resultado 
			if(año<0) {
				System.out.print("La fecha "+dia+" de");
				meses(mes);
				System.out.print(" del "+año+" a.C "+" tiene "+diasaño+" dias");
			}else {

				System.out.print("La fecha "+dia+" de");
				meses(mes);
				System.out.print(" del "+año+" tiene "+diasaño+" dias");
			}


		}catch(InputMismatchException lupita) {

			System.out.println(">> Error, dato introducido no valido");

		}catch(AssertionError ea) {
			System.out.println(ea.getMessage());

		}finally {
			teclado.close();
		}






	}

}

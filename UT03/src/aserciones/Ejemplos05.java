package aserciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplos05 {
	
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
	
	private static void cumple(int dia, int mes) {
		
		if(dia==19 && mes==2)
			System.out.println("Felicidades");
	}

	public static void main(String[] args) {
		
		
		//Abrimos el lector
		Scanner teclado=new Scanner(System.in);
		try {
			
		
			System.out.println("Dime una fecha");
			//Pedimos el año
			System.out.println("Año: ");
			int year=teclado.nextInt();
			int año=Math.abs(year);
			
			//asercion del año
			assert year!=0: "El año 0 no existe";
			
			/*Pedimos el mes(antes que el dia puesto 
			 * que tenemos que saber que mes es para saber 
			 * hasta donde llegan los dias)
			 */
	
			System.out.println("Mes: ");
			int mes=teclado.nextInt();
			
			//añadimos una asercion al mes 
			assert mes >=1 && mes<=12: ">> Los meses van desde el uno hasta el doce";
			
			
			//Pedimos el numero de dias
			System.out.println("Dia: ");
			int dia=teclado.nextInt();
			
			/*añadimos aserccion con la funcion 
			 * de los dias del mes creada para saber 
			 * hasta donde llegan los dias de cada mes
			 */
			
			assert dia >=1 && dia<=diasmes(mes): ">> El numero de dias dentro del mes que has introducidoo no es correcto";
			
			//Imprimimos por pantalla el resultado 
			if(year<0)
			System.out.println("La fecha "+dia+"/"+mes+"/"+año+" a.C"+" Es correcta");
			else
			
				System.out.println("La fecha "+dia+"/"+mes+"/"+año+" Es correcta");
		
		}catch(InputMismatchException ime) {
			System.out.println("Error en la entrada de datos");
			
		}catch(AssertionError ea) {
			System.out.println(ea.getMessage());
		}finally {
		
			teclado.close();
		}
		
		
		
		
	}

}

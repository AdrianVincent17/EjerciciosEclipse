package examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ01 {
	
	/**
	 * Funcion que devuelve una cadena con el formato de la hora en hh:mm:ss
	 * @param h horas
	 * @param m minutos
	 * @param s segundos
	 */

	public static String horaok(int h, int m, int s) {

		String cad="";

		if (h>=0 && h<=23) {
			if (m>=0 && m<=59) {
				if (s>=0 && s<=59) {
					if(h<10)
						cad+="0"+h+":";
					else
						cad+=h+":";
					if(m<10)
						cad+="0"+m+":";
					else
						cad+=m+":";
					if(s<10)
						cad+="0"+s;
					else
						cad+=s;


				}
			}
		}
		return cad;
	}


	/**
	 * procedimiento que muestra por pantalla los segundos siguientes a las horas, minutos y segundos establcidos
	 * @param h horas
	 * @param m minutos
	 * @param s segundos
	 */

	public static void sumaseg(int h, int m, int s) {

		s++;
		if(s==60) {
			s=0;
			m++;
			if(m==60) {
				m=0;
				h++;
				if(h==24) {
					h=0;
				}
			}

		}
		System.out.println(horaok(h,m,s));
	}

	public static void main(String[] args) {
		//Abrimos el lector
		Scanner teclado=new Scanner(System.in);

		try{
			//Declaramos las variales
			int h,m,s;

			//Pedimos por teclado horas, minutos y segundos
			System.out.println("Introduce la hora...");
			System.out.print("Hora: ");
			h=teclado.nextInt();

			assert h>=0 && h<24 :">> Horas fuera de rango permitido"; //asercion para la hora

			System.out.print("Minutos: ");
			m=teclado.nextInt();

			assert m>=0 && m<60 :">> Minutos: Fuera de rango permitido"; //asercion para los minutos

			System.out.print("Segundos: ");
			s=teclado.nextInt();

			assert s>=0 && s<60 :">> Segundos fuera de rango permitido"; //asercion para los segundos

			System.out.println();
			//Hora introducida
			System.out.print("> Hora introducida: ");
			System.out.println(horaok(h,m,s));

			//segundo seiguiente a la hora indicada
			System.out.print("> Hora en el segundo siguiente: ");
			sumaseg(h,m,s);



		}catch(InputMismatchException lupita) {
			System.out.println(">> ERROR, El tipo de dato introducido no es correcto.");
		}catch(AssertionError ea){
			System.out.println(ea.getMessage());
		}finally {
			teclado.close();
		}

	}

}



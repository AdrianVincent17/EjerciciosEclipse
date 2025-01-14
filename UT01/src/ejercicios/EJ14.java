package ejercicios;

public class EJ14 {

	public static void main(String[] args) {
		
		/*Realiza un programa en Java con una variable entera t la cual contiene 
		un tiempo en segundos y queremos conocer este tiempo pero 
		expresado en horas, minutos y segundos.
		*/
		
		//tiempo total expresado en segundos totales 
		int t=3677;
		
		//dividimos el tiempo total entre 3600 segundos que es equivalente a una hora
		int horas =(t/3600);
		
		//sacamos las horas dividiendo entre 60 el modulo del tiempo total con los segundos de una hora
		int minutos=(t%3600/60);
		
		//el modulo del tiempo total entre 60 
		int segundos=(t%60);
		
		
		System.out.println("El tiempo es de "+horas+" horas "+minutos+" minutos "+segundos+" segundos ");
		
	}	

}

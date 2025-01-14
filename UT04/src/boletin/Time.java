package boletin;

public class Time {
	
	//Atributos
	
	private int hours;
	private int minutes;
	private int seconds;
	
	
	/**
	 * Constructor
	 * @param hours
	 * @param minutes
	 * @param seconds
	 */
	public Time(int hours, int minutes, int seconds) {
		
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}


	/**
	 * Constructor vacio
	 */
	public Time() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}


	/**
	 * Devuelve las horas establecidas
	 * @return las horas
	 */
	public int getHours() {
		return hours;
	}


	/**
	 * Establece las horas 
	 * @param hours las horas a establecer
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}


	/**
	 * devuelve los minutos establecidos
	 * @return los minutos
	 */
	public int getMinutes() {
		return minutes;
	}


	/**
	 * Establece los minutos
	 * @param minutes los minutos a establecer
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}


	/**
	 * Devuelve los segundos establecidos
	 * @return los segundos
	 */
	public int getSeconds() {
		return seconds;
	}


	/**
	 * Establece los segundos
	 * @param seconds el seconds a establecer
	 */
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	/**
	 * Devuelve true o false si la hora es correcta o no 
	 * @return true o false
	 */
	public boolean isvalid() {
		
		if(hours>=0 && hours<60) {
			if(minutes>=0 && minutes <60) {
				if(seconds>=0 && seconds<60){
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Devuelve la cadena con la hora, minutos y segundos establecida en formato hh:mm:ss
	 * @return cadena string con la informacion sobre la hora
	 */
	
	public String tostring() {
		String cad="";
		
		if(hours<10)
			cad+="0"+hours+":";
		else
			cad+=hours+":";
		
		if(minutes<10)
			cad+="0"+minutes+":";
		else
			cad+=minutes+":";
		
		if(seconds<10)
			cad+="0"+seconds;
		else
			cad+=seconds;
		
		return cad;
		
		
	}
	
	
	
	
	

}

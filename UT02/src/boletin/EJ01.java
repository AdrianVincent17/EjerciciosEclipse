package boletin;

public class EJ01 {
	
	/**
	 * hacemos una funcion que calcula el volumen de una esfera
	 * @param r radio de la esfera 
	 * @return devuelve el volumen 
	 */
	
	public static double area(int r) {
		
		final double PI=3.141592;
		
		double Volumen=(4.0/3)*PI*(r*r*r);
		return Volumen;
	}


	public static void main(String[] args) {
		
		//Declaramos e inicializamos
		
		int radio=3;
		
		System.out.println("Radio: "+radio);
		System.out.println("El volumen de la Esfera "+area(radio));
	}

}

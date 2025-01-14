package ejmplos;

public class AreasCirculos {

	final static double PI=3.141592;

	/**
	 * Calcula el perimetro de la circunferencia de radio r
	 * @param r radio de la circunferencia
	 * @return devuelve total del perimetro
	 */


	public static double perimetro(int r) {

		double perimetro=PI*2*r;
		return perimetro;
	}


	/**
	 * Calcula el area de la circunferencia de radio r
	 * @param r radio de la circunferencia 
	 * @return
	 */

	public static double area(int  r) {


		double area=PI*(r*r);
		return area;
	}

	/**
	 * Muestra por pantalla los resultados del mensaje
	 * @param radio de la circunferencia
	 */

	public static void circunferencia(int radio) {

		System.out.println("radio: "+radio);
		System.out.println("Perimetro de la circunferencia: "+perimetro(radio));
		System.out.println("Area del circulo: "+area(radio)+"\n");
	}

	//Programa principal

	public static void main(String[] args) {


		//hacemos la llamada al procedimiento
		circunferencia(3);
		circunferencia(4);

	}
}

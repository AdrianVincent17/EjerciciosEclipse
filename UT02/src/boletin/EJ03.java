package boletin;

public class EJ03 {
	
	/**
	 * funcion que calcula el precio rebajado de una compra
	 * @param paga el dinero que paga
	 * @param desc el dinero de la rebaja
	 * @return el precio total rebajado
	 */
	
	public static double desc(double paga, double desc) {
		
		double 	rebaja=(paga*(desc/100)), preciorebajado;	//multiplicamos el precio por el descuento para obetener el total de descuento
		return  preciorebajado=paga-rebaja;					//Descontamos el precio al descuento para obtener el precio total	
	}
	


	public static void main(String[] args) {
		
		/*
		 * Declaramos e inicializamos variables
		 */
		
		double precio= 85.0;
		int descuento= 30;
		
		//Mostramos por pantalla
		
		System.out.println("Precio (€): "+precio);
		System.out.println("Descuento (%): "+descuento);
		System.out.println("Precio rebajado (€): "+desc(precio,descuento));



	}

}

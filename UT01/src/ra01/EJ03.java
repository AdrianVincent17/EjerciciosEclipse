package ra01;

public class EJ03 {

	public static void main(String[] args) {
		
		//Declaramos las variables e inicializamos
		
		double 	precio=75.0, 
				descuento=10, 
				rebaja=(precio*(descuento/100)), 	//multiplicamos el precio por el descuento para obetener el total de descuento
				preciorebajado=precio-rebaja; 		 //Descontamos el precio al descuento para obtener el precio total
		
		//Mostramos por pantalla los resultado del precio, el descuento y el total
		System.out.println("Precio: (€): "+precio);
		System.out.println("Descuento (%): "+(int)descuento);
		System.out.println("Precio rebajado (€): "+preciorebajado);
	

	}

}

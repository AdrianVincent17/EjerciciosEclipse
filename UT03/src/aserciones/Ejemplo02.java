package aserciones;

public class Ejemplo02 {

	public static void main(String[] args) {
		
		int divisor=0, numerador=10;
		
		assert divisor !=0 : "Error: El divisor no puede ser cero";
		
		int resultado = numerador/divisor;
		
		System.out.println("Resultado de la division: "+ resultado);
		

	}

}

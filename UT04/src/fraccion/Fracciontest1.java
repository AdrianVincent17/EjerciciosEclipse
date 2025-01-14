package fraccion;

public class Fracciontest1 {

	public static void main(String[] args) {
		
		//Creacion de objetos o instancias de la clase Fraccion.
		Fraccion f1=new Fraccion();
		Fraccion f2=new Fraccion(1,4);
		
		//Establecemos valores para numerador y denominador del objeto f1
		f1.setNumerador(5);
		f1.setDenominador(8);
		
		//Mostramos por pantalla las fracciones
		System.out.println("Primera Fraccion: "+f1.toString());
		System.out.println("Segunda Fraccion: "+f2.toString());

		//Sumamos las fracciones
		Fraccion suma=f1.sumarfraccion(f2);
		suma.simplificar();
		System.out.println("\n"+f1.toString()+" + "+f2.toString()+" = "+suma.toString());
		
		//Restamos las fracciones
		Fraccion resta=f1.restarfraccion(f2);
		resta.simplificar();
		System.out.println(f1+" - "+f2+" = "+resta);
		
		//Multiplicamos las fracciones
		Fraccion multi=f1.multiplicar(f2);
		multi.simplificar();
		System.out.println(f1+" * "+f2+" = "+multi);
		
		//Dividimos las fracciones
		Fraccion divi=f1.dividir(f2);
		divi.simplificar();
		System.out.println(f1+" / "+f2+" = "+divi);
			
	}

}

package ejercicios;

public class Passwordtest {

	public static void main(String[] args) {
		
		Password p1=new Password(10);
		System.out.print("Contraseña 1: "+p1.getContraseña());
		System.out.print("\nLongitud 1: "+p1.getLongitud());
		
		if(p1.esfuerte())
			System.out.println("\nLa contraseña es fuerte");
		else
			System.out.println("\nLa contraseña no es fuerte");
		
		System.out.println();
		
		
		Password p2=new Password();
		System.out.print("Contraseña 1: "+p2.getContraseña());
		System.out.print("\nLongitud 1: "+p2.getLongitud());
		
		if(p2.esfuerte())
			System.out.println("\nLa contraseña es fuerte");
		else
			System.out.println("\nLa contraseña no es fuerte");
	}

}

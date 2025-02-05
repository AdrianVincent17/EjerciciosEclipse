package strings.ejemplos;

public class Ejemplo03 {

	public static void main(String[] args) {

		String nombre1="JUAN";
		String nombre2=new String("juan");

		System.out.println("Comparamos...");
		
		// Con compareTo()

		if(nombre1.compareTo(nombre2)==0)

			System.out.println("1a. "+nombre1+" y "+nombre2+" son iguales");
		else
			System.out.println("1a. "+nombre1+" y "+nombre2+" son distintos");


		if(nombre1.toUpperCase().compareTo(nombre2.toUpperCase())==0)

			System.out.println("1b. "+nombre1+" y "+nombre2+" son iguales");
		else
			System.out.println("1b. "+nombre1+" y "+nombre2+" son distintos");
		
		//2. Con equals()
		
		if(nombre1.equals(nombre2))

			System.out.println("2. "+nombre1+" y "+nombre2+" son iguales");
		else
			System.out.println("2. "+nombre1+" y "+nombre2+" son distintos");
		
		//3. con ==
		
		if(nombre1==nombre2)

			System.out.println("3. "+nombre1+" y "+nombre2+" son iguales");
		else
			System.out.println("3. "+nombre1+" y "+nombre2+" son distintos");
		
		
		
		




	}

}

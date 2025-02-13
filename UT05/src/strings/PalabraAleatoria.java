package strings;

import java.util.Scanner;

public class PalabraAleatoria {

	private static String generarPalabras() {
		String[] array= {"AUSTRALOPITECUS","PIZARRA","LINFOCITO","GERIFALTE","APITAFIO",
				"EMPANADILLA","MATASUEGRAS","DROMEDARIO","CORONAVIRUS","TESTAMENTO","ORDENAMIENTO",
				"ANTICAPITALISMO","FONTANERO","BUTANERO",};
		return array[(int )(Math.random()*array.length)];

	}

	public static void main(String[] args) {

		final int TOTAL_INTENTOS=10;

		int intentos=0;
		String palabraAcertar=generarPalabras();
		String palabraMostrar="";
		String cadena;
		char letra;
		boolean acertada=false;

		for(int i=0; i<palabraAcertar.length(); i++) 
			palabraMostrar+="*";
		

		System.out.println("Nº de letras que tiene la palabra "+palabraAcertar.length());

		Scanner sc = new Scanner(System.in);
		
		while(intentos<TOTAL_INTENTOS && !acertada) {

			System.out.println("Palabra a acertar: "+palabraMostrar);

			System.out.println("Nº intentos realizados: "+intentos);
			System.out.println("Nº intentos restantes: "+(TOTAL_INTENTOS-intentos));


			System.out.print("Introduce una letra: ");
			cadena=sc.nextLine().toUpperCase();
			
			
		

			if(cadena.startsWith("RESUELVO:")) {

				if(palabraAcertar.equals(cadena.substring(9)))
					acertada=true;
				else
					System.out.println("OHHH La palabra introducida no es correcta");
			}else {

				letra=cadena.charAt(0);
				System.out.println("Letra introducida: "+letra);

				if(palabraAcertar.indexOf(letra)==-1) 
					System.out.println("FALLASTE  la letra "+letra+" no se encuentra en la palabra a acertar");
				else {
					System.out.println("ACERTASTE la letra "+letra+" se encuentra en la palabra a acertar");

					for(int i =0; i<palabraAcertar.length(); i++)
						if(palabraAcertar.charAt(i)==letra)
							palabraMostrar=palabraMostrar.substring(0, i)+letra+palabraMostrar.substring(i+1);

					if(palabraAcertar.equals(palabraMostrar))
				acertada=true;
			}
			}
			intentos++;

		}

		sc.close();

		if(acertada) {
			System.out.println("Enhorabuena acertarste la palabra");
			System.out.println("Acerstaste la palabra en: "+intentos+" intentos");
		}else 
			System.out.println("oh lo siento agotaste el numero de intentos");
		
		System.out.println("La palabra es: "+palabraAcertar);
	}

}





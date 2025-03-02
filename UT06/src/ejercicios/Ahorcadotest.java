package ejercicios;

import java.util.Scanner;

public class Ahorcadotest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Ahorcado J1 = new Ahorcado(10);
		String cadena;
		char letra;
		boolean acertada = false;
		char[] metidos = new char[J1.getIntentosTotales()];
		int contameti = 0;

		System.out.println("Nº de letras que tiene la palabra " + J1.getPalabraAcertar().length());

		while (J1.getIntentosrealizados() < J1.getIntentosTotales() && !acertada) {

			System.out.println("\nPalabra a acertar: " + J1.getPalabraMostrar());

			System.out.println("Nº intentos realizados: " + J1.getIntentosrealizados());
			System.out.println("Nº intentos restantes: " + (J1.getIntentosrestantes()));

			System.out.print("introduce 'resolver' o una letra: ");
			cadena = sc.nextLine().toUpperCase();

			if (cadena.contains("RESOLVER")) {

				System.out.println("De acuerdo vamos a resolver...");
				System.out.print("Prueba la palabra: ");

				String resuelve = sc.nextLine().toUpperCase().trim();

				sc.close();
				if (J1.resolver(resuelve))
					acertada = true;
				else
					System.out.println("OHHH no pudiste resolver...");
			} else {

				letra = cadena.charAt(0);
				// Variable para ver si la letra ya está en el array
				boolean repetida = false;

				// Verificar si la letra ya existe en el array
				for (int i = 0; i < contameti; i++) { // Solo hasta las letras introducidas
					if (metidos[i] == letra) {
						repetida = true;
						break;
					}
				}

				if (repetida) {
					System.out.println("La letra " + letra + " ya ha sido introducida anteriormente");
					J1.setIntentosrealizados(J1.getIntentosrealizados()-1);
				} else {
					// Añadir la letra al array en la posición actual del contador
					metidos[contameti] = letra;
					contameti++; // Incrementar el contador para la próxima letra

				}
				System.out.println("Letras introducida: " + letra);
				System.out.print("Letras metidas anteriormente: ");
				for (int i = 0; i < contameti; i++) { // Solo hasta las letras añadidas
					System.out.print(metidos[i] + " ");
				}

				if (!J1.intentar(letra))
					System.out.println("\nFALLASTE  la letra " + letra + " no se encuentra en la palabra a acertar");
				else {
					System.out.println("\nACERTASTE la letra " + letra + " se encuentra en la palabra a acertar");

					J1.descubriendopalabra(letra);

					if (J1.resolver(J1.getPalabraMostrar()))
						acertada = true;
				}
			}
			J1.setIntentosrealizados(J1.getIntentosrealizados() + 1);

		}
		if (acertada)

		{
			System.out.println("Enhorabuena acertaste la palabra");
			System.out.println("Acerstaste la palabra en: " + J1.getIntentosrealizados() + " intentos");
		} else
			System.out.println("oh lo siento agotaste el numero de intentos");

		System.out.println("La palabra es: " + J1.getPalabraAcertar());
	}

}

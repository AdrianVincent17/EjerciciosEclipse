package interfaces;

public class Entregabletest {

	public static void main(String[] args) {

		Serie listaseries[] = new Serie[3];
		Videojuego listajuegos[] = new Videojuego[3];

		listaseries[0] = new Serie();
		listaseries[1] = new Serie("Juego de tronos", "George R.R Martin");
		listaseries[2] = new Serie("Breaking bad", 5, "Thriller", "Vince Gilligan");
		listajuegos[0] = new Videojuego();
		listajuegos[1] = new Videojuego("Assassins Creed", "Ubisoft");
		listajuegos[2] = new Videojuego("Super Mario 3DS", 30, "Plataforma", "Nintendo");

		listaseries[1].entregar();
		listajuegos[1].entregar();
		listajuegos[2].entregar();

		int disponibles = 0;
		int prestados = 0;

		System.out.println("SERIES: ");
		for (Serie element : listaseries) {
			if (element.isprestado()) {
				System.out.println(element.toString() + "\n ---> PRESTADO <--- ");
				System.out.println();
				prestados++;
			} else {
				System.out.println(element.toString() + "\n ---> DISPONIBLE <--- ");
				System.out.println();
				disponibles++;
			}

		}

		System.out.println("\nVIDEOJUEGOS: ");
		for (Videojuego element : listajuegos) {
			if (element.isprestado()) {
				System.out.println(element.toString() + "\n ---> PRESTADO <--- ");
				System.out.println();
				prestados++;
			} else {
				System.out.println(element.toString() + "\n ---> DISPONIBLE <--- ");
				System.out.println();
				disponibles++;
			}

		}
		System.out.println("\nTotal diponibles: " + disponibles);
		System.out.println("Total prestados: " + prestados);

	}

}

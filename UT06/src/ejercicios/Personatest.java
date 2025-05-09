package ejercicios;

import java.util.Scanner;

public class Personatest {

	public static void muestramensajepeso(Persona p) {

		switch (p.CalcularIMC()) {

		case -1:
			System.out.println("La persona esta por debajo de su peso ideal");
			break;
		case 0:
			System.out.println("La persona esta en su peso ideal");
			break;
		case 1:
			System.out.println("La persona esta por encima de su peso");
			break;

		}
	}

	public static void muestramensajeedad(Persona p) {

		if (p.mayoredad()) {
			System.out.println("La persona es mayor de edad");
		} else {
			System.out.println("La persona no es mayor de edad");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Dime un nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Dime tu edad: ");
		int edad = sc.nextInt();
		System.out.print("Indica tu sexo: ");
		char sexo;
		do {
			System.out.print("Sexo(H|M: ");
			sexo = sc.next().toUpperCase().charAt(0);
		} while (sexo != 'H' && sexo != 'h' && sexo != 'H' && sexo != 'h');

		System.out.print("Dime cuanto pesas: ");
		double peso = sc.nextDouble();
		System.out.print("Dime cuanto mides: ");
		double altura = sc.nextDouble();

		Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
		System.out.println(p1);
		muestramensajepeso(p1);
		muestramensajeedad(p1);

		sc.close();

		Persona p2 = new Persona();
		p2.setNombre("Ana Valero");
		p2.setEdad(32);
		p2.setSexo('M');
		p2.setPeso(60);
		p2.setAltura(1.72);
		System.out.println(p2);
		muestramensajepeso(p2);
		muestramensajeedad(p2);
	}

}

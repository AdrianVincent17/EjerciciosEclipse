package herencia;

import java.util.Scanner;

public class DoctoradoTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce los datos del Alumno de doctorado...");
		System.out.print("Nombre del alumno: ");
		String nombre = sc.nextLine();
		System.out.print("Curso: ");
		String curso = sc.nextLine();
		System.out.print("Nota Curso: ");
		double notacurso = Double.parseDouble(sc.nextLine());
		System.out.print("Nombre de la tesis: ");
		String nomTesis = sc.nextLine();
		System.out.print("Nota de la tesis: ");
		double notatesis = Double.parseDouble(sc.nextLine());

		Doctorado d1 = new Doctorado(nombre, notacurso, curso, notatesis, nomTesis);
		System.out.println("Los datos introducidos son: ");
		System.out.println();
		System.out.println(d1.toString());

		sc.close();

	}

}

package ejercicios;

public class Matriztest {

	public static void main(String[] args) {

		Matriz m1 = new Matriz();

		m1.ValoresAleatorios();
		System.out.println("Valores Aleatorios: ");
		System.out.println(m1.toString());

		System.out.print("Diagonal: ");
		m1.diagonal();

		System.out.print("\nSuma diagonal: ");
		System.out.println(m1.sumadiagonal());

		System.out.print("Numero de pares: ");
		System.out.println(m1.ContarPares());

		m1.numPares();

		System.out.print("Numero de Impares: ");
		System.out.println(m1.ContarImpares());
		m1.numImpares();
		System.out.println();

		Matriz m2 = new Matriz();
		System.out.println("Matriz 2: ");
		m2.ValoresAleatorios();
		System.out.println(m2.toString());

		System.out.println("Matrices sumadas: ");
		m2.mostrarmatriz(m2.sumamatrices(m1.getMatriz()));

		System.out.print("Numero de filas: " + m2.getFilas());
		System.out.println("\nNumero de columnas: " + m2.getColumnas());

		

	}

}

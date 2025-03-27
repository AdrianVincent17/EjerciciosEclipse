package examen;

public class Empleadotest {

	public static void main(String[] args) {

		Camarero c1 = new Camarero("Rebeca Torres", 20, 200);
		Camarero c2 = new Camarero("Juan Toledo", 30, 150);

		Cocinero co1 = new Cocinero("Elena Arzak", 30, 5);
		Cocinero co2 = new Cocinero("Joan Roca", 40, 10);

		System.out.println(c1.toString());
		System.out.println();
		System.out.println(c2.toString());
		System.out.println();
		System.out.println(co1.toString());
		System.out.println();
		System.out.println(co2.toString());

	}

}

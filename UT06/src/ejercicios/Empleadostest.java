package ejercicios;

public class Empleadostest {

	public static void main(String[] args) {

		Empleados e1 = new Empleados("Adrian", 34, 1200, 2, "SemiSenior");

		System.out.println(e1.toString());
		System.out.println(e1.esposibleascenso());
	}

}

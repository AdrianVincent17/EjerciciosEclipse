package entero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Enterotest3 {

	public static void main(String[] args) {

		Entero num1=new Entero(5);

		int num2=(int)(Math.random()*10+1);
		
		if(num1.esmayor(num2))
			System.out.println("El numero "+num1.getNumero()+" es mayor a "+num2);
		else if(num1.getNumero()==num2)
			System.out.println("El numero "+num1.getNumero()+" es igual a "+num2);
		else
			System.out.println("El numero "+num1.getNumero()+" es menor a "+num2);





	}

}

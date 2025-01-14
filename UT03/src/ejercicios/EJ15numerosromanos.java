package ejercicios;

import java.util.Scanner;

public class EJ15numerosromanos {
	
	/**
	 * Funcion que devuelve una cadena de caracteres como numeros romanos al pasar un numero como parametro
	 * @param N numero entero
	 * @return numero romano
	 */
	
	public static String romanos(int N) {
		
		String cad="";
		int num=Math.abs(N);
		
			while(num>=1000) {num-=1000; cad=cad+"M";}
			
			if(num>=900) {num-=900;	cad=cad+"CM";}
			
			if(num>=500) {num-=500;	cad=cad+"D";}
			
			if(num>=400) {num-=400; cad=cad+"CD";}
			
			while(num>=100) {num-=100; cad=cad+"C";}
			
			if(num>=90) {num-=90; cad=cad+"C";}
			
			if(num>=50) {num-=50; cad=cad+"L";}
			
			if(num>=40) {num-=40; cad=cad+"XL";}
			
			while(num>=10) {num-=10; cad=cad+"X";}
			
			if(num>=9) {num-=9; cad=cad+"IX";}
			
			if(num>=5) {num-=5; cad=cad+"V";}
			
			if(num>=4) {num-=4; cad=cad+"IV";}
			
			while(num>=1) {num-=1; cad=cad+"I";}
				
		return cad;

	}
	public static void main(String[] args) {
		//Abrimos el lector
		Scanner teclado=new Scanner(System.in);
		
		try {
			
			System.out.println("Dime un numero y lo convierto a romano");
			int num=teclado.nextInt();
			
			//Cerramos el lector
			teclado.close();
			if(num<0)
				System.out.println("El numero "+num+" en romano es "+romanos(num)+" (A.c)");
			else
				System.out.println("El numero "+num+" en romano es "+romanos(num));
		}catch(Exception lupita) {
			System.out.println("Error dato introducido no valido");
		}
		
		
		
		
		

	}

}

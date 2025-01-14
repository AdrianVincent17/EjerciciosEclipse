package wrappers;

public class Integertest {

	public static void main(String[] args) {
		
	
		int num=5;
		Integer numwrapper=num;
		System.out.println("Valor (Integer): "+numwrapper);
		
		
	
		int numdevuelto=numwrapper;
		System.out.println("Valor (int): "+numdevuelto);
		
		
		String textonum="123";
		Integer numconvertido=Integer.parseInt(textonum);
		System.out.println("Conversion de String a Integer: "+numconvertido);
		
		Integer numvalueof=Integer.valueOf("2025");
		System.out.println("Creado con valueOf desde un string: "+numvalueof);
		
		String textonum2=numwrapper.toString();
		System.out.println("Conversion de Integer a String: "+textonum2);
		
		int numerobase=42;
		
		String binario=Integer.toBinaryString(numerobase);
		String octal=Integer.toOctalString(numerobase);
		String hexadecimal=Integer.toHexString(numerobase);
		
		System.out.println("Representacion de "+numerobase+" en binario "+binario);
		System.out.println("Representacion de "+numerobase+" en octal "+octal);
		System.out.println("Representacion de "+numerobase+" en hexadecimal "+hexadecimal);

		

	}

}

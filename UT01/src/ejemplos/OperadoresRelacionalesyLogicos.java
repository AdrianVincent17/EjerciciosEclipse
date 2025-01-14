package ejemplos;

public class OperadoresRelacionalesyLogicos {

	public static void main(String[] args) {

		//Declaramos e inicializamos las variables
		int a=8,b=6; 
		boolean res;
		
		//Vemos el valor de res segun la expresion logica
		res=(a<=b)&&(a!=b);
		System.out.println(res);
		res=(a<=b)||(a!=b);
		System.out.println(res);
		System.out.println((a>b)&&(b>5));
	
	}

}

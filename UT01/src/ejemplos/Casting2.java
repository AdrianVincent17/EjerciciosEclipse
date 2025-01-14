package ejemplos;

public class Casting2 {

	public static void main(String[] args) {
		
		
		// Declaracion e inicializacion de variables
		int a =3, b=8;
		System.out.println("a= "+a+", b= "+b);


		//Ejemplos de casting
		System.out.println("b/a= "+b/a);				//en el primero no hacemos casting por tanto no obetnemos ningun decimal al ser un int
		System.out.println("b/a= "+(float)(b/a));  		//en el segundo hacemos un cast a la operacion y obtenemos el resultado pero con variables 
		System.out.println("b/a= "+(float)b/a);  		//aqui hacemos cast a la primera variable
		System.out.println("b/a= "+b/(float)a);			//en este ejemplo hacemos cast a la segunda variable
		System.out.println("b/a= "+(float)b/(float)a); 	//en este caso hacemos cast sobre ambas variables
	
		a--;
		a-=1;
		
		
	}

}

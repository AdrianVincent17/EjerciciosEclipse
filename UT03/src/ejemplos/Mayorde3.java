package ejemplos;

public class Mayorde3 {

	public static void main(String[] args) {
		
		int a=MayordefuncionconAleatorio.aleatorio(1000),
			b=MayordefuncionconAleatorio.aleatorio(1000),
			c=MayordefuncionconAleatorio.aleatorio(1000);

		if(a>b) {
			if(a>c)
				System.out.println("Mayor "+a);
			else
				System.out.println("Mayor "+c);
		}else if(b>c)
				System.out.println("Mayor "+b);
		else 
			System.out.println("Mayor "+c);
	}

}

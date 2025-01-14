package ejercicios2;

import java.util.Scanner;

public class EJ04valors {

	public static void main(String[] args) {

		Scanner teclado=new Scanner(System.in);

		try {

			int num;
			int contapos=0; // contador numeros positivos introducidos
			int sumapos=0;	// suma de los numero introducidos postivos
			int contaneg=0; // contador numeros negativos introducidos
			int sumaneg=0;	// suma de los numero introducidos negativos
			int contacero=0;// contador de los ceros introducidos
			int suma=0;		// resultado total numeros introducidos
			//Pedimos 10 numero por teclado y actualizamos el valor de las variables

			for(int i=1; i<=4; i++) {
				System.out.print("("+i+") Dime un valor: ");
				num=teclado.nextInt();

				if(num==0)
					contacero++;
				else if (num>0) {
					contapos++;
					sumapos+=num;
					suma+=num;
				}else {
					contaneg++;
					sumaneg+=num;
					suma+=num;
				}
			}

			//Mostramos los resultados
			if(contapos>0)
			
				System.out.println("Media positivos: "+((float)sumapos/contapos));
			else
				System.out.println("\nNo has introducido ningun valor positivo");
			
			if(contaneg>0)
			System.out.println("Media negativos: "+((float)sumaneg/contaneg));
			else
				System.out.println("\nNo has introducido un valor negativo");
			
			System.out.println(">> Numeros positivos introducidos: "+contapos);
			System.out.println(">> Numeros negativos introducidos: "+contaneg);
			System.out.println(">> Sumatorio de positivos introducidos: "+sumapos);
			System.out.println(">> Sumatorio de negativos introducidos: "+sumaneg);
			System.out.println(">> Numero cero introducidos: "+contacero);
			System.out.println(">> Suma total de todos los numeros: "+suma);

		}catch(Exception e) {
			System.out.println("Error, dato no valido");
		}finally {
			teclado.close();

		}


		
	}

}

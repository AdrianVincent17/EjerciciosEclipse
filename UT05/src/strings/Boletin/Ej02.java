package strings.Boletin;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		try {
			String entrada;
			String cadena="FIN";
			int conta=1;
			System.out.println("Introduce palabras (FIN para terminar...");
			String aux="";
			do {
				System.out.print("palabra "+conta+": ");
				entrada=sc.nextLine();
				aux+=entrada+" ";
				conta++;
				
			}while(cadena.indexOf(entrada)!=0);
			if(cadena.indexOf(entrada)!=-1) {
				aux=aux.replace(cadena, "");
			}
			aux.trim();
			
			System.out.println("Frase: "+aux);
			
		}catch(Exception  e) {
			System.out.println("Error");
			
		}finally {
			sc.close();
		}
		
		

	}

}

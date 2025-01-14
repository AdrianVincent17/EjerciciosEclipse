package boletin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Timetest {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		
		try {
			
			System.out.println("Introduce una hora....");
			System.out.print("  Horas: ");
			int h=teclado.nextInt();
						
			System.out.print("  Mintuos: ");
			int m=teclado.nextInt();
			
			System.out.print("  Segundos: ");
			int s=teclado.nextInt();
			
			Time t1=new Time(h,m,s);
			
			if(!t1.isvalid()) {
				System.out.println(">> Error en el dato introducido");
			}else {
				System.out.println("\n> Hora introducida: "+t1.tostring());
				int totalseg=t1.getHours()*3600+t1.getMinutes()*60+t1.getSeconds();
				System.out.println("> Total sg transcurridos: "+totalseg+" sg");
				
				int seg=t1.getSeconds()-1;
				int min=t1.getMinutes();
				int hou=t1.getHours();
				
				if(seg<0) {
					seg=59;
					min--;
				}
				if(min<0) {
					min=59;
					hou--;
				}
				if(hou<0) {
					hou=23;
					min=59;
					seg=59;
				}
				
				Time t2= new Time(hou,min,seg);
				System.out.println("> Hora 1 sg antes: "+t2.tostring());
				
				
			}
			
			
			
			
			
			
			
			
			
		}catch(InputMismatchException lupita) {
			System.out.println(">> Error en la introduccion de datos.");
			
		}catch(AssertionError ea) {
			System.out.println(ea.getMessage());
			
		}finally {
			teclado.close();
		}

	}

}

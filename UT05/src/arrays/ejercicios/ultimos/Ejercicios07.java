package arrays.ejercicios.ultimos;



public class Ejercicios07 {
	
	static int [] array;
	final static int TAM=100;
	final static int LIMIT=100;
	
	public static void muestra() {
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static int aleatorio(int N) {
		return (int)(Math.random()*N+1);
	}
	
	public static void ordena() {
		
		int aux;
		boolean cambio=false;
		
		for(int i=array.length; i>0; i--) {
			cambio=false;
			for(int j=0; j<i-1; j++) {
				if(array[j]>array[j+1]) {
					aux=array[j+1];
					array[j+1]=array[j];
					array[j]=aux;
					cambio=true;
				}
			}
			if(!cambio)
				return;
		}
	}
	
	public static boolean encuentra(int N) {
		for(int i=0; i<array.length; i++) {
			if(N==array[i])
				return true;
			if(N<array[i])
				return false;
		}
		return false;
	}

	public static void main(String[] args) {
		
		array = new int[TAM];
		
		for(int i=0; i<array.length; i++) {
			array[i]=aleatorio(LIMIT);
		}
		
		System.out.print("Lista desordenada: ");
		muestra();
		
		ordena();
		
		System.out.print("\nLista ordenada: ");
		
		muestra();
		
		System.out.print("\n\nLos siguientes numeros no se encuentran  en la lista: ");
		for(int num=1; num<LIMIT; num++) {
			if(!encuentra(num)) {
				System.out.print(num+" ");
			}
		}
	}

}

package arrays.ejercicios.ultimos;

public class EjercicioS04 {
	
	
	
	public static void visualiza(int [] array) {
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]+" ");
		}
	}
	
	public static int[] combina(int[] A, int[] B) {
		
	
		int[] C=new int[A.length+B.length];
		int i;
		for(int j=0; j<A.length; j++) {
			C[i]=A[j];
			i++;
		}
		for(int j=0; j<B.length; j++) {
			C[i]=B[j];
			i++;
		}
		return C;
	}
	
	public static void burbujamejor(int [] array) {
		
		int aux;
		boolean cambio;
		
		for(int i=array.length-1; i>0; i--) {
			cambio=false;
			for(int j=0; j<array.length; j++) {
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
	
	
	public static int aleatorio(int num) {
		
		return (int)(Math.random()*num+1);
	}
	
	final static int TAM=50;
	final static int LIMITE=100;

	public static void main(String[] args) {
		
		
		int [] array1=new int[TAM];
		int [] array2=new int[TAM];
		
		
		

	}

}

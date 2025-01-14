package bucles;

public class DeNaM {

	public static void main(String[] args) {
		
		/*
		 * Declaramose e inicializamos variables con numeros aleatorios
		 * */
		int N=(int)(Math.random()*25+1);
		int M=(int)(Math.random()*25+1);
		
		int N2;
		int M2;
		
		/**
		 * Si el primero es menor que el segundo muestra cuenta ascendente
		 * si por el contrario es mayor, muestra cuenta descendente,
		 * en caso de empate muestra empate 
		 * */
		if(N<M) {
			System.out.println("La cuenta es de "+N+" a "+M+": (Ascendente)");
			for(N2=N; N2<=M; N++)
				System.out.print(N+" ");
		}else if(N>M) {
			System.out.println("La cuenta es de "+N+" a "+M+": (Descendente)");
			for(M2=M; N>=M; N--)
				System.out.print(N+" ");
		}else
			System.out.println("Empate tecnico "+N);	
	}

}

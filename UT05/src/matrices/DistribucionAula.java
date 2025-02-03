package matrices;

public class DistribucionAula {
	
	public static void mostrar(int [][] m) {
		
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
					System.out.print(m[i][j]+"\t");
			}
			System.out.println(); 
			
		}
		
	}
	
	/**
	 * Funcion que determina si un valor se encutnra almacenado en una matriz
	 * @param m - array bidimensional de valores enteros
	 * @param valor - valor enero (que vamos a ver si se encuenta ya o no almacenada en la matriz)
	 * @param fila- fila de la matriz hasta la que comparamos los valores
	 * @param columna - columna de la matriz, dentro de la fila indicada como parametro, 
	 * @return true si N se encuentra entre los valores almacenados en la matriz y false en caso contrario
	 */
	
	public static boolean encontrado(int [][] m, int valor, int fila, int columna) {
		int i;
		//Recorremos todos los valores almacenados en filas anteriores
		for(i=0; i<fila; i++) {
			for(int j=0; j<m[0].length; j++) 
					
				if(m[i][j]==valor) 
					return true;	
		}
		
		//Recorremos la fila en la que se encuentra el elemento 
		for(int j=0; j<columna; j++) 
			if(m[i][j]==valor) 
				return true;
				
		return false;
	}
	
		
	
	
	final static int FILAS=4;
	final static int COLUMNAS=6;

	public static void main(String[] args) {
		
		String [] clase= {"Jesus C.", "Alberto C.", "Marlon C.","Hamza D.","Adam D.",
				  "Jose G.", "Angel G.", "Mehdi L.","Joaquin L", "Rafael L.",
				  "Fran L.","Elena L.","Uriel L.", "Alvaro L.", "Uriel M.", 
				  "Felix R.","JAPeñalver", "Jesus P.", "Erik P.","Eduardo P.", 
				  "Ivan S.", "Jalil T.", "Alejandro","Adrian V."}; 
		
		
		
		int [][] matriz=new int [FILAS][COLUMNAS];
		int valor;
		
		for(int i=0; i<matriz.length; i++) 
			for(int j=0; j<matriz[i].length; j++) {
				do {
					valor=(int)(Math.random()*(FILAS*COLUMNAS));
				}while(encontrado(matriz, valor, i, j));
			matriz[i][j]=valor;
		}
		int puesto=24;
		
		System.out.println("Distribucion de puestos: \n");
		for(int i=0; i<FILAS; i++) {
			for(int j=0; j<COLUMNAS; j++, puesto--) 
					System.out.print("("+puesto+") "+clase[matriz[i][j]]+"\t");
			System.out.println("\n"); 
			}
			
			
		
	
	puesto=1;
	
	//Listamos la distribucion
	System.out.println("Listado por puestos: \n");
	
	for(int i=FILAS-1; i>=0; i--) {
		for(int j=COLUMNAS-1; j>=0; j--, puesto++) 
				System.out.println(puesto+" - "+clase[matriz[i][j]]);
		
		}
		
		
	}
		
	}

	
	



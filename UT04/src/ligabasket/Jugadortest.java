package ligabasket;

public class Jugadortest {

	public static void main(String[] args) {
		
		//Creamos una primera instancia de jugador
		Jugador j1=new Jugador("Michael Jordan", 23, 1.98,"Escolta",20000000);
		
		System.out.println(j1.mostrarjugador());
		
		//Creamos una segunda instancia de jugador
		
		Jugador j2=new Jugador();

		System.out.println(j2.mostrarjugador());
		
		
		//El jugador 2 se llama Larry Bird y lleva el dorsal 33
		//Mide 10 cm mas qeu micheael jordan y cobra la mitad que el 
		j2.setNombre("Larry Bird");
		j2.setDorsal(33);
		j2.setAltura(j1.getAltura()+0.1);
		j2.setSalario(j1.getSalario()/2);
		j2.setPuesto("Alero");
		
		System.out.println(j2.mostrarjugador());
	}

}

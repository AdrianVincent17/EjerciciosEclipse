package ejercicios;

public class Ahorcado {

	private int intentosrealizados;
	private int intentosTotales;
	private String palabraAcertar;
	private String palabraMostrar;
	private int intentosrestantes;

	/**
	 * @param palabraMostrar
	 */
	public Ahorcado() {

		palabraAcertar = generarpalabra();
		palabraMostrar = palabramostrar();
		intentosTotales = 10;
		intentosrealizados = 0;
	}

	public Ahorcado(int intentos) {

		palabraAcertar = generarpalabra();
		palabraMostrar = palabramostrar();
		intentosTotales = intentos;
		intentosrealizados = 0;
	}

	/**
	 * @return el intentosrealizados
	 */
	public int getIntentosrealizados() {
		return intentosrealizados;
	}

	/**
	 * @param intentosrealizados el intentosrealizados a establecer
	 */
	public void setIntentosrealizados(int intentosrealizados) {
		this.intentosrealizados = intentosrealizados;
	}

	/**
	 * @return el intentosTotales
	 */
	public int getIntentosTotales() {
		return intentosTotales;
	}

	/**
	 * @param intentosTotales el intentosTotales a establecer
	 */
	public void setIntentosTotales(int intentosTotales) {
		this.intentosTotales = intentosTotales;
	}

	/**
	 * @return el intentosrestantes
	 */
	public int getIntentosrestantes() {
		return intentosrestantes = intentosTotales - intentosrealizados;
	}

	/**
	 * @param intentosrestantes el intentosrestantes a establecer
	 */
	public void setIntentosrestantes(int intentosrestantes) {
		this.intentosrestantes = intentosrestantes;
	}

	/**
	 * @return el palabraAcertar
	 */
	public String getPalabraAcertar() {
		return palabraAcertar;
	}

	/**
	 * @param palabraAcertar el palabraAcertar a establecer
	 */
	public void setPalabraAcertar(String palabraAcertar) {
		this.palabraAcertar = palabraAcertar;
	}

	/**
	 * @return el palabraMostrar
	 */
	public String getPalabraMostrar() {
		return palabraMostrar;
	}

	/**
	 * @param palabraMostrar el palabraMostrar a establecer
	 */
	public void setPalabraMostrar(String palabraMostrar) {
		this.palabraMostrar = palabraMostrar;
	}

	/**
	 * Metodo que devuelve verdadero o falso en caso de que la letra pasada por
	 * paramtero coincida con alguna letra de la palabra a acertar
	 * 
	 * @param letra
	 * @return TRUE en caso de ser correcta Y FALSE si no lo es
	 */

	public boolean intentar(char letra) {
		for (int i = 0; i < palabraAcertar.length(); i++) {
			if (palabraAcertar.charAt(i) == letra) {
				return true;
			}
		}
		return false;
	}

	/**
	 * metodo que devuelve true o false si la cadena introducida como parametro es o
	 * no igual a la palabra a acertar
	 * 
	 * @param cadena
	 * @return TRUE si es correcta y FASLE si no lo es
	 */

	public boolean resolver(String cadena) {
		if (palabraAcertar.equals(cadena)) {
			return true;
		}
		return false;
	}

	/**
	 * Palabra codificada con asteriscos de la palabra secreta
	 * 
	 * @return
	 */

	public String palabramostrar() {
		String asteriscos = "";
		for (int i = 0; i < palabraAcertar.length(); i++) {
			asteriscos += "*";
		}
		return asteriscos;
	}

	/**
	 * Metodo que genera una palabra aleatoria a partir de un array de palabras
	 * predefinidas
	 * 
	 * @return una palabra de la lista aleatoria
	 */

	public String generarpalabra() {

		String[] palabras = { "LEUCOCITO", "SOMBRILLA", "OBESIDAD", "CALAMBRE", "COBRADOR", "ARMARIO", "LIMONADA",
				"ESCRITORIO", "ALCACHOFA", "MEDICAMENTO", "ABRAZADERA", "ESTRANGULAMIENTO", "ESTUPEFACIENTE", "MONITOR",
				"MATASUEGRAS", "ESCOMBRO", "PINZAMIENTO", "EXTRAÑAR", "APROBAR", "VISTAZO", "OPORTUNIDAD", "LUMBRERAS",
				"INSULTO", "PARAPLEJICO", "TRIFASICO", "POMPEYA", "LUCIERNAGA" };

		return palabraAcertar = palabras[(int) (Math.random() * palabras.length)];

	}

	public void descubriendopalabra(char letra) {
		for (int i = 0; i < palabraAcertar.length(); i++) {
			if (palabraAcertar.charAt(i) == letra) {
				palabraMostrar = palabraMostrar.substring(0, i) + letra + palabraMostrar.substring(i + 1);
			}
		}
	}

}

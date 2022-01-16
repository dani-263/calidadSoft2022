package netflix;

public class Serie extends Video{

	/**
	 * 
	 * Clase Serie que representan las series almacenadas. Es una clase hija de Video.
	 * @author Dani
	 * @version 4.17
	 */
	
	//Atributos de la clase Serie.
	private int numeroTemporadas;
	private int numeroCapitulos;
	
	/**
	 * Constructor de la clase Serie que inicializa los valores.
	 */
	//Contructor inicialización.
	public Serie(){
	super();
	this.numeroTemporadas = 1;
	this.numeroCapitulos = 1;
	}
	
	//Constructor principal.
	
	/**
	 * Constructor de la clase Serie que asigna los valores que le pasamos.
	 * @param numeroTemporadas Número de temporadas de la serie a asignar
	 * @param numeroCapitulos Númerod de capítulos de la serie a asignar
	 */
	
	public Serie(String tituloVideo, String generoVideo, int duracionVideo, int numeroTemporadas, int numeroCapitulos) {
		super(tituloVideo, generoVideo, duracionVideo);
		this.numeroTemporadas = numeroTemporadas;
		this.numeroCapitulos = numeroCapitulos;
	}

	//Getters de los atributos.
	
	/**
	 * @return NumeroTemporadas Devuelve el número de temporadas que tiene una serie
	 */
	
	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}


	/**
	 * @return NumeroCapitulos Devuelve el número de capítulos que tiene una serie
	 */
	
	public int getNumeroCapitulos() {
		return numeroCapitulos;
	}

	//Setters de los atributos.
	
	/**
	 * 
	 * @param NumeroTemporadas Asigna el número de temporadas que tiene una serie
	 */
	
	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}


	/**
	 * 
	 * @param NumeroCapitulos Asigna el número de capítulos que tiene una serie
	 */
	
	public void setNumeroCapitulos(int numeroCapitulos) {
		this.numeroCapitulos = numeroCapitulos;
	}
	
	//Método toString específico de la clase Serie que muestra la información relacionada con cada serie.
	
	/**
	 * @return Método toString específico de la clase Serie que muestra la información relacionada con las temporadas y capçitulos de una serie
	 */
	
	public String toString() {
		return super.toString() + "\n\tNúmero de temporadas: " + getNumeroTemporadas() + "\n\tNúmero de capítulos: " + getNumeroCapitulos();
		}
	
	
}

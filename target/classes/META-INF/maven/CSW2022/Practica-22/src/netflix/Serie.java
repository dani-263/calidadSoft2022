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
	//Contructor inicializaci�n.
	public Serie(){
	super();
	this.numeroTemporadas = 1;
	this.numeroCapitulos = 1;
	}
	
	//Constructor principal.
	
	/**
	 * Constructor de la clase Serie que asigna los valores que le pasamos.
	 * @param numeroTemporadas N�mero de temporadas de la serie a asignar
	 * @param numeroCapitulos N�merod de cap�tulos de la serie a asignar
	 */
	
	public Serie(String tituloVideo, String generoVideo, int duracionVideo, int numeroTemporadas, int numeroCapitulos) {
		super(tituloVideo, generoVideo, duracionVideo);
		this.numeroTemporadas = numeroTemporadas;
		this.numeroCapitulos = numeroCapitulos;
	}

	//Getters de los atributos.
	
	/**
	 * @return NumeroTemporadas Devuelve el n�mero de temporadas que tiene una serie
	 */
	
	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}


	/**
	 * @return NumeroCapitulos Devuelve el n�mero de cap�tulos que tiene una serie
	 */
	
	public int getNumeroCapitulos() {
		return numeroCapitulos;
	}

	//Setters de los atributos.
	
	/**
	 * 
	 * @param NumeroTemporadas Asigna el n�mero de temporadas que tiene una serie
	 */
	
	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}


	/**
	 * 
	 * @param NumeroCapitulos Asigna el n�mero de cap�tulos que tiene una serie
	 */
	
	public void setNumeroCapitulos(int numeroCapitulos) {
		this.numeroCapitulos = numeroCapitulos;
	}
	
	//M�todo toString espec�fico de la clase Serie que muestra la informaci�n relacionada con cada serie.
	
	/**
	 * @return M�todo toString espec�fico de la clase Serie que muestra la informaci�n relacionada con las temporadas y cap�itulos de una serie
	 */
	
	public String toString() {
		return super.toString() + "\n\tN�mero de temporadas: " + getNumeroTemporadas() + "\n\tN�mero de cap�tulos: " + getNumeroCapitulos();
		}
	
	
}

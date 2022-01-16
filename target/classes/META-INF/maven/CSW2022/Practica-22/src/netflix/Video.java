package netflix;

public class Video implements Test{

	/**
	 * 
	 * Clase Video que representa el contenido e implementa Test.
	 * @author Dani
	 * @version 4.17
	 */
	
	//Atributos de la clase Video.
	protected String tituloVideo;
	protected String generoVideo;
	protected int duracionVideo;
	protected boolean visto;
	
	
	/**
	 * Constructor de la clase Video que inicializa los valores a cero.
	 */
	//Construtor vac�o.
	public Video(){
	this.tituloVideo = "";
	this.generoVideo = "";
	this.duracionVideo = 0;

	}
	
	/**
	 * Constructor de la clase Video que asigna los valores que le pasamos.
	 * @param tituloVideo Titulo del video a asignar
	 * @param generoVideo G�nero del video a asignar
  	 * @param duracionVideo Duraci�n del video a asignar
	 */
	//Constructor principal.
	public Video(String tituloVideo, String generoVideo, int duracionVideo) {
		this.tituloVideo = tituloVideo;
		this.generoVideo = generoVideo;
		this.duracionVideo = duracionVideo;
	
	}

	/**
	 * @return precTituloVideo Devuelve el titulo del video
	 */
	
	//Getters de los atributos.
	public String getTituloVideo() {
		return tituloVideo;
	}

	/**
	 * @return GeneroVideo Devuelve el g�nero del video
	 */

	public String getGeneroVideo() {
		return generoVideo;
	}


	/**
	 * @return DuracionVideo Devuelve la duraci�n del video
	 */
	
	public int getDuracionVideo() {
		return duracionVideo;
	}



	/**
	 * 
	 * @param nombre Asigna el t�tulo al video
	 */
	
	//Setters de los atributos.
	public void setTituloVideo(String tituloVideo) {
		this.tituloVideo = tituloVideo;
	}


	/**
	 * 
	 * @param nombre Asigna el g�nero al video
	 */
	
	public void setGeneroVideo(String generoVideo) {
		this.generoVideo = generoVideo;
	}


	/**
	 * 
	 * @param nombre Asigna la duraci�n al video
	 */
	
	public void setDuracionVideo(int duracionVideo) {
		this.duracionVideo = duracionVideo;
	}

	
	/**
	 * @return M�todo toString general de la clase padre que muestra la informaci�n relacionada con video
	 */

	public String toString() {
		return "\tTitulo: " + getTituloVideo() + "\n\tGenero: " + getGeneroVideo() + "\n\tDuracion: "+ getDuracionVideo() + "\n\tVisto: " + contenidoReproducido();
		}
	
	/**
	 * @void M�todo marcarContenido que marca como visto un video, asignando true al valor de boolean visto
	 */
	
	public void marcarContenido() {
		this.visto = true;
		}
	
	/**
	 * return M�todo contenidoReproducido que devuelve si el video ha sido visto
	 */
	
	public boolean contenidoReproducido() {
		return this.visto;
	}
	
}

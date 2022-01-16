package netflix;

public class Pelicula extends Video{

	/**
	 * 
	 * Clase Pelicula que representan las peliculas almacenadas. Es una clase hija de Video.
	 * @author Dani
	 * @version 4.17
	 */
	
	//Atributos de la clase Pelicula.
	private int anioPelicula;

	//Constructor vac�o.
	/**
	 * Constructor vac�o de la clase Pelicula.
	 */
	
	public Pelicula(){
		super();
		
		}
	
	//Constructor principal.
	
	/**
	 * Constructor de la clase Pelicula que asigna los valores que le pasamos.
	 * @param anioPelicula A�o de estreno de la pel�cula a asignar
	 */
	
	public Pelicula(String tituloVideo, String generoVideo, int duracionVideo, int anioPelicula) {
		super(tituloVideo, generoVideo, duracionVideo);
		this.anioPelicula = anioPelicula;
	}

	//Getters de los atributos.
	
	/**
	 * @return anioPelicula Devuelve el a�o de estreno de una pel�cula
	 */
	
	public int getAnioPelicula() {
		return anioPelicula;
	}

	//Setters de los atributos.
	
	/**
	 * 
	 * @param anioPelicula Asigna el a�o de estreno de una pel�cula
	 */
	
	public void setAnioPelicula(int anioPelicula) {
		this.anioPelicula = anioPelicula;
	}
	
	/**
	 * @return M�todo toString espec�fico de la clase Pelicula que muestra la informaci�n relacionada con el a�o de estreno de la misma
	 */
	
	public String toString() {
		return super.toString()+ "\n\tA�o: " + getAnioPelicula();
		}
	
	
}

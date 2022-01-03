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

	//Constructor vacío.
	/**
	 * Constructor vacío de la clase Pelicula.
	 */
	
	public Pelicula(){
		super();
		
		}
	
	//Constructor principal.
	
	/**
	 * Constructor de la clase Pelicula que asigna los valores que le pasamos.
	 * @param anioPelicula Año de estreno de la película a asignar
	 */
	
	public Pelicula(String tituloVideo, String generoVideo, int duracionVideo, int anioPelicula) {
		super(tituloVideo, generoVideo, duracionVideo);
		this.anioPelicula = anioPelicula;
	}

	//Getters de los atributos.
	
	/**
	 * @return anioPelicula Devuelve el año de estreno de una película
	 */
	
	public int getAnioPelicula() {
		return anioPelicula;
	}

	//Setters de los atributos.
	
	/**
	 * 
	 * @param anioPelicula Asigna el año de estreno de una película
	 */
	
	public void setAnioPelicula(int anioPelicula) {
		this.anioPelicula = anioPelicula;
	}
	
	/**
	 * @return Método toString específico de la clase Pelicula que muestra la información relacionada con el año de estreno de la misma
	 */
	
	public String toString() {
		return super.toString()+ "\n\tAño: " + getAnioPelicula();
		}
	
	
}

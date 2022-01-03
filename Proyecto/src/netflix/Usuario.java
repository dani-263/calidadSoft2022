package netflix;


public class Usuario {

	/**
	 * 
	 * Clase Usuario que representan los usuarios que tiene almacenados el sistema
	 * @author Dani
	 * @version 4.17
	 */
	
	//Atributos de la clase Usuario.
	private String nombreUsuario;
	private int idUsuario;
	private String direccionUsuario;
	
	/**
	 * Constructor de la clase Usuario que asigna los valores que le pasamos.
	 */
	
	//Constructor principal.
	public Usuario(String nombreUsuario, int idUsuario, String direccionUsuario) {
		this.nombreUsuario = nombreUsuario;
		this.idUsuario = idUsuario;
		this.direccionUsuario = direccionUsuario;
	}
	
	//Constructor vacio
	public Usuario() {
		
	}
		
	
	//Getters de los atributos.
	
	/**
	 * @return NombreUsuario Devuelve el nombre del usuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}


	/**
	 * @return IdUsuario Devuelve el id del usuario
	 */
	
	public int getIdUsuario() {
		return idUsuario;
	}


	/**
	 * @return DireccionUsuario Devuelve la dirección del usuario
	 */
	
	public String getDireccionUsuario() {
		return direccionUsuario;
	}

	//Setters de los atributos.
	

	/**
	 * 
	 * @param NombreUsuario Asigna el nombre al usuario
	 */
	
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	/**
	 * 
	 * @param IdUsuario Asigna el identificador al usuario
	 */
	
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	/**
	 * 
	 * @param DireccionUsuario Asigna la dirección a un  usuario
	 */
	
	public void setDireccionUsuario(String direccionUsuario) {
		this.direccionUsuario = direccionUsuario;
	}
	
	/**
	 * @return Método toString que muestra la información relacionada con el usuario
	 */
	
	public String toString() {
		return super.toString() + "\n\tUsuario: " + getNombreUsuario() + "\n\tID: " + getIdUsuario() + "\n\tDirección: " + getDireccionUsuario();
		}
	
	
}

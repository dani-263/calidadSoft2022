package practica3;

public class Pelicula {

	 String titulo;
	 int anio;
	 String actor;
	 int valoracion;
	 int referencia = 0;
	
	 
	 
	 public Pelicula(String titulo, int anio, String actor, int valoracion, int referencia) {
		super();
		this.titulo = titulo;
		this.anio = anio;
		this.actor = actor;
		this.valoracion = valoracion;
		this.referencia = referencia;
	}





	public String getTitulo() {
		return titulo;
	}





	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}





	public int getAnio() {
		return anio;
	}





	public void setAnio(int anio) {
		this.anio = anio;
	}





	public String getActor() {
		return actor;
	}





	public void setActor(String actor) {
		this.actor = actor;
	}





	public double getValoracion() {
		return valoracion;
	}





	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}





	public int getReferencia() {
		return referencia;
	}





	public void setReferencia(int referencia) {
		this.referencia++;
	}


	
	 
	 
}

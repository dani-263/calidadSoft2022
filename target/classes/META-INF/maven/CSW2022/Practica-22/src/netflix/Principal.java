package netflix;

import java.util.ArrayList;
import java.util.Collections;





public class Principal {

	public static void main(String[] args) {
	
		
		//Creaci�n de arryas de los diferenctes tipos.
		ArrayList<Pelicula> arrayPeliculas = new ArrayList<Pelicula>();
		ArrayList<Serie> arraySeries = new ArrayList<Serie>();
		ArrayList<Usuario> arrayUsuarios = new ArrayList<Usuario>();

		
		//A�adimos diferentes peliculas al array.
		arrayPeliculas.add(new Pelicula());
		arrayPeliculas.add(new Pelicula("Alpha", "Drama", 96, 2018));
		arrayPeliculas.add(new Pelicula("Riddick", "Acci�n", 119, 2013));
		arrayPeliculas.add(new Pelicula("Saw VIII", "Terror", 91, 2017));
		arrayPeliculas.add(new Pelicula("Blade Runner", "Ficci�n", 163, 2017));
		arrayPeliculas.add(new Pelicula("Legion", "Thriller", 100, 2010)); 
		
		
		//A�adimos diferentes series al array.
		arraySeries.add(new Serie());
		arraySeries.add(new Serie("Los Simpson", "Animaci�n", 45, 10, 5));
		arraySeries.add(new Serie("Juego de Tronos", "Fantas�a", 50, 5, 7));
		arraySeries.add(new Serie("Black Mirror", "Ficci�n", 55, 2, 20));
		arraySeries.add(new Serie("Friends", "Comedia", 40, 10, 2)); 
		arraySeries.add(new Serie("Arrow", "Superheroes", 50, 8, 2)); 
		arraySeries.add(new Serie("Chernobil", "Drama", 90, 1, 5)); 
		arraySeries.add(new Serie("Gambito de Dama", "Drama", 90, 1, 7)); 
		
		
		
		//A�adimos ususarios al array.
		arrayUsuarios.add(new Usuario());
		arrayUsuarios.add(new Usuario("Maria", 01, "Murcia"));
		arrayUsuarios.add(new Usuario("Juan", 02, "Cartagena"));
		arrayUsuarios.add(new Usuario("Pedro", 03, "Alicante"));
		arrayUsuarios.add(new Usuario("Marta", 04, "Almeria"));
		
		
		
		/**Marcamos varias series o peliculas como vistas, usando la interfaz,
		se necesita el uso de excepciones para que funcione correctamente.*/
		
		try {
		arrayPeliculas.get(2).marcarContenido();
		arrayPeliculas.get(3).marcarContenido();
		arraySeries.get(2).marcarContenido();
		} catch(IndexOutOfBoundsException error){ 
			System.out.println("Error");
		}
		
		
		
		System.out.println("--------------------------------------");
		System.out.println("---- LISTADO DE PLICULAS Y SERIES ---");
		System.out.println("--------------------------------------");
		
		//Se muestra la informaci�n relativa a las pel�culas del cat�logo.
		System.out.println("\nPELICULAS:");
		System.out.println("----------");
		for(int i = 1; i<6; i++){
		System.out.println("\n"+ arrayPeliculas.get(i).toString());
		System.out.println("\t________________________________");
		}
		
		//Se muestra la informaci�n relativa a las series del cat�logo.
		System.out.println("\nSERIES:");
		System.out.println("-------");
		for(int i = 1; i<7; i++){
		System.out.println(" \n"+arraySeries.get(i).toString());
		System.out.println("\t________________________________");
		}
		
		//Se muestra la informaci�n de los usuarios del sistema.
		System.out.println("\nUSUARIOS:");
		System.out.println("----------");
		for(int j = 1; j<5; j++){
		System.out.println(arrayUsuarios.get(j).toString());
		System.out.println("\t________________________________");
		}
		
		
		System.out.println("\n\n------------------------------------------------");
		System.out.println("\tORDENAR PELICULAS POR NOVEDADES: ");
		System.out.println("------------------------------------------------");
		
		//Ordenaci�n de pel�culas por novedades utilizando el criterio CriterioAntiguedadPelicula().
		Collections.sort(arrayPeliculas, new CriterioAntiguedadPelicula());
		
		for(Pelicula aux:arrayPeliculas) {
			if (aux instanceof Pelicula)
				System.out.println("\t___________________________________");
			System.out.println("\tPelicula: "+ aux.getTituloVideo() + ". A�o: "+aux.getAnioPelicula());
			
		}
		
		
		/**Se muestran las pel�culas que ya han sido vistas, recorriendo el array de series 
		 y pel�culas y mostrando  las que han sido ya vistas (se eligieron al azar varias anteriormente).*/
		
		
		System.out.println("\n\n------------------------------------------------");
		System.out.println("\tLISTADO DE PRODUCTOS VISTOS: ");
		System.out.println("------------------------------------------------");
		
		for (int i=1; i<5; i++){
		if(arrayPeliculas.get(i).contenidoReproducido() == true)
		{
		System.out.println("\t___________________________________");
		System.out.println("\t " + arrayPeliculas.get(i).getTituloVideo());
				
		}
		if(arraySeries.get(i).contenidoReproducido() == true){
		System.out.println("\t___________________________________");
		System.out.println("\t " + arraySeries.get(i).getTituloVideo());
		}
		} 
	
				
		System.out.println("\n\n------------------------------------------------");
		System.out.println("\tMINISERIES (siete capitulos o menos): ");
		System.out.println("------------------------------------------------");
				
		//Se recorre el array con todas las series y se muestran las miniseries.		
		for(Serie aux:arraySeries) {
			if (aux instanceof Serie && aux.getNumeroCapitulos()>1 && aux.getNumeroCapitulos()<=7 && aux.getNumeroTemporadas()==1) {
			System.out.println("\tSerie: "+ aux.getTituloVideo());
			}
		}
				
				
	}

	
}


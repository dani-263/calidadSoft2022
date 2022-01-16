package netflix;
import java.util.Comparator;


public class CriterioAntiguedadPelicula implements Comparator<Pelicula>{


		public int compare(Pelicula a, Pelicula b) {
			
			if(a.getAnioPelicula() > b.getAnioPelicula())
				return -1;
			
			if(a.getAnioPelicula() < b.getAnioPelicula())
				return 1;
			else
				return 0;
		}
}

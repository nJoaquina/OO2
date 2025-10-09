package ar.edu.unlp.oo2.Ejer7DecodificadorDePeliculas;

import java.util.ArrayList;

public class Similitud implements Criterio{

	// similitud: las peliculas similares a alguna pelicula que reprodujo, ordenadas de mas a menos reciente
	@Override
	public ArrayList<Pelicula> sugerirPeliculas(Decodificador d) {
		
		return d.similitud();
	}

	
}

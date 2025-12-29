package ar.edu.unlp.oo2.Ejer7DecodificadorDePeliculas;

import java.util.List;
import java.util.stream.Collectors;

public class Similitud implements Criterio{

	// similitud: las peliculas similares a alguna pelicula que reprodujo, ordenadas de mas a menos reciente
	@Override
	public List<Pelicula> sugerirPeliculas(Decodificador d) {
		
		return d.similitud().stream().limit(3).collect(Collectors.toList());;
	}

	
}

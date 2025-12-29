package ar.edu.unlp.oo2.Ejer7DecodificadorDePeliculas;

import java.util.List;
import java.util.stream.Collectors;

public class Novedad implements Criterio {

	// LAS PELICULAS MAS RECIENTES, mostrar solo 3
	@Override
	public List<Pelicula> sugerirPeliculas(Decodificador d) {
		return d.peliculasNuevas().stream().limit(3).collect(Collectors.toList());
	}

}

package ar.edu.unlp.oo2.Ejer7DecodificadorDePeliculas;

import java.util.ArrayList;

public class Novedad implements Criterio {

	// LAS PELICULAS MAS RECIENTES
	@Override
	public ArrayList<Pelicula> sugerirPeliculas(Decodificador d) {
		return d.peliculasNuevas();
	}

}

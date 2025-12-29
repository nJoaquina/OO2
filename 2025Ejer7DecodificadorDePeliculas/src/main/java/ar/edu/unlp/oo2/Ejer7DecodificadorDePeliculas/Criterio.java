package ar.edu.unlp.oo2.Ejer7DecodificadorDePeliculas;

import java.util.List;

public interface Criterio {
	
	//SOLO 3 PELICULAS PUEDE SUGERIR
	public List<Pelicula> sugerirPeliculas(Decodificador d); 
	
}

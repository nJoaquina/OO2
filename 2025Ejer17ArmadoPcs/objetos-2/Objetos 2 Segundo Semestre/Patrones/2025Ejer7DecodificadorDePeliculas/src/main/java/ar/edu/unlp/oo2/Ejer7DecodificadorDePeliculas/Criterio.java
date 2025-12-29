package ar.edu.unlp.oo2.Ejer7DecodificadorDePeliculas;

import java.util.ArrayList;

public interface Criterio {
	
	//SOLO 3 PELICULAS PUEDE SUGERIR
	public ArrayList<Pelicula> sugerirPeliculas(Decodificador d); 
	
}

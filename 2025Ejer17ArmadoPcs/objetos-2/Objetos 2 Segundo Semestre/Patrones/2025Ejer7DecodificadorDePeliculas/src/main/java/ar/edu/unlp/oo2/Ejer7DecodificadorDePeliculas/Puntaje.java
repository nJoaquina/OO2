package ar.edu.unlp.oo2.Ejer7DecodificadorDePeliculas;

import java.util.ArrayList;

public class Puntaje implements Criterio {
	//SOLO DEVUELVE 3
	// puntaje: las peliculas de mayor puntajee, para igual puntaje considera la mas reciente
	@Override
	public ArrayList<Pelicula> sugerirPeliculas(Decodificador d) {
		// TODO Auto-generated method stub
		return d.puntaje();
	}

	
}

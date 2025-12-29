package ar.edu.unlp.oo2.Ejer7DecodificadorDePeliculas;
import java.util.stream.Collectors;
import java.util.List;

public class Puntaje implements Criterio {
	//SOLO DEVUELVE 3
	// puntaje: las peliculas de mayor puntajee, para igual puntaje considera la mas reciente
	@Override
	public List<Pelicula> sugerirPeliculas(Decodificador d) {
		
		return d.puntaje().stream()
		            .limit(3)
		            .collect(Collectors.toList());
		  
		};
	}

	


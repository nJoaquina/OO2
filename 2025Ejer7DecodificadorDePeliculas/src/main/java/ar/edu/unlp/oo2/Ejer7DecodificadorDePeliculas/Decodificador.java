package ar.edu.unlp.oo2.Ejer7DecodificadorDePeliculas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Decodificador {
	private List<Pelicula> grilla; 
	private List<Pelicula> reproducidas; 
	private Criterio criterio;
	
	public Decodificador(List<Pelicula> grilla, List<Pelicula> reproducidas, Criterio criterio) {
		this.grilla = grilla;
		this.reproducidas = reproducidas;
		this.criterio = criterio;
	}
	
	public List<Pelicula> sugerirPeliculas(){
		return this.criterio.sugerirPeliculas(this); 
	}
	
	public void setCriterio(Criterio c) {
		this.criterio = c; 
	}
	
	public List<Pelicula> mostrarGrillaDePeliculas(){
		return this.grilla; 
	}
	public List<Pelicula> mostrarPeliculasReproducidas(){
		return this.reproducidas; 
	}
	
	public void addReproducidas(Pelicula p) {
		this.reproducidas.add(p);
	}
	public void addGrilla(Pelicula p) {
		this.grilla.add(p);
	}
	
	public ArrayList<Pelicula> getGrilla(){
		return this.grilla;
	}
	
	
	//--------------------CONSULTAR ------------------------------------
	//Estos metodos para abajo esta mal que esten aca para no generar envidia de atributos o cada uno deberia estar en la estrategia concreta que le corresponde?? 
	//pasa las peliculas ordenadas por fecha mas nueva a mas vieja
	public List<Pelicula> peliculasNuevas() {
	    return this.getGrilla().stream()
	        .sorted(Comparator.comparingInt(Pelicula::getAnioEstreno).reversed())
	        .collect(Collectors.toList());
	}
	
	
	
	//similitud: las peliculas similares a alguna pelicula que reprodujo, ordenadas de mas a menos reciente
	
	public List<Pelicula> similitud() {
		    return this.reproducidas.stream()
		        .flatMap(r -> r.getPelisSimilares().stream())
		        .distinct()
		        .sorted(Comparator.comparingInt(p -> ((Pelicula) p).getAnioEstreno()).reversed())
		        .collect(Collectors.toList());
		}
	
	
	// puntaje: las peliculas de mayor puntajee, para igual puntaje considera la mas reciente
	
	public List<Pelicula> puntaje() {
	    return this.getGrilla().stream()
	        .sorted(
	            Comparator.comparingDouble(Pelicula::getPuntaje)
	                      .thenComparing(Comparator.comparingInt(Pelicula::getAnioEstreno).reversed())
	                      .reversed())
	        .collect(Collectors.toList());
	}
	}
	

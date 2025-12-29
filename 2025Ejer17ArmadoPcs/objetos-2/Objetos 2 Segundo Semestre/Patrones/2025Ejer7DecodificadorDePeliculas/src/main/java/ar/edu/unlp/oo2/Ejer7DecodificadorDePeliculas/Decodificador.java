package ar.edu.unlp.oo2.Ejer7DecodificadorDePeliculas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Decodificador {
	private ArrayList<Pelicula> grilla; 
	private ArrayList<Pelicula> reproducidas; 
	private Criterio criterio;
	
	public Decodificador(ArrayList<Pelicula> grilla, ArrayList<Pelicula> reproducidas, Criterio criterio) {
		this.grilla = grilla;
		this.reproducidas = reproducidas;
		this.criterio = criterio;
	}
	
	public ArrayList<Pelicula> sugerirPeliculas(){
		return this.criterio.sugerirPeliculas(this); 
	}
	
	public void setCriterio(Criterio c) {
		this.criterio = c; 
	}
	
	public ArrayList<Pelicula> mostrarGrillaDePeliculas(){
		return this.grilla; 
	}
	public ArrayList<Pelicula> mostrarPeliculasReproducidas(){
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
	
	//DEVOLVER SOLO 3 PELICULAS, LAS MAS NUEVAS
	public ArrayList<Pelicula> peliculasNuevas() {
	    return this.getGrilla().stream()
	        .sorted(Comparator.comparingInt(Pelicula::getAnioEstreno).reversed())
	        .limit(3)
	        .collect(Collectors.toCollection(ArrayList::new));
	}
	
	//similitud: las peliculas similares a alguna pelicula que reprodujo, ordenadas de mas a menos reciente
	//devuelve solo 3
	public ArrayList<Pelicula> similitud() {
		    return this.reproducidas.stream()
		        .flatMap(r -> r.getPelisSimilares().stream())
		        .distinct()
		        .sorted(Comparator.comparingInt(p -> ((Pelicula) p).getAnioEstreno()).reversed())
		        .limit(3)
		        .collect(Collectors.toCollection(ArrayList::new));
		}
	
	//SOLO DEVUELVE 3
	// puntaje: las peliculas de mayor puntajee, para igual puntaje considera la mas reciente
	
	public ArrayList<Pelicula> puntaje() {
	    return this.getGrilla().stream()
	        .sorted(
	            Comparator.comparingDouble(Pelicula::getPuntaje)
	                      .thenComparing(Comparator.comparingInt(Pelicula::getAnioEstreno).reversed())
	                      .reversed()
	        )
	        .limit(3)
	        .collect(Collectors.toCollection(ArrayList::new));
	}
	}
	

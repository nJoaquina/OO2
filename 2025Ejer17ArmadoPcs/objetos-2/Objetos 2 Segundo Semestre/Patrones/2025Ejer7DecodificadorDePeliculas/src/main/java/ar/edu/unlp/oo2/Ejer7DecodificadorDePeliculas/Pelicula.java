package ar.edu.unlp.oo2.Ejer7DecodificadorDePeliculas;

import java.util.ArrayList;


public class Pelicula {
	private String titulo; 
	private int anioEstreno; 
	private double puntaje;
	private ArrayList<Pelicula> peliculasSimilares; 
	
	public Pelicula(String titulo, double puntaje,  int anioEstreno) {
		this.titulo = titulo;
		this.anioEstreno = anioEstreno;
		this.puntaje = puntaje;
		this.peliculasSimilares = new ArrayList<>(); 
	}
	/* esto genera un bucle infinito 
	public void addSimilar(Pelicula p) {
		this.peliculasSimilares.add(p); 
		p.addSimilar(this);
	}
	*/
	public void addSimilar(Pelicula otra) {
	    if (!this.peliculasSimilares.contains(otra)) {
	        this.peliculasSimilares.add(otra);
	        if (!otra.peliculasSimilares.contains(this)) {
	            otra.addSimilar(this);
	        }
	    }
	}
	
	public ArrayList<Pelicula> getPelisSimilares(){
		return this.peliculasSimilares; 
	}
	
	public int getAnioEstreno() {
		return this.anioEstreno;
	}
	
	public double getPuntaje() {
		return this.puntaje;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
}

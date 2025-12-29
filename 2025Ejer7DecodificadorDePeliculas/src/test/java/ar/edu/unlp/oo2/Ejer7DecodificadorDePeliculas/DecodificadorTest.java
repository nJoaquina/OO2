/**
 * 
 */
package ar.edu.unlp.oo2.Ejer7DecodificadorDePeliculas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.stream.Collectors;

public class DecodificadorTest {
	
	Decodificador deco;
	Pelicula thor, capitanAmerica, ironMan, dunkrik, rocky, rambo;
	List<Pelicula> grilla;
	List<Pelicula> reproducidas;
	Criterio similitud; 
	
	@BeforeEach
	void setUp() throws Exception {
		thor = new Pelicula("Thor", 7.9, 2007);
		capitanAmerica = new Pelicula("Capitan America", 7.8, 2016);
		ironMan = new Pelicula("Iron man", 7.9, 2010);
		dunkrik = new Pelicula("Dunkirk", 7.9, 2017);
		rocky = new Pelicula("Rocky", 8.1, 1976);
		rambo = new Pelicula("Rambo", 7.8, 1979 );
		grilla = new List<>();
		reproducidas = new List<>();
		
		grilla.add(thor);
		grilla.add(capitanAmerica);
		grilla.add(ironMan);
		grilla.add(dunkrik);
		grilla.add(rocky);
		grilla.add(rambo);
		
		reproducidas.add(thor);
		reproducidas.add(rocky);
		
		similitud = new Similitud();
		
		deco = new Decodificador (grilla,reproducidas, similitud); 
		
		thor.addSimilar(capitanAmerica);
		thor.addSimilar(ironMan);
		capitanAmerica.addSimilar(ironMan);
		rocky.addSimilar(rambo);
	}
	
	//Thor, 7.9, 2007 (Similar a Capitan America, Iron Man)
	//Capitan America, 7.8, 2016 (Similar a Thor, Iron Man)
	//Iron man, 7.9, 2010 (Similar a Thor, Capitan America)
	//Dunkirk, 7.9, 2017
	//Rocky, 8.1, 1976 (Similar a Rambo)
	//Rambo, 7.8, 1979 (Similar a Rocky)

	@Test //DIO BIEN
	public void testSimilitud() {
	    String resultado = deco.sugerirPeliculas().stream()
	        .map(Pelicula::getTitulo)
	        .collect(Collectors.joining(", "));
	  
	    assertEquals("Capitan America, Iron man, Rambo", resultado);
	}
	@Test //DIO BIEN 
	public void testNovedad() {
		deco.setCriterio(new Novedad());
	    String resultado = deco.sugerirPeliculas().stream()
	        .map(Pelicula::getTitulo)
	        .collect(Collectors.joining(", "));
	  
	    assertEquals("Dunkirk, Capitan America, Iron man", resultado);
	}
	@Test
	public void testPuntaje() {
		deco.setCriterio(new Novedad());
	    String resultado = deco.sugerirPeliculas().stream()
	        .map(Pelicula::getTitulo)
	        .collect(Collectors.joining(", "));
	  
	    assertEquals("Dunkirk, Iron man, Capitan America", resultado);
	} //DIO MAL --> TIENE QUE DAR Dunkirk, Capitan America, Iron man
}

/**
 * 
 */
package ar.edu.unlp.oo2.EjerPersonajesDeJuegosDeRol;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonajesTest {
	
	Director director; 
	//Builder guerrero;
	Guerrero guerrero;
	Personaje personaje, guerrero1, guerrero2; 
	@BeforeEach
	void setUp() throws Exception {
		  
		director = new Director();
		
		personaje = new Personaje("guerrero1"); 
		guerrero = new Guerrero(personaje);
		director.armarPersonaje(guerrero);
		guerrero1= guerrero.getPersonaje();
		
		personaje = new Personaje("guerrero2"); 
		guerrero = new Guerrero(personaje);
		director.armarPersonaje(guerrero);
		guerrero2= guerrero.getPersonaje(); 
		
	}
    @Test //dio bien
    public void testPuntosGuerreroContraGuerrero() {
    	//guerrero 1 ataca a guerrero 2
    	guerrero1.ataque(guerrero2); 
        assertEquals(97, guerrero2.getPuntos());
        assertEquals(100, guerrero1.getPuntos());
        
        
    }
}

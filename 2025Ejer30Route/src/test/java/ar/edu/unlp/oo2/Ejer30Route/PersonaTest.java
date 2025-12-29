/**
 * 
 */
package ar.edu.unlp.oo2.Ejer30Route;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RouteTest {
	
	private List<Location> points;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Persona("James", "Glossing");
		guido = new Persona("Guido", "van Rossum");
	}
    @Test
    public void testNombreCompleto() {
        assertEquals("Glossing, James", james.getNombreCompleto());
        assertEquals("van Rossum, Guido", guido.getNombreCompleto());
        
    }
}

/**
 * 
 */
package ar.edu.unlp.oo2.Ejer8Excursiones;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcurionTest {
	
	Excursion excursion;
	Usuario user1, user2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		user1 = new Usuario("Ana", "Noguiera", "ani@gmail.com");
		user2 = new Usuario("Lola", "M", "lolim@gmail.com");
		
		LocalDate fechaInicio = LocalDate.now().minusDays(1); //ayer
		LocalDate fechaFin= LocalDate.of(2025, 10, 10); // 10/10/2025
		excursion = new Excursion("Dos dias en kayak bajando el Parana ", fechaInicio, fechaFin," puntoE ", 200.0, 1, 2);;
		
	}
//DAN TODOS BIEN
    @Test
    public void testNoAlcanzaCupoMinMensaje() {
        assertEquals("Dos dias en kayak bajando el Parana 2025-10-07 2025-10-10 puntoE  1", excursion.obtenerInformacion());
    }

    @Test
    public void testAlcanzaCupoMinMensaje() {
    	excursion.inscribir(user1);
        assertEquals("Dos dias en kayak bajando el Parana 2025-10-07 2025-10-10 puntoE  ani@gmail.com 1", excursion.obtenerInformacion());
    }
    @Test
    public void testAlcanzaCupoMaxMensaje() {
    	excursion.inscribir(user1);
    	excursion.inscribir(user2);
    //    assertEquals(2, excursion.getInscriptos());
        assertEquals("Dos dias en kayak bajando el Parana 2025-10-07 2025-10-10 puntoE  ", excursion.obtenerInformacion());
    }

}





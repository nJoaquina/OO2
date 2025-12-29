/**
 * 
 */
package ar.edu.unlp.oo2.Ejer11AlquilerDeAutomoviles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlquilerAutosTest {
	
	Usuario user;
	AutoEnAlquiler auto;
	Reserva reserva; 
	PoliticaCancelacion politica; 
	LocalDate fechaReserva, fechaCancelacion;
	
	@BeforeEach
	void setUp() throws Exception {
		user = new Usuario("Ana");
		politica = new Flexible(); 
		auto = new AutoEnAlquiler(100.0, 4, "Jeep", politica);
		fechaReserva =  LocalDate.of(2026, 9, 1); //1-09-2026
		//la fecha deberia ser un periodo 
		reserva = new Reserva(user, auto, 5, fechaReserva);
	}
    @Test //dio bien
    public void testMontoReembolsoPoliticaFlexible() {
    	fechaCancelacion = LocalDate.of(2025, 9, 1); // cancelo antes de la fecha de reserva
        assertEquals(500, reserva.montoAReembolsar(fechaCancelacion));
    }
    @Test //dio bien
    public void testMontoReembolsoPoliticaModerada() {
    	auto.setPolitica(new Moderada());
    	fechaCancelacion = fechaReserva.minusWeeks(1); // una semana antes que la reserva
        assertEquals(500, reserva.montoAReembolsar(fechaCancelacion));
        fechaCancelacion = fechaReserva.minusDays(2); // 2 dias antes que la reserva
        assertEquals(250, reserva.montoAReembolsar(fechaCancelacion));
    }
}

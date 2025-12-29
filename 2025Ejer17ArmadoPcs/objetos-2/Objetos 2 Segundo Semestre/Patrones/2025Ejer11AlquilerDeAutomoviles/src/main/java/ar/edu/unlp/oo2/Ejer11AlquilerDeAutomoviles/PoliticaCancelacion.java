package ar.edu.unlp.oo2.Ejer11AlquilerDeAutomoviles;

import java.time.LocalDate;

public interface PoliticaCancelacion {

	public double montoAReembolsar(LocalDate fechaCancelacion, Reserva r); 
}


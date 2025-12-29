package ar.edu.unlp.oo2.Ejer11AlquilerDeAutomoviles;

import java.time.LocalDate;

public class Estricta implements PoliticaCancelacion {

	
	private boolean esUnaSemanaAntes(LocalDate fechaCancelacion, LocalDate fechaReserva) {
		return (fechaCancelacion.isBefore(fechaReserva.minusWeeks(1)));
	}
	private boolean dosDiasAntes(LocalDate fechaCancelacion, LocalDate fechaReserva) {
		return fechaCancelacion.isBefore(fechaReserva.minusDays(2)); 
	}
	
	@Override
	public double montoAReembolsar(LocalDate fechaCancelacion, Reserva r) {
		double reembolso = 0; 
		if (this.esUnaSemanaAntes(fechaCancelacion, r.getFecha())) {
			reembolso = r.montoAPagar(); 
		}
		if(dosDiasAntes(fechaCancelacion, r.getFecha())) {
			reembolso = r.cincuentaPorCientoReembolso(); 
		}
		return reembolso;
	}

}

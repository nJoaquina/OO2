package ar.edu.unlp.oo2.Ejer11AlquilerDeAutomoviles;

import java.time.LocalDate;

public class Moderada implements PoliticaCancelacion {

	private boolean semanaAntes(LocalDate fechaCancelacion, LocalDate fechaReserva) {
	    return !fechaCancelacion.isAfter(fechaReserva.minusWeeks(1));
	}
	
	private boolean dosDiasAntes(LocalDate fechaCancelacion, LocalDate fechaReserva) {
		    return !fechaCancelacion.isAfter(fechaReserva.minusDays(2));
		}
	
	@Override
	public double montoAReembolsar(LocalDate fechaCancelacion, Reserva r) {
		double reembolso = 0;
		if(semanaAntes(fechaCancelacion, r.getFecha())) {
			reembolso = r.montoAPagar();
		}else if(dosDiasAntes(fechaCancelacion, r.getFecha())) {
			reembolso = r.cincuentaPorCientoReembolso();
		}
		return reembolso;
	
	}
	
}


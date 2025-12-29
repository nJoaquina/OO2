package ar.edu.unlp.oo2.Ejer11AlquilerDeAutomoviles;

import java.time.LocalDate;

public class Flexible implements PoliticaCancelacion {

	
	private boolean esAntes(LocalDate fechaCancelacion, LocalDate fechaReserva) {
		return fechaCancelacion.isBefore(fechaReserva); 
	}
	
	@Override
	public double montoAReembolsar(LocalDate fechaCancelacion, Reserva r) {
		double devolucion = 0; 
		if (esAntes(fechaCancelacion, r.getFecha())) { //la fecha de inicio es antes de hoy
			devolucion = r.montoAPagar();
		}
		return devolucion; 
	}

}

package ar.edu.unlp.oo2.Ejer11AlquilerDeAutomoviles;

import java.time.LocalDate;

public class Reserva {
	private Usuario conductor; 
	private AutoEnAlquiler autoAlquilado; 
	private Integer cantidadDias; 
	private LocalDate fecha;
	
	public Reserva(Usuario conductor, AutoEnAlquiler autoAlquilado, Integer cantidadDias, LocalDate fecha) {
	
		this.conductor = conductor;
		this.autoAlquilado = autoAlquilado;
		this.cantidadDias = cantidadDias;
		this.fecha = fecha;
	} 
	
	public LocalDate getFecha() {
		return this.fecha; 
	}
	public double montoAPagar() {
		return this.autoAlquilado.precioPorDia() * this.cantidadDias;
	}
	
	public double montoAReembolsar(LocalDate fechaCancelacion) {
		return this.autoAlquilado.montoAReembolsar(fechaCancelacion, this);
	}
	
	public double cincuentaPorCientoReembolso() {
		return montoAPagar()/2; 
	}
	
	
}

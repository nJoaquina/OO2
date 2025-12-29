package ar.edu.unlp.oo2.Ejer11AlquilerDeAutomoviles;

import java.time.LocalDate;

public class AutoEnAlquiler {
	private double precioPorDia;
	private Integer cantidadPlazas; 
	private String marca;
	private PoliticaCancelacion politica; 
	
	public AutoEnAlquiler(double precioPorDia, Integer cantidadPlazas, String marca, PoliticaCancelacion p) {
		this.precioPorDia = precioPorDia;
		this.cantidadPlazas = cantidadPlazas;
		this.marca = marca;
		this.politica = p;
	} 
	
	public double precioPorDia() {
		return this.precioPorDia;
	}
	
	public void setPolitica(PoliticaCancelacion p) {
		this.politica = p; 
	}
	
	public double montoAReembolsar(LocalDate fechaCancelacion, Reserva r) {
		return this.politica.montoAReembolsar(fechaCancelacion, r); 
	}

}

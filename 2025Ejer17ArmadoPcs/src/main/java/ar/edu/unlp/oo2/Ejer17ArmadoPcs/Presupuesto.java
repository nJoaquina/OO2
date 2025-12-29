package ar.edu.unlp.oo2.Ejer17ArmadoPcs;

import java.time.LocalDate;

public class Presupuesto {
	private String nombrePersona; 
	private LocalDate fecha; 
	private Computadora compu; 
	
	public Presupuesto(String p, LocalDate f, Computadora c) {
		this.nombrePersona = p;
		this.fecha = f; 
		this.compu = c;
	}
	
	public double crearPresupuesto() {
		return this.compu.presupuesto();
	}
	
	
}

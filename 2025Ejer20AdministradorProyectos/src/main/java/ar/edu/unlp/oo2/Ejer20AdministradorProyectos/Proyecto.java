package ar.edu.unlp.oo2.Ejer20AdministradorProyectos;

import java.time.LocalDate;

public class Proyecto {
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo; 
	private Integer integrantes;
	private double margenGanacia;
	private Estado estado; 
	
	public void CrearProyecto(LocalDate fechaInicio, LocalDate fechaFin, String objetivo, Integer integrantes) {
		
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.integrantes = integrantes;
		this.margenGanacia = 0.07;
		this.estado = new EnConstruccion(); 
	} 
	
	public void setEstado(Estado e) {
		this.estado = e; 
	}
	public void addObjetivo(String c) {
		this.objetivo = this.objetivo + c; 
	}
	public String getObjetivo() {
		return this.objetivo;  
	}
	public void aprobarEtapa() {
		this.estado.aprobarEtapa(this);
	}
	//lo pongo solo para el test
	public Estado getEstado() {
	    return this.estado;
	}
	
	public double constoDelProyecto () {
		return this.integrantes * this.margenGanacia; 
	}
	
	public double precioDelProyecto () {
		return this.constoDelProyecto() * this.margenGanacia; 
	}
	public  void modificarMargenGanancia () {
		this.estado.modificarMargenGanancia(this);
	}
	public  void cancelarProyecto (Proyecto p) {
		this.estado.cancelarProyecto(this);
	}

	public boolean margenGananciaEntre8y10() {
	    return (this.margenGanacia >= 0.08 && this.margenGanacia <= 0.10);
	}
	public boolean margenGananciaEntre11y15() {
	    return (this.margenGanacia >= 0.11 && this.margenGanacia <= 0.15);
	}
}
	
	


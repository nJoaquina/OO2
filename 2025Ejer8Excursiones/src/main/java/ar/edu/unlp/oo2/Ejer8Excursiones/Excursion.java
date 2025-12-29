package ar.edu.unlp.oo2.Ejer8Excursiones;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.ArrayList;

public class Excursion {
	private String nombreE;
	private LocalDate fechaI;
	private LocalDate fechaF;
	private String puntoE; 
	private double costo;
	private Integer cupoMin;
	private Integer cupoMax;
	private ArrayList<Usuario> inscriptos;
	private ArrayList<Usuario> espera;
	private Estado estado;
	
	public Excursion(String nombreE, LocalDate fechaI, LocalDate fechaF, String puntoE, double costo, Integer cupoMin,
			Integer cupoMax) {
	
		this.nombreE = nombreE;
		this.fechaI = fechaI;
		this.fechaF = fechaF;
		this.puntoE = puntoE;
		this.costo = costo;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		this.estado = new NoAlcanzoCupoMin();
		this.inscriptos = new ArrayList<>();
		this.espera = new ArrayList<>();
	}
	
	public String getNombreE() {
		return nombreE;
	}

	public LocalDate getFechaI() {
		return fechaI;
	}

	public LocalDate getFechaF() {
		return fechaF;
	}

	public String getPuntoE() {
		return puntoE;
	}

	public double getCosto() {
		return costo;
	}

	public Integer getCupoMin() {
		return cupoMin;
	}

	public Integer getCupoMax() {
		return cupoMax;
	}

	public ArrayList<Usuario> getInscriptos() {
		return inscriptos;
	}

	public ArrayList<Usuario> getEspera() {
		return espera;
	}
 
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void inscribir(Usuario unUsuario) {
	    if (this.inscriptos.size() <= this.cupoMin) {
	        this.inscriptos.add(unUsuario);
	    } else {
	        this.espera.add(unUsuario);
	    }
	    this.estado.chequeoCupos(this);
	}
	
	public String obtenerInformacion() {
		return this.estado.obtenerInfo(this); 
	}
	
	
	public int faltanteMin() {
		return this.getCupoMin() - this.getInscriptos().size(); 
	}
	
	public String informacion() {
		return getNombreE() + getFechaI() +" "+ getFechaF() + getPuntoE();
	}
	
	
	public boolean llegoCupoMin() {
		return this.getInscriptos().size() == this.getCupoMin(); 
	}
	
	public boolean llegoCupoMax() {
		return this.getInscriptos().size() == this.getCupoMax();
	}
/*	
	public String mailsInscriptos() {
		return this.inscriptos.stream().map(i -> i.getMail()).toString(); 
	}
	*/
	public String mailsInscriptos() {
	    return this.inscriptos.stream()
	        .map(i -> i.getMail())
	        .collect(Collectors.joining(", "));
	}
	//cuantos cupos faltan para llegar al cupo max
	public int faltanteMax() {
	   return this.getCupoMax() - this.getInscriptos().size();
	}
	

}

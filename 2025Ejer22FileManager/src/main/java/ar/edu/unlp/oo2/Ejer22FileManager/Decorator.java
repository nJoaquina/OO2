package ar.edu.unlp.oo2.Ejer22FileManager;

import java.time.LocalDate;

public abstract class Decorator implements InterfaceFileManager {
	protected InterfaceFileManager archivo;
	
	public Decorator (InterfaceFileManager archivo) {
		this.archivo = archivo; 
	}
	@Override
	public String getNombre() {
		return this.archivo.getNombre();
	}

	@Override
	public String getExtension() {
		return this.archivo.getExtension();
	}

	@Override
	public double getTamanio() {
		return this.archivo.getTamanio();
	}

	@Override
	public LocalDate getFechaCreacion() {
		return this.archivo.getFechaCreacion();
	}

	@Override
	public LocalDate getFechaModificacion() {
		return this.archivo.getFechaModificacion();
	}

	@Override
	public String getPermisos() {
		return this.archivo.getPermisos();
	}

	//SIEMPRE VA IR NOMBRE ... Y LO QUE ELIJA 
//	@Override
//	public String prettyPrint() {
//		return this.archivo.getNombre() + this.info();
//	}
	@Override
	public String prettyPrint() {
		return this.archivo.prettyPrint() + this.info() + " "; //<-- template method
	}
	public abstract String info(); 

}

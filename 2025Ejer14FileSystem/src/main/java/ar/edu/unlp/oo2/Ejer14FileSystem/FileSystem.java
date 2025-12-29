package ar.edu.unlp.oo2.Ejer14FileSystem;

import java.time.LocalDate;
import java.util.List;

public abstract class FileSystem {
	private String nombre; 
	private LocalDate fechaCreacion; 
	
	
	public FileSystem(String nombre, LocalDate fechaCreacion) {
		this.nombre = nombre;
	//	this.fechaCreacion = Local.now();
		
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	

	public abstract int tamanoTotalOcupado() ;
	public abstract Archivo archivoMasGrande();
    public abstract Archivo archivoMasNuevo(); 
    public abstract FileSystem buscar(String nombre);
    public abstract List<FileSystem> buscarTodos(String nombre);
    public abstract String listadoDeContenido();
    public abstract void addContenido(FileSystem fs);
    public abstract void removeContenido(FileSystem fs);
}

package ar.edu.unlp.oo2.Ejer14FileSystem;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public class Archivo extends FileSystem {
	private int tamBytes;
	
	public Archivo(String nombre, LocalDate fechaCreacion, int tam) {
		super(nombre, fechaCreacion);
		this.tamBytes = tam;
	}
	
	public int getTamBytes() {
		return tamBytes;
	}

	@Override
	public int tamanoTotalOcupado() {
		return this.getTamBytes();
	}

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}
/*
 // En Archivo.java (Leaf)
@Override
public FileSystem buscar(String nombre) {
    // Solo retorna 'this' si el nombre coincide. Si no coincide, retorna 'null' para que la recursión continúe.
    return this.getNombre().equals(nombre) ? this : null;
}
 */
 
	@Override
	public FileSystem buscar(String nombre) {		// 
		return this.getNombre().equals(nombre) ? this : null;

	}

	
	@Override
	public List<FileSystem> buscarTodos(String nombre) {
	    // Si el nombre del Archivo coincide, retorna una lista con 'this'. 
	    // Si no coincide, retorna una lista vacía.
	    return this.getNombre().equals(nombre) ? List.of(this) : List.of(); 
	}

	@Override
	public String listadoDeContenido() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addContenido(FileSystem fs) {
		// no hace nada
		
	}

	@Override
	public void removeContenido(FileSystem fs) {
		//no hace nada
		
	}

}

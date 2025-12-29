package ar.edu.unlp.oo2.Ejer22FileManager;

import java.time.LocalDate;

public interface InterfaceFileManager {
	
	String getNombre();
	String getExtension();
	double getTamanio();
	LocalDate getFechaCreacion();
	LocalDate getFechaModificacion();
	String getPermisos(); 	
	String prettyPrint(); 
	
}


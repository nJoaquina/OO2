/**
 * 
 */
package ar.edu.unlp.oo2.Ejer22FileManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecoratorTest {
	
	Archivo archivo; 
	Nombre nombre; 
	Extension ext; 
	FechaDeCreacion fechaC; 
	Permisos permisos; 
	Tamanio tam; 
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		archivo = new Archivo("anotaciones" ,".txt", 10.0, LocalDate.now().minusDays(1), LocalDate.now(), "permisos");
		
		
	}
	//DIERON TODOS BIEN
    @Test //nombre - extension
    public void testNombreExtension() {
    	nombre = new Nombre (archivo);
    	ext = new Extension (nombre);
        assertEquals("Nombre: anotaciones Extension: .txt ", ext.prettyPrint());  
    }
    @Test //nombre - extension - fecha creacion
    public void testNombreExtensionFechaCreaciono() {
    	nombre = new Nombre (archivo);
    	ext = new Extension (nombre);
    	fechaC = new FechaDeCreacion(ext);
        assertEquals("Nombre: anotaciones Extension: .txt Fecha de Creacion: 2025-10-18 ", fechaC.prettyPrint());
        
    }
    @Test //permisos - nombre - extension - tamaño
    public void testPermisosNombreExtensionTamanio() {
    	permisos = new Permisos(archivo);
    	nombre = new Nombre(permisos);
    	ext = new Extension (nombre);
    	tam = new Tamanio(ext);
        assertEquals("Permisos: permisos Nombre: anotaciones Extension: .txt Tamanio: 10.0 ", tam.prettyPrint());
    }
}

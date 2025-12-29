/**
 * 
 */
package ar.edu.unlp.oo2.Ejer14FileSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileSystemTest {
	
	FileSystem archivo1, archivo2, directorio1, directorio2, directorio3, raiz;
	//directorio1/ archivo1 directorio2
	//directorio2/ archivo2
	//directorio3 VACIO
	
	@BeforeEach
	void setUp() throws Exception {
        //LocalDate fecha = LocalDate.of(2024, 12, 19);
		// los directorios deben ser creados primero que los arch (fechas)
		directorio1 = new Directorio ("Directorio1", LocalDate.of(2024, 10, 11));
		directorio2 = new Directorio ("Directorio2", LocalDate.of(2024, 10, 15));
		directorio3 = new Directorio ("Directorio2", LocalDate.of(2024, 11, 11));
		archivo1 = new Archivo("Archivo1", LocalDate.of(2024, 10, 20) , 1);
		archivo2 = new Archivo("Archivo2", LocalDate.of(2024, 10, 26) , 2);
		
		raiz = new Directorio ("RAIZ", LocalDate.of(2020, 10, 11)); 
		
		directorio1.addContenido(archivo1);
    	directorio1.addContenido(directorio2);
    	directorio2.addContenido(archivo2);
    	
    	//no se donde poner todo lo que tengo para testear archivoMasGrande DE TODO EL SISTEMA
    	raiz.addContenido(directorio1);
    	raiz.addContenido(directorio3);
		
	}
    @Test //dio bien
    public void testTotalOcupado() {
        assertEquals(67, directorio1.tamanoTotalOcupado());
        assertEquals(32, directorio3.tamanoTotalOcupado());        
    }
   @Test //dio bien 
    public void testArchivoMasGrande() {
      assertEquals("Archivo2", raiz.archivoMasGrande().getNombre());
    }
   @Test 
   public void testArchivoMasNuevo() {
     assertEquals("Archivo2", raiz.archivoMasNuevo().getNombre());
   }
   @Test //dio bien
   public void testBuscar() {
	   //tener en cuenta que buscar devuelve un FileSyste
	   FileSystem resultado = raiz.buscar(archivo2.getNombre()); 
     assertEquals("Archivo2", resultado.getNombre());
      //Otra forma -> Aserción: Compara el objeto esperado (archivo2) con el objeto retornado por la búsqueda.
      assertEquals(archivo2, raiz.buscar(archivo2.getNombre()));
   }    
   @Test //dio bien
   public void TestBuscarTodos() {
	   List<FileSystem> resultado = new ArrayList<>();
	   Archivo archivoNuevo = new Archivo ("Archivo1", LocalDate.of(2024, 11, 12) , 3);
	   raiz.addContenido(archivoNuevo);
	   resultado = raiz.buscarTodos("Archivo1");
	   assertEquals(resultado, raiz.buscarTodos("Archivo1"));
	   assertTrue(resultado.contains(archivoNuevo));
	   assertTrue(resultado.contains(archivo1));
	   assertFalse(resultado.contains(archivo2));
	   assertFalse(resultado.contains(directorio2));
	   assertEquals(2, resultado.size()); 

   }
    
}

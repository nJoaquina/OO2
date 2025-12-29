/**
 * 
 */
package ar.edu.unlp.oo2.Ejer20AdministradorProyectos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
	
	Proyecto vacacionesDeInvierno;
	
	@BeforeEach
	void setUp() throws Exception {
		vacacionesDeInvierno = new Proyecto(); 
		//dice que el proyecto debe llamarse "Vacaciones De Invierno" pero no tiene nombre. 
		vacacionesDeInvierno.CrearProyecto(LocalDate.now(), LocalDate.now().plusWeeks(1),"salir con amigos ", 3);
	}
    @Test
    public void testEtapaEvaluacion() { //dio bien
    	//pasa a estado Evaluacion 
        vacacionesDeInvierno.aprobarEtapa();
        assertTrue(vacacionesDeInvierno.getEstado() instanceof EnEvaluacion);
        assertEquals("salir con amigos ", vacacionesDeInvierno.getObjetivo());
        //cancelo
        vacacionesDeInvierno.cancelarProyecto(vacacionesDeInvierno);
        assertEquals("salir con amigos cancelado", vacacionesDeInvierno.getObjetivo());
        
        
    }
}

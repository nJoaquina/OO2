package ar.edu.unlp.oo2.Ejer4CalculoSueldos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculoDeSueldos {
	
	Empleado empleado;
	Empleado temporario;
	Empleado pasante; 
	Empleado planta; 
	
	@BeforeEach
	void setUp() throws Exception {
		temporario = new Temporario(1, true,4);
		pasante = new Pasante(3);
		planta = new Planta (3, true, 20);
		
	}
    @Test
    public void testSueldos() {
        assertEquals(12628.4,temporario.sueldo()); // me da mal, me tiene que dar 30011 -
        assertEquals(23100,pasante.sueldo()); // dio bin 
        assertEquals(91950,planta.sueldo()); // este dio bien
    }
}

/**
 * 
 */
package ar.edu.unlp.oo2.Ejer17ArmadoPcs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BuilderTest {
	
	Builder intermedio;
	Director director;
	
	
	@BeforeEach
	void setUp() throws Exception {
		intermedio = new ConcreteBuilderIntermedio();
		director = new Director (intermedio);
		director.construirComputadora();
	}
    @Test //dio bien
    public void testPresupuestoIntermedio() {
        assertEquals(605.0, intermedio.getProducto().presupuesto());
    }
    @Test //no se como hacer la prueba
    public void testConsumoIntermedio() {
        assertEquals(200.0, intermedio.consumo());
    }
}

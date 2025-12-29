/**
 * 
 */
package ar.edu.unlp.oo2.Ejer17ArmadoPcs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BuilderTest {
	
	Builder intermedio;
	Director director;
	Presupuesto presupuesto;
	Catalogo catalogo; 
	Componente componente; 
	
	
	@BeforeEach
	void setUp() throws Exception {
		//ARMO EL CATALOGO
		List<Componente> elementosIntermedio = new ArrayList<>() ; 
		elementosIntermedio.add(new Componente("Procesador Intermedio", "Procesador Intermedio", 250.0, 125.0));
		elementosIntermedio.add(new Componente("Memoria RAM 16GB", "16GB", 70.0, 10.0));
		elementosIntermedio.add(new Componente("Disco SSD 500GB", "SSD 500gb", 60.0, 5.0)); 
		elementosIntermedio.add(new Componente("Tarjeta Gráfica GTX 1650", "GTX 1650", 200.0, 120.0));
		elementosIntermedio.add(new Componente("Gabinete Intermedio", "Gabinete Intermedio", 100.0, 10.0));
		elementosIntermedio.add(new Componente("Fuente 800W", "Fuente 800 w", 120.0, 0.0));
		  

		catalogo = new Catalogo(elementosIntermedio); 
		intermedio = new ConcreteBuilderIntermedio();
		intermedio.cargarCatalogo(catalogo);
		director = new Director (intermedio);
		director.construirComputadora();
		presupuesto= new Presupuesto ("NomPersona", LocalDate.now(), this.intermedio.getProducto() );
		
	}
    
    @Test //dio bien
    public void testPresupuestoIntermedio() { 
        assertEquals(822.8, presupuesto.crearPresupuesto());
    }
    
}

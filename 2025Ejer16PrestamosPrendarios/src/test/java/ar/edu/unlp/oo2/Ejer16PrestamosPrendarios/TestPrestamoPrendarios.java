package ar.edu.unlp.oo2.Ejer16PrestamosPrendarios;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPrestamoPrendarios {
	
		Prenda inmueble, alquiler,automovil;
		PrendaCombinada prendaCombinada; 
		
		
		@BeforeEach
		void setUp() throws Exception {
	        //LocalDate fecha = LocalDate.of(2024, 12, 19);
			inmueble = new Inmueble(100, "direcc", 50); 
			LocalDate fechaInicio = LocalDate.of(2024, 12, 19);
			LocalDate fechaFin = LocalDate.of(2025, 12, 19);
			alquiler = new Alquiler(200, fechaInicio, fechaFin);
			automovil = new Automovil(2020,0,300);
			prendaCombinada = new PrendaCombinada(400);
			
			//Estructura
			//prendaCombinada tiene un inmueble y un automovil
			prendaCombinada.addContenido(inmueble);
			prendaCombinada.addContenido(automovil);
		}
	    @Test
	    public void testValor() { //dio bien
	    	assertEquals(5000,inmueble.valor());
	    	assertEquals(150,automovil.valor());
	        assertEquals(5150,prendaCombinada.valor());
	       
	        PrendaCombinada prendaCombinadaAnidada = new PrendaCombinada(0);
	        prendaCombinadaAnidada.addContenido(prendaCombinada);

	        prendaCombinadaAnidada.addContenido(inmueble);   // Valor actual: 10150
	        prendaCombinadaAnidada.addContenido(prendaCombinada); // ahora es 10150 + 5150 que es lo que esta (prendaCombinada)
	        // 5000 (inmueble) + 5150*2 (recursion) (prendaCombinada)
	        //10150+5150=15300
	        assertEquals(15300, prendaCombinadaAnidada.valor()); 
	                
	    }
	    @Test //dio bien 
	    public void testValorPrendario() {
	        assertEquals(1000, inmueble.valorPrendario());
	        assertEquals(105, automovil.valorPrendario());
	    }
	    
	}

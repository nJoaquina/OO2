/**
 * 
 */
package ar.edu.unlp.oo2.Ejer23EstacionMeteorologica;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecoratorYAdapterTest {
	
	 
	
	HomeWeatherStation homeStation; 
	WeatherData weather; 
	AdapterHomeWeatherStation adapter; 
	PromedioMax pMaximo; 
	TemperaturaC tempC;
	Presion presion; 
	
	
	@BeforeEach
	void setUp() throws Exception { 
		homeStation = new HomeWeatherStation();  
	    adapter = new AdapterHomeWeatherStation(homeStation);
	     
	    
	    
	}
    @Test
    public void testPromMax() {
    	pMaximo = new PromedioMax(adapter);
        assertEquals("Promedio maximo: 104.0", pMaximo.displayData()); 
    }
    
    @Test
    public void testTemperaturaCyPromMax() {
    	tempC = new TemperaturaC(adapter); 
    	pMaximo = new PromedioMax(tempC);
        assertEquals("Temperatura C: 0.0Promedio maximo: 104.0", pMaximo.displayData()); 
    }
    @Test
    public void testTemperaturaCyPromMaxYPresion() {
    	tempC = new TemperaturaC(adapter); 
    	pMaximo = new PromedioMax(tempC);
    	presion = new Presion(pMaximo); 
        assertEquals("Temperatura C: 0.0Promedio maximo: 104.0 Presion: 10.0", presion.displayData()); 
    }
    @Test
    public void testPresionTempCPromMax() {
    	presion = new Presion(adapter);
    	tempC = new TemperaturaC(presion);
    	pMaximo = new PromedioMax(tempC);
        assertEquals(" Presion: 10.0Temperatura C: 0.0Promedio maximo: 104.0", pMaximo.displayData()); 
    }
    
    
    
    
}

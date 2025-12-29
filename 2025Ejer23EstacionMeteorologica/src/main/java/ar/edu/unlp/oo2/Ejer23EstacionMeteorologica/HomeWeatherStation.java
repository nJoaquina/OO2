package ar.edu.unlp.oo2.Ejer23EstacionMeteorologica;

import java.util.List;
import java.util.ArrayList;



public class HomeWeatherStation{
	//retorna la temperatura en grados Fahrenheit. 
	public double getTemperatura() {
		return 32.0; 
	}

	//retorna la presión atmosférica en hPa
	public double getPresion() {
		return 10.0; 
	}

	//retorna la radiación solar
	public double getRadiacionSolar() {
		return 5; 
	}

	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturas() {
	    List<Double> lista = new ArrayList<>();
	    lista.add(32.0); 
	    lista.add(68.0); 
	    lista.add(77.0); 
	    lista.add(86.0); 
	    lista.add(104.0);  
	    return lista;
	}

	//retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
	public String displayData(){
	return "Temperatura F: " + this.getTemperatura() +
	   	  "Presión atmosf: " + this.getPresion() +
	   	  "Radiación solar: " + this.getRadiacionSolar();
	}

}

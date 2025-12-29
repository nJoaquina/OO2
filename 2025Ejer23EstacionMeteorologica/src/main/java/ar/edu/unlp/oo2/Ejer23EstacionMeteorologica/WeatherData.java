package ar.edu.unlp.oo2.Ejer23EstacionMeteorologica;


import java.util.List;


public interface WeatherData {
	public double getTemperatura();
	public double getPresion();
	public double getRadiacionSolar();
	public List<Double> getTemperaturas();
	public String displayData();
	public double gradosCelcius();
	public double promedioTemperaturasHistorica();
	public double temperaturaMaximaHistorica();
	public double temperaturaMinimaHistorica();
	
}

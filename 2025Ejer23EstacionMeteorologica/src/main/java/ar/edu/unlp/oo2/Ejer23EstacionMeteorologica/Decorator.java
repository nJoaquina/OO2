package ar.edu.unlp.oo2.Ejer23EstacionMeteorologica;

import java.util.List;

public abstract class Decorator implements WeatherData{
	protected WeatherData weather; 
	
	public Decorator(WeatherData weather) {
		this.weather = weather; 
	}
	@Override
	public double getTemperatura() {
		return this.weather.getTemperatura();
	}

	@Override
	public double getPresion() {
		return this.weather.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		return this.weather.getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturas() {
		return this.weather.getTemperaturas();
	}

	@Override
	public String displayData() {
		
		//return "Temperatura F: " + this.getTemperatura() +" "+ this.info();
	// cada decorador agregue su info() al resultado del decorador anterior
		 return this.weather.displayData() + this.info() + "";
	}
	


	public abstract String info(); 
	
	@Override
	public double gradosCelcius() {
		return this.weather.gradosCelcius();
	}

	@Override
	public double promedioTemperaturasHistorica() {
		return this.weather.promedioTemperaturasHistorica();
	}

	@Override
	public double temperaturaMaximaHistorica() {
		return this.weather.temperaturaMaximaHistorica();
	}

	@Override
	public double temperaturaMinimaHistorica() {
		return this.weather.temperaturaMinimaHistorica();
	}

}

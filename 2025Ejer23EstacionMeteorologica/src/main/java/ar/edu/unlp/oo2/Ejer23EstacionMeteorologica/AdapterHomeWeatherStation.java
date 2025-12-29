package ar.edu.unlp.oo2.Ejer23EstacionMeteorologica;

import java.util.List;

public class AdapterHomeWeatherStation implements WeatherData {
	private HomeWeatherStation homeWeather; 
	
	public AdapterHomeWeatherStation (HomeWeatherStation homeW) {
		this.homeWeather= homeW; 
	}
	@Override
	public double getTemperatura() {
		
		return homeWeather.getTemperatura();
	}

	@Override
	public double getPresion() {
		return homeWeather.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		return homeWeather.getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturas() {
		return homeWeather.getTemperaturas();
	}
//CONSULTAR ESTE METODO
	@Override
	public String displayData() {
		//return homeWeather.displayData();
		return "";
	}
	@Override
	public double gradosCelcius() {
		return ((homeWeather.getTemperatura()-32)/1.8);
	}
	@Override
	public double promedioTemperaturasHistorica() {
	    return homeWeather.getTemperaturas()
	                      .stream()
	                      .mapToDouble(Double::doubleValue)
	                      .average()
	                      .orElse(0);
	}
	@Override
	public double temperaturaMaximaHistorica() {
	    return homeWeather.getTemperaturas()
	                      .stream()
	                      .mapToDouble(Double::doubleValue)
	                      .max()
	                      .orElse(0);
	}
	@Override
	public double temperaturaMinimaHistorica() {
	    return homeWeather.getTemperaturas()
	                      .stream()
	                      .mapToDouble(Double::doubleValue)
	                      .min()
	                      .orElse(0);
	}

}

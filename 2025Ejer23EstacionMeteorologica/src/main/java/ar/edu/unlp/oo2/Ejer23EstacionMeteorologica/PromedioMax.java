package ar.edu.unlp.oo2.Ejer23EstacionMeteorologica;

public class PromedioMax extends Decorator{

	public PromedioMax(WeatherData weather) {
		super(weather);
		
	}

	@Override
	public String info() {
		return "Promedio maximo: " + this.weather.temperaturaMaximaHistorica();  
	}

}

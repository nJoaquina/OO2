package ar.edu.unlp.oo2.Ejer23EstacionMeteorologica;

public class TemperaturaC extends Decorator{

	public TemperaturaC(WeatherData weather) {
		super(weather);
	}

	@Override
	public String info() {
		return "Temperatura C: " + this.weather.gradosCelcius();
	}

}

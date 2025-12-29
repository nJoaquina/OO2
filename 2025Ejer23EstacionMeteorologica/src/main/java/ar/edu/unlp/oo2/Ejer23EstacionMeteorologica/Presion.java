package ar.edu.unlp.oo2.Ejer23EstacionMeteorologica;

public class Presion extends Decorator{

	public Presion(WeatherData weather) {
		super(weather);
		
	}

	@Override
	public String info() {
		
		return " Presion: " + this.weather.getPresion();
	}

}

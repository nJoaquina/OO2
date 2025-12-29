package ar.edu.unlp.oo2.Ejer16PrestamosPrendarios;
import java.time.LocalDate;

public class Automovil extends Prenda{
	private int modelo; 
	private double kilometraje; 
	
	
	public Automovil(int m, double km, double c) {
		super(c);
		this.modelo = m;
		this.kilometraje = km; 
	}
	
	//reduce 10% por cada año de antiguedad
		@Override
		public double valor() { //  300 * (1.0 - 5 * 0.10) = 300 * 0.5 = 150
			return (this.getCosto() * (1.0 - this.aniosDeAntiguedad() * 0.10));
		}
	@Override
	public double liquidez() {
		return 0.7;
	}
// 2025 - 2020 = 5
	private int aniosDeAntiguedad() {
		return LocalDate.now().getYear() - this.getModelo();
	}
	public int getModelo() {
		return modelo;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	
}

package ar.edu.unlp.oo2.Ejer16PrestamosPrendarios;

public class Inmueble extends Prenda{
	private String direccion;
	private double superficie; 
	

	public Inmueble(double c, String d, double superficie) {
		super(c);
		this.direccion = d;
		this.superficie = superficie; 
	}
	
// superficie * csto m2
	@Override
	public double valor() {
		double costoM2 = this.getCosto(); //100 use en el test
		return this.getSuperficie() * costoM2; // 50 * 100 = 5000 use en el test 
	}

	@Override
	public double liquidez() {
		return 0.2;
	}
	public String getDireccion() {
		return direccion;
	} 
	public double getSuperficie() {
		return superficie;
	} 
	  

}

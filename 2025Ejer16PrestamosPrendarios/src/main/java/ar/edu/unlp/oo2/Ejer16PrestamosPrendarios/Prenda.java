package ar.edu.unlp.oo2.Ejer16PrestamosPrendarios;

public abstract class Prenda {
	private double costo; 
	
	public Prenda(double c) {
		this.costo=c;
	}
	public double getCosto() {
		return this.costo;
	}
	public abstract double valor(); 
	public abstract double liquidez(); 
	
	
	public double valorPrendario() {
	        return this.valor() * this.liquidez(); //template
	    }

}

package ar.edu.unlp.oo2.Ejer17ArmadoPcs;

//PRODUCT: Objeto completo a ser construido
public class Computadora {
	private double procesador;
	private double ram;
	private double tarjGraf;
	private double gabinete;
	private double disco;
	 
	public void setProcesador(double procesador) {
		this.procesador = procesador;
	}
	public void setRam(double ram) {
		this.ram = ram;
	}
	public void setTarjGraf(double tarjGraf) {
		this.tarjGraf = tarjGraf;
	}
	public void setGabinete(double gabinete) {
		this.gabinete = gabinete;
	}
	public void setDisco(double disco) {
		this.disco = disco;
	}
	
	public double presupuesto() {
		// 1.21 es el IVA
		return (this.procesador + this.ram + this.tarjGraf + this.gabinete + this.disco) * 1.21;  
	}
    
    
}

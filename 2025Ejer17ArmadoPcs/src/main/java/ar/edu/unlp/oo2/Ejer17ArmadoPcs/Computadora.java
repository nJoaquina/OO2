package ar.edu.unlp.oo2.Ejer17ArmadoPcs;

//PRODUCT: Objeto completo a ser construido
public class Computadora {
	private Componente procesador;
	private Componente ram;
	private Componente tarjGraf;
	private Componente gabinete;
	private Componente disco;
	 
	public void setProcesador(Componente procesador) {
		this.procesador = procesador;
	}
	public void setRam(Componente ram) {
		this.ram = ram;
	}
	public void setTarjGraf(Componente tarjGraf) {
		this.tarjGraf = tarjGraf;
	}
	public void setGabinete(Componente gabinete) {
		this.gabinete = gabinete;
	}
	public void setDisco(Componente disco) {
		this.disco = disco;
	}
	
	public double presupuesto() {
		// 1.21 es el IVA
		return (this.procesador.getPrecio() + this.ram.getPrecio() + this.tarjGraf.getPrecio() + this.gabinete.getPrecio() + this.disco.getPrecio()) * 1.21;  
	}

	
	public double consumo() {
		return (this.procesador.getConsumo() + this.ram.getConsumo() + this.tarjGraf.getConsumo() + this.gabinete.getConsumo() + this.disco.getConsumo());
	}
}

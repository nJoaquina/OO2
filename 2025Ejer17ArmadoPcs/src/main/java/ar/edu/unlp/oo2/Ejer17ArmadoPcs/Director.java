package ar.edu.unlp.oo2.Ejer17ArmadoPcs;
//Conoce los pasos para consturir el producto final 
public class Director {

	private Builder builder;
	
	public Director(Builder concreteBuilder) {
		this.builder = concreteBuilder; 
	}
	
	public void setBuilder(Builder b) {
		this.builder =b;
	}
	
	public void construirComputadora() {
		this.builder.reset();
		this.builder.agregarProcesador();
		this.builder.agregarRam();
		this.builder.agregarDisco();
		this.builder.agregarTarjgGraf();
		this.builder.agregarGabinete();
	}
	
}

package ar.edu.unlp.oo2.Ejer17ArmadoPcs;

//Concrete Builder: implementa interfaz de Builder para construir las partes del producto
public class ConcreteBuilderIntermedio extends Builder{


	@Override
	public void agregarProcesador() {	
		this.getProducto().setProcesador(this.getCatalogo().getComponente("Procesador Intermedio"));
		
	}

	@Override
	public void agregarRam() {
		this.getProducto().setRam(this.getCatalogo().getComponente("16GB"));
	}

	@Override
	public void agregarDisco() {
		this.getProducto().setDisco(this.getCatalogo().getComponente("SSD 500gb"));
	}

	@Override
	public void agregarTarjgGraf() {
		this.getProducto().setTarjGraf(this.getCatalogo().getComponente("GTX 1650"));
		
	}

	@Override
	public void agregarGabinete() {
		this.getProducto().setGabinete(this.getCatalogo().getComponente("Gabinete Intermedio"));
		
	}

	}



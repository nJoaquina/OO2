package ar.edu.unlp.oo2.Ejer17ArmadoPcs;

//Concrete Builder: implementa interfaz de Builder para construir las partes del producto
public class ConcreteBuilderIntermedio extends Builder{


	@Override
	public void agregarProcesador() {
		//double precioP = this.getCatalogo().getComponente("Procesador Intermedio").getPrecio();
		//this.getProducto().setProcesador(precioP);
		this.getProducto().setProcesador(100); //para que ande el test
		
	}

	@Override
	public void agregarRam() {
		//double precioRAM = this.getCatalogo().getComponente("16 GB").getPrecio();
		//this.getProducto().setRam(precioRAM);
		this.getProducto().setRam(100);
	}

	@Override
	public void agregarDisco() {
		//double precioDisco = this.getCatalogo().getComponente("SSD 500 GB").getPrecio();
		//this.getProducto().setDisco(precioDisco);
		this.getProducto().setDisco(100);
	}

	@Override
	public void agregarTarjgGraf() {
		//double precioTG = this.getCatalogo().getComponente("GTX 1650").getPrecio();
		//this.getProducto().setTarjGraf(precioTG);
		this.getProducto().setTarjGraf(100);
		
	}

	@Override
	public void agregarGabinete() {
		//double precioG = this.getCatalogo().getComponente("Gabinete Intermedio Fuente 800 w").getPrecio();
		//this.getProducto().setGabinete(precioG);
		this.getProducto().setGabinete(100);
		
	}
//CONSULTAR
	@Override
	public double consumo() {
		return (this.getCatalogo().getComponente("Procesador Intermedio").getConsumo() +
				this.getCatalogo().getComponente("16 GB").getConsumo() +
				this.getCatalogo().getComponente("SSD 500 GB").getConsumo() +
				this.getCatalogo().getComponente("GTX 1650").getConsumo() +
				this.getCatalogo().getComponente("Gabinete intermedio Fuente 800 w").getConsumo() 		
				); 
		
	}

}

package ar.edu.unlp.oo2.Ejer17ArmadoPcs;

//BUILDER: ESPEFICIFICA UNA INTERFAZ ABSTRACTA PARA CREAR LAS PARTES DE UN PRODUCTO *
  
public abstract class Builder {
	private Computadora productoFinal =  new Computadora(); 
	private Catalogo catalogo; 
	
	//puede tener el constructor que le llega el catalogo e inicializa la compu 
	
	public void cargarCatalogo(Catalogo c) {
		this.catalogo = c; 
	}	
	
	public void reset() { //importante para reutilizar el builder
		this.productoFinal = new Computadora(); 
	}
	
	public Computadora getProducto() {
		return this.productoFinal; 
	}
	public Catalogo getCatalogo() {
		return this.catalogo;
	}

	 
	public abstract void agregarProcesador();
	public abstract void agregarRam() ;
	public abstract void agregarDisco();
	public abstract void agregarTarjgGraf();
	public abstract void agregarGabinete();
}

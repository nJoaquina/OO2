package ar.edu.unlp.oo2.Ejer22FileManager;

public class Tamanio extends Decorator {
 
	public Tamanio (InterfaceFileManager file) {
		super(file);
	}

	@Override
	public String info() {
		return "Tamanio: " + this.archivo.getTamanio();
	}
	
}

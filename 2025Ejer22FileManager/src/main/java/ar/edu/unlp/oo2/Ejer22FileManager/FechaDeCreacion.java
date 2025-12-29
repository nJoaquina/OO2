package ar.edu.unlp.oo2.Ejer22FileManager;

public class FechaDeCreacion extends Decorator {

	public FechaDeCreacion (InterfaceFileManager file) {
		super(file);
	}

	@Override
	public String info() {
		return "Fecha de Creacion: " + archivo.getFechaCreacion();
	}
	
}

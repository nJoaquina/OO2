package ar.edu.unlp.oo2.Ejer22FileManager;

public class Permisos extends Decorator{
	
	public Permisos (InterfaceFileManager file) {
		super(file);
	}

	@Override
	public String info() {
		return "Permisos: " + archivo.getPermisos(); 
	}
	
}

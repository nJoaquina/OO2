package ar.edu.unlp.oo2.Ejer22FileManager;

public class Extension extends Decorator{

	public Extension(InterfaceFileManager archivo) {
		super(archivo);
	}

	@Override
	public String info() {
		return "Extension: " + this.archivo.getExtension();
	}
	
	
	
}

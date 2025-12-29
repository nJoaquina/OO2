package ar.edu.unlp.oo2.Ejer22FileManager;

public class Nombre extends Decorator{

	public Nombre(InterfaceFileManager archivo) {
		  super(archivo); 
	}
	@Override
	public String info() {
		return "Nombre: " +this.archivo.getNombre();
	}

}

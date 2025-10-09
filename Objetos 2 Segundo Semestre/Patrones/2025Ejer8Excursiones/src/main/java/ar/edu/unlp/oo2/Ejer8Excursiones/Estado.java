package ar.edu.unlp.oo2.Ejer8Excursiones;

public abstract class Estado {
	
	public  String obtenerInfo(Excursion e) {
		return e.informacion() + faltante(e); 
	} 
	public abstract void chequeoCupos(Excursion e);
	public abstract String faltante(Excursion e);
}

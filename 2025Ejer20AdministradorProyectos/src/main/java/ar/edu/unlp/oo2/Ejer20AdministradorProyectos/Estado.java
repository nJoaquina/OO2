package ar.edu.unlp.oo2.Ejer20AdministradorProyectos;

public abstract class Estado {
 
	public abstract void aprobarEtapa(Proyecto p);
	public abstract void modificarMargenGanancia (Proyecto p);
	public  void cancelarProyecto (Proyecto p) {
		p.addObjetivo("cancelado"); 
		p.setEstado(new Cancelado());
	}
	
}

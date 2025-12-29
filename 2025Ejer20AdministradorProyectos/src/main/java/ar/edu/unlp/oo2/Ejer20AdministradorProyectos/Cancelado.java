package ar.edu.unlp.oo2.Ejer20AdministradorProyectos;

public class Cancelado extends Estado{

	@Override
	public void aprobarEtapa(Proyecto p) {
		// no hace nada
		
	}

	@Override
	public void modificarMargenGanancia(Proyecto p) {
		//no hace nada
		
	}

	@Override
	public void cancelarProyecto(Proyecto p) {
		// refefino para que no haga nada. 
		
	}

}

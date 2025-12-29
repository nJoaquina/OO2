package ar.edu.unlp.oo2.Ejer20AdministradorProyectos;

public class EnEvaluacion extends Estado{

	@Override
	public void aprobarEtapa(Proyecto p) {
		p.setEstado(new Confirmada());
		
	}

	@Override
	public void modificarMargenGanancia(Proyecto p) {
		if(p.margenGananciaEntre11y15()) {
			//p.ActualizarMargenGanancia()???? no se como se actualiza. 
		}
		
	}


}

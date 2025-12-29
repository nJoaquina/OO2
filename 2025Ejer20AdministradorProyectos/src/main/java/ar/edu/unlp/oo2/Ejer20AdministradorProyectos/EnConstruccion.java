package ar.edu.unlp.oo2.Ejer20AdministradorProyectos;

public class EnConstruccion extends Estado{

	@Override
	public void aprobarEtapa(Proyecto p) {
		if(p.precioDelProyecto() > 0) {
			p.setEstado(new EnEvaluacion());
		}else {
			throw new RuntimeException("Error: el proyecto tiene un precio de 0"); 
		}
	}


	@Override
	public void modificarMargenGanancia(Proyecto p) {
	    if(p.margenGananciaEntre8y10()) {
	    	// dice que actualiza margen pero no se con que info?? 
	    }
		
	}



}

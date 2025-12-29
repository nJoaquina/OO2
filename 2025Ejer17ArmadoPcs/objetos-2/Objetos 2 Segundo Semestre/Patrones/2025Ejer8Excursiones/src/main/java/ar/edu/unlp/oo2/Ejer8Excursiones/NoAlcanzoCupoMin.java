package ar.edu.unlp.oo2.Ejer8Excursiones;

public class NoAlcanzoCupoMin extends Estado{

	@Override
	public String faltante(Excursion e) {
		 //esto es envidia de atributos por eso lo hago directamnte en Excusrion 
		//String respuesta = e.getNombreE() + e.getFechaI() + e.getFechaF() + e.getPuntoE() + e.faltante();
		//return respuesta;
		
			return 	" " + e.faltanteMin();
		}
	
	
	public void chequeoCupos(Excursion e) {
		if(e.llegoCupoMin())
			e.setEstado(new AlcanzoCupoMin());
	}

}

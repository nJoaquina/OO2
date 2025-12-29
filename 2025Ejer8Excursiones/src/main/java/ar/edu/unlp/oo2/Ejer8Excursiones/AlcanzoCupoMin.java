package ar.edu.unlp.oo2.Ejer8Excursiones;

public class AlcanzoCupoMin extends Estado{

	@Override
	public String faltante(Excursion e) {
		return " "+ e.mailsInscriptos() +" "+ e.faltanteMax();
	}

	@Override
	public void chequeoCupos(Excursion e) {
		if(e.llegoCupoMax()) {
			e.setEstado(new AlcanzoCupoMax());
		}
	}
	

}

package ar.edu.unlp.oo2.EjerPersonajesDeJuegosDeRol;

public class Espada extends Arma {

	@Override
	public void pegar(Personaje atacado) {
		Armadura armaduraAtacado = atacado.getArmadura();
		int daño = atacado.getPuntos() - armaduraAtacado.dañoEspada();
		atacado.setPuntos(daño);
	}

		
	

}

package ar.edu.unlp.oo2.EjerPersonajesDeJuegosDeRol;

public class Director {
	
	
	public void armarPersonaje(Builder b) {
		b.reset(b.getPersonaje().getNombre());
		b.ponerArmadura();
		b.ponerArma();
		b.ponerHabilidad();
	}
	
}

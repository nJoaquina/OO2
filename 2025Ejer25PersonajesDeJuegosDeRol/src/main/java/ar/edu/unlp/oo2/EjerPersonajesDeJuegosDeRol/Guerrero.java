package ar.edu.unlp.oo2.EjerPersonajesDeJuegosDeRol;

public class Guerrero extends Builder{

	public Guerrero(Personaje p) {
		super(p);
		
	}

	@Override
	public void ponerArmadura() {
		this.getPersonaje().setArmadura(new Acero());
		
	}

	@Override
	public void ponerArma() {
		this.getPersonaje().setArma(new Espada());
		
	}

	@Override
	public void ponerHabilidad() {
		this.getPersonaje().setHabilidad("cuerpo a cuerpo");
		
	}
	
	
}

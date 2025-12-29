package ar.edu.unlp.oo2.EjerPersonajesDeJuegosDeRol;

public abstract class Builder {
	protected Personaje personaje; 
	
	public Builder (Personaje p) {
		this.personaje = p;
	}
	
	public Personaje getPersonaje() {
		return personaje; 
	}
	
	public void reset(String nom) {
		this.personaje = new Personaje(nom);
	}
	
	public abstract void ponerArmadura();
	public abstract void ponerArma();
	public abstract void ponerHabilidad(); 
}

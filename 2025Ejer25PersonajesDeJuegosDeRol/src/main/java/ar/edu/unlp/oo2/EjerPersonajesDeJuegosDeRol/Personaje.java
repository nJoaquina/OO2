package ar.edu.unlp.oo2.EjerPersonajesDeJuegosDeRol;

public class Personaje {
	private String nombre;
	private int puntos; 
	private Armadura armadura;
	private Arma arma;
	private String habilidad;
	
//	public Personaje(String nom, String h, Armadura armadura, Arma arma) {
//		this.nombre = nom; 
//		this.puntos = 100; 
//		this.armadura = armadura; 
//		this.arma = arma; 
//		this.habilidad = h; 
//	}
	public Personaje(String nom) {
		this.nombre = nom; 
		this.puntos = 100; 
		this.armadura = null; 
		this.arma = null; 
		this.habilidad = ""; 
	}
	public String getNombre() {
		return nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	public Armadura getArmadura() {
		return armadura;
	}

	public Arma getArma() {
		return arma;
	}

	public String getHabilidad() {
		return habilidad;
	}
	
	public void ataque(Personaje atacado) {
		if(this.puntos > 0) {
			this.arma.pegar(atacado);
		}
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setArmadura(Armadura armadura) {
		this.armadura = armadura;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}
	
}

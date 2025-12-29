package ar.edu.unlp.oo2.Ejer8Excursiones;

public class Usuario {
	private String nombre;
	private String apellido; 
	private String email; 
	

	public Usuario(String nombre, String apellido, String email) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}


	public String getMail(){
		return this.email;
	}
	
}

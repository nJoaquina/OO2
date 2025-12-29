package ar.edu.unlp.oo2.Ejer11AlquilerDeAutomoviles;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private ArrayList<AutoEnAlquiler> autosEnAlquiler;
	
	public Usuario(String nombre) {
		this.nombre = nombre; 
		autosEnAlquiler = new ArrayList<>();
	}
	
	public void addAutosEnAlquiler(AutoEnAlquiler a) {
		this.autosEnAlquiler.add(a);
	}
}

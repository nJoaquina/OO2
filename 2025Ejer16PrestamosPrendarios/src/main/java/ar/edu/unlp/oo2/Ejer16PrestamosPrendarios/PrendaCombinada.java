package ar.edu.unlp.oo2.Ejer16PrestamosPrendarios;

import java.util.ArrayList;

public class PrendaCombinada extends Prenda {
	private ArrayList<Prenda> contenido; 
	
	public PrendaCombinada(double c) {
		super(c);
		contenido = new ArrayList<>();
	}
	@Override
	public double valor() {
		// TODO Auto-generated method stub
		return this.contenido.stream().mapToDouble(p -> p.valor()).sum();  
	}

	@Override
	public double liquidez() {
		return 0.5;
	}
	
	public void addContenido(Prenda p) {
		this.contenido.add(p);
	}
	public void removeContenido(Prenda p) {
		this.contenido.remove(p);
	}

	public ArrayList<Prenda> getContenido() {
		return contenido;
	}
	
}

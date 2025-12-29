package ar.edu.unlp.oo2.Ejer17ArmadoPcs;

public class Componente {
	private String nombre;
	private String des; 
	private double precio; 
	private double consumo;
	
	public Componente(String nombre, String des, double precio, double consumo) {
	
		this.nombre = nombre;
		this.des = des;
		this.precio = precio;
		this.consumo = consumo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDes() {
		return des;
	}

	public double getPrecio() {
		return precio;
	}

	public double getConsumo() {
		return consumo;
	}


}

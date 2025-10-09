package ar.edu.unlp.oo2.Ejer4CalculoSueldos;

public class Temporario extends Empleado{
	private Integer cantHorasTrabajadas; 
	private Integer cantHijos; 
	private Boolean casado; 
	
	public Temporario(Integer cantHorasTrabajadas, Boolean casado, Integer cantHijos) {
		this.cantHorasTrabajadas = cantHorasTrabajadas;
		this.cantHijos = cantHijos;
		this.casado = casado;
	}
	
	
	public Integer getCantHorasTrabajadas() {
		return cantHorasTrabajadas;
	}


	public Integer getCantHijos() {
		return cantHijos;
	}


	public Boolean getCasado() {
		return casado;
	}
	@Override
	public double basico() {
		return 20.000 + (this.getCantHorasTrabajadas() * 300); 
	}
	
	@Override
	public double adicional() {
		double porCadaHijo = this.getCantHijos() * 2000; 
		if(this.getCasado()) {
			return porCadaHijo + 5000;
		}
		return porCadaHijo; 
	}
	

}




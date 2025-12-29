package ar.edu.unlp.oo2.Ejer4CalculoSueldos;

public class Planta extends Empleado{
	private Integer cantAnioAntiguedad; 
	private Integer cantHijos; 
	private Boolean casado; 
	
	public Planta(Integer cantHijos, Boolean casado, Integer cantAnioAntiguedad) {
		this.cantAnioAntiguedad = cantAnioAntiguedad;
		this.cantHijos = cantHijos;
		this.casado = casado;
	}

	@Override
	public double basico() {
		return 50000;
	}

	@Override
	public double adicional() {
		double extra = ((2000* this.cantHijos) + (2000 * this.cantAnioAntiguedad)); 
		if(this.casado) {
			return 5000 + extra;
		}
		return extra;
	}
	
}

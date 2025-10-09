package ar.edu.unlp.oo2.Ejer4CalculoSueldos;

public class Pasante extends Empleado{
	private Integer cantExamenRendido;
	
	public Pasante (Integer cantExamR) {
		this.cantExamenRendido = cantExamR; 
	}
	
	@Override
	public double basico() {
		return 20000;
	}

	@Override
	public double adicional() {
		return (2000 * this.cantExamenRendido) ;
	}

}

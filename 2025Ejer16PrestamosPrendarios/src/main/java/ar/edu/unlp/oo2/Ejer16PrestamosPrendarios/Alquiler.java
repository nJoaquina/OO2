package ar.edu.unlp.oo2.Ejer16PrestamosPrendarios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler extends Prenda{
	private LocalDate comienzoContrato;
	private LocalDate finContrato;
	
	
	public Alquiler(double c, LocalDate cc, LocalDate fc) {
		super(c);
		this.comienzoContrato = cc;
		this.finContrato = fc; 
	}
	
	//meses que faltan del contrato * costo mensual
		@Override
		public double valor() {
			 // Obtiene la fecha actual (Octubre 10, 2025)
	        LocalDate hoy = LocalDate.now(); 
	        double costoMensual = this.getCosto();
	        
	        // Si el contrato ya terminó, el valor restante es 0.
	        if (this.finContrato.isBefore(hoy) || this.finContrato.isEqual(hoy)) {
	            return 0.0;
	        }

	        // 1. Calcular la diferencia total en meses completos.
	        // ChronoUnit.MONTHS.between cuenta los meses completos entre dos fechas.
	        long mesesFaltantes = ChronoUnit.MONTHS.between(hoy.withDayOfMonth(1), this.finContrato.withDayOfMonth(1));

	        // 2. Multiplicar los meses completos por el costo mensual.
	        return (mesesFaltantes * costoMensual);
	    }
	
	@Override
	public double liquidez() {
		return 0.9;
	}

	public LocalDate getComienzoContrato() {
		return comienzoContrato;
	}

	public LocalDate getFinContrato() {
		return finContrato;
	}

	
	
   	
}

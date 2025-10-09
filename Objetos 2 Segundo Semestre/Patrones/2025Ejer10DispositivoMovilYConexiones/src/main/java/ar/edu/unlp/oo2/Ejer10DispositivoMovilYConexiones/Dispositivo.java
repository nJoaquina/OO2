package ar.edu.unlp.oo2.Ejer10DispositivoMovilYConexiones;

public class Dispositivo {
	private Connection connection; 
	private Display display;
	private Ringer ringer; 
	private Strategy strategy;
	
	public Dispositivo(Connection conection, Display display, Ringer ringer, Strategy strategy) {	
		this.connection = conection;
		this.display = display;
		this.ringer = ringer;
		this.strategy = strategy;
	} 
	
//no se toca, dado en el enunciado. 
	public String send(String data) {
		//long crc = this.crcCalculator.crcFor(data);
		long crc = this.strategy.crcFor(data);
		return this.connection.sendData(data, crc); 
	}
	
	public String conectarCon(Connection c) {
		this.connection = c; 
	    this.ringer.ring(); 
		return c.pict(); 
	}
	
	public void configurarCRC(Strategy s) {
		this.strategy = s; 
	}
}

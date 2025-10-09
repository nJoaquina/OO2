package ar.edu.unlp.oo2.Ejer10DispositivoMovilYConexiones;

public interface Connection {
	
	public String sendData(String data, long crc);
	public String pict(); 
	

}

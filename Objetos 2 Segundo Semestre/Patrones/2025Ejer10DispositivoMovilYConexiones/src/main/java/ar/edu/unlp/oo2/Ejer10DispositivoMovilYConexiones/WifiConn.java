package ar.edu.unlp.oo2.Ejer10DispositivoMovilYConexiones;

public class WifiConn implements Connection{
	private String pict = "wifi"; 
	
	
	public String pict(){
		return this.pict; 
	}

	@Override
	public String sendData(String data, long crc) {
		
	 return data + ":crc=" + crc;

	}

	
}

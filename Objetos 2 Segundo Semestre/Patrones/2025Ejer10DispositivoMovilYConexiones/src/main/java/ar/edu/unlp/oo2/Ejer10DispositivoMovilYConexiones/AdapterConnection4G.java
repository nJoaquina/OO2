package ar.edu.unlp.oo2.Ejer10DispositivoMovilYConexiones;

public class AdapterConnection4G implements Connection {
	private Connection4G c4G; 
	
	
	
	public AdapterConnection4G(Connection4G c4g) {
		c4G = c4g;
	}

	@Override
	public String sendData(String data, long crc) {
		return data + ":crc=" + crc ;
	}

	@Override
	public String pict() {
		return c4G.symb();
	}

}

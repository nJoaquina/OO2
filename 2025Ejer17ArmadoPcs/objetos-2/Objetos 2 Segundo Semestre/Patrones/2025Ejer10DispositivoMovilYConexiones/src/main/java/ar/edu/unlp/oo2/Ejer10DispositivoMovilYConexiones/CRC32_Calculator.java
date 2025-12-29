package ar.edu.unlp.oo2.Ejer10DispositivoMovilYConexiones;

import java.util.zip.CRC32;


public class CRC32_Calculator implements Strategy{

	//dado por el enunciado
	@Override
	public long crcFor(String datos) {
		CRC32 crc = new CRC32();
		crc.update(datos.getBytes());
		return crc.getValue();
		}

}

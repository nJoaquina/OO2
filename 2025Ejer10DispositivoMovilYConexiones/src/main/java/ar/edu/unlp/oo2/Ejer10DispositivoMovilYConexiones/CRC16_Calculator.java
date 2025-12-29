package ar.edu.unlp.oo2.Ejer10DispositivoMovilYConexiones;

public class CRC16_Calculator implements Strategy{

	
	//recibe el mensaje data con los datos a enviar y deuvelve un valor numerico. Dado en el enunciado
	@Override
	public long crcFor(String datos) {
		int crc = 0xFFFF;
		for (int j = 0; j < datos.getBytes().length; j++) {
		crc = ((crc >>> 8) | (crc << 8)) & 0xffff;
		crc ^= (datos.getBytes()[j] & 0xff);
		crc ^= ((crc & 0xff) >> 4);
		crc ^= (crc << 12) & 0xffff;
		crc ^= ((crc & 0xFF) << 5) & 0xffff;
		}
		crc &= 0xffff;
		return crc;
		}


}

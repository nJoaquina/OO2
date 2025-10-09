/**
 * 
 */
package ar.edu.unlp.oo2.Ejer10DispositivoMovilYConexiones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConectionTest {
	
	Dispositivo d;
	Strategy CRC16, CRC32;
	Connection wifi, adapter_c46; 
	Connection4G c4G;
	Display display;
	Ringer ring; 
	
	@BeforeEach
	void setUp() throws Exception {
		wifi = new WifiConn(); 
		display = new Display(); 
		ring = new Ringer();
		CRC16 = new CRC16_Calculator(); 
		d = new Dispositivo(wifi, display, ring, CRC16);
	
	}
    @Test // paso bien
    public void testSend() {
        assertEquals("dato a enviar:crc=53803",  d.send("dato a enviar"));
        //cambio estrategia ahora paso a CRC32
        CRC32 = new CRC32_Calculator(); 
        d.configurarCRC(CRC32);
        assertEquals("dato a enviar:crc=4166492519",  d.send("dato a enviar"));
    }
    @Test // paso bien
    public void testConcetarCon() {
    	assertEquals("wifi",  d.conectarCon(wifi));
        //cambio de conexion
    	adapter_c46 = new AdapterConnection4G(new Connection4G()); 
        assertEquals("4G",  d.conectarCon(adapter_c46)); 
        
    }
    
    
    
}

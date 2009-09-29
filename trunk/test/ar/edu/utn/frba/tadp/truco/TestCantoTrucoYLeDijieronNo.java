package ar.edu.utn.frba.tadp.truco;


import org.junit.Before;
import org.junit.Test;

import ar.edu.utn.frba.tadp.truco.g10.Jugador;
import ar.edu.utn.frba.tadp.truco.g10.Mano;
import ar.edu.utn.frba.tadp.truco.g10.Mazo;

public class TestCantoTrucoYLeDijieronNo {

	Jugador j1;
	Jugador j2;
	Mazo mazo;
	Mano mano;
	@Before
	public void setUp() throws Exception {
		j1 = new Jugador("Pepe");
		j2 = new Jugador("Tito");
		mazo = new Mazo();
		mano = new Mano(j1,j2,mazo);
	}
	
	@Test
	public void teCantoTruco(){
		mano.prepararMano();
		mano.jugarRondas();
		assertTrue(mano.seCantoTruco());	
	}
	

}

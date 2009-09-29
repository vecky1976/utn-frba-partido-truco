package ar.edu.utn.frba.tadp.truco;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ar.edu.utn.frba.tadp.truco.g10.Jugador;
import ar.edu.utn.frba.tadp.truco.g10.Mano;
import ar.edu.utn.frba.tadp.truco.g10.Mazo;

public class TestNoSeCantaTruco {

	Jugador jugador1;
	Jugador jugador2;
	Mazo mazo;
	Mano mano;

	@Before
	public void setUp() throws Exception {
		jugador1 = new Jugador("Pepe");
		jugador2 = new Jugador("Tito");
		mazo = new Mazo();
		mano = new Mano(jugador1, jugador2, mazo);

	}

	@Test
	public void noSeCantoTruco() {
		
		assertFalse(mano.alguienCantoTruco());

	}

	@Test
	public void seCantoTruco() {
		mano.seCantoTruco();
		assertTrue(mano.alguienCantoTruco());
	}

	@Test
	public void cantoTrucoLaMano() {
		jugador1.truco();
		assertTrue(jugador1.canteTruco());
	}

	@Test
	public void cantoTrucoElPie() {
		jugador2.truco();
		assertTrue(jugador2.canteTruco());
	}

}

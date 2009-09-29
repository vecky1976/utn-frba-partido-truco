package ar.edu.utn.frba.tadp.truco;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ar.edu.utn.frba.tadp.truco.g10.Jugador;
import ar.edu.utn.frba.tadp.truco.g10.Mano;
import ar.edu.utn.frba.tadp.truco.g10.Mazo;

public class TestRepartirTresCartas {

	private Jugador j1;
	private Jugador j2;
	private Mazo mazo;
	private Mano mano;
//	private Partido p;

	@Before
	public void setUp() throws Exception {
		j1 = new Jugador("Pepe");
		j2 = new Jugador("Tito");
		mazo = new Mazo();
		mano = new Mano(j1,j2,mazo);
//		p = new Partido(j1, j2, mazo);
		
	}

	@Test
	/** Se prueba que el metodo que devuelve una collecion de tres cartas este funcionando correctamente.
	 * 
	 */
	public void darTresCartas() {
		assertTrue(mazo.darTresCartas().size() == 3);
	}

	@Test
	/** Se pureba que al preparar una mano para iniciarse se hayan repartido correctamente tres cartas por jugador.
	 * 
	 */
	public void seRepartieronTresCartasPorJugador(){
		assertTrue(j1.getCantidadCartas() == 0);
		assertTrue(j2.getCantidadCartas() == 0);
		mano.prepararMano();
		assertTrue(j1.getCantidadCartas() == 3);
		assertTrue(j2.getCantidadCartas() == 3);
		mazo.getCantidadDeCartasEnElMazo();
		
		
	}
	
	
	
	
}

package ar.edu.utn.frba.tadp.truco;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ar.edu.utn.frba.tadp.truco.g10.CartaDeTruco;
import ar.edu.utn.frba.tadp.truco.g10.Envido;

public class TestEnvido {
	private Palo BASTO;
	private CartaDeTruco c1, c2, c3, c4;
	private Envido envido;

	@Before
	public void setUp() throws Exception {
		envido = new Envido();
		c3 = new CartaDeTruco(BASTO, 6);
		c4 = new CartaDeTruco(BASTO, 7);
	}

	@Test
	public void testTieneEnvidoDeFiguras(){
		// crear tres cartas con envido = 20 (2 figuras)
		c1 = new CartaDeTruco(BASTO, 10);
		c2 = new CartaDeTruco(BASTO, 11);
		
		assertTrue(envido.calcularEnvido(c1, c2)==20);
	}
	
	@Test
	public void testTieneMaximoEnvido(){
		assertTrue(envido.calcularEnvido(c3, c4)==33);
	}
}

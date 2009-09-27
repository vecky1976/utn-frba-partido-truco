package ar.edu.utn.frba.tadp.truco;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ar.edu.utn.frba.tadp.truco.g10.CartaDeTruco;
import ar.edu.utn.frba.tadp.truco.g10.Envido;

import java.util.ArrayList;

/**
 * @author matias
 * Resolver si un conjunto de 3 cartas le gana el envido a otro 
 * conjunto de 3 cartas
 *
 */
public class TestTresCartasLeGananEnvidoAotrasTresCartas {
	private Palo BASTO;
	private Palo ESPADA;
	private CartaDeTruco c1, c2, c3, c4, c5, c6;
	private ArrayList<CartaDeTruco> tresCartas;
	private ArrayList<CartaDeTruco> otrasTresCartas;
	private Envido envido;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	
		// crear tres cartas con envido = 20 (2 figuras)
		c1 = new CartaDeTruco(BASTO, 10);
		c2 = new CartaDeTruco(BASTO, 11);
		c3 = new CartaDeTruco(ESPADA, 1);
		
		// crear tres cartas con envido = 27 (7 y figura)
		c4 = new CartaDeTruco(ESPADA, 7);
		c5 = new CartaDeTruco(ESPADA, 11);
		c6 = new CartaDeTruco(BASTO, 2);
		
		tresCartas = new ArrayList<CartaDeTruco>();
		otrasTresCartas = new ArrayList<CartaDeTruco>();
		
		// crear conjunto de tres cartas con envido
		tresCartas.add(c1);
		tresCartas.add(c2);
		tresCartas.add(c3);
		
		// crear conjunto de tres cartas con envido
		otrasTresCartas.add(c4);
		otrasTresCartas.add(c5);
		otrasTresCartas.add(c6);
		
		envido = new Envido();
	}
	
	@Test
	public void testNoGanaEnvido(){
		// 20 de basto pierde contra 27 de espada
		assertFalse(envido.ganaEnvido(tresCartas, otrasTresCartas));
	}
	
	@Test
	public void testGanaEnvido(){
		// 27 de espada le ganan a 20 de basto
		assertTrue(envido.ganaEnvido(otrasTresCartas, tresCartas));
	}

}

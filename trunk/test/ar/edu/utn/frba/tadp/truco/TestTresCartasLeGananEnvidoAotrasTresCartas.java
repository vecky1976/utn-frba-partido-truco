package ar.edu.utn.frba.tadp.truco;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ar.edu.utn.frba.tadp.truco.g10.CartaDeTruco;
import ar.edu.utn.frba.tadp.truco.g10.Envido;
import ar.edu.utn.frba.tadp.truco.g10.ResultadoEnvido;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author matias
 * Resolver si un conjunto de 3 cartas le gana el envido a otro 
 * conjunto de 3 cartas
 *
 */
public class TestTresCartasLeGananEnvidoAotrasTresCartas {
	private CartaDeTruco c1, c2, c3, c4, c5, c6;
	private Collection<Carta> tresCartasCon20DeEnvido;
	private Collection<Carta> tresCartasCon27DeEnvido;
	private Envido envido;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		this.envido = new Envido();
		
		tresCartasCon20DeEnvido = new ArrayList<Carta>();
		tresCartasCon27DeEnvido = new ArrayList<Carta>();
		// crear tres cartas con envido = 20 (2 figuras)
		c1 = new CartaDeTruco(Palo.BASTO, 10);
		c2 = new CartaDeTruco(Palo.BASTO, 11);
		c3 = new CartaDeTruco(Palo.ESPADA, 1);
		
		// crear tres cartas con envido = 27 (7 y figura)
		c4 = new CartaDeTruco(Palo.ESPADA, 7);
		c5 = new CartaDeTruco(Palo.ESPADA, 11);
		c6 = new CartaDeTruco(Palo.BASTO, 2);
		

		
		// crear conjunto de tres cartas con envido
		tresCartasCon20DeEnvido.add(c1);
		tresCartasCon20DeEnvido.add(c2);
		tresCartasCon20DeEnvido.add(c3);
		
		// crear conjunto de tres cartas con envido
		tresCartasCon27DeEnvido.add(c4);
		tresCartasCon27DeEnvido.add(c5);
		tresCartasCon27DeEnvido.add(c6);
	}
	
	@Test
	public void testGanaEnvido(){
		// 27 de espada le ganan a 20 de basto
		assertTrue(envido.ganaEnvido(tresCartasCon27DeEnvido, tresCartasCon20DeEnvido)==ResultadoEnvido.GANA);
	}
	
	@Test
	public void testPierdeEnvido(){
		// 20 de basto pierden contra 27 de espada
		assertTrue(envido.ganaEnvido(tresCartasCon20DeEnvido, tresCartasCon27DeEnvido)==ResultadoEnvido.PIERDE);
	}

	@Test
	public void testEmpataEnvido(){
		// 20 de basto pierden contra 27 de espada
		assertTrue(envido.ganaEnvido(tresCartasCon20DeEnvido, tresCartasCon20DeEnvido)==ResultadoEnvido.EMPATA);
	}
}

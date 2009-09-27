package ar.edu.utn.frba.tadp.truco;


import org.junit.Before;

import ar.edu.utn.frba.tadp.truco.g10.CartaDeTruco;
//import ar.edu.utn.frba.tadp.truco.Palo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author matias
 * Resolver si un conjunto de 3 cartas le gana el envido a otro 
 * conjunto de 3 cartas
 *
 */
public class TestTresCartasLeGananEnvidoAotrasTresCartas {
	
	private Palo BASTO;
	private Palo ESPADA;

	// crear tres cartas con envido = 20 (2 figuras)
	CartaDeTruco c1 = new CartaDeTruco(BASTO, 10);
	CartaDeTruco c2 = new CartaDeTruco(BASTO, 11);
	CartaDeTruco c3 = new CartaDeTruco(ESPADA, 1);
	
	// crear tres cartas con envido = 27 (7 y figura)
	CartaDeTruco c4 = new CartaDeTruco(ESPADA, 7);
	CartaDeTruco c5 = new CartaDeTruco(ESPADA, 11);
	CartaDeTruco c6 = new CartaDeTruco(BASTO, 2);
	
	Collection<Carta> tresCartas = new ArrayList<Carta>();
	Collection<Carta> otrasTresCartas = new ArrayList<Carta>();
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// crear conjunto de tres cartas con envido
		tresCartas.add(c1);
		tresCartas.add(c2);
		tresCartas.add(c3);
		
		// crear conjunto de tres cartas con envido
		otrasTresCartas.add(c4);
		otrasTresCartas.add(c5);
		otrasTresCartas.add(c6);
		
		
	}

}

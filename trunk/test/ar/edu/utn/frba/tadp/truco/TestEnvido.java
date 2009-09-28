package ar.edu.utn.frba.tadp.truco;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import ar.edu.utn.frba.tadp.truco.g10.CartaDeTruco;
import ar.edu.utn.frba.tadp.truco.g10.Envido;

public class TestEnvido {
	private CartaDeTruco c1, c2, c3;
	private Envido envido;
	private Collection<Carta> tresCartas;

	@Before
	public void setUp() throws Exception {
		this.envido = new Envido();
	}

	@Test
	public void testTieneEnvidoDeFiguras(){
		// crear tres cartas con envido = 20 (2 figuras)
		c1 = new CartaDeTruco(Palo.BASTO, 10);
		c2 = new CartaDeTruco(Palo.BASTO, 11);
		
		assertTrue(envido.calcularEnvido(c1, c2)==20);
	}
	
	@Test
	public void testTieneMaximoEnvido(){
		c1 = new CartaDeTruco(Palo.BASTO, 6);
		c2 = new CartaDeTruco(Palo.BASTO, 7);
		assertTrue(envido.calcularEnvido(c1, c2)==33);
	}
	
	@Test
	public void testTieneEnvidoDeFiguraConNumero(){
		c1 = new CartaDeTruco(Palo.BASTO, 12);
		c2 = new CartaDeTruco(Palo.BASTO, 5);
		assertTrue(envido.calcularEnvido(c1, c2)==25);
	}
	
	// tiene envido si tiene al menos dos cartas del mismo palo
	@Test
	public void testTieneEnvidoConTresCartasMismoPalo(){

		this.tresCartas = new ArrayList<Carta>();
		
		this.c1 = new CartaDeTruco(Palo.BASTO, 12);
		this.c2 = new CartaDeTruco(Palo.BASTO, 5);
		this.c3 = new CartaDeTruco(Palo.BASTO, 4);
		
		this.tresCartas.add(c1);
		this.tresCartas.add(c2);
		this.tresCartas.add(c3);
		
		assertTrue(envido.tieneEnvido(this.tresCartas));
	}
	
	// no tiene envido si tiene tres cartas de distinto palo
	@Test
	public void testNoTieneEnvido(){
		
		this.tresCartas = new ArrayList<Carta>();
		
		this.c1 = new CartaDeTruco(Palo.BASTO, 12);
		this.c2 = new CartaDeTruco(Palo.ESPADA, 5);
		this.c3 = new CartaDeTruco(Palo.ORO, 4);
		
		this.tresCartas.add(c1);
		this.tresCartas.add(c2);
		this.tresCartas.add(c3);
		
		assertFalse(envido.tieneEnvido(this.tresCartas));
	}
	
	// tiene dos posibles valores envido pero se canta el mayor
	@Test
	public void testMayorValorEnvidoConTresCartasMismoPalo(){

		this.tresCartas = new ArrayList<Carta>();
		
		this.c1 = new CartaDeTruco(Palo.BASTO, 12);
		this.c2 = new CartaDeTruco(Palo.BASTO, 5);
		this.c3 = new CartaDeTruco(Palo.BASTO, 4);
		
		this.tresCartas.add(c1);
		this.tresCartas.add(c2);
		this.tresCartas.add(c3);
		
		assertTrue(envido.getValorEnvido(this.tresCartas)==29);
	}
	
}

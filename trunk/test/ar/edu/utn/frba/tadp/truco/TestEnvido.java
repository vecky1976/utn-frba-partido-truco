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
	
	// regla: si tiene dos posibles valores envido, se canta el mayor valor
	// si tiene envido con 3 cartas del mismo palo se canta la mayor suma
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
	
	
	@Test
	public void testMintioEnvidoCantaCartaMayorValorEnvido(){
		
		this.tresCartas = new ArrayList<Carta>();
		
		this.c1 = new CartaDeTruco(Palo.BASTO, 12);
		this.c2 = new CartaDeTruco(Palo.ESPADA, 7);
		this.c3 = new CartaDeTruco(Palo.ORO, 4);
		
		this.tresCartas.add(c1);
		this.tresCartas.add(c2);
		this.tresCartas.add(c3);
		
		assertTrue(envido.getValorEnvido(this.tresCartas)==7);
	}
	
	@Test
	public void testMintioEnvidoSinNada(){
		
		this.tresCartas = new ArrayList<Carta>();
		// todas figuras
		this.c1 = new CartaDeTruco(Palo.BASTO, 12);
		this.c2 = new CartaDeTruco(Palo.ESPADA, 11);
		this.c3 = new CartaDeTruco(Palo.ORO, 11);
		
		this.tresCartas.add(c1);
		this.tresCartas.add(c2);
		this.tresCartas.add(c3);
		
		assertTrue(envido.getValorEnvido(this.tresCartas)==0);
	}
	
	@Test
	public void testTieneEnvidoNormal(){

		this.tresCartas = new ArrayList<Carta>();
		
		this.c1 = new CartaDeTruco(Palo.BASTO, 12);
		this.c2 = new CartaDeTruco(Palo.BASTO, 5);
		this.c3 = new CartaDeTruco(Palo.COPA, 4);
		
		this.tresCartas.add(c1);
		this.tresCartas.add(c2);
		this.tresCartas.add(c3);
		
		assertTrue(envido.getValorEnvido(this.tresCartas)==25);
	}
	
	@Test
	public void testTieneMaximoValorEnvido(){

		this.tresCartas = new ArrayList<Carta>();
		
		this.c1 = new CartaDeTruco(Palo.BASTO, 7);
		this.c2 = new CartaDeTruco(Palo.BASTO, 6);
		this.c3 = new CartaDeTruco(Palo.COPA, 4);
		
		this.tresCartas.add(c1);
		this.tresCartas.add(c2);
		this.tresCartas.add(c3);
		
		assertTrue(envido.getValorEnvido(this.tresCartas)==33);
	}
	
	@Test
	public void testTieneEnvidoDeFiguras(){

		this.tresCartas = new ArrayList<Carta>();
		
		this.c1 = new CartaDeTruco(Palo.BASTO, 11);
		this.c2 = new CartaDeTruco(Palo.BASTO, 12);
		this.c3 = new CartaDeTruco(Palo.COPA, 6);
		
		this.tresCartas.add(c1);
		this.tresCartas.add(c2);
		this.tresCartas.add(c3);
		
		assertTrue(envido.getValorEnvido(this.tresCartas)==20);
	}
}

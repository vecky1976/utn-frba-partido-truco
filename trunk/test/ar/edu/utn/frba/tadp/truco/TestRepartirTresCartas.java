package ar.edu.utn.frba.tadp.truco;


import org.junit.Before;
import org.junit.Test;

import ar.edu.utn.frba.tadp.truco.g10.Jugador;
import ar.edu.utn.frba.tadp.truco.g10.Mazo;
import ar.edu.utn.frba.tadp.truco.g10.Partido;


public class TestRepartirTresCartas {
	
	private Jugador j1;
	private Jugador j2;
	private Mazo mazo;
	private Partido p;

	@Before
	public void setUp() throws Exception {
		j1 = new Jugador("Pepe");
		j2 = new Jugador("Tito");
		mazo = new Mazo();
		p = new Partido(j1,j2,mazo);
	}
	
	@Test
	public void seRepartieronTresCartas(){
		//p.repartirCartas();
		assert((j1.getCantidadCartas()== 3 )&& (j2.getCantidadCartas() == 3) );
		
	}

}

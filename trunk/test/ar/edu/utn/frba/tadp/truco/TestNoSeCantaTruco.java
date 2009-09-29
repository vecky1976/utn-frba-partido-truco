package ar.edu.utn.frba.tadp.truco;


import org.junit.Before;
import org.junit.Test;

import ar.edu.utn.frba.tadp.truco.g10.Jugador;
import ar.edu.utn.frba.tadp.truco.g10.Mano;
import ar.edu.utn.frba.tadp.truco.g10.Mazo;
import ar.edu.utn.frba.tadp.truco.g10.Partido;

public class TestNoSeCantaTruco {
	
	Jugador jugador1;
	Jugador jugador2;
	Mazo mazo;
	Mano mano ;
	Partido partido;
	

	@Before
	public void setUp() throws Exception {
		jugador1 = new Jugador("Pepe");
		jugador2= new Jugador ("Tito");
		mazo = new Mazo();
		mano = new Mano(jugador1,jugador2,mazo);
		partido  = new Partido(jugador1, jugador1, mazo);
		
		
	}
	
	@Test
	public void noSeCantoTruco(){
		mano.prepararMano();
//		mano.
				
	}

}

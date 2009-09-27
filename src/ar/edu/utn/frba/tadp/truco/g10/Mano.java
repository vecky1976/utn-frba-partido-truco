package ar.edu.utn.frba.tadp.truco.g10;

public class Mano {
	
	public Mano(Jugador jugador1, Jugador jugador2, Mazo mazo) {
		this.mano = jugador1;
		this.noEsMano = jugador2;
		this.mazo = mazo;
	}
		
	private Jugador mano;
	private Jugador noEsMano;
	private Mazo mazo;
	
	public void jugarRonda() {
		// TODO Auto-generated method stub
		this.repartirCartas();
		
		
	}

	private void repartirCartas() {
		// TODO Auto-generated method stub
		this.jugadorMano.aceptarCartas(this.mazo.darTresCartas());
		this.jugadorResto.aceptarCartas(this.mazo.darTresCartas());
		
		
	}
	
	

}

package ar.edu.utn.frba.tadp.truco.g10;

public class Mano {
	
	public Mano(Jugador jugador1, Jugador jugador2, Mazo mazo) {
		this.jugadorMano = jugador1;
		this.jugadorResto = jugador2;
		this.mazo = mazo;
	}
		
	private Jugador jugadorMano;
	private Jugador jugadorResto;
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

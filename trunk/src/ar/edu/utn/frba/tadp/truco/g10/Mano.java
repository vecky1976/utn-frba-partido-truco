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
	
	public void jugarRondas() {
		// TODO Auto-generated method stub
		
	}
	/** Se prepara todo para que se puedan iniciar las rondas de la mano.
	 * Se reparten 3 cartas a cada jugador.
	 * 
	 */
	public void prepararMano(){
		this.repartirCartas();
	}

	/** A cada uno de los jugadores de la mano se le reparten tres cartas.
	 * 
	 */
	private void repartirCartas() {
		// TODO Auto-generated method stub
		this.jugadorMano.aceptarCartas(this.mazo.darTresCartas());
		this.jugadorResto.aceptarCartas(this.mazo.darTresCartas());
		
		
	}
	
	

}

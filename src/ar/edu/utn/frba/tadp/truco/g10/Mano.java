package ar.edu.utn.frba.tadp.truco.g10;

import java.util.ArrayList;

public class Mano {

	public Mano(Jugador jugador1, Jugador jugador2, Mazo mazo) {
		this.manoEnCurso = true;
		this.alguienCantoTruco = false;
		this.jugadorMano = jugador1;
		this.jugadorResto = jugador2;
		this.mazo = mazo;
		this.rondasDeLaMano = new ArrayList<Ronda>();

	}

	private Jugador jugadorMano;
	private Jugador jugadorResto;
	private Mazo mazo;
	private ArrayList<Ronda> rondasDeLaMano;
	private boolean manoEnCurso;
	private boolean alguienCantoTruco;

	public void jugarRondas() {
		Ronda rondaEnCurso = new Ronda();
		while (this.rondasDeLaMano.size() <= 3 && this.manoEnCurso) {
			rondaEnCurso.jugar();
			this.rondasDeLaMano.add(rondaEnCurso);

		}

	}
	/**
	 * Se prepara todo para que se puedan iniciar las rondas de la mano. Se
	 * reparten 3 cartas a cada jugador.
	 * 
	 */
	public void prepararMano() {
		this.repartirCartas();
	}

	/**
	 * A cada uno de los jugadores de la mano se le reparten tres cartas.
	 * 
	 */
	private void repartirCartas() {
		// TODO Auto-generated method stub
		this.jugadorMano.aceptarCartas(this.mazo.darTresCartas());
		this.jugadorResto.aceptarCartas(this.mazo.darTresCartas());

	}
	public void seCantoTruco() {

		this.alguienCantoTruco = true;
	}
	public boolean alguienCantoTruco() {
		// TODO Auto-generated method stub
		return this.alguienCantoTruco;
	}

}

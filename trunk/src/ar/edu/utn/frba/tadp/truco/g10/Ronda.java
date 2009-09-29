package ar.edu.utn.frba.tadp.truco.g10;

import java.util.ArrayList;

public class Ronda {

	private ArrayList<Jugada> jugadasDeLaRonda = new ArrayList<Jugada>();
	private boolean rondaEnCurso;

	public Ronda() {
		rondaEnCurso = true;
		// Jugada primeraJugada = new Jugada();
		// jugadasDeLaRonda.add(primeraJugada);
	}

	public boolean isTerminada() {
		return !rondaEnCurso;
	}

	public void seVaAlMazo(Jugador jugador) {
		getUltimaJugada().seVaAlMazo(jugador);
		terminarRonda();
	}

	private void terminarRonda() {
		this.rondaEnCurso = false;
	}

	private Jugada getUltimaJugada() {
		return jugadasDeLaRonda.get(jugadasDeLaRonda.size() - 1);
	}

	public boolean seFueAlMazo(Jugador jugador) {
		return getUltimaJugada().seFueAlMazo(jugador);
	}

	public void jugar() {
		while (!this.isTerminada()) {
			// Los jugadores tienen que iterar de a uno, hasta que jueguen una
			// carta.
			// Hasta que no se juegan las dos cartas no se deberia de terminar
			// la ronda
			// Ejemplo
			// jugadorMano.teTocaJugar()
			// jugadorMano.juegaAlgo() -- Esto seria cualquier jguada posible
			// dentro del truco (Truco, Envido, ReTruco, QuieroValeCuatro.... o
			// jugar la carta)
		}

	}

}

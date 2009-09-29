package ar.edu.utn.frba.tadp.truco.g10;

import java.util.ArrayList;

public class Ronda {
	 
	private ArrayList<Jugada> jugadasDeLaRonda = new ArrayList<Jugada>();
	private boolean rondaEnCurso;
	
	public Ronda(){
		rondaEnCurso = true;
//		Jugada primeraJugada = new Jugada();
//		jugadasDeLaRonda.add(primeraJugada);
	}
	
	public boolean isTerminada(){
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
		return jugadasDeLaRonda.get(jugadasDeLaRonda.size()-1);
	}

	public boolean seFueAlMazo(Jugador jugador) {
		return getUltimaJugada().seFueAlMazo(jugador);
	}
	
}

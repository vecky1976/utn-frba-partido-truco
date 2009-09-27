package ar.edu.utn.frba.tadp.truco.g10;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Clase Partido
 * 
 * Implementa una Facade entre el jugador y el Sistema de Truco.
 * 
 */
public class Partido {
	
	//TODO - Revisar si en este caso es correcto usar Facade. La idea sería que el jugador solamente conosca al Partido.
	
	private Jugador jugador1;
	private Jugador jugador2;
	private Mazo mazo;
	private ArrayList<Ronda> rondasDelPartido = new ArrayList<Ronda>();

	public Partido(Jugador j1, Jugador j2, Mazo mazo) {		
		this.jugador1 = j1;
		j1.entrarEnElPartido(this);
		
		this.jugador2 = j2;
		j2.entrarEnElPartido(this);
		
		this.mazo = mazo;
	}

	public void repartirCartas() {
		// TODO Auto-generated method stub
		
	}

	public boolean isFinDeRonda() {
		return getUltimaRonda().isTerminada();
	}

	private Ronda getUltimaRonda() {
		return rondasDelPartido.get(rondasDelPartido.size()-1);
	}

	public void comenzarPartido() {
		Ronda rondaInicial = new Ronda();
		rondasDelPartido.add(rondaInicial);
	}

	public void devolverCartas(Collection<CartaDeTruco> mano) {
		mazo.devolverCartas(mano);		
	}

	public void seVaAlMazo(Collection<CartaDeTruco> manoDelJugador,Jugador jugador) {
		mazo.devolverCartas(manoDelJugador);
		getUltimaRonda().seVaAlMazo(jugador);
	}

	public boolean isSeFueAlMazo(Jugador jugador) {
		return getUltimaRonda().seFueAlMazo(jugador);
	}

}

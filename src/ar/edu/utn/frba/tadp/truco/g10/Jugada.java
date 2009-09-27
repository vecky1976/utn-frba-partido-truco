package ar.edu.utn.frba.tadp.truco.g10;

import java.util.ArrayList;

public class Jugada {

	private class Accion {
		private String accionDeLaJugada;
		private Jugador jugadorQueLaRealizo;
		
		public Accion (String accion, Jugador jugador){
			this.accionDeLaJugada = accion;
			this.jugadorQueLaRealizo = jugador;
		}

		public Jugador getJugadorQueLaRealizo() {
			return this.jugadorQueLaRealizo;
		}

		public String getAccionDeLaJugada() {
			return this.accionDeLaJugada;
		}
	}
	
	private ArrayList<Accion> accionesDeLaJugada = new ArrayList<Accion>();

	public void seVaAlMazo(Jugador jugador) {
		agregarAccion("Se va al mazo",jugador);
	}

	private void agregarAccion(String accion, Jugador jugador) {
		accionesDeLaJugada.add(new Accion(accion,jugador));
	}

	public boolean seFueAlMazo(Jugador jugador) {
		if ((getUltimaAccion().getJugadorQueLaRealizo() == jugador)
			&& (getUltimaAccion().getAccionDeLaJugada() == "Se va al mazo")) 
		{
			return true;
		}
		else return false;
	}

	private Accion getUltimaAccion() {
		return accionesDeLaJugada.get(accionesDeLaJugada.size()-1);
	}
	

}

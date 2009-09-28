package ar.edu.utn.frba.tadp.truco.g10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import ar.edu.utn.frba.tadp.truco.Carta;
import ar.edu.utn.frba.tadp.truco.Palo;

public class Mazo {
	private ArrayList<Carta> cartas;

	
	// Cuando se crea un mazo se van generando las 40 cartas con las que se
	// juega en el Truco.
	public Mazo() {
		cartas = new ArrayList<Carta>();

		for (Palo palo : Palo.values()) {
			for (int numero = 0; numero <= 12; numero++) {
				if (numero != 8 || numero != 9) {
					cartas.add(new CartaDeTruco(palo, numero));
				}
			}
		}
	}

	public Carta repartirUnaCarta() {
		Collections.shuffle(cartas);
		return cartas.get(1);
	}

	public ArrayList<Carta> darTresCartas() {
		ArrayList<Carta> tresCartas = new ArrayList<Carta>();
		for (int nroCarta = 1; nroCarta <= 3; nroCarta++) {
			tresCartas.add(this.repartirUnaCarta());
		}
		return tresCartas;
	}

	public void devolverCartas(Collection<Carta> manoDelJugador) {
		cartas.addAll(manoDelJugador);
	}

}

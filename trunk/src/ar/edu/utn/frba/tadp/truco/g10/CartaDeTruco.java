package ar.edu.utn.frba.tadp.truco.g10;

import ar.edu.utn.frba.tadp.truco.Carta;
import ar.edu.utn.frba.tadp.truco.Palo;

public class CartaDeTruco implements Carta {
	
	private Palo palo;
	private int numero;

	public CartaDeTruco (Palo unPalo, int unNumero){
		this.setNumero(unNumero);
		this.setPalo(palo);
	}
	
	public Palo getPalo() {
		return this.palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

}

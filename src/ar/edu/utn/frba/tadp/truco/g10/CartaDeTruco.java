package ar.edu.utn.frba.tadp.truco.g10;

import ar.edu.utn.frba.tadp.truco.Carta;
import ar.edu.utn.frba.tadp.truco.Palo;

public class CartaDeTruco implements Carta {
	
	private Palo palo;
	private int numero;

	public CartaDeTruco (Palo unPalo, int unNumero){
		this.setNumero(numero);
		this.setPalo(palo);
	}
	
	@Override
	public Palo getPalo() {
		// TODO Auto-generated method stub
		return this.palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}
	
	@Override
	public int getNumero() {
		// TODO Auto-generated method stub
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
}

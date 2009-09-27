package ar.edu.utn.frba.tadp.truco.g10;

import java.util.ArrayList;

public class Envido {
	// verificar si dos cartas de tres son del mismo palo
	public boolean tieneEnvido(ArrayList<CartaDeTruco> cartas){
		if ( (cartas.get(0).getPalo() == cartas.get(1).getPalo()) ||
				(cartas.get(0).getPalo() == cartas.get(2).getPalo()) ||
				(cartas.get(1).getPalo() == cartas.get(2).getPalo())
			)
				return true;
		
		return false;
	}
	
	public boolean ganaEnvido(	ArrayList<CartaDeTruco> unasCartas,
								ArrayList<CartaDeTruco> otrasCartas ){
		if (this.tieneEnvido(unasCartas) && this.tieneEnvido(otrasCartas)){
			return true;
		}
		return true;
		
	}
	
	public int getValorEnvido(CartaDeTruco unaCarta, CartaDeTruco otraCarta) {
		return this.getValorEnvidoCarta(unaCarta.getNumero()) + 
				this.getValorEnvidoCarta(otraCarta.getNumero()) + 20;
	}
	
	// si es figura vale cero, entro caso el numero de la carta
	private int getValorEnvidoCarta(int valor){
		switch (valor)
		{
		case 10:
		case 11:
		case 12:
			return 0;
		default:
			return valor;
		}
	}
}

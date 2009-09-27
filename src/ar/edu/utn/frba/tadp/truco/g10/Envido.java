package ar.edu.utn.frba.tadp.truco.g10;

import java.util.ArrayList;

/**
 * Abstrae las operaciones que realiza el Envido en un juego de truco
 * @author matias
 *
 */
public class Envido {
	
	public Envido () {
		
	}
	
	// verificar si dos cartas de tres son del mismo palo
	public boolean tieneEnvido(ArrayList<CartaDeTruco> tresCartas){
		if ( (tresCartas.get(0).getPalo() == tresCartas.get(1).getPalo()) ||
				(tresCartas.get(0).getPalo() == tresCartas.get(2).getPalo()) ||
				(tresCartas.get(1).getPalo() == tresCartas.get(2).getPalo())
			)
				return true;
		
		return false;
	}
	
	/**
	 * dados dos conjuntos de cartas, devuelve true si las primeras
	 * le ganan envido a las segundas, caso contrario false
	 * nota: tener en cuenta que pueden empatar y gana el jugador mano
	 * @param tresCartas
	 * @param otrasTresCartas
	 * @return
	 */
	public boolean ganaEnvido(	ArrayList<CartaDeTruco> tresCartas,
								ArrayList<CartaDeTruco> otrasTresCartas ){
		return this.getValorEnvido(tresCartas) > this.getValorEnvido(otrasTresCartas);
		
	}
	
	// deberia pasarle 3 cartas y que considere:
	// - si no tiene 2 del mismo palo el valor envido es la carta de mayor numero
	// - si tiene envido sumo las 2 mayores del mismo palo
	public int getValorEnvido(ArrayList<CartaDeTruco> tresCartas) {
		ArrayList<CartaDeTruco> mayoresCartas = new ArrayList<CartaDeTruco>();
		
		if (this.tieneEnvido(tresCartas)){
			mayoresCartas = this.getDosMayoresMismoPalo(tresCartas);
			return this.calcularEnvido(mayoresCartas.get(0), mayoresCartas.get(1));
		}
		return this.getMayorValorCarta(tresCartas);
	}
	
	private int getMayorValorCarta(ArrayList<CartaDeTruco> tresCartas) {
		int mayorValorEnvido = -1;
		// TODO Auto-generated method stub
		for (CartaDeTruco carta : tresCartas) {
			if (this.getValorEnvidoCarta(carta.getNumero()) > mayorValorEnvido){
				mayorValorEnvido = this.getValorEnvidoCarta(carta.getNumero());
			}
		}
		return mayorValorEnvido;
	}

	private ArrayList<CartaDeTruco> getDosMayoresMismoPalo(
			ArrayList<CartaDeTruco> tresCartas) {
		// TODO Auto-generated method stub
		ArrayList<CartaDeTruco> cartasEnvido = new ArrayList<CartaDeTruco>();
		// filtrar sub coleccion por mismo palo
		// si son 2 elementos > retorno esos
		// si son 3 del mismo palo > retorno las 2 de mayorValorEnvido
		return null;
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
	
	public int calcularEnvido(CartaDeTruco unaCarta, CartaDeTruco otraCarta){
		return this.getValorEnvidoCarta(unaCarta.getNumero()) + 
				this.getValorEnvidoCarta(otraCarta.getNumero()) + 20;
	}
}

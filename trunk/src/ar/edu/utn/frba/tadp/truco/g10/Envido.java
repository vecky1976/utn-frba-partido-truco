package ar.edu.utn.frba.tadp.truco.g10;

import java.util.ArrayList;
import java.util.Collection;

import ar.edu.utn.frba.tadp.truco.Carta;

/**
 * Abstrae las operaciones que realiza el Envido en un juego de truco
 * @author matias
 *
 */
public class Envido {
	
	public Envido () {
		
	}
	
	// verificar si al menos dos cartas de tres son del mismo palo
	public boolean tieneEnvido(Collection<Carta> cartasDeUnaMano){
		Collection<Carta> cartasOro = new ArrayList<Carta>();
		Collection<Carta> cartasCopa = new ArrayList<Carta>();
		Collection<Carta> cartasEspada = new ArrayList<Carta>();
		Collection<Carta> cartasBasto = new ArrayList<Carta>();
		// filtrar sub colecciones por mismo palo
		for (Carta unaCarta : cartasDeUnaMano){
			switch (unaCarta.getPalo())
			{
			case ORO: cartasOro.add(unaCarta); break;
			case ESPADA: cartasEspada.add(unaCarta); break;
			case BASTO: cartasBasto.add(unaCarta); break;
			case COPA: cartasCopa.add(unaCarta); break;
			}
		}
		// si cualquier coleccion del mismo palo tiene
		// dos o mas cartas tiene envido
		if (	(cartasOro.size()> 1) ||
				(cartasEspada.size()> 1) ||
				(cartasBasto.size()> 1) ||
				(cartasCopa.size()> 1)
			)
			return true;
		else
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
	public boolean ganaEnvido(	Collection<Carta> tresCartas,
								Collection<Carta> otrasTresCartas ){
		return this.getValorEnvido(tresCartas) > this.getValorEnvido(otrasTresCartas);
		
	}
	
	// deberia pasarle 3 cartas y que considere:
	// - si no tiene 2 del mismo palo el valor envido es la carta de mayor numero
	// - si tiene envido sumo las 2 mayores del mismo palo
	public int getValorEnvido(Collection<Carta> cartasDeUnaMano) {
		Collection<Carta> mayoresCartas = new ArrayList<Carta>();
		
		if (this.tieneEnvido(cartasDeUnaMano)){
			mayoresCartas = this.getDosMayoresMismoPalo(cartasDeUnaMano);
			return this.calcularEnvido(((ArrayList<Carta>) mayoresCartas).get(0), ((ArrayList<Carta>) mayoresCartas).get(1));
		}
		return this.getMayorValorCarta(cartasDeUnaMano);
	}
	
	private int getMayorValorCarta(Collection<Carta> tresCartas) {
		int mayorValorEnvido = -1;
		// TODO Auto-generated method stub
		for (Carta carta : tresCartas) {
			if (this.getValorEnvidoCarta(carta.getNumero()) > mayorValorEnvido){
				mayorValorEnvido = this.getValorEnvidoCarta(carta.getNumero());
			}
		}
		return mayorValorEnvido;
	}

	private Collection<Carta> getDosMayoresMismoPalo(
			Collection<Carta> tresCartas) {
		// TODO Auto-generated method stub
		Collection<Carta> cartasOro = new ArrayList<Carta>();
		Collection<Carta> cartasCopa = new ArrayList<Carta>();
		Collection<Carta> cartasEspada = new ArrayList<Carta>();
		Collection<Carta> cartasBasto = new ArrayList<Carta>();
		// filtrar sub coleccion por mismo palo
		for (Carta unaCarta : tresCartas){
			switch (unaCarta.getPalo())
			{
			case ORO: cartasOro.add(unaCarta);
			case ESPADA: cartasEspada.add(unaCarta);
			case BASTO: cartasBasto.add(unaCarta);
			case COPA: cartasCopa.add(unaCarta);
			}
		}
		
		// si son 2 elementos -> retorno esos
		if (cartasOro.size()==2)
			return cartasOro;
		if (cartasCopa.size()==2)
			return cartasCopa;
		if (cartasBasto.size()==2)
			return cartasBasto;
		if (cartasEspada.size()==2)
			return cartasEspada;
		
		// si son 3 del mismo palo -> retorno las 2 de mayorValorEnvido
		if (cartasOro.size()==3) {
			// no va a funcionar por estoy sacando otro objeto que no esta en la coleccion
			cartasOro.remove(this.getCartaMenorValorEnvido(cartasOro));
			return cartasOro;
		}
		if (cartasCopa.size()==3){
			cartasCopa.remove(this.getCartaMenorValorEnvido(cartasCopa));
			return cartasCopa;
		}
		if (cartasBasto.size()==3){
			cartasBasto.remove(this.getCartaMenorValorEnvido(cartasBasto));
			return cartasBasto;
		}
		if (cartasEspada.size()==3){
			cartasEspada.remove(this.getCartaMenorValorEnvido(cartasEspada));
			return cartasEspada;
		}
		return null;// no deveria llegar aca, excepcion
	}

	private Carta getCartaMenorValorEnvido(Collection<Carta> cartasDeUnaMano) {
		Carta unaCarta = null;
		int menorValorEnvido = 20; // no existe este valor de carta de envido
		// TODO Auto-generated method stub
		for (Carta carta : cartasDeUnaMano) {
			if (this.getValorEnvidoCarta(carta.getNumero()) < menorValorEnvido){
				menorValorEnvido = this.getValorEnvidoCarta(carta.getNumero());
				unaCarta = new CartaDeTruco(carta.getPalo(), carta.getNumero());
			}
		}
		return unaCarta;
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
	
	public int calcularEnvido(Carta unaCarta, Carta otraCarta){
		return this.getValorEnvidoCarta(unaCarta.getNumero()) + 
				this.getValorEnvidoCarta(otraCarta.getNumero()) + 20;
	}

}

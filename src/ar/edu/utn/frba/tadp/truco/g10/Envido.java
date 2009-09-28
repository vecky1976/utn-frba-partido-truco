package ar.edu.utn.frba.tadp.truco.g10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import ar.edu.utn.frba.tadp.truco.Carta;

/**
 * Abstrae las operaciones que realiza el Envido en un juego de truco
 * @author matias
 *
 */
public class Envido {
	
	private Collection<Carta> cartasOro = new ArrayList<Carta>();
	private Collection<Carta> cartasCopa = new ArrayList<Carta>();
	private Collection<Carta> cartasEspada = new ArrayList<Carta>();
	private Collection<Carta> cartasBasto = new ArrayList<Carta>();
	
	public Envido () {
		
	}
	
	// verificar si al menos dos cartas de tres son del mismo palo
	private boolean tieneEnvido(Collection<Carta> cartasDeUnaMano){
		
		this.clasificarPorPalo(cartasDeUnaMano);

		// si cualquier coleccion del mismo palo tiene
		// dos o mas cartas tiene envido
		if (	this.anyPaloColectionHasMoreThan(1)
			)
			return true;
		else
			return false;
	}
	
	private boolean anyPaloColectionHasMoreThan(int i) {
		if ((this.cartasOro.size()> i) ||
				(this.cartasEspada.size()> i) ||
				(this.cartasBasto.size()> i) ||
				(this.cartasCopa.size()> i)
			)
			return true;
		else
			return false;
	}

	private void clasificarPorPalo(Collection<Carta> cartasDeUnaMano) {
		// TODO Auto-generated method stub
		this.cartasOro = new ArrayList<Carta>();
		this.cartasCopa = new ArrayList<Carta>();
		this.cartasEspada = new ArrayList<Carta>();
		this.cartasBasto = new ArrayList<Carta>();
		
		// filtrar sub colecciones por mismo palo
		for (Carta unaCarta : cartasDeUnaMano){
			switch (unaCarta.getPalo())
			{
			case ORO: this.cartasOro.add(unaCarta); break;
			case ESPADA: this.cartasEspada.add(unaCarta); break;
			case BASTO: this.cartasBasto.add(unaCarta); break;
			case COPA: this.cartasCopa.add(unaCarta); break;
			}
		}
	}

	/**
	 * nota: tener en cuenta que pueden empatar y gana el jugador mano
	 * @param tresCartas
	 * @param otrasTresCartas
	 * @return GANA si las primeras le ganan a las segundas
	 * 			EMAPATA si son pardas: mismo valor de envido
	 * 			PIERDE si las segundas le ganan a las primeras
	 */
	public ResultadoEnvido ganaEnvido(	Collection<Carta> tresCartas,
								Collection<Carta> otrasTresCartas ){
		if (this.getValorEnvido(tresCartas) > this.getValorEnvido(otrasTresCartas))
			return ResultadoEnvido.GANA;
		if (this.getValorEnvido(tresCartas) < this.getValorEnvido(otrasTresCartas))
			return ResultadoEnvido.PIERDE;
		
		return ResultadoEnvido.EMPATA;
		
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
		return this.getMayorValorEnvidoCarta(cartasDeUnaMano);
	}
	
	private int getMayorValorEnvidoCarta(Collection<Carta> tresCartas) {
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
		
		this.clasificarPorPalo(tresCartas);
		
		
		// si son 2 elementos -> retorno esos
		if (this.cartasOro.size()==2)
			return this.cartasOro;
		if (this.cartasCopa.size()==2)
			return this.cartasCopa;
		if (this.cartasBasto.size()==2)
			return this.cartasBasto;
		if (this.cartasEspada.size()==2)
			return this.cartasEspada;
		
		// si son 3 del mismo palo -> retorno las 2 de mayorValorEnvido
		// sacar 
		if (this.cartasOro.size()==3) {
			this.removeCartaMenorValorEnvido(this.cartasOro);
			return this.cartasOro;
		}
		if (this.cartasCopa.size()==3){
			this.removeCartaMenorValorEnvido(this.cartasCopa);
			return this.cartasCopa;
		}
		if (this.cartasBasto.size()==3){
			this.removeCartaMenorValorEnvido(this.cartasBasto);
			return this.cartasBasto;
		}
		if (this.cartasEspada.size()==3){
			this.removeCartaMenorValorEnvido(this.cartasEspada);
			return this.cartasEspada;
		}
		return null;// no deveria llegar aca, excepcion
	}

	private void removeCartaMenorValorEnvido(Collection<Carta> cartasDeUnaMano){
		
		Iterator<Carta> it = cartasDeUnaMano.iterator();
		int menorValorEnvido = 20; // no existe este valor de carta de envido
		
		
		for (Carta carta : cartasDeUnaMano) {
			if (this.getValorEnvidoCarta(carta.getNumero()) < menorValorEnvido){
				menorValorEnvido = this.getValorEnvidoCarta(carta.getNumero());
			}
		}
		
		while(it.hasNext()) 
		{
			Carta c = it.next();
			if(this.getValorEnvidoCarta(c.getNumero()) == menorValorEnvido) 
				it.remove();
		}
		
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
	
	private int calcularEnvido(Carta unaCarta, Carta otraCarta){
		return this.getValorEnvidoCarta(unaCarta.getNumero()) + 
				this.getValorEnvidoCarta(otraCarta.getNumero()) + 20;
	}

}

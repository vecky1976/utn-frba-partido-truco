package ar.edu.utn.frba.tadp.truco.g10;

import java.util.ArrayList;
import java.util.Collection;

import ar.edu.utn.frba.tadp.truco.Carta;
import ar.edu.utn.frba.tadp.truco.Palo;

public class Mazo {
	private Collection<CartaDeTruco> cartas;
	//Cuando se crea un mazo se van generando las 40 cartas con las que se juega en el Truco.
	
	public Mazo(){
		cartas = new ArrayList<CartaDeTruco>();
		
		for( Palo palo : Palo.values()){
			for (int numero = 0; numero <= 12; numero++){
				if (numero != 8 || numero != 9  ){
					cartas.add(new CartaDeTruco(palo, numero));
				}
			}
		}
	}


	public ArrayList<Carta> darTresCartas() {
		// TODO Auto-generated method stub
		
		
		return null;
	}

}

package ar.edu.utn.frba.tadp.truco;

import java.util.Collection;

/**
 * Modela el Estado del juego al finalizar una mano.
 * @author lgassman
 *
 */
public interface Resultado {
	
	
	public boolean isFinJuego();
	public boolean isGanasteJuego();
	public int getPuntosTuyos();
	public int getPuntosOponente();
	
	public boolean isGanasteTruco();
	public boolean isGanasteEnvido();
	public boolean mintioEnvido();
	public int getPuntosTruco();
	public int getPuntosEnvido();
	public Collection<Carta> getCartasGanadoras();

}

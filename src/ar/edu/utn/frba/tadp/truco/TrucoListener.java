package ar.edu.utn.frba.tadp.truco;

import java.util.Collection;

/**
 * Este listener escucha los eventos que necesita un jugador para poder itneractuar
 * con el sistema. Es una interfaz de salida del sistema.
 * Una aplicación de un jugador de truco debe registrar una implementación de esta interface
 * 
 * @author lgassman
 *
 */
public interface TrucoListener {
	
	public void teDijoTruco();
	public void teDijoQuieroRetruco();
	public void teDijoQuieroValeCuatro();
	public void teDijoEnvido();
	public void teDijoRealEnvido();
	public void teDijoFaltaEnvido();
	public void teDijoQuiero();
	public void teDijoNoQuiero();
	public void seFueAlMazo();
	public void teJugo(Carta carta);
	public void seRindo();
	/**
	 * Una colección con 3 cartas
	 * @param cartas
	 */
	public void aceptarCartas(Collection<Carta> cartas);
	
	public void teTocaJugar();
	
	/**
	 * El usuario debe cantar los puntos del envido siendo mano
	 * @return los puntos a cantar o null si no se desa contar
	 */
	public void cantarValorEnvido(int valorReal);

	/**
	 * El usuario debe cantar los puntos del envido siendo pie
	 * @param puntosContrincante valor del envido del contrincante o null no cantó
	 */
	public void cantarValorEnvido(int valorReal, Integer valorContrincante);
	
	public void resultadoEnvido(boolean ganaste, int puntos, Integer valorEnvido, Integer valorOponente);
	/**
	 * Informa el resultado de la mano y el estado del juego.	
	 * @param resultado
	 */
	public void finMano(Resultado resultado);
	
}

package ar.edu.utn.frba.tadp.truco;

/**
 * Modela el contrincante contra quien se juega
 * Esta es una interfaz de entrada al truco.
 * Una aplicación de un jugador de truco recibe un objeto que implementa esta interface
 * como respuesta al registro del jugador.
 * 
 * @author lgassman
 *
 */
public interface ContrincanteTruco {
		
	public void truco();
	public void quieroRetruco();
	public void quieroValeCuatro();
	public void envido();
	public void realEnvido();
	public void faltaEnvido();
	public void quiero();
	public void noQuiero();
	public void meVoyAlMazo();
	public void jugar(Carta carta);
	public void meRindo();
	/**
	 * @param puntos del envido o null si son buenas.
	 */
	public void valorEnvido(Integer puntos);
	
}

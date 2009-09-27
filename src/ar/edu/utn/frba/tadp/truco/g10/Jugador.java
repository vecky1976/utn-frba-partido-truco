package ar.edu.utn.frba.tadp.truco.g10;

import java.util.Collection;

import ar.edu.utn.frba.tadp.truco.*;

public class Jugador implements  TrucoListener, ContrincanteTruco{
	
	private String nombre;

	public Jugador(String nombre) {
		this.setNombre(nombre);
		
	}

	public void aceptarCartas(Collection<Carta> cartas) {
		// TODO Auto-generated method stub
		
	}

	public void cantarValorEnvido(int valorReal) {
		// TODO Auto-generated method stub
		
	}

	public void cantarValorEnvido(int valorReal, Integer valorContrincante) {
		// TODO Auto-generated method stub
		
	}

	public void finMano(Resultado resultado) {
		// TODO Auto-generated method stub
		
	}

	public void resultadoEnvido(boolean ganaste, int puntos,
			Integer valorEnvido, Integer valorOponente) {
		// TODO Auto-generated method stub
		
	}

	public void seFueAlMazo() {
		// TODO Auto-generated method stub
		
	}

	public void seRindo() {
		// TODO Auto-generated method stub
		
	}

	public void teDijoEnvido() {
		// TODO Auto-generated method stub
		
	}

	public void teDijoFaltaEnvido() {
		// TODO Auto-generated method stub
		
	}

	public void teDijoNoQuiero() {
		// TODO Auto-generated method stub
		
	}

	public void teDijoQuiero() {
		// TODO Auto-generated method stub
		
	}

	public void teDijoQuieroRetruco() {
		// TODO Auto-generated method stub
		
	}

	public void teDijoQuieroValeCuatro() {
		// TODO Auto-generated method stub
		
	}

	public void teDijoRealEnvido() {
		// TODO Auto-generated method stub
		
	}

	public void teDijoTruco() {
		// TODO Auto-generated method stub
		
	}

	public void teJugo(Carta carta) {
		// TODO Auto-generated method stub
		
	}

	public void teTocaJugar() {
		// TODO Auto-generated method stub
		
	}

	public void envido() {
		// TODO Auto-generated method stub
		
	}

	public void faltaEnvido() {
		// TODO Auto-generated method stub
		
	}

	public void jugar(Carta carta) {
		// TODO Auto-generated method stub
		
	}

	public void meRindo() {
		// TODO Auto-generated method stub
		
	}

	public void meVoyAlMazo() {
		// TODO Auto-generated method stub
		
	}

	public void noQuiero() {
		// TODO Auto-generated method stub
		
	}

	public void quiero() {
		// TODO Auto-generated method stub
		
	}

	public void quieroRetruco() {
		// TODO Auto-generated method stub
		
	}

	public void quieroValeCuatro() {
		// TODO Auto-generated method stub
		
	}

	public void realEnvido() {
		// TODO Auto-generated method stub
		
	}

	public void truco() {
		// TODO Auto-generated method stub
		
	}

	/** un jugador canta su envido
	 *  validar que no pueda mentir cuando canta.
	 *  Crear excepcion
	 */
	
	public void valorEnvido(Integer puntos) {
		// TODO Auto-generated method stub
		
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidadCartas() {
		// TODO Auto-generated method stub
		return 0;
	}

}

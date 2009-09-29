package ar.edu.utn.frba.tadp.truco;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/** Ejecutamos un Test general en donde consideramos las pruebas de todos los TESTS creados.
 * 
 * @author Pablo
 *
 */


@RunWith(Suite.class)
@Suite.SuiteClasses({TestEnvido.class ,TestJugadorSeVaAlMazo.class ,TestNoSeCantaTruco.class , TestTresCartasLeGananEnvidoAotrasTresCartas.class  })
public class TestSuite {

}

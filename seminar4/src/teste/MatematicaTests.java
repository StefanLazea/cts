package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Matematica;


public class MatematicaTests {
	private Matematica mate;
	
	@Before	
	public void initializare() {
		this.mate = new Matematica();
	}
	
	@Test
	public void testSumaCorecta() {
		int rezultatObtinut = mate.suma(4, 9);
		int rezultatAsteptat = 13;

		assertEquals(rezultatAsteptat, rezultatObtinut);
	}

	@Test
	public void testRaportNumarIntreg() {
		double rezultatObtinut = mate.raport(10, 2);
		double rezultatAsteptat = 5;

		assertEquals(rezultatAsteptat, rezultatObtinut, 0.1);
	}

	@Test
	public void testRaportCuZecimale() {
		double rezultatObtinut = mate.raport(10, 2);
		double rezultatAsteptat = 5;

		assertEquals(rezultatAsteptat, rezultatObtinut, 0.1);
	}

	@Test
	public void testRaportExceptie() {
		try {
			double rezultatObtinut = mate.raport(10, 0);
			fail("Should not be here");
		} catch (IllegalArgumentException ex) {
			
		}		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testRaportExceptieJunit4() {
		mate.raport(10,0);
	}
	
	@Test
	public void testEstePar() {
		assertTrue(mate.estePar(4));
		assertFalse(mate.estePar(5));
	}
	
	@Test
	public void testListaNull() {
		assertNull(mate.nNumerePare(0));
	}

}
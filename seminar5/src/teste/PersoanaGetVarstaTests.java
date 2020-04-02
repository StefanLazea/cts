package teste;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import clase.Persoana;

public class PersoanaGetVarstaTests {

	// test de corectitudine (R-BICEP)
	// mai multe teste; mai multe seturi de date
	// complexitatea ciclomatica (3 if-uri)
	
	@Test
	public void testGetVarstaRight1900() {
		Persoana pers = new Persoana("nume", "1971227030015");
		assertEquals(22, pers.getVarsta());
	}
	 
	@Test
	public void testGetVarstaRight2000() {
		Persoana pers = new Persoana("nume", "503080030015");
		assertEquals(16, pers.getVarsta());
	}
	
	
	@Test
	public void testGetVarstaBoundary1900() {
		Persoana pers = new Persoana("nume", "10001010030015");
		assertEquals(120, pers.getVarsta());
	}
	
	@Test
	public void testGetVarstaBoundarySuperior1900() {
		Persoana pers = new Persoana("nume", "19912310030015");
		assertEquals(20, pers.getVarsta());
	}
	
	@Test
	public void testGetVarstaBoundary2000() {
		Persoana pers = new Persoana("nume", "5000101676503");
		assertEquals(20, pers.getVarsta());
	}
	
	private String converterForCNPItems(int value) {
		if(value < 10) {
			return "0" + value;
		}
		return "" + value;
	}
	
	@Test
	public void testGetVarstaBoundarySuperior2000() {
		Calendar dataCurenta = Calendar.getInstance();
		int an = dataCurenta.get(Calendar.YEAR);
		int luna = 1 + dataCurenta.get(Calendar.MONTH);
		int zi = dataCurenta.get(Calendar.DAY_OF_MONTH);
		
		int anCnp = an - 2000;
		String cnp = "5"+converterForCNPItems(anCnp) + converterForCNPItems(luna)+converterForCNPItems(zi)+"123456";
		
		Persoana pers = new Persoana("nume", cnp);
		
		assertEquals(0, pers.getVarsta());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetVarstaError() {
		Persoana pers = new Persoana("nume", "000030899998");
		pers.getVarsta();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetVarstaNascutaInViitor() {
		Calendar dataCurenta = Calendar.getInstance();
		int an = dataCurenta.get(Calendar.YEAR)-2000;
		int luna = 1 + dataCurenta.get(Calendar.MONTH);
		int zi = dataCurenta.get(Calendar.DAY_OF_MONTH) + 1;
		
		int anCnp = an - 2000;
		String cnp = "5" + converterForCNPItems(an) + converterForCNPItems(luna)+converterForCNPItems(zi)+"123456";

		Persoana pers = new Persoana("nume", cnp);
		pers.getVarsta();		
	}
	
	@Test(timeout=90)
	public void testPerformance() {
		Persoana pers = new Persoana("nume", "1971227030015");
		pers.getVarsta();
	}
	
	@Test
	public void testOrdering() {
		Persoana pers = new Persoana("nume", "1971227030015");
		Persoana pers2 = new Persoana("nume", "19501227030015");
		assertTrue(pers.getVarsta() < pers2.getVarsta());		
	}
}

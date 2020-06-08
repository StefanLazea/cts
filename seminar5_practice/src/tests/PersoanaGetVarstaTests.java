package tests;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Persoana;
import tests.categorii.CategorieTestePersoaneVarstnice;

public class PersoanaGetVarstaTests {

	// teste right
	@Test
	public void testGetVarstaRight1900() {
		Persoana pers = new Persoana("Ionel", "1971227030017");
		assertEquals(22, pers.getVarsta());
	}

	@Test
	public void testGetVarstaRight2000() {
		Persoana pers = new Persoana("Ionel", "6001227030017");
		assertEquals(19, pers.getVarsta());
	}

	// boundary
	@Test
	@Category({CategorieTestePersoaneVarstnice.class})
	public void testGetVarstaBoundary1800() {
		Persoana pers = new Persoana("Ionel", "3000101030017");
		assertEquals(220, pers.getVarsta());
	}

	@Test
	public void testGetVarstaBoundary2000() {
		Persoana pers = new Persoana("Ionel", "6000101030017");
		assertEquals(20, pers.getVarsta());
	}

	@Test
	public void testGetVarstaBoundarySuperior1999() {
		Persoana pers = new Persoana("Ionel", "299123130017");
		assertEquals(20, pers.getVarsta());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetVarstaErrors() {
		Persoana pers = new Persoana("Ionel", "000003130017");
		pers.getVarsta();
	}

	private String converterForCNPItems(int value) {
		if (value < 10) {
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
		String cnp = "5" + converterForCNPItems(anCnp) + converterForCNPItems(luna) + converterForCNPItems(zi)
				+ "123456";

		Persoana pers = new Persoana("nume", cnp);

		assertEquals(0, pers.getVarsta());
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
	public void testCardinality() {
		Persoana pers = new Persoana("nume", "1971227030015");
		Persoana pers2 = new Persoana("nume", "19501227030015");
		assertTrue(pers.getVarsta()<pers2.getVarsta());
	}
	
	@Test
	public void testCardinalityFor1() {
		Persoana pers = new Persoana("nume", "6190303030015");
		assertEquals(pers.getVarsta(), 1);
	}
	
	
}

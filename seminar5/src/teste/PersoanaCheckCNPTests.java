package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Persoana;
import exceptii.CnpContainsLettersException;
import exceptii.CnpIsNullException;
import exceptii.CnpWrongFormatException;
import exceptii.CnpWrongFirstLetterException;

public class PersoanaCheckCNPTests {

	@Test(timeout=10)
	public void testPerformance() {
		Persoana pers = new Persoana("nume", "1971227030015");
		pers.checkCNP();
	}

	//Conformance
	@Test(expected = CnpWrongFormatException.class)
	public void testConformance() {
		Persoana pers = new Persoana("nume2", "227030015");
		pers.checkCNP();		
	}
	
	@Test(expected = CnpContainsLettersException.class)
	public void testCheckForLettersConformance() {
		Persoana pers = new Persoana("nume2", "19712270300aa");
		pers.checkCNP();
	}
	
	@Test(expected = CnpWrongFirstLetterException.class)
	public void testCheckForFirstLetterConformance() {
		Persoana pers = new Persoana("nume2", "0971227030015");
		pers.checkCNP();
	}
    
	// teste de corectitudine (cele din Right)
	@Test
	public void testCheckForValidCNP() {
		Persoana pers = new Persoana("nume", "1971227030015");
		assertTrue(pers.checkCNP());
	}
	
	// test de corectitudine
	@Test
	public void testCheckForInvalidCNP() {
		Persoana pers = new Persoana("nume", "1971227030011");
		assertFalse(pers.checkCNP());
	}
	
	@Test(expected = CnpIsNullException.class)
	public void textExistance() {
		Persoana pers = new Persoana("nume", null);
		pers.checkCNP();
	}

}

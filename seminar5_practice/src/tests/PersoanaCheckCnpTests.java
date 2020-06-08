package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Persoana;
import exceptii.CnpWrongFormatException;

public class PersoanaCheckCnpTests {

	// Conformance
	@Test(expected = CnpWrongFormatException.class)
	public void testConformance() {
		Persoana pers = new Persoana("nume2", "227030015");
		pers.checkCNP();
	}

}

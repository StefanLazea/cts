package cts.examen.s2.unittesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class testConstructor {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRight() throws ExceptieGenerala {
		IncomingPatient incomingPatient = new IncomingPatient("Dorel", true, 37);
		assertEquals("Dorel", incomingPatient.getName());
		assertEquals(37.0, incomingPatient.getBodyTemp(),0.01);
	}
	
	@Test
	public void testInverse() throws ExceptieGenerala {
		//test to no be what it was
		IncomingPatient incomingPatient = new IncomingPatient("Dorel", true, 37);
		IncomingPatient incomingPatient2 = new IncomingPatient("Ghita", true, 37);
		incomingPatient = incomingPatient2;
		//test not to be what it was
		assertEquals("Ghita", incomingPatient.getName());
	}
	
	@Test
	public void testExistence() throws ExceptieGenerala {
		IncomingPatient incomingPatient = new IncomingPatient("Dorel", true, 37);
		assertNotNull("Testing the existance of the object ", incomingPatient);
		//ASSETNOTNULL pt EXISTANCE
	}
	
	@Category(SlowTest.class)
	@Test(expected=ExceptieGenerala.class)
	public void testException() throws ExceptieGenerala {
		IncomingPatient incomingPatient = new IncomingPatient("Dore", true, 37);
		fail("N-a aruncat exceptie");
	}
	
	
}

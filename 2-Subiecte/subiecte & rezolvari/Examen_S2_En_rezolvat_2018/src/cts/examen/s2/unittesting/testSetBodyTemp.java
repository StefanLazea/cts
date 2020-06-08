package cts.examen.s2.unittesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testSetBodyTemp {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test(expected=ExceptieGenerala.class)
	public void testException() throws ExceptieGenerala {
		IncomingPatient incomingPatient = new IncomingPatient("Dorel", true, 37);
		incomingPatient.setBodyTemp(55);
		fail("Nu merge exceptia!");
	}
	

}

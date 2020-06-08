package cts.examen.s2.unittesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testMinDrugPrice {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCardinality() throws ExceptieGenerala {
		IncomingPatient incomingPatient = new IncomingPatient("Dorel", true, 37);
		float[] prices = {};
		float min = incomingPatient.minDrugPrice(prices);
		assertEquals(1000, min,0.01);
	}
	
	@Test
	public void testCardinality2() throws ExceptieGenerala {
		IncomingPatient incomingPatient = new IncomingPatient("Dorel", true, 37);
		float[] prices = {5};
		float min = incomingPatient.minDrugPrice(prices);
		assertEquals(5, min,0.01);
	}
	//EXISTANCE PT FUNCTIE te astepti sa arunce eroare!
	@Test(expected=ExceptieGenerala.class)
	public void testExistance() throws ExceptieGenerala {
		IncomingPatient incomingPatient = new IncomingPatient("Dorel", true, 37);
		float[] prices = null;
		float min = incomingPatient.minDrugPrice(prices);
		fail("nu arunca eroare la exisstance");
	}
	//EXISTANE
	//DA unu din ei:)) nu, vali vine maine :)) da
	
	@Test
	public void testPerformancce() throws ExceptieGenerala {
		IncomingPatient incomingPatient = new IncomingPatient("Dorel", true, 37);
		float[] prices = new float[500000];
		for (int i = 0; i < 500000; i++) {
			prices[i] = i+1;
		}
		long start = System.currentTimeMillis();
		float min = incomingPatient.minDrugPrice(prices);
		long stop = System.currentTimeMillis();
		if(stop - start > 5) {
			fail("PREA INCET");
		}
	}

}

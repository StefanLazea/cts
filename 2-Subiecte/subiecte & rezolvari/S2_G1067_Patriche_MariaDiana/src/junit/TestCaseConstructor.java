package junit;

import junit.exceptii.ExceptieInaltime;
import junit.exceptii.ExceptieLungimeAdresa;
import junit.exceptii.ExceptieLungimeBariera;
import junit.framework.TestCase;

public class TestCaseConstructor extends TestCase {

	private LogAccesBariera bariera;
	
	public TestCaseConstructor(String string) {
		super(string);
	}

	protected void setUp() throws Exception {
		super.setUp();
		bariera = new LogAccesBariera("piata romana", 4, 15);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testConformance() throws ExceptieLungimeAdresa, ExceptieLungimeBariera, ExceptieInaltime {
		bariera = new LogAccesBariera("piata romana", 4, 15);
		if(bariera.getAdresaLocatie().equals("piata romana") && bariera.getLungime() == 4 && bariera.getInaltime() == 15)
			assertTrue(true);
		else
			fail("bariera nu respecta cerintele");
	}
	
	public void testExceptie() {
		try {
			bariera = new LogAccesBariera("victorie", 3, -2);
			fail("nu a generat exceptii");
		} catch (ExceptieInaltime e) {
			assertTrue(true);
		} catch (Exception e) {
			fail("A generat alta exceptie");
		}
		
		
	}
}

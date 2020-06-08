package junit;

import junit.framework.TestSuite;

public class ColectieTeste extends TestSuite {

	protected void setUp() throws Exception {
	}

	protected void tearDown() throws Exception {
	}

	public static TestSuite suite() {
		TestSuite colectie = new TestSuite();
		colectie.addTest(new TestCaseConstructor("testExceptie"));
		colectie.addTest(new TestCaseTotalIntrari("testOrdering"));
		return colectie;
	}
}

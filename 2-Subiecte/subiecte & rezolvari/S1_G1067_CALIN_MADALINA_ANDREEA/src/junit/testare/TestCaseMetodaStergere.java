package junit.testare;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.clase.LogAccesBariera;
import junit.exceptii.LogException;
import junit.mock.Mock;

public class TestCaseMetodaStergere {

	LogAccesBariera logAcces;
	static Mock mock;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		mock=new Mock();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMockStergereLog() throws LogException {
	
		logAcces=new LogAccesBariera("Str Mizil", 5, 2);
		logAcces.adaugaIntrare(2);
		mock.setSalvareDate(true);	
		int rezultatObtinut=logAcces.stergeLog(mock);
		System.out.println(rezultatObtinut);
		int rezultatAsteptat=1;
		assertEquals(rezultatAsteptat, rezultatObtinut);
		
		mock.setSalvareDate(false);	
		int rezultatObtinut2=logAcces.stergeLog(mock);
		System.out.println(rezultatObtinut);
		int rezultatAsteptat2=0;
		assertEquals(rezultatAsteptat2, rezultatObtinut2);
		
	}

}

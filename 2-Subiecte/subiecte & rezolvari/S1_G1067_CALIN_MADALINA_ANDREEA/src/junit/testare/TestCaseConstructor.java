package junit.testare;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import junit.clase.LogAccesBariera;
import junit.exceptii.LogException;

public class TestCaseConstructor {

	LogAccesBariera logAcces;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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

	@Category(CategorieTesteSuita.class)
	@Test
	public void testRightConstructor() throws LogException {
		String adresaLocatie="Str. Independentei";
		int lungimeB=4;
		int inaltimeB=5;
		logAcces=new LogAccesBariera(adresaLocatie, lungimeB, inaltimeB);
		String adresaObtinuta=logAcces.getAdresaLocatie();
		
		assertEquals(adresaLocatie, adresaObtinuta);
	}
	
	
	@Test(expected=LogException.class)
	public void testExceptieConstructor() throws LogException {
		String adresaLocatie="Str. Independentei";
		int lungimeB=logAcces.LIMITA_MIN_LUNGIME-2;
		int inaltimeB=5;
		logAcces=new LogAccesBariera(adresaLocatie, lungimeB, inaltimeB);
		
	}
	
	
	

}

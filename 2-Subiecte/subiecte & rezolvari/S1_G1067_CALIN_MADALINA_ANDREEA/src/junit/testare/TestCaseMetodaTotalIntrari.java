package junit.testare;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;

import junit.clase.LogAccesBariera;
import junit.exceptii.LogExceptionLista;

public class TestCaseMetodaTotalIntrari {

	LogAccesBariera logAcces;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		logAcces=new LogAccesBariera();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Category(CategorieTesteSuita.class)
	@Test
	public void testCardinalitateTotalIntrari() throws LogExceptionLista {
		
		logAcces.adaugaIntrare(3);
		int rezultatAsteptat=103;
		int rezultatObtinut=logAcces.totalIntrari();
		
		assertEquals(rezultatAsteptat, rezultatObtinut);
	}
	
	@Test(expected=LogExceptionLista.class)
	public void testExistenceTotalIntrari() throws LogExceptionLista {
		
		
		logAcces.totalIntrari();
		
	}

}

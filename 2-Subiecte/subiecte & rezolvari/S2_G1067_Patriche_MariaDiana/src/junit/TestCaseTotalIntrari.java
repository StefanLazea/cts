package junit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

import javax.rmi.CORBA.Util;

import junit.framework.TestCase;

public class TestCaseTotalIntrari extends TestCase {

	LogAccesBariera bariera;
	static Mock mock;
	
	public TestCaseTotalIntrari(String string) {
		super(string);
	}

	protected void setUp() throws Exception {
		super.setUp();
		bariera = new LogAccesBariera("piata romana", 4, 15);
		mock = new Mock();
	}
	
	public void testStergeLog() {
		mock.setSalvareDate(true);
		bariera.stergeLog(mock);
		if(bariera.stergeLog(mock)==1)
			assertTrue(true);
		else
			fail("datele nu s-au salvat");
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public ArrayList<Integer> generare(int nr)
	{
		Random random = new Random();
		ArrayList<Integer> vector = new ArrayList<>(nr);
		for(int i=0;i<nr;i++)
			vector.add(random.nextInt());
		return vector;
	}
	
	public void testOrdering() {
		ArrayList<Integer> intrari = new ArrayList<>();
		intrari.add(1);
		intrari.add(2);
		intrari.add(3);
		intrari.add(4);
		intrari.add(5);
		bariera.setNumarIntrariPeZi(intrari);
		int toatlAsteptat = (5 * 6) / 2;
		int totalRezultat = bariera.totalIntrari();
		assertEquals("total calculat ok", toatlAsteptat, totalRezultat);
	}
	
	public void testCrossCheck()
	{
		ArrayList<Integer> intrari = this.generare(50);
		bariera.setNumarIntrariPeZi(intrari);
		int suma = 0;
		for(Integer intrare : intrari)
			suma += intrare;
		assertEquals("total ok",suma,bariera.totalIntrari());
	}
	
}

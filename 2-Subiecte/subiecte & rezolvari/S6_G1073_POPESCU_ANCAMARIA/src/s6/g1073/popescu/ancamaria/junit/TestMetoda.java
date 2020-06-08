package s6.g1073.popescu.ancamaria.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestMetoda {

	@Category(SuiteClass.class)
	@Test(expected = MaxException.class)
	public void testExistence() throws MaxException {
		Produs p = new Produs("Produs", 30, 10);
		p.setVanzariZilnice(null);
		p.getVanzareMaxima();

	}

	public int metodaCrossCheck(ArrayList<Integer> vanzari) {
		Vector<Integer> vector = new Vector<>();
		for (int element : vanzari) {
			vector.add(element);
		}
		int max = Collections.max(vector);
		return max;

	}

	@Test()
	public void testCrossCheck() throws MaxException {
		Produs p = new Produs("Produs", 30, 10);
		ArrayList<Integer> vanzari = new ArrayList<>();
		vanzari.add(10);
		vanzari.add(20);
		vanzari.add(50);
		p.setVanzariZilnice(vanzari);

		int actual = p.getVanzareMaxima();
		int expected = this.metodaCrossCheck(vanzari);
		assertEquals("testare cross check", expected, actual);

	}

}

package s6.g1073.popescu.ancamaria.junit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestSetter {

	@Test
	public void testRight() {
		Produs p = new Produs("Produs", 30, 10);
		p.setPret(20);
		assertEquals("testare right pentru setter pret",20, p.getPret(),0.001);
	}
	@Category(SuiteClass.class)
	@Test
	public void testRange() {
		Produs p = new Produs("Produs", 30, 10);
		p.setPret(20);
		assertTrue("testare range pentru setter pret", p.getPret() > 0);
	}
	

}

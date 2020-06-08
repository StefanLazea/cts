package s5.g1073.paler.georgiana.testare;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestareRight {

	@Category(IncludTests.class)
	@Test
	public void testRight() throws Exception {
		
		
		ProdusCopy produsCopy = new ProdusCopy("Masina", 20, 200);
		produsCopy.setPret(250);
		assertEquals(250, produsCopy.getPret(), 0.01);
	}

}

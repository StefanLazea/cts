package s5.g1073.paler.georgiana.testare;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class testareExistence {

	@Category(IncludTests.class)
	@Test(expected = MaxException.class)
	public void testExistence() throws Exception {
		ProdusCopy produsCopy = new ProdusCopy("Masina", 20, 200);
		produsCopy.getVanzareMaxima();
	}

}

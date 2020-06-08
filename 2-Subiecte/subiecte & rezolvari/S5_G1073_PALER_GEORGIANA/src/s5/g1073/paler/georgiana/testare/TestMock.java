package s5.g1073.paler.georgiana.testare;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMock {

	@Test
	public void testMock() throws Exception {
		ProdusCopy produsCopy = new ProdusCopy("Masina", 20, 200);
		Mockfurnizor furnizor = new Mockfurnizor();
		produsCopy.comandaFurnizor(10, furnizor);
		assertEquals(30, produsCopy.getStoc(), 0.01);
	}

}

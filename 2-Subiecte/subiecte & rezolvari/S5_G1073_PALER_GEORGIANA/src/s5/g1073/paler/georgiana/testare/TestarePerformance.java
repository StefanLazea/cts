package s5.g1073.paler.georgiana.testare;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestarePerformance {

	@Category(IncludTests.class)
	@Test
	public void testPerformance() throws Exception {
		
		
		ProdusCopy produsCopy = new ProdusCopy("Masina", 20, 200);
		
		ArrayList<Integer> listaTemp = new ArrayList<Integer>();
		for(int i=0; i< 1000; i++) {
			listaTemp.add(i);
		}
		
		produsCopy.setVanzariZilnice(listaTemp);
		
		double beforeValue = System.currentTimeMillis();
		System.out.println(produsCopy.getVanzareMaxima());
		double afterValue = System.currentTimeMillis();
		assertTrue(afterValue - afterValue < 5000 );
	}

}

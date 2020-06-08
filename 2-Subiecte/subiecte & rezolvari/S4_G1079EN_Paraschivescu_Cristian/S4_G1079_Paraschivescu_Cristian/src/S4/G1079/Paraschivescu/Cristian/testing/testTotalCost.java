package S4.G1079.Paraschivescu.Cristian.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import S4.G1079.Paraschivescu.Cristian.surse.Platform;

public class testTotalCost {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCrossCheck() throws DurationException {
		Platform p1 = new Platform(2, 200);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(20);
		list.add(15);
		p1.setPiecesCost(list);
		int[] list2 = {100,20,15};
		int sum = 10;
		for(int i=0;i<list2.length;i++) {
			sum+= list.get(i);
		}
		assertEquals(p1.totalCost(), sum);
	}

}

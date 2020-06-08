package S4.G1079.Paraschivescu.Cristian.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import S4.G1079.Paraschivescu.Cristian.surse.Platform;



public class testIsInspectionNecessary {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRight1() throws DurationException {
		Platform p1 = new Platform(1, 200);
		assertEquals(false, p1.isInspectionNecessary());
	}
	
	@Category(SlowTest.class)
	@Test()
	public void testRight2() throws DurationException {
		Platform p1 = new Platform(1, 700);
		assertEquals(true, p1.isInspectionNecessary());
	}

}

package S4.G1079.Paraschivescu.Cristian.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import S4.G1079.Paraschivescu.Cristian.surse.Platform;

public class testSetNoDays {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test(expected = DurationException.class)
	public void testException() throws DurationException {
		Platform p1 = new Platform(1, 200);
		p1.setNoDays(-20);
		fail("nu a aruncat exceptie");
	}
	
	@Category(SlowTest.class)
	@Test()
	public void testBoundary1() throws DurationException {
		Platform p1 = new Platform(1, 200);
		p1.setNoDays(0);
		assertEquals(0,p1.getDaySinceLastInspection());
	}
	
	@Category(SlowTest.class)
	@Test()
	public void testBoundary2() throws DurationException {
		Platform p1 = new Platform(1, 200);
		p1.setNoDays(365);
		assertEquals(365,p1.getDaySinceLastInspection());
	}

}

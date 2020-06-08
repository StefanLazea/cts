package S4.G1079.Paraschivescu.Cristian.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import S4.G1079.Paraschivescu.Cristian.surse.Platform;

public class testMock {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMock() throws Exception {
		Platform p1 = new Platform(1, 200);
		MockObject mock = new MockObject();
		mock.setWeight(800);
		assertEquals(90, p1.getVehicleTransportCost(mock));
	}

}

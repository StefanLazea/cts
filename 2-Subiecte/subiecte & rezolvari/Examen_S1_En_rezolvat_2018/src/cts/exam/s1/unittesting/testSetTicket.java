package cts.exam.s1.unittesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class testSetTicket {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test(expected = ExceptieGenerala.class)
	public void testException() throws ExceptieGenerala {
		NormalTicket normalTicket = new NormalTicket("acdf", 555);
		normalTicket.setTicketNumber(10000);
		fail("Nu a aruncat exceptie!!!");
	}
	
	@Category(SlowTest.class)
	@Test
	public void testBoundary() throws ExceptieGenerala {
		NormalTicket normalTicket = new NormalTicket("acdf", 555);
		normalTicket.setTicketNumber(998);
		assertEquals(998, normalTicket.getTicketNumber());
	}

}

package cts.exam.s1.unittesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testConstructor {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testRight() throws ExceptieGenerala {
		NormalTicket normalTicket = new NormalTicket("acdf", 555);
		assertEquals("acdf", normalTicket.getEventName());
		assertEquals(555, normalTicket.getTicketNumber());
	}
	
	@Test(expected = ExceptieGenerala.class)
	public void testException() throws ExceptieGenerala  {
		NormalTicket normalTicket = new NormalTicket("acdf", 999);
		fail("Nu a aruncat exceptie!!!");
	}

}

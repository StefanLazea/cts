package s3.g1079.paris.iannis.junit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class testSetDays {

	@Test(expected=DurationException.class)
	public void testException() throws DurationException {
		s3.g1079.paris.iannis.clase.Platform p = new s3.g1079.paris.iannis.clase.Platform(1, 500);
		p.setNoDays(-13);
	}
	@Category(SlowTest.class)
	@Test
	public void testRange1() throws DurationException {
		s3.g1079.paris.iannis.clase.Platform p = new s3.g1079.paris.iannis.clase.Platform(1, 500);
		p.setNoDays(200);
		assertEquals(200, p.getNoDays());
	}
	@Category(SlowTest.class)
	@Test
	public void testRange2() throws DurationException {
		s3.g1079.paris.iannis.clase.Platform p = new s3.g1079.paris.iannis.clase.Platform(1, 500);
		p.setNoDays(400);
		assertEquals(400, p.getNoDays());
	}

}

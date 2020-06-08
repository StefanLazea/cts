package s3.g1079.paris.iannis.junit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import javafx.application.Platform;

public class testInspection {

	@Test
	public void testRight1() throws DurationException {
		s3.g1079.paris.iannis.clase.Platform p = new s3.g1079.paris.iannis.clase.Platform(1, 100);
		assertEquals(false, p.isInspectionNecessary());
	}
	
	@Category(SlowTest.class)
	@Test
	public void testRight2() throws DurationException {
		s3.g1079.paris.iannis.clase.Platform p = new s3.g1079.paris.iannis.clase.Platform(1, 500);
		assertEquals(true, p.isInspectionNecessary());
	}

}

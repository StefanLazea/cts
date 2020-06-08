package s3.g1079.paris.iannis.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

public class testTotalCost {

	@Test(expected=Exception.class)
	public void testExistance() throws DurationException {
		s3.g1079.paris.iannis.clase.Platform p = new s3.g1079.paris.iannis.clase.Platform(1, 500);
		ArrayList<Integer> costuri= null;
		p.setPiecesCost(costuri);
		p.totalCost();
	}

}

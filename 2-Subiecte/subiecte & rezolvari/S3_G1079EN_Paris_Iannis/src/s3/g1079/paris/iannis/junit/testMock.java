package s3.g1079.paris.iannis.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class testMock {

	@Test
	public void testMock() throws DurationException {
		s3.g1079.paris.iannis.clase.Platform p = new s3.g1079.paris.iannis.clase.Platform(1, 500);
		VehicleMock vehicle = new VehicleMock();
		//weight e setat in mock ca fiind 1000 deci se asteapta 90
		assertEquals(90, p.getVehicleTransportCost(vehicle));
	}

}

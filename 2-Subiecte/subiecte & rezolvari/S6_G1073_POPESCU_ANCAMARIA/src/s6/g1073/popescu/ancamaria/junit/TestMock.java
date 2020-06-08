package s6.g1073.popescu.ancamaria.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMock {

	@Test(expected = UnsupportedOperationException.class)
	public void testException() {
		Produs p = new Produs("Produs", 30, 10);
		FurnizorMock mock = new FurnizorMock();
		mock.setVerificaStoc(false);
		p.comandaFurnizor(20, mock);
	}

	@Test()
	public void testRight() {
		Produs p = new Produs("Produs", 30, 10);
		FurnizorMock mock = new FurnizorMock();
		mock.setVerificaStoc(true);
		p.comandaFurnizor(20, mock);
		assertTrue(p.getStoc() == 50);
	}

}

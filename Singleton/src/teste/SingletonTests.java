package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.CasaDeMarcat;

public class SingletonTests {

	@Test
	public void testGetInstance() {
		CasaDeMarcat casa = CasaDeMarcat.getInstance();
		CasaDeMarcat casa2 = CasaDeMarcat.getInstance();
		assertSame(casa, casa2);
	}

}

package test;

import static org.junit.Assert.*;

import org.junit.Test;

import boja.clase.SimpleFactorySingleton;

public class TestSimpleFactorySingleton {

	@Test
	public void testSingleton() {
		SimpleFactorySingleton instance1 = SimpleFactorySingleton.getInstance("da", "da");
		SimpleFactorySingleton instance2 = SimpleFactorySingleton.getInstance("da", "da");
		assertSame(instance1, instance2);
	}

}

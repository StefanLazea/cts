package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.AgentieTurism;
import clase.PachetTuristic;
import teste.categorii.CategorieTesteAgentieTurism;
import teste.dubluri.PersoanaFake;
import teste.dubluri.PersoanaStub;

public class AgentieTurismTests {
	private AgentieTurism agentie;
	
	@Before
	public void init() {
		this.agentie = new AgentieTurism();
	}
	
	@Test
	@Category({CategorieTesteAgentieTurism.class})
	public void testSumaPacheteRIght() {
		PersoanaStub pers = new PersoanaStub();
		PachetTuristic pachet1 = new PachetTuristic(pers, "Miami", 2000.0);
		PachetTuristic pachet2 = new PachetTuristic(pers, "Miami", 1000.0);
		this.agentie.adaugaPachet(pachet1);
		this.agentie.adaugaPachet(pachet2);
		assertEquals(3000.0, this.agentie.calculareSumaTotalaPachete(), 0.01);
	}
		
}

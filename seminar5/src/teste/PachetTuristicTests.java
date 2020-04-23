package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.PachetTuristic;
import teste.categorii.CategorieTestePersoaneTinere;
import teste.categorii.CategorieTestePersoaneVarstnice;
import teste.dubluri.PersoanaFake;
import teste.dubluri.PersoanaStub;

public class PachetTuristicTests {

	@Test
	@Category(CategorieTestePersoaneVarstnice.class)
	public void testAplicaDiscount() {
		PersoanaStub pers = new PersoanaStub();
		PachetTuristic pachet = new PachetTuristic(pers, "Bahamas", 2000.0);
		pachet.aplicaDiscountVarstnici(10);
		
		assertEquals(1800.0, pachet.getPret(), 0.01);
	}
	
	@Test
	@Category(CategorieTestePersoaneVarstnice.class)
	public void testDiscountPersoanaInVarsta() {
		PersoanaFake persoana = new PersoanaFake();
		persoana.setVarsta(80);
		PachetTuristic pachet = new PachetTuristic(persoana, "bahamas", 2000.0);
		pachet.aplicaDiscountVarstnici(10);
		assertEquals(1800.0, pachet.getPret(), 0.01);
	}
	
	@Test
	@Category(CategorieTestePersoaneTinere.class)
	public void testDiscountPersoanaTanara() {
		PersoanaFake persoana = new PersoanaFake();
		persoana.setVarsta(20);
		PachetTuristic pachet = new PachetTuristic(persoana, "bahamas", 2000.0);
		pachet.aplicaDiscountVarstnici(10);
		assertEquals(2000.0, pachet.getPret(), 0.01);
	}

	@Test
	public void testVarstaNuPoateRezerva() {
		PersoanaFake pers = new PersoanaFake();
		pers.setVarsta(16);
		PachetTuristic pachet = new PachetTuristic(pers, "Jakarta", 4589.0);
		assertFalse(pachet.poateRezerva());
	}
	
	@Test
	public void testVarstaPoateRezerva() {
		PersoanaFake pers = new PersoanaFake();
		pers.setVarsta(35);
		PachetTuristic pachet = new PachetTuristic(pers, "Jakarta", 4589.0);
		assertTrue(pachet.poateRezerva());
	}
	
	@Test
	public void testPersoana() {
		PersoanaStub pers = new PersoanaStub();
		PachetTuristic pachet = new PachetTuristic(pers, "Jakarta", 4589.0);
		assertSame(pers, pachet.getClient());
	}
	
	@Test
	public void testDestinatieIdentica() {
		PersoanaStub pers = new PersoanaStub();
		PachetTuristic pachet = new PachetTuristic(pers, "Jakarta", 4589.0);
		assertEquals("Jakarta", pachet.getDestinatie());
	}
	
	@Test
	public void testDestinatieSetter() {
		PersoanaStub pers = new PersoanaStub();
		PachetTuristic pachet = new PachetTuristic(pers, "", 4589.0);
		pachet.setDestinatie("Miami");
		assertEquals("Miami", pachet.getDestinatie());
	}
	
	@Test
	public void testClientSetter() {
		PersoanaStub pers = new PersoanaStub();
		PachetTuristic pachet = new PachetTuristic(pers, "", 4589.0);
		PersoanaStub persoanaSetter = new PersoanaStub();
		pachet.setClient(persoanaSetter);
		assertSame(persoanaSetter, pachet.getClient());
	}
	
	@Test
	public void testPretSetter() {
		PersoanaStub pers = new PersoanaStub();
		PachetTuristic pachet = new PachetTuristic(pers, "Miami", 222.0);
		pachet.setPret(999.9);
		assertEquals(999.9, pachet.getPret(), 0.01);
	}
}

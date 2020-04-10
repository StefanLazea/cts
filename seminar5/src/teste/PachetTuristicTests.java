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

}

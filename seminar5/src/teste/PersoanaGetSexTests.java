package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import clase.Persoana;
import teste.categorii.CategorieTestePersoaneNascuteDupa2000;
import teste.categorii.CategorieTestePersoaneNascuteInainte2000;

public class PersoanaGetSexTests {

	@Test
	@Category({CategorieTestePersoaneNascuteInainte2000.class})
	public void testGetSexRight1900Male() {
		Persoana pers = new Persoana("nume", "1971227030015");
		assertEquals("M", pers.getSex());
	}
	
	@Test
	@Category({CategorieTestePersoaneNascuteInainte2000.class})
	public void testGetSexRight1900Female() {
		Persoana pers = new Persoana("nume", "2971227030015");
		assertEquals("F", pers.getSex());
	}
	
	@Test
	@Category({CategorieTestePersoaneNascuteInainte2000.class})
	public void testGetSexRight1800Male() {
		Persoana pers = new Persoana("nume", "30001010030015");
		assertEquals("M", pers.getSex());
	}
	
	
	@Test
	@Category({CategorieTestePersoaneNascuteInainte2000.class})
	public void testGetSexRight1800Female() {
		Persoana pers = new Persoana("nume", "40001010030015");
		assertEquals("F", pers.getSex());
	}
	
	@Test
	@Category({CategorieTestePersoaneNascuteDupa2000.class})
	public void testGetSexRight2000Male() {
		Persoana pers = new Persoana("nume", "50001010030015");
		assertEquals("M", pers.getSex());
	}
	
	
	@Test
	@Category({CategorieTestePersoaneNascuteDupa2000.class})
	public void testGetSexRight2000Female() {
		Persoana pers = new Persoana("nume", "60001010030015");
		assertEquals("F", pers.getSex());
	}
	
	@Test
	@Category({CategorieTestePersoaneNascuteDupa2000.class, CategorieTestePersoaneNascuteInainte2000.class})
	public void testGetSexWrongCnp() {
		Persoana pers = new Persoana("nume", "00001010030015");
		assertEquals("N/A", pers.getSex());
	}
	
	@Test
	@Category({CategorieTestePersoaneNascuteInainte2000.class})
	public void testGetSexBasicConstructor() {
		Persoana pers = new Persoana();
		assertEquals("M", pers.getSex());
	}
	
}
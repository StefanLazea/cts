package dp3Composite;

public class TestPatternComposite {

	public static void main(String[] args) {
		
		GrupareStructura companie=new GrupareStructura("Companie",false);
		companie.adaugaElement(new CardAngajat(true, "Matei", 1));
		
		GrupareStructura echipaDezvoltare=new GrupareStructura("Echipa dezvoltare software",true);
		echipaDezvoltare.adaugaElement(new CardAngajat(false, "Andreea", 2));
		echipaDezvoltare.adaugaElement(new CardAngajat(false, "Alex", 2));
		
		GrupareStructura echipaQA=new GrupareStructura("Echipa de QA",true);
		echipaQA.adaugaElement(new CardAngajat(false, "Codrin", 1));
		echipaQA.adaugaElement(new CardAngajat(false, "Melissa", 2));
		
		companie.adaugaElement(echipaDezvoltare);
		companie.adaugaElement(echipaQA);
		companie.solicitaPermisiune();
		companie.getInfo();
	}
}

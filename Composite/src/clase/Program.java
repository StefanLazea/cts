package clase;

public class Program {
	public static void main(String[] args) {
		IOptiune cAntibiotice = new CategorieComposite("Antibiotice");
		IOptiune cAdulti = new CategorieComposite("Adulti");
		IOptiune cCopii = new CategorieComposite("Copii");
		
		cAntibiotice.adaugaNod(cAdulti);
		cAntibiotice.adaugaNod(cCopii);
		
		IOptiune mMed1 = new MedicamentFrunza("Augmentin");
		IOptiune mMed2 = new MedicamentFrunza("Augmentin2");
		
		
		cAntibiotice.adaugaNod(mMed1);
		cAdulti.adaugaNod(mMed2);
		
		
		cAntibiotice.descriere("");
		cAntibiotice.stergereNod(mMed1);
		cCopii.adaugaNod(mMed1);
		cAntibiotice.descriere("");
		
		cAntibiotice.getChild(0).adaugaNod(cAntibiotice.getChild(1).getChild(0));
		cAntibiotice.getChild(1).stergereNod(cAntibiotice.getChild(1).getChild(0));
		cAntibiotice.descriere("");
	}
}

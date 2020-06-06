package clase;

public class MedicamentFrunza implements IOptiune {

	private String nume;

	public MedicamentFrunza(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void stergereNod(IOptiune optiune) {
		throw new IllegalArgumentException();
	}

	@Override
	public void adaugaNod(IOptiune optiune) {
		throw new IllegalArgumentException();
	}

	@Override
	public void descriere(String identare) {
		System.out.println(identare+"Medicament: " + this.nume);
	}

	@Override
	public IOptiune getChild(int pozitie) {
		throw new IllegalArgumentException();
	}

}

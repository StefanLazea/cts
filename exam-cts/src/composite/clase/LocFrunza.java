package composite.clase;

public class LocFrunza implements ISectiuneAsezare {

	private String denumire;

	public LocFrunza(String denumire) {
		super();
		this.denumire = denumire;
	}

	@Override
	public void adaugaOptiune(ISectiuneAsezare sectiune) {
		throw new IllegalArgumentException();
	}

	@Override
	public ISectiuneAsezare getChild(int index) {
		return null;
	}

	@Override
	public void stergereOptiune(ISectiuneAsezare sectiune) {
		throw new IllegalArgumentException();
	}

	@Override
	public void descriere(String spatiu) {
		System.out.println(spatiu + "locul de la " + this.denumire);
	}

}

package d.composite;

public class Filiala implements INod {
	private String denumire;

	public Filiala(String denumire) {
		super();
		this.denumire = denumire;
	}

	@Override
	public void adaugaNod(INod nod) {
		throw new IllegalArgumentException();

	}

	@Override
	public INod getNod(int index) {
		throw new IllegalArgumentException();
	}

	@Override
	public void stergereNod(INod nod) {
		throw new IllegalArgumentException();

	}

	@Override
	public void descriere(String spatiu) {
		System.out.println(spatiu + "Filiala: " + this.denumire);
	}

}

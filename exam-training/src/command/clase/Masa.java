package command.clase;

public class Masa {
	private int nrMasa;

	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
	}

	public void rezervare() {
		System.out.println("Masa " + nrMasa + " a fost rezervata");
	}

	public void ocupare() {
		System.out.println("Masa " + nrMasa + " a fost ocupata");
	}

}

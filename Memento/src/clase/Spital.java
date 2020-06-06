package clase;

public class Spital {
	private String nume;
	private String adresa;
	private int nrPacienti;

	public Spital(String nume, String adresa, int nrPacienti) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.nrPacienti = nrPacienti;
	}

	@Override
	public String toString() {
		return "Spital [nume=" + nume + ", adresa=" + adresa + ", nrPacienti=" + nrPacienti + "]";
	}

	public void setNrPacienti(int nrPacienti) {
		this.nrPacienti = nrPacienti;
	}

	public Memento creazaMemento() {
		return new Memento(this.nrPacienti);
	}

	public void restaurare(Memento backup) {
		this.nrPacienti = backup.getNrPacienti();
	}

}

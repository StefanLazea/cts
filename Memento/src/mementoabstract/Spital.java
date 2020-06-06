package mementoabstract;

import clase.Memento;

public class Spital implements ISpital {
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

	@Override
	public Memento salveazaMemento() {
		return new Memento(this.nrPacienti);
	}

	@Override
	public void restaurareDinMemento(Memento backup) {
		this.nrPacienti = backup.getNrPacienti();
	}

}

package a.memento;

public class Pacient {
	private String nume;
	private String rezultatAnalize;

	public Pacient(String nume, String rezultatAnalize) {
		super();
		this.nume = nume;
		this.rezultatAnalize = rezultatAnalize;
	}

	public String getNume() {
		return nume;
	}

	public String getRezultatAnalize() {
		return rezultatAnalize;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setRezultatAnalize(String rezultatAnalize) {
		this.rezultatAnalize = rezultatAnalize;
	}

	public MementoPacient salvareMemento() {
		return new MementoPacient(this.rezultatAnalize);
	}

	public void undoToMemento(MementoPacient backup) {
		this.rezultatAnalize = backup.getAnalizePacient();
	}

	@Override
	public String toString() {
		return "Pacient [nume=" + nume + ", rezultatAnalize=" + rezultatAnalize + "]";
	}

}
